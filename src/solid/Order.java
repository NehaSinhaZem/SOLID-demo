package solid;

public class Order {
    double total;
    Delivery delivery;
    Order(Burger b,int n){
        total=b.getPrice()*n;
    }
    public void total(){
        delivery= new NightDeliveryCharge();
        total+=delivery.charge()+calculateGST();
        System.out.println("Your total is "+total);
    }
    double calculateGST(){
        return total*0.05;
    }
}
