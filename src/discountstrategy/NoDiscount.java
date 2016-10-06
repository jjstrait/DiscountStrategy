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
public class NoDiscount implements DiscountStrategy{
    private double discountRate;
    private final double NO_DISCOUNT_RATE = 0;
    
    @Override
    public final double getDiscount(int qty, double unitPrice) {
        return NO_DISCOUNT_RATE;
    }

     @Override
    public final double getDiscountRate() {
        return NO_DISCOUNT_RATE;
    }
    @Override
    public final void setDiscountRate(double discountRate) {
       this.discountRate = this.NO_DISCOUNT_RATE;
    }
   
    
}
