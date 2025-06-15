public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432", "Shreyas");
        context.setPaymentStrategy(creditCard);
        context.payAmount(500.00);

        PaymentStrategy paypal = new PayPalPayment("shreyas@example.com");
        context.setPaymentStrategy(paypal);
        context.payAmount(300.00);
    }
}
