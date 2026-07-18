package LOOPS;

import java.util.Scanner;

public class Switches {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER YOUR FRUIT HERE:");
        String fruit = in.next();

       // Switch expression here

        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("Run away doctor");
            case "Banana" -> System.out.println("Gym rats favourite");
            default -> System.out.println("Invalid input");
        }

    }
}
