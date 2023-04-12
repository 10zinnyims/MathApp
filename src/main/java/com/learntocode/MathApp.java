package com.learntocode;

public class MathApp {
    public static void main(String[] args) {
        int job1Salary = 30000;
        int job2Salary = 50000;

        int maxSalary = Math.max(job1Salary, job2Salary);

        System.out.println("The smallest salary is " + maxSalary);

        int carPrice = 3000;
        int truckPrice = 5000;

        int lessPrice = Math.min(carPrice, truckPrice);

        System.out.println("The smallest price is " + lessPrice);

        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.println("The area of " + radius + " is " + area );

        double num1 = 5.0;
        double sqNum1 = Math.sqrt(num1);
        System.out.println("The square root of " + num1 + " is " + sqNum1);

        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1, 2));

        double num2 = -3.8;
        double absNum2 = Math.abs(num2);
        System.out.println("The absolute value of " + num2 + " is " + absNum2);

        double ranNum = Math.random();
        System.out.println("The random number is " + ranNum);
    }
}
