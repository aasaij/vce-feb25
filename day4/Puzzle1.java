package day4;

public class Puzzle1 {
	//IIB -> Instance Initializer Block
	{
		System.out.println("Two");
	}
	static { // static block
		System.out.println("Three");
	}
	public Puzzle1() {
		System.out.println("Four");
	}
	public static void main(String[] args) {
		Puzzle1 p = new Puzzle1();
		System.out.println("One");
	}
}
