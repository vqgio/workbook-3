package com.pluralsight;
import java.util.Scanner;

public class EngineLogger {
    public static void main(String[] args) {
        Main logger = new Main("C:/Users/rsant/pluralsight/workbook-3/Mod03/SearchEngineLogger/src/main/resources/logs.txt");

        logger.logAction("launch");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a search term (X to Exit): ");
            String searchTerm = scanner.nextLine();

            if (searchTerm.equalsIgnoreCase("X")) {
                logger.logAction("exit");;
                System.out.println("Exiting the application...loading");
                break;
            } else {
                logger.logAction("search : " + searchTerm);
                System.out.println("Searching the web for: " + searchTerm);
            }
        }
        scanner.close();
    }
}
