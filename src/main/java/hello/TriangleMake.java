package main.java.hello;

import java.util.Scanner;

public class TriangleMake {

    static Scanner scanner = new Scanner(System.in);

    /// Please make Triangle have all equal sides///

    public static void main(String[] varArgs) {

        System.out.println("Enter a base");
        double base = scanner.nextDouble();

        System.out.println("Enter a height");
        double   height   = scanner.nextDouble();
        Triangle triangle = new Triangle(base, height);

        System.out.println("the area of triangle is " + triangle.area() + " and the perimeter is " + triangle.perimeter());
    }
}