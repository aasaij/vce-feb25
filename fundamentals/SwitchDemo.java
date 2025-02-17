package fundamentals;

public class SwitchDemo {

	public static void main(String[] args) {
//		float x = 10;
		int day = new java.util.Scanner(System.in).nextInt();
		switch(day) {
		case 1 -> System.out.println("Its Monday. Concentrate on studies");
		case 2,3,4 -> System.out.println("Still it's week day only");
		case 5 -> System.out.println("It's Friday. Get ready for week end");
		case 6,7 -> System.out.println("Enjoy your week end");
		default -> System.out.println("Invalid day number");
		}
		

	}

}

//Day Number
//1 --> It's Monday. Concentrate on studies
//2,3,4 --> Still it's week day only
//5 -> It's Friday. Get ready for week end
//6,7 -> Enjoy your week end
//
//--> Invalid day number
