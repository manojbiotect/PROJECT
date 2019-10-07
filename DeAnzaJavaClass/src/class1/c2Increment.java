package class1;



public class c2Increment {
	
	
	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		x++;
		++y;
		System.out.println((x++) +","+ (++y)); // x++ ==> x+1 //
		// x++ increment- keep increasing 1 value but ++y doesnot increase in another s
		System.out.println((x) +","+ (y));
		System.out.println((++ x) +","+ (y));	
		System.out.println(x++ + ++x);
	}

}
 