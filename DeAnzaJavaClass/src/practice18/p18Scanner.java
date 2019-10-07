package practice18;

import java.util.Scanner;
//input validation greater than zero
public class p18Scanner {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {

		int x = 55;
		do {
			System.out.print("Enter a number: ");
			x = in.nextInt();

		} while (x > 0);
		
	}

}


