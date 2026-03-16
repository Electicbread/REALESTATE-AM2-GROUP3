/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Synthe
 */
public abstract class PaymentPlan {
    private Property property;
    private double reservedFee;

    public PaymentPlan(Property property, double reservedFee) {
        this.property = property;
        this.reservedFee = reservedFee;
    }
    
    public abstract void viewReceipt();
        
    
    
    public abstract double calculatePrice();
}
