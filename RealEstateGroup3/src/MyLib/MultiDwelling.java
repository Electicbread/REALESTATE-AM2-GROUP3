/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Synthe
 */
public class MultiDwelling extends Property {
    private boolean singleFloor;

    public MultiDwelling(double price, String location, String block, String lot, String status, int size, boolean singleFloor) {
        super(price, location, block, lot, status, size);
        this.singleFloor = singleFloor;
    }
    
    @Override
    public void getFeatures(){
        //output somethjing
    }
}
