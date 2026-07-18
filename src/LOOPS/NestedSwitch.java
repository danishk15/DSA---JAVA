package LOOPS;

import java.util.Scanner;

public class NestedSwitch {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your ID");
        int empID = in.nextInt();

        System.out.println("Enter your department");
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("AbhisheK Yadav");
            case 2 -> System.out.println("Anil Singh");
            case 3 -> System.out.println("Hadiqua Aashna");
            case 4 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT DEPARTMENT");
                    case "CSE" -> System.out.println("CSE DEPARTMENT");
                    case "MANAGEMENT" -> System.out.println("MANAGEMENT DEPARTMENT");
                    default -> System.out.println("INVALID DEPARTMENT");
                }
            }
            default -> System.out.println("INVALID ID");
        }

    }
}
