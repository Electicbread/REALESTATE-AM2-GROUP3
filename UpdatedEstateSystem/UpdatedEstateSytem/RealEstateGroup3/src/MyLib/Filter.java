/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;
import java.util.ArrayList;
/**
 *
 * @author Synthe
 */
public class Filter {
    private Property property; 

    public Filter(Property property) {
        this.property = property;
    }

    public void filterProperty(ArrayList<Property> allProperties,
                               String block, String lot,
                               double minPrice, double maxPrice,
                               int minSize, int maxSize) {

        System.out.println("Filtered Properties:");

        for (Property p : allProperties) {
            boolean matches = true;

            // Filter by block
            if (block != null && !p.getBlock().equals(block)) {
                matches = false;
            }

            // Filter by lot
            if (lot != null && !p.getLot().equals(lot)) {
                matches = false;
            }

            // Filter by price range
            if ((minPrice >= 0 && p.getPrice() < minPrice) ||
                (maxPrice >= 0 && p.getPrice() > maxPrice)) {
                matches = false;
            }

            // Filter by size range
            if ((minSize >= 0 && p.size < minSize) ||
                (maxSize >= 0 && p.size > maxSize)) {
                matches = false;
            }

            // Print matching property
            if (matches) {
                System.out.println("Block " + p.getBlock() + ", Lot " + p.getLot() +
                        ", Price: " + p.getPrice() +
                        ", Size: " + p.size + " sqm" +
                        ", Status: " + p.getStatus());
            }
        }
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
