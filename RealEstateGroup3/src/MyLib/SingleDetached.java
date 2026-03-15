/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Synthe
 */
public class SingleDetached extends Property {
    private boolean carPort;
    private boolean twoFloor;

    public SingleDetached(double price, String location, String block, String lot, String status, int size, boolean carPort, boolean twoFloor) {
        super(price, location, block, lot, status, size);
        this.carPort = carPort;
        this.twoFloor = twoFloor;
    }
    
    @Override
    public void getFeatures() {
        //plz output somthing
    }
}
