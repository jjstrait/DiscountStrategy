/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import javax.swing.JOptionPane;

/**
 *
 * @author jstra
 */
public class ReceiptGuiOutput implements ReceiptOutputStrategy {

    @Override
    public void displayReceiptFmt(ReceiptFormat fmt, int receitpNo, Customer customer, LineItem[] items) {
        JOptionPane.showMessageDialog(null, fmt.getFormat(receitpNo, customer, items));
    }

}
