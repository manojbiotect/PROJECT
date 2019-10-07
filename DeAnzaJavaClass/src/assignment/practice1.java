package assignment;

import java.util.Scanner;

public class practice1 {

    public static void main(String[] args) 
    {
    	Scanner input = new Scanner(System.in);
    	int loanAmount = 0;
    	while (loanAmount <= 0) {
    	    System.out.print("Please enter a Loan Amount: ");
    	    loanAmount = input.nextInt();
    	    if (loanAmount <= 0) {
    	        System.out.println("Please enter a Loan amount above $ 0!");
    	        
    	    }
    	}}}