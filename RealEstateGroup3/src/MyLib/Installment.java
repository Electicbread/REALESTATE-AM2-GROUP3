/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Synthe
 */
public class Installment extends PaymentPlan{
    private float interest;
    private int month;

    public Installment(float interest, int month, Property property, double reservedFee) {
        super(property, reservedFee);
        this.interest = interest;
        this.month = month;
    }
    
    public double calculatePrice() {
        return VariableForBasePaymentPlsAdd + (interest * month);
    }
    
    public void viewReceipt() {
        //is there a format we want to follow?
    }
}
