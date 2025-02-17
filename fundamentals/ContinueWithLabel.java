package fundamentals;

public class ContinueWithLabel {

	public static void main(String[] args) {
		String str = "Rasmitha";
		loop1:
		for (int i = 1; i<=5; i++) {
			for (int j = 0; j<str.length(); j++) {
				if ("aeiouAEIOU".contains(""+str.charAt(j)))
					continue loop1;
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println();
		}

	}

}
