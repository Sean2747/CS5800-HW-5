package org.example;

public class Main {
    public static void main(String[] args) {
        Food cheeseburger = new Base(13.99);
        Food cheeseburgerWithMushroom = new ToppingDecorator(cheeseburger,1.50);
        Food cheeseburgerWithBacon = new ToppingDecorator(cheeseburger, 1.99);
        Food fries = new Base(5.99);
        Food friesWithButter = new ToppingDecorator(fries, 1.00);

        Order order = new Order("premium");
        order.addItem(cheeseburgerWithMushroom);
        order.addItem(cheeseburgerWithBacon);
        order.addItem(friesWithButter);

        System.out.println("Order Summary:");
        System.out.println("Cheeseburger with mushroom: $" + cheeseburgerWithMushroom.getPrice());
        System.out.println("Cheeseburger with bacon: $" + cheeseburgerWithBacon.getPrice());
        System.out.println("Fries with Butter: $" + friesWithButter.getPrice());
        System.out.println("Total: $" + order.orderPrice());
        System.out.println();
        System.out.println("Expected: $" + 0.75*(15.49 + 15.98 + 6.99));
    }
}