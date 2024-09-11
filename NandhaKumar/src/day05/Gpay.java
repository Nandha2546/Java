package day05;

import java.util.ArrayList;
import java.util.List;

public abstract class Gpay {
    private static ArrayList <String> transactionHistory=new ArrayList <String>();
    public abstract void makePayment(double amount,int pin);
    public abstract void checkBalance(int pin);
    
    public void commonFeature() {
    	System.out.println("Processing through Gpay Platform");
    }
    public void recordTransaction(String transDetails) {
    	transactionHistory.add(transDetails);
    }

    public void displayTransactions() {
        System.out.println("Transaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
