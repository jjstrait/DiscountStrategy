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
    private int receiptNumber;
    private Customer customer;
    private DataStore db;
    private LineItem listOfItems[];
    private Product product;
    
    public Receipt(String customerNo, DataStore db) {
        this.db = db;
        this.customer = getCustomerById(customerNo);
        
        listOfItems =new LineItem[0];
    }

    
    public final Customer getCustomerById(String customerNo){
        return db.findCustomerById(customerNo);
    }
    public void addToArrayOfItems(LineItem[] itemArray, LineItem item){
        LineItem[] temp = new LineItem[itemArray.length+1];
        System.arraycopy(itemArray, 0, temp, 0, itemArray.length);
        temp[temp.length-1] = item;
        itemArray = temp;
        listOfItems = itemArray;
        temp = null;
        
    }
    public void addItem(String productId, int qty){
        
        LineItem item = new LineItem(qty,db.findProductById(productId));
        addToArrayOfItems(listOfItems,item);
    }
    public void removeItem(String ProductId){
    
    }
    public void removeItemFromArray(){
        
    }
    public void endSale(){
    
    }
    public static void main(String[] args) {
        DataStore db = new ArrayDatabase();
       Receipt r = new Receipt("c100",db);
        System.out.println(r.getCustomerById("c100").getFirstName());
    }
    
    
    
}
