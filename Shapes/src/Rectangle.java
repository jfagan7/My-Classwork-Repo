
public class Rectangle implements Shape {
	private double length;
	private double width;
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(length + width);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * width;
	}
	
	public Rectangle(double length, double width)
	{
		this.length=length;
		this.width=width;
	}

}
