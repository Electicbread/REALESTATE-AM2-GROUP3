/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Synthe
 */
public class Owner {
    //array here
    public String email;

    public Owner(String num, String telNum, String email) {
        super(String telNum,  String email);
        this.email = email;
    }
    
      public void listProperty() {
        int blockCount = 5;
        int lotCount = 20;
        
        for(int i = 1; i <= blockCount; i++){
            for(int j = 1; j <= lotCount; j++){
                Property addProperty = null;
                if(i == 1 ){
                    double price = 1170000;
                    String location = "Eastborough Angono Place (Multi Dwelling Residency) ";
                    String block = "Block " + i;
                    String lot = "Lot " + j;
                    int size = 90;
                    addProperty = new MultiDwelling(price, location, block, lot, size);
                } else if (i == 2){
                    double price = 1465000;
                    String location = "Eastborough Angono Place (Single Attached (Basic)) ";
                    String block = "Block " + i;
                    String lot = "Lot " + j;
                    int size = 75;
                    addProperty = new SingleAttached(price, location, block, lot, size);
                } else if (i == 3){
                    double price = 1747000;
                     String location = "Eastborough Angono Place (Single Attached (Executive)) ";
                    String block = "Block " + i;
                    String lot = "Lot " + j;
                    int size = 75;
                    addProperty = new SingleAttached(price, location, block, lot, size);
                } else if(i == 4){
                    double price = 1170000;
                    String location = "Eastborough Angono Place (Single Attached (Luxury)) ";
                    String block = "Block " + i;
                    String lot = "Lot " + j;
                    int size = 136;
                    addProperty = new SingleAttached(price, location, block, lot, size);
                } else if (i == 5){
                    double price = 1170000;
                    String location = "Eastborough Angono Place (Single Detached (Luxury)) ";
                    String block = "Block " + i;
                    String lot = "Lot " + j;
                    int size = 180;
                    addProperty = new SingleDetached(price, location, block, lot, size);
                }
                if (property != null){
                    addProperty.setStatus("Available");
                    this.property.add(addProperty);
                }
            }       
        }
    }

     public ArrayList<Property> getProperty() {
        return property;
    }
    
    public void getReport(Report report) {
        
    }
    
    public void updatePropertyDetails(Property) {
        //identifier expected
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
