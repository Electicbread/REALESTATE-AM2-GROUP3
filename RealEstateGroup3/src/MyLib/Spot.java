/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Synthe
 */
public class Spot extends PaymentPlan{
    private float discount;
    private int days;

    public Spot(Property property, double reservedFee, float discount, int days) {
        super(property, reservedFee);
        this.discount = discount;
        this.days = days;
    }
    
    @Override
    public double calculatePrice() {
        //return super.reservedFee * discount; //i forgot what the base price is i mean we havent added the full calculation logic
        double priceMinusReserved = super.property.getPrice - super.reservedFee;
        double spotPrice = priceMinusReserved * discount;//discount is based on days so if statement
        return spotPrice;
    }
    
    public void viewReceipt() {
        //is there a format we want to follow?
    }
}
