package solid;

public class ClassicBurger implements Burger {
    String name = "Classic Burger";
    String patty = "Paneer";
    double price = 50;

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
        System.out.println(name + " having " + patty + "\tPrice:" + price);
    }

}
