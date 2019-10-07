/* @ Author: Fenda Gao
   This is a Assignment 1a. 
   FileName : "practice.java". */
package assignment;

//java is the name of lib, util is name of a package, Scanner is the name of a class.
import java.util.Scanner;


public class practice {
	//main 
	public static void main(String[] strings) {

		// declaration
		double loanAmount, annualInterestRate, monthlyInterestRate,monthlyPayment, balance, interest, principal;
		int numberOfYears;

		// making scanner buffer		
		Scanner input = new Scanner(System.in); 

		// getting loan amount
		System.out.printf("Loan amount: ");
		loanAmount = input.nextDouble();

		if (loanAmount >= 1) 
		{

		} else {
			System.out.println("Loan Amount should be Positive. Please enter a Positive amount. ");	
		}

		System.out.printf("Loan amount: ");
		loanAmount = input.nextDouble();
		// asking number of years
		System.out.print("Number of Years: ");
		numberOfYears = input.nextInt();

		System.out.print("Annual Interest Rate: ");
		annualInterestRate = input.nextDouble();

		// obtain monthly interest rate
		monthlyInterestRate = annualInterestRate/1200;

		// compute mortgage
		monthlyPayment = loanAmount*monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
		balance = loanAmount;


		System.out.println("Monthly Payment: " + (int)(monthlyPayment * 100) / 100.0 );
		System.out.println("Total Payment: " + (int)(monthlyPayment * 12 * numberOfYears * 100) / 100.0 + "\n" );

		// display the header
		System.out.println("Payment#\tInterest\tPrincipal\tBalance");
		for (int i = 1; i <= numberOfYears * 12; i++) {
			interest = (int)(monthlyInterestRate * balance * 100) / 100.0;
			principal = (int)((monthlyPayment - interest) * 100) / 100.0;
			balance = (int)((balance - principal) * 100) / 100.0;
			System.out.println(i + "\t\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
		}
	}
}

/**Output assignment1a
Loan amount: -90000
Loan Amount should be Positive. Please enter a Positive amount. 
Loan amount: 90000
Number of Years: 1
Annual Interest Rate: 11
Monthly Payment: 7954.34
Total Payment: 95452.19

Payment#	Interest	Principal	Balance
1			825.0		7129.34		82870.66
2			759.64		7194.7		75675.96
3			693.69		7260.65		68415.31
4			627.14		7327.2		61088.11
5			559.97		7394.37		53693.74
6			492.19		7462.15		46231.59
7			423.78		7530.56		38701.03
8			354.75		7599.59		31101.44
9			285.09		7669.25		23432.19
10			214.79		7739.55		15692.64
11			143.84		7810.5		7882.14
12			72.25		7882.09		0		71.82		4536.0		0.03

 */

