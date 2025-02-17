package day4;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int x, y, z;
		System.out.println("Example for Exception Handling");
		while(true) {
			x = in.nextInt();
			y = in.nextInt();
			try {
				z = x / y;
				System.out.println(z);
				break;
			}catch(ArithmeticException ae) {
				System.out.println("Divisor should be non-zero");
			}
		}
		System.out.println("Thank you for being very interactive");	
	}
}
//try {
//	<statements_to_be_watched_for_exceptions>
//}
//catch(errorType1) {
//	//handling code
//}
//catch(errorType2) {
//	//handling code
//}
//....
//finally {
//	//code for finalization
//}

