/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Synthe
 */
public class Filter {
    private Property property;

    public Filter(Property property) {
        this.property = property;
    }
    
    public void filterProperty() {
        //sort thru properties and output those that match the search filter aif thats how u plan to implement it
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
