import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    @Test
    void addStockShouldMakeProductAvailable() {

        Inventory inventory = new Inventory();

        inventory.addStock(
                "P001",
                10
        );

        assertTrue(
                inventory.checkAvailability(
                        "P001",
                        5
                )
        );
    }

    @Test
    void checkAvailabilityShouldReturnTrueWhenEnoughStockExists() {

        Inventory inventory = new Inventory();

        inventory.addStock(
                "P001",
                20
        );

        assertTrue(
                inventory.checkAvailability(
                        "P001",
                        10
                )
        );
    }

    @Test
    void checkAvailabilityShouldReturnFalseWhenStockInsufficient() {

        Inventory inventory = new Inventory();

        inventory.addStock(
                "P001",
                5
        );

        assertFalse(
                inventory.checkAvailability(
                        "P001",
                        10
                )
        );
    }

    @Test
    void reduceStockShouldDecreaseQuantity() {

        Inventory inventory = new Inventory();

        inventory.addStock(
                "P001",
                20
        );

        inventory.reduceStock(
                "P001",
                5
        );

        assertTrue(
                inventory.checkAvailability(
                        "P001",
                        15
                )
        );
    }

    @Test
    void reduceStockShouldNotReduceWhenInsufficientStock() {

        Inventory inventory = new Inventory();

        inventory.addStock(
                "P001",
                5
        );

        inventory.reduceStock(
                "P001",
                10
        );

        assertTrue(
                inventory.checkAvailability(
                        "P001",
                        5
                )
        );
    }
}