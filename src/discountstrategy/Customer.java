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
class Customer {

    private String lastName;
    private String firstName;
    private String customerNo;

    public Customer(String lastName, String firstName, String customerNo) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.customerNo = customerNo;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final String getCustomerNo() {
        return customerNo;
    }

    public final void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

}
