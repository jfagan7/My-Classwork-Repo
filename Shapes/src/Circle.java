public class Circle implements Shape {
	private double radius;
	private static double pi=3.14;
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*pi*radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return pi*radius*radius;
	}
	public Circle(double rad)
	{
		this.radius=rad;
	}
}
