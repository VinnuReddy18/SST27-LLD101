
public class PaymentService {
    String pay(Payment p) {
        PaymentProcessor processor = getProcessor(p.provider);
        return processor.processPayment(p.amount);
    }

    private PaymentProcessor getProcessor(String provider) {
        switch (provider) {
            case "CARD":
                return new CardProcessor();
            case "UPI":
                return new UpiProcessor();
            case "WALLET":
                return new WalletProcessor();
            default:
                throw new RuntimeException("No provider");
        }
    }
}