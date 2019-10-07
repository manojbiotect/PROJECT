/** @ Author: Manoj Adhikari 
   @Assignment: 1b. 
   @Date: 10/06/2019
   @FileName : "assignment1B.java". */

package assignment;

//java is the name of lib, util is name of a package, Scanner is the name of a class.
import java.util.Scanner;

public class assignment1A {
	// create main method
	public static void main(String[] args) {
		
		double loanAmount;
	
		// Create Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the loan amount,
		// the number of years and the annual interest rate
		System.out.print("Loan Amount:$ " );
	   loanAmount = input.nextDouble();
	   
	while (loanAmount < 0) 
		{
		System.out.println("Loan Amount should be Positive. Please enter a Positive amount: $ ");	
		loanAmount = input.nextDouble();
		if (loanAmount < 0)
				System.out.println("Sorry, Invalid Amount !!!");	
			}	

		System.out.print("Number of Years: ");
		int years = input.nextInt();
		System.out.print("Annual Interest Rate (%): ");
		double annualRate = input.nextDouble();

		// Calculate monthly interest rate
		double monthlyRate = annualRate / 1200;

		// Calculat montly payment
		double monthlyPayment = loanAmount * monthlyRate / (1 - 1 / 
				Math.pow(1 + monthlyRate, years * 12));

		// Display montly payment
		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);

		// Display total payment
		System.out.printf("Total Payment: %.2f\n", (monthlyPayment * 12) * years);

		// Create loan amortization schedule
		double balance = loanAmount,
				principal, interest;
		System.out.println("Payment#     Interest     Principal     Balance");
		for (int i = 1; i <= years * 12; i++) {
			interest = monthlyRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest,
					principal, balance);
		}
	}

}

/**
Loan Amount:$ -100
Loan Amount should be Positive. Please enter a Positive amount: $ 
-1234
Sorry, Invalid Amount !!!
Loan Amount should be Positive. Please enter a Positive amount: $ 
1000000
Number of Years: 1
Annual Interest Rate (%): 25
Monthly Payment: 95044.20
Total Payment: 1140530.44
Payment#     Interest     Principal     Balance
1            20833.33     74210.87     925789.13
2            19287.27     75756.93     850032.20
3            17709.00     77335.20     772697.00
4            16097.85     78946.35     693750.65
5            14453.14     80591.06     613159.59
6            12774.16     82270.05     530889.54
7            11060.20     83984.00     446905.54
8            9310.53      85733.67     361171.87
9            7524.41      87519.79     273652.08
10           5701.08      89343.12     184308.96
11           3839.77      91204.43     93104.53
12           1939.68      93104.53     -0.00

*/
 