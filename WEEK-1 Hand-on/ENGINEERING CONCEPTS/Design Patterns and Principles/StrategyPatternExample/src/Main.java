public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.pay(500);

        context.setStrategy(new PayPalPayment());
        context.pay(300);
    }
}
