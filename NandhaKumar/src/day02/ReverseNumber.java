package day02;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        int number = sc.nextInt();

        if (number < 1000 || number > 9999) {
            System.out.println(number + " is an invalid number.");
        } else {
            int reversedNumber = 0;
            String expansion = "";
            int divisor = 1000;

            while (number > 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                expansion += digit + " * " + divisor;
                if (number >= 10) {
                    expansion += " + ";
                }
                number /= 10;
                divisor /= 10;
            }

            System.out.println("Reversed number: " + reversedNumber);
            System.out.println("Expanded number: " + expansion);
        }
    }
}
