package solidViolation;

import java.util.Scanner;

public class CreditCard implements Payment{
    int[] num=new int[3];
    Scanner s= new Scanner(System.in);
    @Override
    public void getCardNo() {
        System.out.println("Enter Card No.");
        String card=s.next();
        num[0]=Integer.parseInt(card.substring(0,4));
        num[1]=Integer.parseInt(card.substring(4,8));
        num[2]=Integer.parseInt(card.substring(8,12));
    }

    @Override
    public void getUPI() {

    }

    @Override
    public void getCoupon() {

    }

    @Override
    public void transaction() {
        System.out.println("Card transaction");

    }

}
