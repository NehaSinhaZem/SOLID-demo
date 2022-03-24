package solidViolation;

public abstract class Order {
    double total;
    Order(double total){
        this.total=total;
    }
    abstract double calculateDeliveryCharge();
    abstract void trackOrder();
    double calculateGST(){
        return total*0.05;
    }
}
