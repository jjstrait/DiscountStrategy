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
public class DiscountByQty implements DiscountStrategy {

    private double discountRate;
    private int minQty;

    public DiscountByQty(double discountRate, int minQty) {
        this.discountRate = discountRate;
        this.minQty = minQty;
    }

    @Override
    public final double getDiscount(int qty, double unitPrice) {
        if (qty < minQty) {
            return 0;
        } else {
            return unitPrice * qty * discountRate;
        }
    }

    @Override
    public final double getDiscountRate() {
        return discountRate;
    }

    @Override
    public final void setDiscountRate(double discountRate) {
        //needs vailidation
        this.discountRate = discountRate;
    }

    public final int getMinQty() {
        return minQty;
    }

    public final void setMinQty(int minQty) {
        //needs vailidation
        this.minQty = minQty;
    }

}
