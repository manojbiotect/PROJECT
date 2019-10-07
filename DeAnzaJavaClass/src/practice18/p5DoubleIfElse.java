package practice18;

public class p5DoubleIfElse {
    public static void main(String[] args) {
	       Double n1 = -1.0, n2 = 4.5, n3 = -5.3, ap = 0.0;
		if (n1 >= n2) {
			if (n1 >= n3) {
				ap = n1;
			} else {
				ap = n3;
			}
		} else {
			if (n2 >= n3) {
				ap = n2;
			} else {
				ap = n3;
			}
		}
		System.out.println(ap);
}
}