package main.java.hello;

import java.util.Scanner;

public class Receipt {

    static Scanner      scanner  = new Scanner(System.in);
    static final double TAX_RATE = 0.13;

    public static void main(String[] varArgs) {
        System.out.println("Please enter a cost");
        double cost = scanner.nextDouble();
        System.out.println("The total cost is " + (cost * TAX_RATE + cost));

    }

}
