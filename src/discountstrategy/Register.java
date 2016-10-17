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
public class Register {

    private Receipt receipt;
 

    public final void startNewSale(String customerNo, DataStore db) {
        receipt = new Receipt(customerNo, db);
    }

    public final void addProduct(String productId, int qty) {
        receipt.addItem(productId, qty);
    }

    public final void voidProduct(String productId) {
        receipt.voidItem(productId);
    }

    public final void endSale(ReceiptFormat fmt, ReceiptOutputStrategy output) {
        receipt.endSale(fmt, output);
    }

}
