public class ExpressShipping implements ShippingStrategy {
    public double calculateCost(double weightKg) {
        return 80 + 8 * weightKg;
    }
}
