
public class Test2 {

	public static void main(String[] args) {
	Date d1 = new Date(8, 24, 2020); 
	Date d2 = new Date(9, 26, 2020);
	Date d3 = new Date(10, 30, 2020);
	Date d4 = new Date(12, 3, 2020);

	
	if(d1.compareTo(d2) == 1) {
		System.out.println(d1 + " is later than " + d2);
		
	}
	else if(d1.compareTo(d2) == -1) {
		System.out.println(d1 + " is earlier than " + d2);
		
	}
	else {
		System.out.println(d1 + " and " + d2 + " are the same dates");
	}
	}

}
