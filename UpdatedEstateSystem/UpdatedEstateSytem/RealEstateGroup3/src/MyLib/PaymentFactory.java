package MyLib;

public abstract class PaymentFactory {

    public abstract PaymentPlan createPaymentPlan(
        int days,
        int month,
        Property property,
        float interest,
        float discount,
        double reservedFee
    );
}
