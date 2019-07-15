package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        double outstanding = culculateOutstanding(orders);
        String owing = "*****************************\r\n****** Customer totals ******\r\n*****************************\r\n" +
                "name: " + name + "\r\namount: " + outstanding;
        System.out.println(owing);
    }

    double culculateOutstanding(List<Order> orders) {
        return orders.stream().mapToDouble(order -> order.getAmount()).sum();
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
