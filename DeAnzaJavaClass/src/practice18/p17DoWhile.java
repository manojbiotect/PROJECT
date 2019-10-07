package practice18;

import java.util.Scanner;

public class p17DoWhile {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int x = 55;
		do {
			System.out.print("Enter a number: ");
			x = in.nextInt();
		} while (x < -5);	
	}
}


