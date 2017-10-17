
public class Square implements Shape{
	private double side=0;
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4 * side;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side * side;
	}
	public Square(double side)
	{
		this.side = side;
	}
}
