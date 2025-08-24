public class OrderService {
    TaxCalculator taxCalculator = new TaxCalculator();
    EmailClient email = new EmailClient();
    OrderRepository orderRepository = new OrderRepository();

    void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.calculateTotal(subtotal);
        email.send(customerEmail, "Thanks! Your total is " + total);
        orderRepository.saveOrder(customerEmail, total);
    }
}