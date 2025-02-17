package collectionsdemo;

import java.util.Arrays;
import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str, firstCharString="";
		int n, len;
		str = in.next();
		n = in.nextInt();
		len = str.length();
		for (int i = 1; i<=n; i++) {
			char dir = in.next().charAt(0);
			int rotations = in.nextInt() % len;
			if (dir == 'L' || dir == 'l')
				firstCharString += str.charAt(rotations);
			else if (dir == 'R' || dir == 'r')
				firstCharString += str.charAt(len-rotations);
		}
		char strarr[] = firstCharString.toCharArray();
		Arrays.sort(strarr);
		firstCharString = new String(strarr);
		for (int i = 0;i<=len-n; i++) {
			char arr[] = str.substring(i, i+3).toCharArray();
			Arrays.sort(arr);
			if (firstCharString.equals(new String(arr))) {
				System.out.println("YES");
				System.exit(0);
			}
		}
		System.out.println("NO");
	}

}
