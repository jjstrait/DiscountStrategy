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

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public DiscountStrategy getDiscountStrat() {
        return discountStrat;
    }

    public void setDiscountStrat(DiscountStrategy discountStrat) {
        this.discountStrat = discountStrat;
    }

    
    
    
    
    
    
}
