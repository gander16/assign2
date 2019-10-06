/**
 * Assignment #: 2
 * Name: Gabriel Anderson 
 * Student ID: 1212500313
 * Class ID: 70642
 * Description: AddingMachine.java is the class
 * that acts like a basic calculator with the add,
 * subtract, get total, clear total and convert total to string.
 * GitHub URL (via HTTPS): https://github.com/gander16/assign2.git
 */
package cse360assign2;

/**
 * Creates AddingMachine class that acts like a basic calculator with the add,
 * subtract, get total, clear total and convert total to string.
 * 
 * @author Gabriel Anderson <gander16 @ asu.edu>
 * @version 1.1
 * @since 1.0
 */
public class AddingMachine {

	private int total;
	private String history;

	/**
	 * Creates AddingMachine class. Initializes test and total's history.
	 * 
	 * @since 1.0
	 */
	public AddingMachine() {
		total = 0; // not needed - included for clarity
		history = String.valueOf(total);
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
	public void add(int value) {
		total += value;
		history += " + " + String.valueOf(value);
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
	public void subtract(int value) {
		total -= value;
		history += " - " + String.valueOf(value);
	}

	/**
	 * Converts total into string format.
	 *
	 * <p>
	 * Use {@link #toString()} to return the int total as a String, a.k.a. returns
	 * the history variable.
	 *
	 * @return String of the total and history of adding and subtracting subsequent
	 *         integers.
	 * @since 1.0
	 */
	public String toString() {
		return history;
	}

	/**
	 * Resets the total to 0 and clears the String's history
	 *
	 * <p>
	 * Use {@link #clear()} to reset the total to the original state, along with its
	 * history.
	 *
	 * @return void in all cases
	 * @since 1.0
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}
