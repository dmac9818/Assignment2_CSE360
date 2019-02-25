package cse360assign2;
/** Name: Daniel McComb
 *Class ID: 485
 *Assignment 2
 *Description: A class that contains methods to perform a number of math operations and print the history of them.
 */
public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	
	/**
	 * Returns total value
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds parameter to total value
	 * @param value integer taken to be added to total
	 */
	
	public void add (int value) {
		total = total + value;
	}
	
	/**
	 * Subtracts parameter from total value
	 * @param value integer taken to be subtracted from total
	 */
	
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * Multiplies parameter with total value
	 * @param value integer taken to be multiplied with total
	 */
	
	public void multiply (int value) {
		total = total * value;
	}
	
	/**
	 * Divides total value by parameter
	 *  @param value integer taken to be divisor of total
	 */
	
	public void divide (int value) {
		if(value==0)
			total=0;
		else
			total = total/value;
	}
	
	public String getHistory () {
		return "";
	}
}