package fundamentals;

import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//getting size of the list
		int n = in.nextInt();
		int max, smax;
		max = smax = Integer.MIN_VALUE;
		for (int i = 1; i<=n; i++) {
			int x = in.nextInt();
			if (x > max) {
				smax = max;
				max = x;
			}
			else if ( smax < x && x != max)
				smax = x;
		}
		System.out.println( smax!= Integer.MIN_VALUE?smax:"N/A");


	}

}
