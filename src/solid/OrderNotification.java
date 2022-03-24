package solid;

import java.util.List;

public class OrderNotification {
    List<Notification> list;
    OrderNotification(List<Notification> list){
        this.list=list;
    }
    void send(){
        for(Notification n:list)
            n.send();
    }
}
