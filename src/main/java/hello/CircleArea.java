package main.java.hello;

import java.util.Scanner;

public class CircleArea {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] varArgs) {
        Circle circle = new Circle();
        System.out.println("Enter a Radius");
        double radius = scanner.nextDouble();
        circle.setRadius(radius);

        Circle circle2 = new Circle();
        System.out.println("Enter a Radius");
        radius = scanner.nextDouble();
        circle2.setRadius(radius);

        System.out.println("The area for circle 1 is " + circle.area() + " and circle 2 is " + circle2.area());
    }
}