package solidViolation;

import java.util.Scanner;

public class Burger {
    double price;
    String name;
    String patty;
    Burger() {
        price = 50;
        name = "Classic Burger";
        patty="Paneer";
    }
    public void display(){
//        System.out.println("Veg burger");
        System.out.println(name+" having "+ patty+"\tPrice:"+price);//liskov, burger interface
    }
    public void order(int q){//single, create order class
        Delivery delivery = new Delivery(price*q);
        double total = delivery.calculateGST()+delivery.calculateDeliveryCharge();
        System.out.println("Your total is "+total);
        System.out.println("How do want to pay?\n1.Credit Card\n2.GPay\n3.PhonePe");
        Scanner s= new Scanner(System.in);
        int op;
        do {
            op = s.nextInt();
            switch (op) {
                case 1:
                    CreditCard card = new CreditCard();
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
        Email email = new Email();//di
        email.send();
        SMS sms= new SMS();//notification interface.send();
        sms.send();
    }
    /*OrderTotal{calculateDeliveryCharge();gst();}
pickup extends Ordertotal{}
    delivery extends Ordertotal{}
    calculateDEliveryChrage{}
    gst{}*/

}
