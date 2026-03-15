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
    private boolean twoFloor;

    public SingleAttached(double price, String location, String block, String lot, String status, int size, boolean twoFloor) {
        super(price, location, block, lot, status, size);
        this.twoFloor = twoFloor;
    }
    
    @Override
    public void getFeatures() {
        
    }
}
