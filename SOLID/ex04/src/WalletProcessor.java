public class WalletProcessor implements PaymentProcessor {
    public String processPayment(double amount) {
        return "Wallet debit: " + amount;
    }
}
