package fundamentals;

public class PatternPrinting {

	public static void main(String[] args) {
//		int n = new java.util.Scanner(System.in).nextInt();
//		String str = "*".repeat(n);
		String str = new java.util.Scanner(System.in).next();
		int len = str.length();
		for (int i = len; i>=1; i--)
			System.out.printf(
					"%-"+len+"."+i+"s%"
			     +len+"."+i+"s\n",str,str);
		
		for (int i = 1; i<=len; i++)
			System.out.printf(
					"%-"+len+"."+i+"s%"
			+len+"."+i+"s\n",str,str);
//		System.out.printf("%6.5s\n", "Lokesh");
//		System.out.printf("%6.4s\n", "Lokesh");
//		System.out.printf("%6.3s\n", "Lokesh");		
//		System.out.printf("%6.2s\n", "Lokesh");
//		System.out.printf("%6.1s\n", "Lokesh");		
	}
}
