package solidViolation;

public class Delivery extends Order{
    static int count=30;
    Delivery(double total) {
        super(total);
    }
    double calculateDeliveryCharge() {
            boolean night=true;
            boolean special=true;
            boolean premium=true;
            double charge=20;
            if(night)
                charge=40;
            else if(special)
                charge=60;
            else if(premium)
                charge=0;
            return charge;
        }
    void trackOrder() {
        System.out.println(count--);
    }
}
