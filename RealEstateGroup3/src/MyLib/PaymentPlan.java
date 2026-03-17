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
    protected Property property;
    protected double reservedFee;

    public PaymentPlan(Property property, double reservedFee) {
        this.property = property;
        this.reservedFee = reservedFee;
    }

    public abstract void viewReceipt();
    public abstract double calculatePrice();

    public static PaymentPlan selectPaymentPlan(Property property, int choice, double reservedFee, int days) {
        switch (choice) {
            case 1:
                return new Spot(property, reservedFee, days);
            case 2:
                return new Installment(property, reservedFee);
            default:
                return null;
        }
    }
}
