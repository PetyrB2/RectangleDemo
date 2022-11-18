
public class RectangleMine {

	// Attributes
	double length;
	double width;

	private static int numRectangles;

	// =====================================
	// Begin Methods
	public RectangleMine() {
		this(1.0, 1.0);
	}// no-arg ctor

	// Main constructor we use
	public RectangleMine(double length, double width) {
		this.length = length;
		this.width = width;
		numRectangles++;
	}// end parameterised ctor

	// =====================================
	// Area Method
	public double area() {
		
		return (length * width);
	}

	// Perimeter Method
	public double perimeter() {
		
		return 2 * length + 2 * width;
	}

	// =====================================
	// Getters and Setters


	public static int getNumRectangles() {
		return numRectangles;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public static void setNumRectangles(int numRectangles) {
		RectangleMine.numRectangles = numRectangles;
	}

	// =====================================
}// EOF
