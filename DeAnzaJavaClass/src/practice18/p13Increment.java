package practice18;

public class p13Increment {
	public static void main (String [] args)
	{
	      int i = 2;   
	      while (i <= 10) {
	         System.out.println("Line " + i);
	         i = ++i + i++;
	      }
	}

}