package day05;

import java.util.Scanner;

public class Demo {

    private static int pin;

    public static void main(String[] args) {
        SBI sbi = new SBI();
        IB ib = new IB();
        Gpay gpay = sbi;
        Scanner sc = new Scanner(System.in);
        int ch = 0;

        do {
            System.out.println("1. Make payment & Enter the pin");
            System.out.println("2. Check balance");
            System.out.println("3. See History");
            System.out.println("4. Switch Account");
            System.out.println("5. Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the amount:");
                    double amount = sc.nextDouble();
                    System.out.println("Enter the pin:");
                    pin = sc.nextInt();
                    if (pin == Demo.pin) {
                        System.out.println("Payment Successfully Completed");
                    } else {
                        System.out.println("Invalid Pin");
                    }
                    gpay.makePayment(amount, pin);
                    break;
                case 2:
                    System.out.println("Enter the pin:");
                    pin = sc.nextInt();
                    gpay.checkBalance(pin);
                    break;
                case 3:
                    System.out.println("Transaction Details:");
                    gpay.displayTransactions();
                    break;
                case 4:
                    System.out.println("Select the Account:");
                    System.out.println("1. SBI\n2. IB");
                    int ch2 = sc.nextInt();
                    if (ch2 == 1) {
                        gpay = sbi;
                        System.out.println("Gpay is switched to SBI Bank Account!");
                    } else if (ch2 == 2) {
                        gpay = ib;
                        System.out.println("Gpay is switched to IB Bank Account!");
                    }
                    break;
                case 5:
                    System.out.println("Thank You for using Gpay");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (ch != 5);
    }
}
