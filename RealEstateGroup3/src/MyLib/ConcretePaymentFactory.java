package MyLib;

public class ConcretePaymentFactory extends PaymentFactory {

    @Override
    public PaymentPlan createPaymentPlan(
        int choice,
        Property property,
        double reservedFee,
        float value,
        int term
    ) {

        switch(choice) {
            case 1:
                return new Spot(property, reservedFee, discount, days);

            case 2:
                return new Installment(interest, month, property, reservedFee);

            default:
                return null;
        }
    }
}
