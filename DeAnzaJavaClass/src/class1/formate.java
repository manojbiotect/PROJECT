package class1;

public class formate {
	public static void main(String[] args) {
		int sal = 500;
		float sal1 = 40.55f;
		String x = "Manoj Adhikari";
		
//		System.out.printf("My salary is %-20d",sal); //My salary is 5000 ==>20 means distance between sal and text
		//My salary is                  500
		
//		System.out.printf("My salary is %-100.4f",sal1);// My salary is 40.55. f==> float 10.4 =>4 number after decimal
		//My salary is 40.5500  // - helps to maintain distance f and text. 100 says distance between one print to other
		
//		System.out.printf("My name is %-50s",x); // 20 is a space between text and string=> - helps to formating.
		
		System.out.printf("My name is %-10s\t%10d\t%-10.2f\n",x,sal,sal1);
		//My name is Manoj Adhikari	       500	40.55  // \n => new line
		System.out.printf("This is a test.");
		
	}

}
