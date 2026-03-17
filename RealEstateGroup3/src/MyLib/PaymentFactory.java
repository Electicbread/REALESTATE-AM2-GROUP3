package MyLib;

public class PaymentFactory {

    public static PaymentPlan createPlan(int choice, Property property) {

        switch(choice) {

            case 1:
                return new Spot(property, 50000, 0.10);

            case 2:
                return new Installment(property, 50000, 0.20, 12);

            default:
                return null;
        }
    }
}
