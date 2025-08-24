public class UpiProcessor implements PaymentProcessor {
    public String processPayment(double amount) {
        return "Paid via UPI: " + amount;
    }
}
