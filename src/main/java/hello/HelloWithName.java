package main.java.hello;

import java.util.Scanner;

public class HelloWithName {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] varArgs) {

        System.out.println("Whats is your first name?");

        String name = scanner.nextLine();

        System.out.println("Whats is your last name?");

        String nameLast = scanner.nextLine();

        System.out.println("Hello " + name + " " + nameLast);


    }

}