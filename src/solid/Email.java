package solid;

public class Email implements Notification {
    @Override
    public void send() {
        System.out.println("Sent email");
    }
}
