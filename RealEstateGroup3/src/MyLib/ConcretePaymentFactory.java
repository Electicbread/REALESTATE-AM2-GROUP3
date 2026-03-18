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
                return new Installment(interest, month, property, 20000);

            default:
                return null;
        }
    }
}

