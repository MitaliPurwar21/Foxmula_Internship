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