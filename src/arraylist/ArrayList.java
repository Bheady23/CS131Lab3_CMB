package arraylist;
import java.util.Arrays;

/**
 * This class represents a generic Array
 * Original @author of this class is Robert Kelley
 * @author Chris Burkhead added additions as requested
 * Programming Lab 3
 * version 1.0
 * CS131ON
 * Summer 2022
 * 
 */


/**
 * 
 * Class signature indicates it is generic
 * @param <T>
 */
public class ArrayList<T> {

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	/**
   	 * Empty argument constructor sets arlist array to DEFAULT_SIZE length
   	 */
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 
   	
   	/**
   	 * Preferred constructor 
   	 * @param length
   	 */
  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
    }//end preferred constructor
  
  	/**
  	 * Method addItem returns a boolean value, it checks to see if an array has been fully instantiated
  	 * using the currentItem variable. If it hasn't then it returns true and allows the item to be added to the array
  	 * if the array is full then it returns false and does not allow the item to be added. 
  	 * @param Object
  	 * @return
  	 */
    public boolean addItem(T Object) {
	 
	 if (currentItem<arList.length) {
		 arList[currentItem]=Object;
		  currentItem++;
		  return true;}
  	else if (currentItem>arList.length)
  		 return false;
  	
  	return false;
    }//end addItem

 
    /**
     * toString method uses a for loop and the array StringBuilder to printout every item of the array in a clean format 
     */
    @Override
    public String toString() {
	int i=0;
	StringBuilder array=new StringBuilder();
	for(i=0;i<currentItem;) {
		array.append(arList[i]+"\n");
	    i++;}
		
	return array.toString();			
    }//end toString
  	
}//end class
