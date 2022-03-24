package solid;

import java.util.Scanner;

public class GPay implements Payment,UPI{
    String upi;
    String coupon;
    Scanner s= new Scanner(System.in);
    @Override
    public void getUPI() {
        System.out.println("Enter UPI");
        upi=s.next();
    }

    @Override
    public void getCoupon() {
        System.out.println("Enter coupon code");
        coupon=s.next();
    }

    @Override
    public void transaction() {
        System.out.println("GPay transaction");
    }
}
