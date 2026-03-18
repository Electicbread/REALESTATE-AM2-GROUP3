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
    protected double price;
    protected String location;
    protected String block;
    protected String lot;
    protected String status;
    protected int size;

    public Property(double price, String location, String block, String lot, int size) {
        this.price = price;
        this.location = location;
        this.block = block;
        this.lot = lot;
        this.size = size;
    }

    public double getPrice(){
        return price;
    }
    
    public abstract void getFeatures();

    public String getStatus() {
        return status;
    }

    public String getBlock() {
        return block;
    }

    public String getLot() {
        return lot;
    }
    
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
