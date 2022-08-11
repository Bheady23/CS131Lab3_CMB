package arraylist;
/**
 * This class provides the main Argument for all classes in the arratList package
 * It instantiates three types of Arrays, String, Square and PointThreeD. 
 * It then calls the toString Method for each Array to be printed to the screen
 * @author Chris Burkhead
 * Programming Lab 3 
 * version 1.0
 * CS131ON
 * Summer 2022
 *
 */
public class ListApp {

	public static void main(String[] args) {
		
	ArrayList<Square>squareList = new ArrayList<Square>();
		  squareList.addItem(new Square(5));
		  squareList.addItem(new Square(6));
		  squareList.addItem(new Square(8));
		  squareList.addItem(new Square(9));
		  
	ArrayList<String>stringList = new ArrayList<String>();
		stringList.addItem(new String("Thor"));
		stringList.addItem(new String("Iron Man"));
	    stringList.addItem(new String("Black Widow"));
	    stringList.addItem(new String("Star Lord"));
	    stringList.addItem(new String("Captain America"));
	    stringList.addItem(new String("Hulk"));
	    stringList.addItem(new String("AntMan"));
	    stringList.addItem(new String("Captian Marvel"));
	    stringList.addItem(new String("Vision"));
	    stringList.addItem(new String("Wanda"));
	    stringList.addItem(new String("Grot"));
		
	 ArrayList<PointThreeD>pointList = new ArrayList<PointThreeD>();
	 	pointList.addItem(new PointThreeD(2.2, 4.5, 6.8));
	 	pointList.addItem(new PointThreeD(1.6, 7.75, 10.12));
	 	pointList.addItem(new PointThreeD(5.7, 3.33, 2.35));
	 	pointList.addItem(new PointThreeD(4.57, 8.72, 11.11));
	 	pointList.addItem(new PointThreeD(2.58, 1.15, 13.3));
	 	pointList.addItem(new PointThreeD(2.12, 6.12, 12.6));
	 	
		System.out.println(squareList.toString());
		System.out.println(stringList.toString());
		System.out.println(pointList.toString());
		
	}//end main

}//end class
