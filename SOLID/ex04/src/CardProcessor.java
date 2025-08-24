public class CardProcessor implements PaymentProcessor {
    public String processPayment(double amount) {
        return "Charged card: " + amount;
    }
}
