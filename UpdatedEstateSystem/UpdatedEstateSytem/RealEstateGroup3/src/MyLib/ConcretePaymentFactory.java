package MyLib;

public class ConcretePaymentFactory extends PaymentFactory {

    private int choice;

    @Override
    public PaymentPlan createPaymentPlan(
        int days,
        int month,
        Property property,
        float interest,
        float discount,
        double reservedFee
    ) {

        switch(choice) {
            case 1:
                if(days == 0){
                    discount = (float) 0.08;
                }
                else if(days == 15){
                    discount = (float) 0.05;
                }
                else if (days == 30){
                    discount = (float) 0.03;
                }
                return new Spot(property, 20000, discount, days);

            case 2:
                if("Block A".equals(property.getBlock())){
                    if(month == 60 || month == 120 || month == 240 || month == 360){
                        interest = (float) (9.38/100);
                    }
                } else if("Block B".equals(property.getBlock())){
                    if(month == 60 || month == 120 || month == 240 || month == 360){
                        interest = (float) (12.66/100);
                    }
                } else if("Block C".equals(property.getBlock())){
                    if(month == 60 || month == 120 || month == 240 || month == 360){
                        interest = (float) (13.61/100);
                    }
                } else if("Block D".equals(property.getBlock())){
                    if(month == 60 || month == 120 || month == 240 || month == 360){
                        interest = (float) (11.08/100);
                    }
                } else if("Block E".equals(property.getBlock())){
                    if(month == 60 || month == 120 || month == 240 || month == 360){
                        interest = (float) (11.91/100);
                    }
                }
                return new Installment(interest, month, property, 20000);

            default:
                return null;
        }
    }
}

