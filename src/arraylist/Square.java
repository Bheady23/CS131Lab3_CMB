package arraylist;
/**
 * This class represents a Square object
 * @author Chris Burkhead
 * Programming Lab 3 
 * version 1.0
 * CS131ON
 * Summer 2022
 *
 */
public class Square {

	private double side;

	/**
	 * Empty argument constructor sets instance variables
	 */
	public Square() {
		side=0;
	}//end empty-argument constructor

	/**
	 * preferred constructor 
	 * @param side
	 */
	public Square(double side) {
		this.side=side;
	}//end preferred constructor
	
	/**
	 * get Area method
	 * @returns variable area which is the area of the square using side 
	 */
	public double getArea() {
		double area=Math.pow(side, 2);
		return area;
	}//end getArea
	
	

	public double getSide() {
		return side;
	}//end getSide

	public void setSide(double side) {
		this.side = side;
	}//end setSide

	@Override
	public String toString() {
		return "Square [side=" + side + ", getArea()=" + getArea() + "]";
	}
	
}//end class

