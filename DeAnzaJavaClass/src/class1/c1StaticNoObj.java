package class1;

public class c1StaticNoObj {
	 public static void main(String[] args) {
	 	 int y =5;
		 print(y);
		 set(y);
		 print(y);
	 }
	 public static void print(int sc) { //one copy - 
	 	System.out.printf("Value=%d\n",sc);
	 }
	 public static void set(int sc) {
	 	sc = 75;
	 }
	}

