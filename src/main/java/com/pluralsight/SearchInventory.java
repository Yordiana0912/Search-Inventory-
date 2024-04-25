package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInventory {
    public static void main(String[] args) {

        ArrayList<Product> inventory = getInventory();
        Scanner scanner  = new Scanner(System.in);

        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static ArrayList <Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        // this method loads product objects into inventory
        // and its details are not shown
        inventory.add(new Product(1,"apples",1.50));
        inventory.add(new Product (2,"oranges", 2.99));
        inventory.add(new Product(3, "strawberry", 2.50));
        inventory.add(new Product(4,"kiwi", 3.50));
        inventory.add(new Product(5,"banana", 4.50));
        return inventory;

    }
}
