import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void newOrderShouldHaveZeroTotalAmount() {

        Order order = new Order("ORD001");

        assertEquals(0, order.getTotalAmount());
    }

    @Test
    void addItemShouldIncreaseTotalAmount() {

        Order order = new Order("ORD001");

        order.addItem(
                new OrderItem(
                        "P001",
                        "Laptop",
                        1,
                        1000
                )
        );

        assertEquals(1000, order.getTotalAmount());
    }

    @Test
    void getTotalAmountShouldCalculateMultipleItems() {

        Order order = new Order("ORD001");

        order.addItem(
                new OrderItem(
                        "P001",
                        "Laptop",
                        1,
                        1000
                )
        );

        order.addItem(
                new OrderItem(
                        "P002",
                        "Mouse",
                        2,
                        50
                )
        );

        assertEquals(1100, order.getTotalAmount());
    }

    @Test
    void updateStatusShouldChangeOrderStatus() {

        Order order = new Order("ORD001");

        order.updateStatus("SHIPPED");

        assertEquals(
                "SHIPPED",
                order.getStatus()
        );
    }

    @Test
    void updateStatusShouldAllowDeliveredStatus() {

        Order order = new Order("ORD001");

        order.updateStatus("DELIVERED");

        assertEquals(
                "DELIVERED",
                order.getStatus()
        );
    }
}