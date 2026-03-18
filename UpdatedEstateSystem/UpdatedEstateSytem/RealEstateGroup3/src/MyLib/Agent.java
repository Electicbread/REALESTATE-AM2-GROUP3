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
    private Property[] assignedProperties;

    public Agent(String name, String telNum, Property[] assignedProperties) {
        super(name, telNum);
        this.assignedProperties = assignedProperties;
    }

    @Override
    public String getName() {
        return name;
    }
    
    
    
    public void manageProperty(Property property, int choice) {
        switch (choice) {
            case 1 -> property.status = "Available";
            case 2 -> property.status = "Reserved";
            case 3 -> property.status = "Sold";
            default -> System.out.println("Invalid status selection.");
    }
}
    
    public void scheduleViewing(Property property, Buyer buyer, String month, int day, int year, String time) {
        if ("Sold".equals(property.getStatus())) { //check first if property already sold by the time of scheduling
            System.out.println("Viewing cancelled: This property is already sold.");
        } else {
            System.out.println("--- VIEWING SCHEDULED ---");
            System.out.println("Buyer: " + buyer.getName());
            System.out.println("Agent: " + name);
            System.out.println("Property: Block " + property.getBlock() + " Lot " + property.getLot());
            System.out.println("Date: " + month + " " + day + ", " + year);
            System.out.println("Time: " + time);
        }
}
    
    public void negotiatePrice(Property property, String inputPrice) {
        try {
            double newPrice = Double.parseDouble(inputPrice); //parseDouble throws the error below if the input is NOT A DOUBLE
            double floorPrice = property.getPrice() * 0.96; // prevents Agents from giving a price way too low, change this if u want
            
            if (newPrice <= 0) {
                System.out.println("Error: Invalid Input (Positive Input Only");
            } else if (newPrice < floorPrice) {
                System.out.println("Negotiation failed: Price is too low.");
            } else {
                property.price = newPrice;
                System.out.println("Negotiated Price updated successfully.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid Input (Not Numeric)");
        }   // god knows how to implement in a jframe honestly, perhaps link a textbox here?
}
    
    public void getReport(Report report) {
        int soldCount = 0;
        double totalSalesValue = 0;

        System.out.println("======= AGENT SALES REPORT =======");
        System.out.println("Agent Name: " + this.getName());
        System.out.println("----------------------------------");

        System.out.println("PROPERTIES LOG:");
        if (assignedProperties != null) {
            for (Property p : assignedProperties) {
                String status = (p.getStatus() == null) ? "Not Set" : p.getStatus();
                
                System.out.println("- " + p.getBlock() + " " + p.getLot() + " | Status: " + status);
                
                // if its sold, it counts
                if ("Sold".equals(status)) {
                    soldCount++;
                    totalSalesValue += p.getPrice();
                }
            }
        }

        System.out.println("----------------------------------");
        System.out.println("TOTAL SUCCESSFUL SALES: " + soldCount);
        
        // output how much sold total by this particular agent
        System.out.printf("TOTAL SALES VOLUME: PHP %.2f%n", totalSalesValue);
        System.out.println("==================================");
    }
    
}
