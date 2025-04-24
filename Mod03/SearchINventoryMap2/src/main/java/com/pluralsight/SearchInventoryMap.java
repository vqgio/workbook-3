package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchInventoryMap {
    //using map bc its more flexible than standard hashmap which is concrete and random.
    public static final String filePath = "/c:/Users/rsant/pluralsight/workbook-3/BedtimeStories/DataFiles/inventory.csv";
    public static final Map<Integer, Product> inventory = new HashMap<>();

    public static void main(String[] args) {
        loadInventory();
        searchProducts();
    }
    private static void loadInventory() {
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                //checks if it was properly formatted
                if(parts.length == 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    double price = Double.parseDouble(parts[2].trim());
                    inventory.put(id, new Product(id, name, price));
                }
            }
            System.out.println("Inventory had loaded and is ready for search");
        } catch (IOException e) {
            System.err.println("Inventory has failed to load. ERROR.");
        }
    }
    private static void searchProducts() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter product id to find your product in our inventory(type exit to quit search)");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("EXITING SEARCH");
                    break;
                }
                try {
                    int id = Integer.parseInt(input);
                    if (inventory.containsKey(id)) {
                        System.out.println(inventory.get(id).getInfo());
                    } else {
                        System.out.println("Sorry we must not have that product currently");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("INVALID INPUT, please make sure its a numeric input!");
                }

            }
        }
    }
}

