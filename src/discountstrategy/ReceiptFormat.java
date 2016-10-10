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
public class ReceiptFormat {

    private Receipt receipt;
    private ReceiptOutputConstants con = new ReceiptOutputConstants();

    public final String getFormat(int receiptNo, Customer customer, LineItem[] itemArray) {
        String format;
        format = "\t\t" + con.RECEIPT_NUMBER_START + receiptNo + con.RECEIPT_NUMBER_END + "\n";
        format += con.THANKS + customer.getFirstName() + "\n";
        format += con.STORE_REGARD + "\n";
        format += String.format("%-4s %-18s %-12s %-5s %-11s %-10s \n", con.PRODUCT_ID, con.PRODUCT_NAME, con.UNIT_PRICE, con.QTY, con.ITEM_TOTAL, con.DISCOUNT_AMOUNT);
        format += String.format("%-4s %-18s %-12s %-5s %-11s %-8s \n", "---", "------------", "----------", "----", "----------", "--------");
        for (LineItem l : itemArray) {

            format += String.format("%-4s %-18s %-12.2f %-5d %10.2f %9.2f\n", l.getProduct().getProductNo(), l.getProduct().getName(), l.getProduct().getUnitPrice(), l.getQty(), l.getProduct().getTotal(l.getQty()), l.getProduct().getDiscountStrat().getDiscount(l.getQty(), l.getProduct().getUnitPrice()));
        }
        format += "---------------------------------------------------------------\n";
        format += String.format("%55s %7.2f\n", con.GRAND_TOTAL, receipt.getGrandTotal());
        format += String.format("%55s %7.2f\n", con.GRAND_DISCOUNT_AMOUNT, receipt.getDiscountedTotal());
        format += String.format("%63s", "--------------------\n");
        format += String.format("%55s %7.2f", con.TOTAL, receipt.getGrandTotal() - receipt.getDiscountedTotal());

        return format;
    }

}
