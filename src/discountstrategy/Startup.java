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
        ReceiptFormat fmt = new ReceiptFormat();
        DataStore db = new ArrayDatabase();
        Register register = new Register();
        ReceiptOutputStrategy output[] = {new ReceiptConsoleOutput(), new ReceiptGuiOutput()};

        register.startNewSale("c200", db);

        register.addProduct("101", 2);
        register.addProduct("202", 1);
        register.addProduct("404", 5);
        register.addProduct("808", 1);
        register.addProduct("303", 7);
        register.voidProduct("303");

        for (ReceiptOutputStrategy o : output) {
            register.endSale(fmt, o);
        }

        register.startNewSale("c100", db);

        register.addProduct("101", 10);
        register.addProduct("202", 50);

        for (ReceiptOutputStrategy o : output) {
            register.endSale(fmt, o);
        }
    }

}
