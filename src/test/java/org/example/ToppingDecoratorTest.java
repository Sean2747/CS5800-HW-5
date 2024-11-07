package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ToppingDecoratorTest {

    @Test
    void priceWithToppingTest() {
        Food cheeseburger = new Base(13.99);
        Food cheeseburgerWithMushroom = new ToppingDecorator(cheeseburger, 1.50);
        assertEquals(15.49, cheeseburgerWithMushroom.getPrice());
    }

    @Test
    void multipleToppingsTest() {
        Food cheeseburger = new Base(13.99);
        Food cheeseburgerWithBaconAndMushroom = new ToppingDecorator(new ToppingDecorator(cheeseburger, 1.50), 1.99);

        assertEquals(17.48, cheeseburgerWithBaconAndMushroom.getPrice());
    }

    @Test
    void noToppingTest() {
        Food cheeseburger = new Base(13.99);
        assertEquals(13.99, cheeseburger.getPrice());
    }

    @Test
    void freeToppingTest() {
        Food cheeseburger = new Base(13.99);
        Food cheeseburgerWithFreeTopping = new ToppingDecorator(cheeseburger, 0.0);
        assertEquals(13.99, cheeseburgerWithFreeTopping.getPrice());
    }
}