package day4;
@FunctionalInterface
interface Shape{
	void findArea(double radius);
//	void findVolume(double d);
}
class ShapeClass implements Shape{
	@Override
	public void findArea(double radius) {	
		
	}	
}
public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		Shape s = new ShapeClass();
//		Shape s = new Shape() {
//			@Override
//			public void findArea(double d) {
//				System.out.println(Math.PI * d * d);
//			}
//		};
		s.findArea(10);
	}

}
