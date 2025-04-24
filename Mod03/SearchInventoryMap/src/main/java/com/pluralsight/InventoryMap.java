package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryMap {
    public static final String filePath = "/c:/Users/rsant/pluralsight/workbook-3/BedtimeStories/DataFiles/inventory.csv";
    public static final Map<String, Product> inventory = new HashMap<>();

    public static void main(String[] args) {
        loadInventory();
        searchInventory();
    }
    private static void loadInventory() {
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String[] parts = line.split("\\|");
            //checks if it was properly formatted
            if(parts.length == 3) {
                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                double price = Double.parseDouble(parts[3].trim());
                inventory.put(name, new Product(name, price, id));
            }
        }
        System.out.println("Inventory loaded and ready for search.");
    } catch (IOException) {
        System.err.println("ERROR, inventory has not loaded and encountered an issue" + e.getMessage());
    }

}
private static void searchInventory() {


}
