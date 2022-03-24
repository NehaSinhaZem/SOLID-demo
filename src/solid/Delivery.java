package solid;

public class Delivery implements OrderCharge,OrderTracking {
    static int count=30;
    public double charge(){
        return 20;
    }

    @Override
    public void trackOrder() {
        System.out.println(count--);
    }
}
