package adapter;

public class AdapterTest {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());

        paypalProcessor.processPayment(500.00);
    }
}
