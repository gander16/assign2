/**
 * Assignment #: 3
 * Name: Gabriel Anderson 
 * Student ID: 1212500313
 * Class ID: 70642
 * Description: AddingMachine.java is the class
 * that acts like a basic calculator with the add,
 * subtract, get total, clear total and convert total to string.
 * GitHub URL (via HTTPS): https://github.com/gander16/assign2.git
 */
package cse360assign3;

/**
 * Creates AddingMachine class that acts like a basic calculator with the add,
 * subtract, get total, clear total and convert total to string.
 * 
 * @author Gabriel Anderson <gander16 @ asu.edu>
 * @version 1.1
 * @param <inherits>
 * @since 1.0
 */
public class Calculator extends AddingMachine {

	/**
	 * Creates AddingMachine class. Initializes test and total's history.
	 * 
	 * @since 1.0
	 */
	public Calculator() {
		super();

	}

	/**
	 * Returns the value of the private int total
	 *
	 * <p>
	 * Use {@link #getTotal()} to return the total value.
	 *
	 * @return int of the new total
	 * @since 1.0
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * Adds an int value to the total integer.
	 *
	 * <p>
	 * Use {@link #add(int value)} to add value to total and save addition to
	 * history.
	 * 
	 * @param value
	 *            integer to add to the total integer.
	 *
	 * @return void in all cases
	 * @since 1.0
	 */
	public void mult(int value) {
		total = total * value;
		history += " * " + String.valueOf(value);
	}

	/**
	 * Subtracts an int value to the total integer.
	 *
	 * <p>
	 * Use {@link #subtract(int value)} to subtract value from total and save
	 * subtraction from history.
	 *
	 * @param value
	 *            integer to subtract from the total integer.
	 *
	 * @return void in all cases
	 * @since 1.0
	 */
	public void div(int value) {
		if (value == 0) {
			total = 0;
		} else {
			total = total / value;
		}
		history += " / " + String.valueOf(value);
	}

	/**
	 * Subtracts an int value to the total integer.
	 *
	 * <p>
	 * Use {@link #subtract(int value)} to subtract value from total and save
	 * subtraction from history.
	 *
	 * @param value
	 *            integer to subtract from the total integer.
	 *
	 * @return void in all cases
	 * @since 1.0
	 */
	public void power(int value) {
		if (value < 0) {
			total = 0;
		} else {
			total = total ^ value;
		}
		history += " ^ " + String.valueOf(value);
	}

}
