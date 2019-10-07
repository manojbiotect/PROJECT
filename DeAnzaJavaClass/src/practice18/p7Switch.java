package practice18;

public class p7Switch {
	public static void main (String [] args)
	{
		int week = 1;
		String day;

		switch (week) {
		case 1:
			day = "Sunday";
		case 2:
			day = "Monday";
		case 3:
			day = "Tuesday";
		case 4:
			day = "Wednesday";
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			day = "Saturday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Invalid day";
			break;
		}
		System.out.println(day);

	}
}


