package solid;

public class PaneerBurger implements Burger{
    String name="Paneer Burger";
    String patty="Paneer";
    double price=80;
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
        return name;
    }
    @Override
    public void display() {
        System.out.println("Veg burger");
        System.out.println(name+" having "+ patty+"\tPrice:"+price);
    }
}
