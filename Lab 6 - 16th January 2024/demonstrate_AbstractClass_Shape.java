abstract class Shape
{
	abstract void calculateArea();
	abstract void calculatePerimeter();
}
class Circle extends Shape
{
	int radius;
	Circle(int radius)
	{
		this.radius=radius;
	}
	void calculateArea()
	{
		System.out.println("The area of the circle of radius "+radius+" is "+(3.14*radius*radius));
	}
	void calculatePerimeter()
	{
		System.out.println("The perimeter of the circle of radius "+radius+" is "+(2*3.14*radius));
	}
}
class Triangle extends Shape
{
	int base, side2, side3;
	int height;
	Triangle(int base, int side2, int side3, int height)
	{
		this.base=base;
		this.side2=side2;
		this.side3=side3;	
		this.height=height;
	}
	void calculateArea()
	{
		System.out.println("The area of the triangle of base "+base+" and height "+height+" is "+(0.5*base*height));
	}
	void calculatePerimeter()
	{
		System.out.println("The perimeter of the triangle of sides "+base+", "+side2+", and "+side3+" is "+(base+side2+side3));
	}
}
class demonstrate_AbstractClass_Shape
{
	public static void main(String args[])
	{
		Circle c1=new Circle(7);
		Triangle t1=new Triangle(3, 4, 5, 6);
		c1.calculateArea();
		c1.calculatePerimeter();
		t1.calculateArea();
		t1.calculatePerimeter();
	}
}
		



	