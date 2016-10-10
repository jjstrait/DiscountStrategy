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
public class Product {

    private String productNo;
    private String name;
    private double unitPrice;
    private DiscountStrategy discountStrat;

    public Product(String productNo, String name, double unitPrice, DiscountStrategy discountStrat) {
        this.productNo = productNo;
        this.name = name;
        this.unitPrice = unitPrice;
        this.discountStrat = discountStrat;
    }

    public final double getTotal(int qty) {
        return qty * unitPrice;
    }

    public final String getProductNo() {
        return productNo;
    }

    public final void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final double getUnitPrice() {
        return unitPrice;
    }

    public final void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public final DiscountStrategy getDiscountStrat() {
        return discountStrat;
    }

    public final void setDiscountStrat(DiscountStrategy discountStrat) {
        this.discountStrat = discountStrat;
    }

}
