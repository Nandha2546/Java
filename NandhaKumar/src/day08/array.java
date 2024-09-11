package day08;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		String reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to reverse:");
		String Original=sc.nextLine();
		int len=Original.length();
		for(int i=len-1;i>=0;i--) {
			reverse+=Original.charAt(i);
		}
		System.out.println("Reverse string:"+reverse);
	}
}
