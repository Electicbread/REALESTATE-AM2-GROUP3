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
    
    public void negotiatePrice(Property property, String inputPrice) {
        try {
        double newPrice = Double.parseDouble(inputPrice); //parseDouble throws the error below if the input is NOT A DOUBLE
        double floorPrice = property.getPrice() * 0.96; // prevents Agents from giving a price way too low, change this if u want
            
            if (newPrice <= 0) {
                System.out.println("Error: Invalid Input (Positive Input Only");
            } else if (newPrice < floorPrice) {
                System.out.println("Error: Price Too Low! (96% of the Property Price Minimum"); // and also figure out a way to have it select which property, but then it is a secondary actor here, so how to best involve buyer?
            } else {
                property.price = newPrice;
                System.out.println("Negotiated Price updated successfully.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid Input (Not Numeric)");
        }   // god knows how to implement in a jframe honestly, perhaps link a textbox here?
}
    
    public void getReport(Report report) {
        //will there be a format for this
    }
    
}
