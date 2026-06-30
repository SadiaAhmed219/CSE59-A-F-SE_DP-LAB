interface MessageSender {
    void sendMessage(String message);
}

class EmailSender implements MessageSender {
    
    public void sendMessage(String message) {
        System.out.println("Email Sent: " + message);
    }
}

class NotificationService {

    private MessageSender sender;

    public NotificationService(MessageSender sender){
        this.sender = sender;
    }
     public void alertUser(String msg) {
        sender.sendMessage(msg);
    }
}
public class Main2 {

    public static void main(String[] args) {

        NotificationService service =
                new NotificationService(new EmailSender());

        service.alertUser("Welcome!");
    }
}
