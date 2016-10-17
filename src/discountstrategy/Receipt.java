/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author jstra
 */
public class Receipt {

    private static double grandTotal;
    private static double discountedTotal;
    private static int receiptNumber;
    private Customer customer;
    private DataStore db;
    private LineItem listOfItems[];
//    private Product product;
    private ReceiptOutputStrategy output;

    public Receipt(String customerNo, DataStore db) {
        this.db = db;
        this.customer = getCustomerById(customerNo);
        receiptNumber++;
        grandTotal = 0;
        discountedTotal = 0;
        listOfItems = new LineItem[0];
    }

    public final Customer getCustomerById(String customerNo) {
        return db.findCustomerById(customerNo);
    }

    public final void addToArray(LineItem[] itemArray, LineItem item) {
        LineItem[] temp = new LineItem[itemArray.length + 1];
        System.arraycopy(itemArray, 0, temp, 0, itemArray.length);
        temp[temp.length - 1] = item;
        itemArray = temp;
        listOfItems = itemArray;
        temp = null;
        grandTotal += item.getProduct().getTotal(item.getQty());
        discountedTotal += item.getProduct().getDiscountStrat().getDiscount(item.getQty(), item.getProduct().getUnitPrice());
    }

    public final void removeItemFromArray(LineItem itemArray[], String productId) {
        LineItem[] temp = new LineItem[itemArray.length - 1];
        for (int i = 0; i <= temp.length; i++) {
            if (!(itemArray[i].getProduct().getProductNo().equals(productId))) {
                temp[i] = itemArray[i];
            } else {
                grandTotal -= itemArray[i].getProduct().getTotal(itemArray[i].getQty());
                discountedTotal -= itemArray[i].getProduct().getDiscountStrat().getDiscount(itemArray[i].getQty(), itemArray[i].getProduct().getUnitPrice());
            }

        }
        itemArray = temp;
        listOfItems = itemArray;
        temp = null;

    }

    public final void voidItem(String productId) {
        removeItemFromArray(listOfItems, productId);
    }

    public final void addItem(String productId, int qty) {

        LineItem item = new LineItem(qty, db.findProductById(productId));
        addToArray(listOfItems, item);
    }

    public final void endSale(ReceiptFormat fmt, ReceiptOutputStrategy output) {
        output.displayReceiptFmt(fmt, receiptNumber, customer, listOfItems);
    }

    public final static void main(String[] args) {
        DataStore db = new ArrayDatabase();

        Receipt r = new Receipt("c100", db);
        System.out.println(r.getCustomerById("c100").getFirstName());
        r.removeItemFromArray(r.listOfItems, "");
    }

    public static double getGrandTotal() {
        return grandTotal;
    }

    public static void setGrandTotal(double grandTotal) {
        Receipt.grandTotal = grandTotal;
    }

    public static double getDiscountedTotal() {
        return discountedTotal;
    }

    public static void setDiscountedTotal(double discountedTotal) {
        Receipt.discountedTotal = discountedTotal;
    }

    public static int getReceiptNumber() {
        return receiptNumber;
    }

    public static void setReceiptNumber(int receiptNumber) {
        Receipt.receiptNumber = receiptNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LineItem[] getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(LineItem[] listOfItems) {
        this.listOfItems = listOfItems;
    }

//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }

}
