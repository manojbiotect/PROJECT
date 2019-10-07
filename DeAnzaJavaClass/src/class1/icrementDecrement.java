package class1;

public class icrementDecrement {
	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		a++; //6 - postfix => does not increase first time by 1
		++b; //6 - prefix => increase instantly +1
		System.out.println((a++)+" "+(++b)); //++b = b+1 ==> first step increase
		//6 7     
		System.out.println((a)+" "+(b)); //a++ ==> a+1 first step same and next step increasing next step by 1
		//7 7
		System.out.println((a)+" "+(++b)); 
		// 7 8
	}

}
