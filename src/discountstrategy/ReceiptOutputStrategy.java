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
public interface ReceiptOutputStrategy {

    public abstract void displayReceiptFmt(ReceiptFormat fmt, int receitpNo, Customer customer, LineItem[] items);

}
