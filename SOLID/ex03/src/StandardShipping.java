public class StandardShipping implements ShippingStrategy {
    public double calculateCost(double weightKg) {
        return 50 + 5 * weightKg;
    }
}
