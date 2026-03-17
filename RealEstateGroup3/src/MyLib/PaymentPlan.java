/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Synthe
 */

import java.util.Scanner; 

public abstract class PaymentPlan {
    protected Property property;
    protected double reservedFee;

    public PaymentPlan(Property property, double reservedFee) {
        this.property = property;
        this.reservedFee = reservedFee;
    }

    public abstract void viewReceipt();
    public abstract double calculatePrice();

    public static PaymentPlan selectPaymentPlan(Property property, int choice) {
        Scanner scanner = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.println("\n-- SPOT PAYMENT --");
                System.out.print("Enter Reservation Fee: ");
                double spotReservedFee = scanner.nextDouble();
                System.out.print("Enter Discount (e.g. 0.05 for 5%): ");
                float discount = scanner.nextFloat();
                System.out.print("Enter Number of Days: ");
                int days = scanner.nextInt();
                return new Spot(property, spotReservedFee, discount, days);

            case 2:
                System.out.println("\n-- INSTALLMENT --");
                System.out.print("Enter Reservation Fee: ");
                double instReservedFee = scanner.nextDouble();
                System.out.print("Enter Interest Rate (e.g. 0.06 for 6%): ");
                float interest = scanner.nextFloat();
                System.out.print("Enter Number of Months: ");
                int months = scanner.nextInt();
                return new Installment(interest, months, property, instReservedFee);

            default:
                System.out.println("Invalid choice!");
                return null;
        }
    }
}
