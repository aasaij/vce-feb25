package day4;

import java.io.IOException;

public class CheckedExceptionDemo {

//	public static void main(String[] args) throws java.io.IOException {
//		char ch = (char)System.in.read();
//		System.out.println(ch);
//	}
	public static void main(String[] args) {
		char ch;
		try {
			ch = (char)System.in.read();
			System.out.println(ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
