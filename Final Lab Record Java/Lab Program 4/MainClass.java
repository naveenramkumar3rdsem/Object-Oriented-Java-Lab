import java.util.Scanner;

class InputScanner

{

	Scanner s=new Scanner(System.in);

}

abstract class shape extends InputScanner

{
	
	int base;
	int height;
	
	abstract void printArea();

}

class Rectangle extends shape

{
	
	void printArea()
	
	{
		
		System.out.println("Area of Rectangle="+(base*height));
	
	}

}

class Triangle extends shape

{
	
	void printArea()
	
	{
		
		System.out.println("Area of Triangle="+((base*height)/2));
	}
}

class Circle extends shape

{
	
	void printArea()

	{
		
		System.out.println("Area of Circle="+(3.14*base*base));
	}	
}

class MainClass
{

	static void input(Rectangle r, Triangle t, Circle c)

	{
				System.out.println("Enter the dimensions of the rectangle ");

		r.base=r.s.nextInt();
		r.height=r.s.nextInt();
		System.out.println("Enter the dimensions of the triangle ");
		t.base=t.s.nextInt();
		t.height=t.s.nextInt();
		System.out.println("Enter the dimensions of the circle ");
		c.base=c.s.nextInt();
	}

	public static void main(String args[])
	
	{
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Circle c=new Circle();
		input(r, t, c);
		r.printArea();
		t.printArea();
		c.printArea();
	
	}

}