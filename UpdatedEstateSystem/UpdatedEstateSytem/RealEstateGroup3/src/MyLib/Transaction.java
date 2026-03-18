/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;
import java.util.ArrayList;
/**
 *
 * @author Synthe
 */
public class Transaction {
    private Buyer buyer;
    private Owner owner;
    private Agent agent;
    private PaymentPlan paymentPlan;
    private Date date;
    private Property property;

    // added arraylist to store transactions in... transactions, let me know if static is a problemo
    public static ArrayList<Transaction> transactions = new ArrayList<>();

    public Transaction(Buyer buyer, Owner owner, Agent agent, PaymentPlan paymentPlan, Date date, Property property) {
        this.buyer = buyer;
        this.owner = owner;
        this.agent = agent;
        this.paymentPlan = paymentPlan;
        this.date = date;
        this.property = property;
        // adds the current transaction to the arraylist
        transactions.add(this);
    }
    
    public void viewRecord() {
        int count = 1;
        for (Transaction t : transactions) {
            System.out.println("======= TRANSACTION #" + count +  " ======="); // logs and sorts transactions by #
            System.out.println("Buyer: " + t.buyer.getName());
            System.out.println("Owner: " + t.owner.getName());
            System.out.println("Agent: " + t.agent.getName());
            t.paymentPlan.viewReceipt();
            t.property.getFeatures();
            t.date.getDate();
            System.out.println("-----------------------------------");
            System.out.println();
            
            count++;
        }
    }
}
