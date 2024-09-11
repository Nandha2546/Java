package day05;

public class SBI extends Gpay {
    private double balance = 1000;
    private int pin = 1212;

    @Override
    public void makePayment(double amount,int pin) {
        if (amount < balance && this.pin == pin) {
            balance -= amount;
            String transactionHistory = "Payment of Rs." + amount + " made using SBI";
            recordTransaction(transactionHistory);
        }
    }

    @Override
    public void checkBalance(int pin) {
        if (this.pin == pin) {
            System.out.println("Your Balance is " + balance);
        } else {
            System.out.println("Invalid pin");
        }
    }
}
