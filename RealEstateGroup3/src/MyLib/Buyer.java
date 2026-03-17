/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author argee
 */
public class Buyer extends User {
  private double budget;
    private PaymentPlan payment;

    public Buyer(double budget, String name, String telNum) {
        super(name, telNum);
        this.budget = budget;
        
    }

    public String getName() {
        return name;
    }
    

    public void viewProperty(ArrayList<Property> availProperties) {
        int i = 1;
        for (Property property : availProperties) {
          
            System.out.println("Property " + i);
            property.getFeatures();
            System.out.println("Status:" + property.getStatus());
            System.out.println("--------------------");
            i++;
        }
    }    
    
    public void purchaseProperty(ArrayList<Property> availProperties, String block, String lot){
        for (Property property : availProperties) {
            if(property.getBlock().equals(block) && property.getLot().equals(lot)){
                if("Available".equals(property.getStatus())){
                    System.out.println("Property has been purchased!");
                } else {
                    System.out.println("Property cannot be purchased!");
                }
            break;
            }
        }
        
        
    }
}
