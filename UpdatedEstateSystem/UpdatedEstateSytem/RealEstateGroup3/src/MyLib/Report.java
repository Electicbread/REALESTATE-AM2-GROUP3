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
        return totalSalesCount;
    }

    public void trackSales() {
        int count = 0;

        for (Transaction t : Transaction.transactions) {
            if (t != null && t.getProperty() != null) {
                if ("Sold".equals(t.getProperty().getStatus())) {
                    count++;
                }
            }
        }

        totalSalesCount = count;
    }
}
