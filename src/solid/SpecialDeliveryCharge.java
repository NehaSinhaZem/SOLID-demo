package solid;

public class SpecialDeliveryCharge extends Delivery{
    @Override
    public double charge() {
        return 60;
    }
}
