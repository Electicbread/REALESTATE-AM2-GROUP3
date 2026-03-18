/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Synthe
 */
public class Report {
    private int totalSalesCount;

    public Report(int totalSalesCount) {
        this.totalSalesCount = totalSalesCount;
    }
    
    public int calculateSalesCount() {
        return totalSalesCount; //placeholder
    }
    
    public void trackSales(Transaction transaction) {
        //insert logic here
    }
}
