// Abstraction
interface MessageSender {
    void sendMessage(String message);
}

// Low-level implementation
class EmailSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

// High-level module
class NotificationService {

    private MessageSender messageSender;

    // Dependency Injection
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void alertUser(String msg) {
        messageSender.sendMessage(msg);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        MessageSender sender = new EmailSender();
        NotificationService service = new NotificationService(sender);

        service.alertUser("Hello! DIP Working Example");
    }
}
