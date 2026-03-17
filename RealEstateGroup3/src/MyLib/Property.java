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
    
    public abstract void getFeatures();

    public double getPrice() {
        return price;
    }

    public String getLocation() {
        return location;
    }

    public String getBlock() {
        return block;
    }

    public String getLot() {
        return lot;
    }

    public String getStatus() {
        return status;
    }

    public int getSize() {
        return size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
}

