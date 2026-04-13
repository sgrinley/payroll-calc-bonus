package com.pluralsight;

import java.util.Scanner;

public class RefactorPC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = getName(scanner);
        String jobTitle = getJobTitle(scanner);
        float hoursWorked = getHoursWorked(scanner);
        float payRate = getPayRate(scanner);

        float grossPay = calculateGrossPay(hoursWorked, payRate);

        displayPayroll(name, grossPay);
    }

    public static String getName(Scanner scanner) {
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    public static String getJobTitle(Scanner scanner) {
        System.out.print("Enter your job title: ");
        return scanner.nextLine();
    }

    public static float getHoursWorked(Scanner scanner) {
        System.out.print("Enter hours worked: ");
        return scanner.nextFloat();
    }

    public static float getPayRate(Scanner scanner) {
        System.out.print("Enter pay rate: ");
        return scanner.nextFloat();
    }

    public static float calculateGrossPay(float hours, float rate) {
        return hours * rate;
    }

    public static void displayPayroll(String name, float grossPay) {
        System.out.println("Employee Name: " + name);
        System.out.println("Gross Pay: $" + grossPay);
    }
}
