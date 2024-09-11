package day07;
import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		int array[]=new int[size];
		if(size < 1 || size > 5) {
			System.out.println("Invalid array size");
			return;
		}
		int numbers=0;
		for(int i=0;i<size;i++) {
		System.out.println("Enter the numbers:");
		array[i]=sc.nextInt();
		}
		if(numbers >0 || numbers < 100) {
 			System.out.println("Enter the number between the 0 to 100!");
			return;
		}
		System.out.println(array);
	}
		
	}

