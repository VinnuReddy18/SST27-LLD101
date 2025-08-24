public class OrderRepository {
    public void saveOrder(String customerEmail, double total) {
        System.out.println("Order stored (pretend DB). Customer: " + customerEmail + ", Total: " + total);
    }
}
