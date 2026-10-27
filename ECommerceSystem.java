import java.util.HashMap;
import java.util.Map;

public class ECommerceSystem {
    private Map<String, Integer> inventory = new HashMap<>();

    public void addProduct(String productId, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }
        inventory.put(productId, inventory.getOrDefault(productId, 0) + quantity);
    }

    public int getStock(String productId) {
        return inventory.getOrDefault(productId, 0);
    }

    public double calculateTotalWithDiscount(double price, double discountPercent) {
        if (price < 0 || discountPercent < 0 || discountPercent > 100) {
            throw new IllegalArgumentException("Invalid price or discount percentage");
        }
        double discountAmount = price * (discountPercent / 100.0);
        return price - discountAmount;
    }
}