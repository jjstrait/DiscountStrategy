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
public class Startup {
    
    
    public static void main(String[] args) {
        DataStore db = new ArrayDatabase();
        Register register = new Register();
        register.startNewSale("c200",db);
        
        register.addProductVoid("101",10);
        register.addProductVoid("205", 50);
        
        register.endSale();
    }
    
    
    
}
