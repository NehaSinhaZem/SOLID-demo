package solid;

public class SMS implements Notification{
    @Override
    public void send() {
        System.out.println("Sent SMS");
    }
}
