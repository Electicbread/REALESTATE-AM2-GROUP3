/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author argee
 */
public abstract class Property {
    private double price;
    private String location;
    private String block;
    private String lot;
    private String status;
    private int size;

    public Property(double price, String location, String block, String lot, String status, int size) {
        this.price = price;
        this.location = location;
        this.block = block;
        this.lot = lot;
        this.status = status;
        this.size = size;
    }

    public double getPrice(){
        return price;
    }
    
    public abstract void getFeatures();
    
}
