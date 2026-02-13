package LinkedLists;

import java.util.*;

class Order implements Comparable<Order> {
    int id;
    String name;

    Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Order other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class ComparableQ {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(3, "Mouse"));
        orders.add(new Order(1, "Keyboard"));
        orders.add(new Order(2, "Monitor"));

        Collections.sort(orders); 

        System.out.println(orders);
    }
}
