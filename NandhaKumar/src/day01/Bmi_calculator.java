package day01;

import java.util.Scanner;

public class Bmi_calculator {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the weight(in kg):");
	int weight=sc.nextInt();
	System.out.print("Enter the height(in kg):");
	int height=sc.nextInt();
	double bmi= (weight/((height/100)*(height/100)));
	System.out.println(bmi);
	if(bmi>=25) {
		System.out.println("You are overweight");
	}
	else if(bmi<=25 && bmi>=18.5) {
		System.out.println("You are fit and healthy");
	}
	else {
		System.out.println("You are underweight");
	}
			}
}