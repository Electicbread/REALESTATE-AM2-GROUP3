/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Synthe
 */
public class SingleAttached extends Property{
   public SingleAttached(double price, String location, String block, String lot, int size) {
        super(price, location, block, lot, size);
  
    }
    
    @Override
    public void getFeatures() {
        System.out.println("Price: " + super.price);
        System.out.println("Location: " + super.location);
        System.out.println("Block: " + super.block);
        System.out.println("Lot: " + super.lot);
        System.out.println("size: " + super.size + " sqm");
    }
}
