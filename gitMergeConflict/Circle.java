
public class Circle {
	
	Circle(double radius){
		
		double Area = radius*radius*3.14;

	}
	
	
	public static void main(String args[]){
		
		Circle myCircle = new Circle(2.5);
		System.out.println("The area of this circle is: " + myCircle);
		
}
}
