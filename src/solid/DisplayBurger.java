package solid;

public class DisplayBurger {
    public void display(Burger burger){
        System.out.println(burger.getName()+" having "+ burger.getPatty()+"\tPrice:"+burger.getPrice());
    }
}
