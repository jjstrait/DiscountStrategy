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
public class ArrayDatabase implements DataStore {

    private Customer[] customers = {
        new Customer("Smith", "John", "c100"),
        new Customer("Doe", "Jane", "c200"),
        new Customer("Person", "Person", "c1337")
    };
    private Product[] products = {
        new Product("101", "Baseball Hat", 11.00, new DiscountByQty(.10, 2)),
        new Product("202", "Baseball Bat", 25.00, new DiscountByQty(.10, 2)),
        new Product("303", "Baseball T Shirt", 20.00, new DiscountByQty(.10, 2)),
        new Product("404", "Baseball", 5.00, new DiscountByQty(.10, 2)),
        new Product("505", "Shoes", 25.00, new DiscountByQty(.10, 2)),
        new Product("606", "Water Bottle", 6.00, new DiscountByQty(.10, 2)),
        new Product("707", "Energy Bar", 2.00, new DiscountByQty(.10, 2)),
        new Product("808", "Baseball Glove", 25.00, new DiscountByQty(.10, 2))

    };

    @Override
    public final Customer findCustomerById(String custId) {
        Customer customer = null;

        for (Customer c : customers) {
            if (custId.equals(c.getCustomerNo())) {
                customer = c;
                break;
            }
        }

        return customer;
    }

    @Override
    public final Product findProductById(String productId) {
        Product product = null;
        for (Product p : products) {
            if (productId.equals(p.getProductNo())) {
                product = p;
                break;

            }
        }

        return product;
    }

    public static void main(String[] args) {
        DataStore db = new ArrayDatabase();
        System.out.println(db.findProductById("101").getName());
        System.out.println(db.findCustomerById("c100").getFirstName());
    }

}
