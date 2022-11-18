import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class RectangleApp {

	public static void main(String[] args) {

		ArrayList<RectangleMine> rectangleList;
		rectangleList = new ArrayList<>();
		
		fileArrayList(rectangleList);
		printRectangles(rectangleList);
	}//end main

	private static void fileArrayList(ArrayList<RectangleMine> rectangleAL) {
		
		Scanner infile;
		
		try {
			infile = new Scanner(new File("rectangle_data.txt"));
		
			RectangleMine temp;
			double length;
			double width;
			
			while(infile.hasNext()) {
				length = infile.nextDouble();
				width = infile.nextDouble();
				
				temp = new RectangleMine(length, width);
				
				rectangleAL.add(temp);
				
				
			}// end while
			infile.close();
		} //end try
		
		catch (FileNotFoundException ex) {
			System.out.println("File Not Found");
		}//end try-catch

	}// end fillArrayList

	

	private static void printRectangles(ArrayList<RectangleMine> rectangleALS) {
		for(RectangleMine r : rectangleALS) {
			System.out.println("Length: " + r.getLength());
			System.out.println("Length: " + r.getWidth());
			System.out.println("Length: " + r.area());
			System.out.println("Perimeter: " + r.perimeter());
			System.out.println("");
		}
	}//end printArrayList

	
}//EOF