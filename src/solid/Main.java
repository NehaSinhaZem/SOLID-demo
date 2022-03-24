package solid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Select burger");
        System.out.println("1. Paneer burger");
        System.out.println("2. Chicken burger");
        int op;
        Burger burger=null;
        do {
            op = s.nextInt();
            switch (op) {
                case 1 -> burger = new PaneerExtraCheeseBurger();
                case 2 -> burger = new ChickenBurger();
                case 3 -> System.exit(0);
                default -> {
                    burger = new ClassicBurger();
                    System.out.println("We only have these options. Choose from these or Press 3 for exit");
                }
            }
        }while(op<0 || op>3);
        burger.display();
        System.out.println("How many do you want?");
        int n=s.nextInt();
        Order order = new Order(burger,n);
        order.total();
        System.out.println("How do want to pay?\n1.Credit Card\n2.GPay\n3.PhonePe");
        do {
            op = s.nextInt();
            switch (op) {
                case 1:
                    CardPayment card = new CardPayment();
                    card.getCardNo();
                    card.transaction();
                    break;
                case 2:
                    GPay pay = new GPay();
                    pay.getUPI();
                    pay.transaction();
                    break;
                case 3:
                    PhonePe phonePe = new PhonePe();
                    phonePe.getUPI();
                    phonePe.transaction();
                    break;
                default:
                    System.out.println("Choose an option ");
            }
        }while(op<1 || op>3);
        List<Notification> modes = new ArrayList<>();
        modes.add(new Email());
        modes.add(new SMS());
        OrderNotification orderNotification = new OrderNotification(modes);
        orderNotification.send();
    }
}

