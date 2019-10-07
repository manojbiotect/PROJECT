package class1;

import java.util.Scanner;

public class ifElse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		double score;
		String x = "Congratulation !! You got a Grade:", y= "Sorry, Try again. You scored grade: ";
		
		System.out.print("Enter your score : ");
		score = sc.nextDouble();
		// Accept only positive number
		if (score < 0){
			System.out.println("Please, Enter a positive number");
			System.out.println("Try again");
			return;
		} 
		

		if(score >= 90)
			System.out.printf(" %-10s%c\n",x,'A'); // %-10s => string copy , x is a string
		else if(score >= 80)
			System.out.printf("%-10s%c\n",x,'B');
		else if(score >= 70)
			System.out.printf("%-10s%c\n",x,'C');
		else if(score >= 60)
			System.out.printf("%-10s%c\n",x,'D');
		else
			System.out.printf("%-10s%c\n",y,'F');
	}

}
