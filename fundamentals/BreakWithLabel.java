package fundamentals;

public class BreakWithLabel {

	public static void main(String[] args) {
		loop2:
		for (int i = 1; i<=10; i++) {
			loop1:
			for (int j = 1; j<=10; j++) {
				if (j % 3 == 0)
					break loop2;
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
