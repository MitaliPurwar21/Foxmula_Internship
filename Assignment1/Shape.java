public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrilateral quadrilateral = new Quadrilateral( 1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4 );
				
				 // A trapezoid is a quadrilateral having exactly two parallel sides
				 Trapezoid trapezoid = new Trapezoid( 0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0 );
				
				 // A parallelogram is a quadrilateral with opposite sides parallel
				 Parallelogram parallelogram = new Parallelogram( 5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0 );
				
				 // A rectangle is an equiangular parallelogram
				 Rectangle rectangle = new Rectangle( 17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0 );
				
				 // A square is an equiangular and equilateral parallelogram
				 Square square = new Square( 4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0 );
				
				 System.out.printf("%s %s %s %s %s\n", quadrilateral, trapezoid, parallelogram,rectangle, square );


	}

}
class Point 
{
private double x; // x coordinate
private double y; // y coordinate

// two-argument constructor
public Point( double xCoordinate, double yCoordinate )
{
x = xCoordinate; // set x
y = yCoordinate; // set y
} // end two-argument Point constructor

// return x
public double getX()
{
return x;
} // end method getX
//return y
public double getY()
{
return y;
} // end method getY
//return string representation of Point objectExercises 9
public String toString()
{
return String.format( "( %.1f, %.1f )", getX(), getY() );
} // end method toString
} // end class Point
//Exercise 9.8 Solution: Quadrilateral.java
//Class Quadrilateral definition
class Quadrilateral
{
private Point point1; // first endpoint
private Point point2; // second endpoint
private Point point3; // third endpoint
private Point point4; // fourth endpoint 
public Quadrilateral( double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4 )
{
point1 = new Point( x1, y1 );
point2 = new Point( x2, y2 );
point3 = new Point( x3, y3 );
point4 = new Point( x4, y4 );
} // end eight-argument Quadrilateral constructor

// return point1
public Point getPoint1()
{
return point1;
} // end method getPoint1

// return point2
public Point getPoint2()
{
return point2;
} // end method getPoint2

// return point3
public Point getPoint3()
{
return point3;
} // end method getPoint3

// return point4
public Point getPoint4()
{
return point4;
} // end method getPoint4

// return string representation of a Quadrilateral object
public String toString(){
return String.format( "%s:\n%s",
"Coordinates of Quadrilateral are", getCoordinatesAsString() ); 
} // end method toString

// return string containing coordinates as strings
public String getCoordinatesAsString()
{
return String.format(
"%s, %s, %s, %s\n", point1, point2, point3, point4 );
} // end method getCoordinatesAsString
} // end class Quadrilateral
//Exercise 9.8 Solution: Trapezoid.java
//Class Trapezoid definition
class Trapezoid extends Quadrilateral
{
private double height; // height of trapezoid
//eight-argument constructor
public Trapezoid( double x1, double y1, double x2, double y2,
double x3, double y3, double x4, double y4 )
{
super( x1, y1, x2, y2, x3, y3, x4, y4 );
} // end of eight-argument Trapezoid constructor

// return height
public double getHeight()
{
if ( getPoint1().getY() == getPoint2().getY() )
return Math.abs( getPoint2().getY() - getPoint3().getY() );
else
return Math.abs( getPoint1().getY() - getPoint2().getY() );
} // end method getHeight

// return area
public double getArea()
{
return getSumOfTwoSides() * getHeight() / 2.0;
} // end method getArea

//return the sum of the trapezoid's two sides
public double getSumOfTwoSides()
{
if ( getPoint1().getY() == getPoint2().getY() )
return Math.abs( getPoint1().getX() - getPoint2().getX() ) +
Math.abs( getPoint3().getX() - getPoint4().getX() );
else
return Math.abs( getPoint2().getX() - getPoint3().getX() ) +
Math.abs( getPoint4().getX() - getPoint1().getX() );
} // end method getSumOfTwoSides

// return string representation of Trapezoid objectExercises 11
public String toString()
{
return String.format( "\n%s:\n%s%s: %s\n%s: %s\n",
"Coordinates of Trapezoid are", getCoordinatesAsString(),
"Height is", getHeight(), "Area is", getArea() );
} // end method toString
} // end class Trapezoid
//Exercise 9.8 Solution: Parallelogram.java
//Class Parallelogram definition
class Parallelogram extends Trapezoid
{
//eight-argument constructor
public Parallelogram( double x1, double y1, double x2, double y2,
double x3, double y3, double x4, double y4 )
{
super( x1, y1, x2, y2, x3, y3, x4, y4 );
} // end eight-argument Parallelogram constructor

//return width of parallelogram
public double getWidth()
{
if ( getPoint1().getY() == getPoint2().getY() )
return Math.abs( getPoint1().getX() - getPoint2().getX() );
else
return Math.abs( getPoint2().getX() - getPoint3().getX() );
} // end method getWidth

//return string representation of Parallelogram object
public String toString()
{
return String.format( "\n%s:\n%s%s: %s\n%s: %s\n%s: %s\n",
"Coordinates of Parallelogram are", getCoordinatesAsString(),
"Width is", getWidth(), "Height is", getHeight(),
"Area is", getArea() );
} // end method toString
} // end class Parallelogram
//Exercise 9.8 Solution: Rectangle.java
//Class Rectangle definition
class Rectangle extends Parallelogram
{
//eight-argument constructor
public Rectangle( double x1, double y1, double x2, double y2,double x3, double y3, double x4, double y4 )
{
super( x1, y1, x2, y2, x3, y3, x4, y4 );
} // end eight-argument Rectangle constructor

//return string representation of Rectangle object
public String toString()
{
return String.format( "\n%s:\n%s%s: %s\n%s: %s\n%s: %s\n",
"Coordinates of Rectangle are", getCoordinatesAsString(),
"Width is", getWidth(), "Height is", getHeight(),
"Area is", getArea() );
} // end method toString
} // end class Rectangle
// Exercise 9.8 Solution: Square.java
// Class Square definition

class Square extends Parallelogram
{
// eight-argument constructor
public Square( double x1, double y1, double x2, double y2,
double x3, double y3, double x4, double y4 )
{
super( x1, y1, x2, y2, x3, y3, x4, y4 );
} // end eight-argument Square constructor

// return string representation of Square object
public String toString()
{
return String.format( "\n%s:\n%s%s: %s\n%s: %s\n",
"Coordinates of Square are", getCoordinatesAsString(),
"Side is", getHeight(), "Area is", getArea() );
} // end method toString
}
 // end class Square