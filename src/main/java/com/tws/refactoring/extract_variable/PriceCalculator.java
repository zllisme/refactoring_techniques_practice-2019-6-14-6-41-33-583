package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    private final static int DISCOUNT_QUANTITY = 500;
    private final static double DISCOUNT = 0.05;
    double getPrice(int quantity, int itemPrice) {
        double basePrice = quantity * itemPrice;
        double discountAmount = Math.max(0, quantity - DISCOUNT_QUANTITY) * itemPrice * DISCOUNT;
        double shippingCost = Math.min(quantity * itemPrice * 0.1, 100.0);
        return basePrice - discountAmount + shippingCost;
    }
}
