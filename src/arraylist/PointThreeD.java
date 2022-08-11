package arraylist;
/**
 * This class represents a Three points of a grid
 * @author Chris Burkhead
 * Programming Lab 3 
 * version 1.0
 * CS131ON
 * Summer 2022
 *
 */
public class PointThreeD {
	
	private double xPoint, yPoint, zPoint;
	
	/**
	 * Empty argument constructor sets instance variables
	 */
	public PointThreeD() {
		xPoint=0;
		yPoint=0;
		zPoint=0;
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor 
	 * @param xPoint
	 * @param yPoint
	 * @param zPoint
	 */
	public PointThreeD(double xPoint, double yPoint, double zPoint) {
		super();
		this.xPoint = xPoint;
		this.yPoint = yPoint;
		this.zPoint = zPoint;
	}//end preferred constructor

	public double getxPoint() {
		return xPoint;
	}//end getxPoint

	public void setxPoint(double xPoint) {
		this.xPoint = xPoint;
	}//end setxPoint

	public double getyPoint() {
		return yPoint;
	}//end getyPoint

	public void setyPoint(double yPoint) {
		this.yPoint = yPoint;
	}//end getyPoint

	public double getzPoint() {
		return zPoint;
	}//end getzPoint

	public void setzPoint(double zPoint) {
		this.zPoint = zPoint;
	}//end setzPoint

	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}//end toString
	
}//end class
