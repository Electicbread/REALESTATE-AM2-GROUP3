package MyLib;

public abstract class PaymentFactory {

    public abstract PaymentPlan createPaymentPlan(
        int choice,
        Property property,
        double reservedFee,
        int term
    );
}
