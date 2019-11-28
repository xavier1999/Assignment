package Week2;

public class Square extends Shape {

	private Point topLeft;
	private double width;
	
	public Square(String name,Point topLeft,double width) {
		super(name);
		this.topLeft = topLeft;
		this.width = width;
	}

	@Override
	public double getArea() {
		
		return this.width * this.width;
	}
	
	public void setWidth(double newWidth) {
		width = newWidth;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setTopLeft(Point newTopLeft) {
		topLeft = newTopLeft;
	}
	
	public Point getTopLeft() {
		return topLeft;
	}
	
	public String toString() {
		return "Square [width=" + width + ", topleft=" + topLeft + "]";
	}
}
