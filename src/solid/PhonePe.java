package solid;

import java.util.Scanner;

public class PhonePe implements Payment,UPI{
    String upi;
    String coupon;
    Scanner s= new Scanner(System.in);
    @Override
    public void transaction() {
        System.out.println("PhonePe transaction");
    }
    @Override
    public void getUPI() {
        System.out.println("Enter UPI");
        upi=s.next();
    }

    @Override
    public void getCoupon() {
        System.out.println("Enter coupon no.");
        coupon=s.next();
    }
}
