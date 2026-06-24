import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Create inventory
        Inventory inventory = new Inventory();

        // Add stock
        inventory.addStock("P001", 50);
        inventory.addStock("P002", 30);

        // Create order
        Order order = new Order("ORD001");

        // Add items to order
        order.addItem(
                new OrderItem(
                        "P001",
                        "Laptop",
                        1,
                        999.99
                )
        );

        order.addItem(
                new OrderItem(
                        "P002",
                        "Mouse",
                        2,
                        29.99
                )
        );

        // Generate invoice
        System.out.println("Original Order");
        order.generateInvoice();

        // Update status
        order.updateStatus("SHIPPED");

        // Display updated order
        System.out.println("\nUpdated Order");
        order.generateInvoice();
    }
}