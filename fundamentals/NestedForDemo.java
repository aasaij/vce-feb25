package fundamentals;

import java.util.Scanner;

public class NestedForDemo {
	public static void main(String[] args) {
		//Program to print prime number between x and y
		Scanner in=new Scanner(System.in);
		int x, y;
		x = in.nextInt();
		y = in.nextInt();
		for (int i = x; i<=y; i++) {
			boolean isPrime = true;
			if (i ==1 )
				isPrime = false;
			else if (i > 3 && (i%2==0 || i % 3==0))
				isPrime = false;
			else {
				for(int j = 5; j*j<=i; j+=6) {
					if (i % j == 0 || i % (j+2)==0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime)
				System.out.println(i);
		}
	}

}
