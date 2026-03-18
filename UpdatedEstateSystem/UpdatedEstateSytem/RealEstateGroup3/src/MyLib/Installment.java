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
public class Installment extends PaymentPlan{
    private float interest;
    private int month;
    private static String pattern = "0.00";
    private static DecimalFormat df = new DecimalFormat(pattern);

    public Installment(float interest, int month, Property property, double reservedFee) {
        super(property, reservedFee);
        this.interest = interest;
        this.month = month;
    }
    
    @Override
   public double calculatePrice() {
        double downPaymentPrice = super.property.getPrice() * 0.2;
        double netDownPayment = downPaymentPrice - super.reservedFee;
        double twelveMonthEquity = netDownPayment/12;
        return Math.round(twelveMonthEquity * 100.00)/100.00;
    }
    
    public double calculateTotalLoan() {
        double loanPrice = super.property.getPrice() * 0.8;
        return Math.round(loanPrice * 100.00)/100.00;
    }
    
    public double calculatePagIbig() {
        double pagIbigMonthly = calculateTotalLoan() * ((interest/12) * (Math.pow(1 + (interest/12), month))/(Math.pow(1 + (interest/12), month)-1));
        return Math.round(pagIbigMonthly * 100.00)/100.00;
    }
    
    public void viewReceipt() {
        System.out.println("Down Payment: " + df.format(calculatePrice()));
        System.out.println("Loan Price: " + df.format(calculateTotalLoan()));
        System.out.println("PAG-IBIG Fee: " + df.format(calculatePagIbig()));
    }
}
