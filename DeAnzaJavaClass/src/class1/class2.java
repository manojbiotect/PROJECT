package class1;

import java.util.Scanner;

public class class2 {
	static Scanner in = new Scanner(System.in);
	static int integer;
	static int longInteger;
	int DoubleReal;
	static String string1;
	static String string2;
	
	public static void main(String[] args) {

	integer = in.nextInt();
	longInteger = (int) in.nextLong();
	float realNumber = in.nextFloat();
	double doubleReal = in.nextDouble();
	string1 = in.nextLine();
	System.out.println("Now enter another value.");
	string2 = in.next();
	 
	System.out.println("Here is what you entered: ");
	System.out.println(integer + " " + longInteger + " " + realNumber + " " + doubleReal + " " + string1 + " and " + string2);
	}
	}



