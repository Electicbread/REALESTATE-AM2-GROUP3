/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;
import java.text.DecimalFormat;
/**
 *
 * @author Synthe
 */
public class Spot extends PaymentPlan{
    private float discount;
    private int days;
    private static String pattern = "0.00";
    private static DecimalFormat df = new DecimalFormat(pattern);

    public Spot(Property property, double reservedFee, float discount, int days) {
        super(property, reservedFee);
        this.discount = discount;
        this.days = days;
    }
    
    @Override
    public double calculatePrice() {
        //return super.reservedFee * discount; //i forgot what the base price is i mean we havent added the full calculation logic
        double priceMinusReserved = super.property.getPrice() - super.reservedFee;
        double spotPrice = priceMinusReserved - (priceMinusReserved * discount);//discount is based on days so if statement
        return Math.round(spotPrice * 100.00)/100.00;
    }
    
    @Override
    public void viewReceipt() {
        //is there a format we want to follow?
        System.out.println("Total Contract Price: " + df.format(super.property.getPrice()));
        System.out.println("Reservation Fee: " + df.format(super.reservedFee));
        System.out.println("Discount: " + df.format(discount));
        System.out.println("Final Price: " + df.format(calculatePrice()));
    }
}    
