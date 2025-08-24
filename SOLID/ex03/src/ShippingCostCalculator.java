public class ShippingCostCalculator {
    double cost(Shipment s) {
        ShippingStrategy strategy = getStrategy(s.type);
        return strategy.calculateCost(s.weightKg);
    }

    private ShippingStrategy getStrategy(String type) {
        if ("STANDARD".equals(type))
            return new StandardShipping();
        if ("EXPRESS".equals(type))
            return new ExpressShipping();
        if ("OVERNIGHT".equals(type))
            return new OvernightShipping();
        throw new IllegalArgumentException("Unknown type: " + type);
    }
}
