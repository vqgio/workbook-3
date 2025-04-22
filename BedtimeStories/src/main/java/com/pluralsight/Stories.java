package com.pluralsight;
import java.io.FileInputStream;
import java.util.Scanner;


public class Stories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("- Bedtime Stories -");
        System.out.println("1. Goldilocks");
        System.out.println("2. Hansel and Gretel");
        System.out.println("3. Mary had a little lamb");
        System.out.print("Pick one(1, 2, 3):");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                readGoldilocks();
                break;
            case 2:
                readHanselAndGretel();
                break;
            case 3:
                readMaryHadLittleLamb();
                break;
            default:
                System.out.println("Try Again!! Please choose between stories 1, 2, 3!");
        }
    }
    static void readGoldilocks() {
        FileInputStream fileStream = null;

        try{
            fileStream = new FileInputStream("/c/Users/rsant/pluralsight/workbook-3/BedtimeStories/DataFiles/goldilocks.txt");

            Scanner readFile = new Scanner(fileStream);

            String input;
            int i = 1;

            while (readFile.hasNextLine()) {
                input = readFile.nextLine();
                System.out.println(i + "." + input);
                i++;
            }
            readFile.close();
        } catch (Exception e){
            System.out.println("File not found!");
        }
    }
    static void readHanselAndGretel() {
        FileInputStream fileStream = null;

        try{
            fileStream = new FileInputStream("/c/Users/rsant/pluralsight/workbook-3/BedtimeStories/DataFiles/hansel_and_gretel.txt");

            Scanner readFile = new Scanner(fileStream);

            String input;
            int i = 1;

            while (readFile.hasNextLine()) {
                input = readFile.nextLine();
                System.out.println(i + "." + input);
                i++;
            }
            readFile.close();
        } catch (Exception e){
            System.out.println("File not found!");
        }
    }
    static void readMaryHadLittleLamb() {
        FileInputStream fileStream = null;

        try{
            fileStream = new FileInputStream("/c/Users/rsant/pluralsight/workbook-3/BedtimeStories/DataFiles/mary_had_a_little_lamb.txt");

            Scanner readFile = new Scanner(fileStream);

            String input;
            int i = 1;

            while (readFile.hasNextLine()) {
                input = readFile.nextLine();
                System.out.println(i + "." + input);
                i++;
            }
            readFile.close();
        } catch (Exception e){
            System.out.println("File not found!");
        }
    }
}
