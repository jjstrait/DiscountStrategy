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
public interface DiscountStrategy {

    public abstract double getDiscount(int qty, double unitPrice);

    public abstract void setDiscountRate(double discountRate);

    public abstract double getDiscountRate();

}
