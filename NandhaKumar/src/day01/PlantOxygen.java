package day01;

import java.util.Scanner;

public class PlantOxygen {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of the room(in m)");
	int length=sc.nextInt();
	if(length<=0) {
		System.out.println("Invalid length");
	}
	System.out.println("Enter the breadth of the room(in m)");
	int breadth=sc.nextInt();
	if(breadth<=0) {
		System.out.println("Invalid breadth");
	}
	System.out.println("Enter the plant area of a single plant(in cm2)");
	double area=sc.nextDouble();
	if(area<=0) {
		System.out.println("Invalid area");
	}
	Double total_plants=(length*breadth/area)*100*100;
	total_plants-=total_plants%10;
	System.out.println(total_plants);
	double total_oxygen=(total_plants*0.9);
	System.out.println("Total Production of Oxygen:" + total_oxygen);
}
}
