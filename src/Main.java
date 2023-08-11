import sun.plugin2.message.Message;

public class Main {
    public static void main(String[] args) {
        MessageService sms = new SMSMessagingService();
        MessageService email = new EmailMessagingService();
        MessageService whatsapp = new WhatsAppMessagingService();

        sms.sendMessage();
        email.sendMessage();
        whatsapp.sendMessage();
    }
}

interface MessageService {
    void sendMessage();
}

class SMSMessagingService implements MessageService {
    @Override
    public void sendMessage() {
        System.out.println("Sending SMS message");
    }
}

class EmailMessagingService implements MessageService {
    @Override
    public void sendMessage() {
        System.out.println("Sending email message");
    }
}

class WhatsAppMessagingService implements MessageService {
    @Override
    public void sendMessage() {
        System.out.println("Sending WhatsApp message");
    }
}