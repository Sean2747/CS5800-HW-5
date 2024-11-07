package org.example;

public class Base implements Food {

    private double basePrice;

    public Base(double basePrice) {
        if (basePrice < 0) {
            throw new IllegalArgumentException("Price shall be negative");
        }
        else
            this.basePrice = basePrice;
    }

    @Override
    public double getPrice() {
        return basePrice;
    }
}
