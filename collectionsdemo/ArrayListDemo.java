package collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
//import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>();
//		ArrayList<String> nameList2 = new ArrayList<>(Arrays.asList("A", "B", "c","D"));
		ArrayList<String> nameList2 = new ArrayList<>(List.of("A", "B", "c","D"));
		System.out.println(nameList2);
		nameList.add("Ajay");
		nameList.add(0, "Charan");
		nameList.add(1, "Hemanth");
		ArrayList<String> newList = new ArrayList<>();
		newList.addAll(nameList);
//		newList.add("Anandhi");
		nameList.add("Anandhi");
//		System.out.println(nameList);
//		System.out.println(newList);
		ArrayList<String> oldOne = nameList;
		ArrayList<String> oldTwo = (ArrayList)nameList.clone();
//		oldTwo.add("Rasmitha");
		nameList.add("Rasmitha");
		oldTwo.remove(0);
//		System.out.println(oldOne);
//		System.out.println(oldTwo);
//		System.out.println(newList.containsAll(nameList));
//		System.out.println(newList.containsAll(oldTwo));
//		for (String name : nameList)
//			System.out.println(name);
//		nameList.forEach(name -> System.out.println(name));
		//Printing names starting with 'A'
//		for (String name : nameList) {
//			if (name.startsWith("A"))
//				System.out.println(name);
//		}
		nameList.stream().filter(name -> name.startsWith("A")).forEach(name -> System.out.println(name));
		LinkedList<String> list = new LinkedList<>();
		
	}
}
