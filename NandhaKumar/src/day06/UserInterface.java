package day06;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID:");
        int studentId = sc.nextInt();
        System.out.println("Enter Student Name:");
        String studentName = sc.next();
        System.out.println("Enter Department Name:");
        String department = sc.next();
        System.out.println("Enter Gender:");
        String gender = sc.next();
        System.out.println("Enter Category (Hosteller/Dayscholar):");
        String category = sc.next();
        System.out.println("Enter College Fee:");
        double collegeFee = sc.nextDouble();

        if (category.equals("Hosteller")) {
            System.out.println("Enter Room Number:");
            int roomNumber = sc.nextInt();
            System.out.println("Enter Block Name (A/B/C):");
            char blockName = sc.next().charAt(0);
            System.out.println("Enter Room Type (Ac/Non-Ac):");
            String roomType = sc.next();
            Hosteller hosteller = new Hosteller(studentId, studentName, department, gender,
                    category, collegeFee, roomNumber, blockName, roomType);
            System.out.println("Total College Fee for Hosteller: $" + hosteller.calculateTotalFee());
        } else if (category.equals("Dayscholar")) {
            System.out.println("Enter Bus Number:");
            int busNumber = sc.nextInt();
            System.out.println("Enter Distance (in km):");
            float distance = sc.nextFloat();
            Dayscholar dayscholar = new Dayscholar(studentId, studentName, department,
                    gender, category, collegeFee, busNumber, distance);
            System.out.println("Total College Fee for Dayscholar: $" + dayscholar.calculateTotalFee());
        } else {
            System.out.println("Invalid category entered. Please choose 'Hosteller' or 'Dayscholar'.");
        }
    }
}
