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
    private Product products;
    
    public final void startNewSale(String customerNo, DataStore db){
        receipt = new Receipt(customerNo, db);   
    }
    public final void addProductVoid(String productId, int qty){
        receipt.addItem(productId, qty);
    }
    
    public final void endSale(){
    receipt.endSale();
    }
    
    
    
    
}
