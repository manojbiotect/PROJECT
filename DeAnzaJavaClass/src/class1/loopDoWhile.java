package class1;

import java.util.Scanner;

public class loopDoWhile {
	public static void main(String[] args) {
		Scanner lb = new Scanner(System.in);
		
		int x = -9;
//		System.out.println("Enter a number: ");
//		x= lb.nextInt();
		
		do {
			 lb.nextInt(); //if input -5 ?
			System.out.printf("The number is positive %d",x);
		} while (x < 0);
		System.out.printf("The number is negative %d",x);

	}

}
