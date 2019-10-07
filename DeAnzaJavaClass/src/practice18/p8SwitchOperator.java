package practice18;

import java.util.Scanner;

public class p8SwitchOperator {
	public static void main (String [] args)
	{
		char operator;
		Double number1, number2, result;

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter operator (either +, -, * or /): ");
		operator = in.next().charAt(0);
		System.out.print("Enter number1 and number2 respectively: ");
		number1 = 55.0;
		number2 = 33.0;

		switch (operator) {
		case '+':
			result = number1 + number2;
			System.out.print(number1 + "+" + number2 + " = " + result);

		case '-':
			result = number1 - number2;
			System.out.print(number1 + "-" + number2 + " = " + result);

		case '*':
			result = number1 * number2;
			System.out.print(number1 + "*" + number2 + " = " + result);
			break;
		case '/':
			result = number1 / number2;
			System.out.print(number1 + "/" + number2 + " = " + result);

		default:
			System.out.println("Invalid operator!");
			break;
		}
	}
}


