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