package class1;

import java.util.Scanner;

public class switchPractice {
	public static void main(String[] args) {
		
		Scanner love = new Scanner(System.in);

		int x;
		System.out.println("Enter a case number: ");
		x = love.nextInt();
		
		String y;

		switch (x) {
		case 1:
			y = "a1";
		case 2:
			y = "a2";
			break;
		case 3:
			y = "a3";
		case 6:
		default:
			y = "a6";
		}
		System.out.printf("your test case result is %-10s",y);
		
	}

}
