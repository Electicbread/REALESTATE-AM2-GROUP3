/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Synthe
 */
public class Transaction {
    private Buyer buyer;
    private Owner owner;
    private PaymentPlan payment;
    private Date date; 
    private Agent agent;
    private Property property;

    public Transaction(Buyer buyer, Owner owner, PaymentPlan payment, Date date, Agent agent, Property property) {
        this.buyer = buyer;
        this.owner = owner;
        this.payment = payment;
        this.date = date;
        this.agent = agent;
        this.property = property;
    }
    
    public void viewRecord() {
        System.out.println("TRANSACTION RECORD");

        System.out.println("Buyer: " + buyer.name);
        System.out.println("Owner: " + owner.name);
        System.out.println("Agent: " + agent.name);

        System.out.println("Property Details");
        property.getFeatures();

        System.out.println("Payment Details");
        payment.viewReceipt();

        System.out.println("Date: " + date.getDate());
    }
}
