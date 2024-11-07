package org.example;

public class ToppingDecorator implements Food{
    protected Food food;
    private double toppingPrice;
    public ToppingDecorator(Food food, double toppingPrice) {
        this.food = food;
        this.toppingPrice = toppingPrice;
    }

    public double getPrice(){
        return food.getPrice() + toppingPrice;
    }
}
