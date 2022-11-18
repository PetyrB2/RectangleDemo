
public class RectangleDemo {

	public static void main(String[] args) {


		RectangleMine r1 = new RectangleMine();
		RectangleMine r2 = new RectangleMine(10, 5);
		
		System.out.println(RectangleMine.getNumRectangles());
		
		RectangleMine r3;
		
		System.out.println("After r3 is declared: " + RectangleMine.getNumRectangles());
	
		r3 = new RectangleMine(2.5, 4);
		
		System.out.println("After r3 is instantiated: " + RectangleMine.getNumRectangles());
		System.out.println("");
		System.out.println("-----");
		System.out.println("Areas");
		System.out.println("-----");
		System.out.println("Area of r1: \t" + r1.area());
		System.out.println("Area of r2: \t" + r2.area());
		System.out.println("Area of r3: \t" + r3.area());
		System.out.println("");
		System.out.println("----------");
		System.out.println("Perimeters");
		System.out.println("----------");
		System.out.println("Perimeter of r1: \t" + r1.perimeter());
		System.out.println("Perimeter of r2: \t" + r2.perimeter());
		System.out.println("Perimeter of r3: \t" + r3.perimeter());
		
	}//end of main
}//EOF
