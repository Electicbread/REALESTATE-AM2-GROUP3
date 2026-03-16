/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Synthe
 */
public class Agent extends User{
    private double commissionRate;
    private Property[] assignedProperties;

    public Agent(String name, String telNum, double commissionRate, Property[] assignedProperties) {
        super(name, telNum);
        this.commissionRate = commissionRate;
        this.assignedProperties = assignedProperties;
    }
    
    public void manageProperty() {
       System.out.println("Agent is managing assigned properties:");

        if (assignedProperties == null) {
            System.out.println("No properties assigned.");
            return;
        }

        for (Property p : assignedProperties) {
            if (p != null) {
                System.out.println("Property located at: " + p.getLocation());
            }
        } 
    }
    
    public void scheduleViewing(Property property, Buyer buyer) {
        //perhaps we can set specific days of the week and hours
        System.out.println("Viewing scheduled.");
        System.out.println("Buyer: " + buyer.getName());
        System.out.println("Property location: " + property.getLocation());
    }
    
    public void negotiatePrice() {
        //im aSSuming this is will input by agent as a secondary actor
        double price = property.getPrice();
        double negotiatedPrice = price * 0.95;

        System.out.println("Original price: " + price);
        System.out.println("Negotiated price: " + negotiatedPrice);
    }
    
    public void getReport(Report report) {
        //will there be a format for this
        System.out.println("Generating report...");
        report.calculateSalesCount();
    }
    
}
