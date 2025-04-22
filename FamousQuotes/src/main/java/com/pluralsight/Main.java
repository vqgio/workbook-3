package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] famousQuotes = {
        "timbob",
        "jimmybob",
        "johnny",
        "carl",
        "melch",
        "alex",
        "carl",
        "gio",
        "cesar",
        "leo"
        };
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Pick a number between 1-10 for the quote:");
            int userChoice = scanner.nextInt();
            System.out.println("selected quote: " + famousQuotes[userChoice - 1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
                System.out.println("ERROR");
//                Scanner.nextLine();
//
        }
    }
}
