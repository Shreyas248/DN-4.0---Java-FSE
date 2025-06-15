package decorator;

public class DecoratorTest{
    public static void main(String[] args){
        Notifier email = new EmailNotifier();
        Notifier sms = new SMSNotifierDecorator(email);
        sms.send("System maintenance scheduled for 10 PM");
    }
}
