package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        double outstanding = culculateOutstanding(orders);
        System.out.println("*****************************\r\n****** Customer totals ******\r\n*****************************\r\nname: " + name + "\r\namount: " + outstanding);
    }

    double culculateOutstanding(List<Order> orders) {
        Iterator<Order> orderElements = orders.iterator();
        double outstanding = 0.0;
        while (orderElements.hasNext()) {
            Order each = orderElements.next();
            outstanding += each.getAmount();
        }
        return outstanding;
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
