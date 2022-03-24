package solidViolation;

public class Pickup extends Order{
    Pickup(double total) {
        super(total);
    }
    double calculateDeliveryCharge() {
        try {
            throw new Exception("Does not imply delivery charge");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    void trackOrder(){
        try {
            throw new Exception("It's pick-up order");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
