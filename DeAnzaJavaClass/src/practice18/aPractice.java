package practice18;

import java.util.Scanner;

public class aPractice {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number of day :");
		
	 
		String day;
		int week = 0;
		
		switch(week) {
		
		case '1':
			day = "Sunday";
			
		case '2': 
			day = "monday";
		case '3':
			day = "Tuesday";
		case '4':
			day = "Wednesday";
		case '5':
			day = "Thursday";
			break;
		case '6':
			day = "Friday";
			day = "Saturday";
			break;
		case '7':
			day = "Saturday";
			break;
		default:
			day = "Invalid day";
			break;
		}
		System.out.println(day);
	}

}
