package solid;

import java.util.Scanner;

public class CardPayment implements Payment,Card{
    int[] num= new int[3];
    Scanner s= new Scanner(System.in);
    @Override
    public void transaction() {
        System.out.println("Card transaction");
    }

    @Override
    public void getCardNo() {
        System.out.println("Enter Card No.");
        String card=s.nextLine();
        String t=card.substring(0,4);
        num[0]=Integer.parseInt(t);
        num[1]=Integer.parseInt(card.substring(4,8));
        num[2]=Integer.parseInt(card.substring(8,12));
    }
}
