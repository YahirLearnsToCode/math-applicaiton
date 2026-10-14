package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        //Question 1 Finding highest salary
        int bobSalary = 149000;
        int garySalary = 184000;
        int highestSalary;
        //Finding highest Salary and printing it
        highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is $" + highestSalary);

        //Question 2 finding smallest variable
        double carPrice = 49000.00;
        double truckPrice = 89000.00;
        //printing lowest price between car and truck
        System.out.println("The lowest price is " + Math.min(carPrice,truckPrice));

        //Question 3 finding and displaying the area of a circle
        double radius = 7.25;
        System.out.println("The area of a circle with a radius of " + radius + " is " + Math.PI * Math.pow(radius,2));

        //Question 4 find and display the square root of a variable
        double fiveAsDouble = 5.0;
        System.out.println("The square root of " + fiveAsDouble + " is " + Math.sqrt(fiveAsDouble));

        //Question 5 Find and display the distance between the points (5, 10) and (85, 50)
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        //calculating distance using distance formula
        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        //Printing result
        System.out.println("The Distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is: " + distance);

        //Question 6 Find and display the absolute (positive) value of a variable after it is set to -3.8
        double negDoubleVariable = -3.8;
        System.out.println("The absolute value of " + negDoubleVariable + " is " + Math.abs(negDoubleVariable));

        //Question 7 Find and display a random number between 0 and 1
        System.out.println("Random number between 0 and 1: " + Math.random());

        //Question 8 Calculate how many minutes are in 24 days, use a variable for each value you calculate with.
        //BONUS: How many milliseconds?
        int days = 24;
        int hoursInADay = 24;
        int minutesInAnHour = 60;
        int minutesIn24Days = (minutesInAnHour * hoursInADay) * days;
        System.out.println("There are " + minutesIn24Days + " minutes in " + days + " days");

        //BONUS
        int millisecondsInAMinute = 60000;
        int millisecondsIn24Days = minutesIn24Days * millisecondsInAMinute;
        System.out.println("There are " + millisecondsIn24Days + " milliseconds in " + days + " days");
    }
}
