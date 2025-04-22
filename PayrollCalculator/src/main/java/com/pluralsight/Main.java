package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        FileReader reader;
        try {
            reader = new FileReader("/c:/Users/rsant/pluralsight/workbook-3/BedtimeStories/DataFiles/employees.csv");
            String input;
            BufferedReader bufferedReader = new BufferedReader(reader);

            Employee[] employees = new Employee[8];
            int lineIndex = 0;
            while ((input = bufferedReader.readLine()) != null) {
                String[] lineData = input.split("\\|");
                //System.out.println(lineData);
                if (lineData[0].equals("id")) {
                    continue;
                }

                int id = Integer.parseInt(lineData[0]);
                String name = lineData[1];
                double hours = Double.parseDouble(lineData[2]);
                double rate = Double.parseDouble(lineData[3]);

                Employee newEmployee = new Employee(id, name, hours, rate);
                System.out.println("ID: " + newEmployee.getEmployeeId() + " Name; " + newEmployee.getName() + " Pay: " + newEmployee.calculateGrossPay());
                System.out.printf("ID: %d Name: %s Pay: %.2f", newEmployee.getEmployeeId(), newEmployee.getName(), newEmployee.calculateGrossPay());


            }

        } catch (Exception e) {
            System.err.println("There was a problem of some sort reading the file: " + e.getMessage());
        }
    }
}
