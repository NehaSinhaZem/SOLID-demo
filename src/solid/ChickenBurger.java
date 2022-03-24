package solid;

public class ChickenBurger implements Burger{
    String name="Chicken Burger";
    String patty="Chicken";
    double price=100;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getPatty() {
        return patty;
    }

    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public void display() {
        System.out.println("NonVeg burger");
        System.out.println(name+" having "+ patty+"\tPrice:"+price);
    }
}
