class Point 
{
	private double x; //will store x coordinates
	private double y; //will store y coordinates
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y; 
	} 
	public double getX() //will return x
	{
		return x;
	} 
	public double getY() //will return y
	{
		return y;
	} 
} 

class Quadrilateral
{
	private Point point1,point2,point3,point4; // first, second, third and fourth end point respectively
	public Quadrilateral( double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4 ) //constructor 
	{
		point1 = new Point( x1, y1 );
		point2 = new Point( x2, y2 );
		point3 = new Point( x3, y3 );
		point4 = new Point( x4, y4 );
	} 
	public Point getPoint1() //will return point 1
	{
		return point1;
	}
	public Point getPoint2() //will return point 2
	{
		return point2;
	} 
	public Point getPoint3() //will return point3
	{
		return point3;
	} 
	public Point getPoint4() //will return point4
	{
		return point4;
	} 
} 

class Trapezoid extends Quadrilateral
{
	private double height; 
	public Trapezoid( double x1, double y1, double x2, double y2,double x3, double y3, double x4, double y4 )
	{
		super( x1, y1, x2, y2, x3, y3, x4, y4 );
	}
	public double getHeight() //return height
	{
		if ( getPoint1().getY() == getPoint2().getY() )
			return Math.abs( getPoint2().getY() - getPoint3().getY() );
		else
			return Math.abs( getPoint1().getY() - getPoint2().getY() );
	} 
	public double getArea() // return area
	{
		return getSumOfTwoSides() * getHeight() / 2.0;
	} 
	//return the sum of the trapezoid's two sides
	public double getSumOfTwoSides()
	{
		if ( getPoint1().getY() == getPoint2().getY() )
			return Math.abs( getPoint1().getX() - getPoint2().getX() ) +
		Math.abs( getPoint3().getX() - getPoint4().getX() );
		else
			return Math.abs( getPoint2().getX() - getPoint3().getX() ) +
		Math.abs( getPoint4().getX() - getPoint1().getX() );
	} 
} 

class Parallelogram extends Trapezoid
{
	public Parallelogram( double x1, double y1, double x2, double y2,double x3, double y3, double x4, double y4 )
	{
		super( x1, y1, x2, y2, x3, y3, x4, y4 );
	} 
	public double getWidth() //return width of parallelogram
	{
		if ( getPoint1().getY() == getPoint2().getY() )
			return Math.abs( getPoint1().getX() - getPoint2().getX() );
		else
			return Math.abs( getPoint2().getX() - getPoint3().getX() );
	} 
} 

class Rectangle extends Parallelogram
{
	public Rectangle( double x1, double y1, double x2, double y2,double x3, double y3, double x4, double y4 )
	{
		super( x1, y1, x2, y2, x3, y3, x4, y4 );
	}
} 

class Square extends Parallelogram
{
	public Square( double x1, double y1, double x2, double y2,double x3, double y3, double x4, double y4 )
	{
		super( x1, y1, x2, y2, x3, y3, x4, y4 );
	} 
}
 
public class Shape 
{
	public static void main(String[] args) 
	{
		Trapezoid trapezoid = new Trapezoid(0.0, 0.0, 2.0, 4.0, 6.0, 4.0, 10.0, 0.0 ); // A trapezoid is a quadrilateral having exactly two parallel sides
		Parallelogram para = new Parallelogram( 0.0, 0.0, 8.0, 0.0, 2.0, 6.0, 10.0, 6.0); // A parallelogram is a quadrilateral with opposite sides parallel
		Rectangle rect = new Rectangle( 4.0, 8.0, 12.0, 8.0, 4.0, 12.0, 12.0, 20.0 );// A rectangle is an equiangular parallelogram
		Square sq = new Square( 2.0, 6.0, 6.0, 6.0, 2.0, 2.0, 6.0, 2.0 );// A square is an equiangular and equilateral parallelogram
		System.out.println("Trapezoid "+ trapezoid.getArea());
		System.out.println("Parallelogram "+ para.getArea());
		System.out.println("Rectangle "+ rect.getArea());
		System.out.println("Square "+ sq.getArea());
	}
}