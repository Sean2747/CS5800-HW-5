package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    void oneItemAndWithoutDiscountTest() {
        var burger = new Base(10.00);
        var order = new Order("regular");
        order.addItem(burger);
        assertEquals(10.00, order.orderPrice());
    }

    @Test
    void multipleItemsWithMemberDiscountTest() {
        var burger = new Base(10.00);
        var burgerWithBacon = new ToppingDecorator(burger, 2.00);
        var order = new Order("member");
        order.addItem(burger);
        order.addItem(burgerWithBacon);
        assertEquals(0.9 * (10.00 + 12.00), order.orderPrice());
    }

    @Test
    void multipleItemsWithPremiumDiscountTest() {
        var burger = new Base(10.00);
        var burgerWithBacon = new ToppingDecorator(burger, 2.00);
        var order = new Order("premium");
        order.addItem(burger);
        order.addItem(burgerWithBacon);
        assertEquals(0.75 * (10.00 + 12.00), order.orderPrice());
    }
}