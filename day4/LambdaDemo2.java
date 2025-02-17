package day4;

interface Calculate1<T>{
	T sum(T x, T y);
}

public class LambdaDemo2 {
	public static void main(String[] args) {
		Calculate1<Float> obj = (x,y) -> {return x+y;};
		System.out.println(obj.sum(100.5f, 200.8f));
	}
}
