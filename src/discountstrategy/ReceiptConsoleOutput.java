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
public class ReceiptConsoleOutput implements ReceiptOutputStrategy {

    private ReceiptFormat fmt;

    @Override
    public final void displayReceiptFmt(ReceiptFormat fmt, int receitpNo, Customer customer, LineItem[] items) {
        System.out.println(fmt.getFormat(receitpNo, customer, items));
    }

}
