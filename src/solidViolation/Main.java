package solidViolation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int op;
        Burger burger=null;
        System.out.println("Select burger");
        System.out.println("1. Paneer burger");
        System.out.println("2. Chicken burger");
        do {
            op = s.nextInt();
            switch (op) {
                case 1 -> burger = new PaneerBurger();
                case 2 -> burger = new ChickenBurger();
                case 3 -> System.exit(0);
                default -> {
                    burger = new Burger();
                    System.out.println("We only have these options. Choose from these or Press 3 for exit");
                }
            }
        }while(op<0 || op>3);
        burger.display();
        System.out.println("How many do you want?");
        int n=s.nextInt();
        burger.order(n);
    }
}
