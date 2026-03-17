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
    
    public void manageProperty(Property property, int choice) {
        switch (choice) {
            case 1 -> property.status = "Available";
            case 2 -> property.status = "Reserved";
            case 3 -> property.status = "Sold";
            default -> System.out.println("Invalid status selection.");
    }
    
    public void scheduleViewing(Property property, Buyer buyer) {
        //perhaps we can set specific days of the week and hours
    }
    
    public void negotiatePrice() {
        //im aSSuming this is will input by agent as a secondary actor
    }
    
    public void getReport(Report report) {
        //will there be a format for this
    }
    
}
