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
        
      
        
        if(lastName == null||lastName.isEmpty()){
            throw new IllegalArgumentException("The String for last name is empty");
        }else{
         this.lastName = lastName;
        }
       
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
       if(firstName == null||firstName.isEmpty()){
            throw new IllegalArgumentException("The String for first name is empty");
        }else{
            this.firstName = firstName;
        }
    }

    public final String getCustomerNo() {
        return customerNo;
    }

    public final void setCustomerNo(String customerNo) throws IllegalArgumentException{
        if(customerNo == null||customerNo.isEmpty()){
            throw new IllegalArgumentException("The String for customer number is empty");
        }else{
             this.customerNo = customerNo;
        }
        
    }

}
