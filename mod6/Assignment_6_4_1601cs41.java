class Rectangle
{
	double length;
	double width;
	double area;
	String color;

	public void set_length(double l)
	{
		this.length = l;
	}

	public void set_width(double w)
	{
		this.width = w;
	}

	public void set_color(String c)
	{
		this.color = c;
	}

	public double find_area()
	{
		double result = (length*width);
		return result;
	}
}

public class Assignment_6_4_1601cs41
{
	public static void main(String[] args) 
	{
		Rectangle rect1 = new Rectangle();
		rect1.set_length(4);
		rect1.set_width(5);
		rect1.set_color("Green");

		Rectangle rect2 = new Rectangle();
		rect2.set_length(7);
		rect2.set_width(4);
		rect2.set_color("Black");

		if(rect1.find_area() == rect2.find_area() && rect1.color.equals(rect2.color))
		{
			System.out.println("Matching Rectangles");
		}
		else
		{
			System.out.println("Non matching Rectangles");
		}
	}
}
