package fundamentals;

import java.util.Scanner;

public class SwitchExpressionDemo {
	public static String calculate(int x, int y, char c) {
		return switch(c) {
			case '+' -> x + y +"";
			case '-' -> x - y + "";
			case '*','x','X' -> x * y + "";
			case '/' -> x /(float) y + "";
			case '%' -> x % y + "";
			default -> "Invalid operation";
		};
	}
	public static void main(String[] args) {
		int x, y;
		String z;
		char opr;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an expression ");
		x = in.nextInt();
		opr = in.next().charAt(0);
		y = in.nextInt();
		z = calculate(x,y, opr);
		System.out.println(x + " " + opr + " " + y + 
				" = " + z);
	}
}
//Scanner class Methods
//nextInt()
//nextByte()
//nextShort()
//nextLong()
//next()
//nextLine()
//nextFloat()
//nextDouble()
//nextBoolean()



