public class OvernightShipping implements ShippingStrategy {
    public double calculateCost(double weightKg) {
        return 120 + 10 * weightKg;
    }
}
