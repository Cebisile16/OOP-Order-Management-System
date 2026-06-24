import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderItemTest {

    @Test
    void constructorShouldCreateOrderItemCorrectly() {

        OrderItem item =
                new OrderItem(
                        "P001",
                        "Laptop",
                        2,
                        1000
                );

        assertEquals(2000, item.getTotal());
    }

    @Test
    void getTotalShouldCalculateCorrectAmount() {

        OrderItem item =
                new OrderItem(
                        "P001",
                        "Laptop",
                        3,
                        500
                );

        assertEquals(1500, item.getTotal());
    }

    @Test
    void getTotalShouldReturnZeroWhenQuantityZero() {

        OrderItem item =
                new OrderItem(
                        "P001",
                        "Laptop",
                        0,
                        500
                );

        assertEquals(0, item.getTotal());
    }
}