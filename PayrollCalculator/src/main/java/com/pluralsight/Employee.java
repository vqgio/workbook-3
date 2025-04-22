package com.pluralsight;

public class Employee {
    //declare fields
    int employeeId;
    String name;
    double hoursWorked;
    double payRate;

    public double calculateGrossPay() {
        return this.hoursWorked * this.payRate;
    }
    public double calculateGrossPay(double hoursWorked, double payRate) {
        return hoursWorked * payRate;
    }
    public Employee() {

    }

    public Employee(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
