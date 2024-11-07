package org.example;
import java.util.*;

public class Order {
    private List<Food> orderList = new ArrayList<Food>();
    private LoyaltyStatus loyalty;

    public Order(String status) {
        this.loyalty = new LoyaltyStatus(status);
    }

    public void addItem(Food item) {
        orderList.add(item);
    }
    public double orderPrice(){
        double total = 0.0;
        for (Food item : orderList) {
            total += item.getPrice(); // Prints each item in the list
        }
        return loyalty.discountPercentage()*total;
    }
}
