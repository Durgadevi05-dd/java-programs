class Notification {

    void sendNotification() {
        System.out.println("Sending Notification");
    }
}

class EmailNotification extends Notification {

    @Override
    void sendNotification() {
        System.out.println("Notification sent through Email");
    }
}

class SMSNotification extends Notification {

    @Override
    void sendNotification() {
        System.out.println("Notification sent through SMS");
    }
}

class WhatsAppNotification extends Notification {

    @Override
    void sendNotification() {
        System.out.println("Notification sent through WhatsApp");
    }
}

public class NotificationSystem {

    public static void main(String[] args) {

        Notification n;

        n = new EmailNotification();
        n.sendNotification();

        n = new SMSNotification();
        n.sendNotification();

        n = new WhatsAppNotification();
        n.sendNotification();
    }
}