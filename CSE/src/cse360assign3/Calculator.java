
package cse360assign3;

/** Simple Calculator class
 * @author Larry Standage 816
 * @version Feb 20, 2016
 * 
 */
public class Calculator {

	/** Accumulator for calculations */
	private int total;
	
	/** Accumulator for history */
	private String strHistory;
	
	/** Create an empty calculator */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		strHistory = "0 "; 
	}
	
	/**
	 *  Returns the total on the calculator
	 *  @return total
	 *  
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 *  Add a number to the calculated total
	 *  @param value - the number to added to the total
	 *  
	 */
	public void add (int value) {
		total += value;
		strHistory += "+ " + value + " ";
	}
	
	/**
	 *  Subtract a number from the calculated total
	 *  @param value - the number to be subtracted from the total
	 *  
	 */
	public void subtract (int value) {
		total -= value;
		strHistory += "- " + value + " ";
	}
	
	/**
	 *  Multiply the calculated total by a number
	 *  @param value - the number to multiply the total by
	 *  
	 */
	public void multiply (int value) {
		total *= value;
		strHistory += "* " + value + " ";
	}
	
	/**
	 *  Divide the calculated total by a number
	 *  @param value - the number to Divide the total by
	 *  
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else
			total = total / value;
		
		strHistory += "/ " + value + " ";
	}
	
	/**
	 *  Retrieve the calculations done in this session
	 *  @return A string representation of the calculations performed.
	 *  
	 */
	public String getHistory () {
		return strHistory += "= "+getTotal();
	}
}
