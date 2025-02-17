package oops;

public class ReverseConsonant {
	public static boolean isVowel(char ch) {
		return "aeiouAEIOU".indexOf(ch)!= -1;
	}
	public static boolean isConsonant(char ch) {
		return Character.isLetter(ch) && !isVowel(ch);
	}
	public static void main(String[] args) {
//		String str = System.console().readLine();
		String str = new java.util.Scanner(System.in).next();
		char c[] = str.toCharArray();
		for (int i = 0, j = str.length()-1; i<j; i++, j--) {
			if (isConsonant(c[i]) && isConsonant(c[j])) {
				char temp = c[i];
				c[i]= c[j];
				c[j] = temp;				
			}
			else if (isConsonant(c[i])) i--;
			else if (isConsonant(c[j])) j++;
		}
		System.out.println(new String(c));
		
	}

}
