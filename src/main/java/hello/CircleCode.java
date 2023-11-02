package main.java.hello;

import java.util.Scanner;

public class CircleCode {

    static Scanner scanner = new Scanner(System.in);
    static Circle  circle  = new Circle();

    public static void main(String[] varArgs) {

        System.out.println("Enter a Radius");
        double radius = scanner.nextDouble();
        circle.setRadius(radius);
        System.out.println("The area is " + circle.area());
    }
}