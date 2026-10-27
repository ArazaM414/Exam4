import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ECommerceSystemTest {

    // --- POSITIVE TESTS (Happy Path) ---
    @Test
    public void testAddProductSuccess() {
        ECommerceSystem store = new ECommerceSystem();
        store.addProduct("PROD-101", 5);
        assertEquals(5, store.getStock("PROD-101"));
    }

    @Test
    public void testCalculateTotalWithDiscountSuccess() {
        ECommerceSystem store = new ECommerceSystem();
        double finalPrice = store.calculateTotalWithDiscount(1000.0, 10.0);
        assertEquals(900.0, finalPrice);
    }

    // --- NEGATIVE TESTS (Sad Path / Error Handling) ---
    @Test
    public void testAddProductInvalidQuantity() {
        ECommerceSystem store = new ECommerceSystem();
        assertThrows(IllegalArgumentException.class, () -> {
            store.addProduct("PROD-101", -2);
        });
    }

    @Test
    public void testCalculateTotalWithInvalidDiscount() {
        ECommerceSystem store = new ECommerceSystem();
        assertThrows(IllegalArgumentException.class, () -> {
            store.calculateTotalWithDiscount(500.0, 150.0);
        });
    }
}