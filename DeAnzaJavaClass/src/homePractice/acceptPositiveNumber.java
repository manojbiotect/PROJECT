package homePractice;

import java.util.Scanner;

public class acceptPositiveNumber {
	public static void main(String[] args) {
		int value;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value: ");
		value = scanner.nextInt();
		
		
		while(value < 0) {
		  System.out.print("Enter a value > 0: ");
		  value = scanner.nextInt();
		  if(value < 0)
		     System.out.println("sorry write a value > 0");
		}

	}

}
