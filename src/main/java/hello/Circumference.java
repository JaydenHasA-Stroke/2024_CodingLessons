package main.java.hello;

import java.util.Scanner;

public class Circumference {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] varArgs) {
        Circle circle = new Circle();
        System.out.println("Enter a Radius");
        double radius = scanner.nextDouble();
        circle.setRadius(radius);
        System.out.println("The circumference is " + circle.circumference());
    }
}
