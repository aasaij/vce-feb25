package day4;
@FunctionalInterface
interface Shape1{
	void findArea(double d);
}
//interface Addition{
//	int sum(int x, int y);
//}

interface Calculate<T>{
	T sum(T x, T y);
}
public class LambdaExpressionDemo {
	public static void main(String[] args) {
		Shape1 s = (radius) -> System.out.println(Math.PI * radius * radius);
		s.findArea(10);
//		Addition a = (n1, n2) -> n1+n2;
//		System.out.println(a.sum(100,200));
		Calculate<String> c = (s1, s2) -> s1+" " +s2;
		System.out.println(c.sum("Aasaithambi", "Jay"));
		Calculate<Integer> c1 = (x,y) -> x + y;
		System.out.println(c1.sum(100, 200));
	}

}
//
//() -> <statement>  //function wth no arguments
//() -> {<statements>}
//
//<argument> -> <statement> // function with one argument
//(x,y) -> x+y
//(x,y) -> {return x+y}

//(arg1, arg2,...,argN) -> <statement>


