/**
 * 
 */
package kenzan;
import java.util.*;
import java.io.*;

/**
 * @author Demonna Evelyn Wade
 * This class is houses the functions to solve the FizzBuzz Problem
 */

public class FizzBuzzSolver {
	private ArrayList<Integer> fizz;
	private ArrayList<Integer> buzz;
	private ArrayList<Integer> fizzBuzz;
	private int upperBoundLimit;
	private String result;
	
/**
 * FizzBuzzSolver
 * @param no parameters required for default constructor
 * initializes all of the variables and data structures used for this class
 */
	FizzBuzzSolver (int upperBoundLimit)
	{
		this.upperBoundLimit = upperBoundLimit;
		this.result = "";
		this.fizz = new ArrayList<Integer>();
		this.buzz = new ArrayList<Integer>();
		this.fizzBuzz = new ArrayList<Integer>();
	}
/**
 * solveFizzBuzz
 * @param newUpperBoundLimit
 * populates fizz, buzz, and fizzbuzz with the correct found integers that meet the requirements
 */

	public void solveFizzBuzz(int newUpperBoundLimit)
	{
		int testValue = 1;
		this.upperBoundLimit = newUpperBoundLimit;
		// testing all the values from 1 until the the upperBoundLimit 
		while (testValue <= this.upperBoundLimit)
		{
			// testing if the testValue is divisible by 3
			if ( (testValue % 3) == 0)
			{
				this.fizz.add(testValue);
			}
			// testing if the testValue is divisible by 5
			if ( (testValue % 5) == 0)
			{
				this.buzz.add(testValue);
			}
			// testing if the testValue is divisible by 3 and 5
			if ( (testValue % 15) == 0)
			{
				this.fizzBuzz.add(testValue);
			}
			testValue ++;
		}
	}
/**
 * @param no parameters required for default constructor
 * This functions takes all of the results found and formats its into the string used to print to the web browser page
 */
	public String printAnswers()
	{
		this.result += "{";
		// add to result all the arrayLists
		this.result += " \"Fizz\": ";
		this.result += this.fizz;
		this.result += ", \"Buzz\": ";
		this.result += this.buzz;
		this.result += ", \"FizzBuzz\": ";
		this.result += this.fizzBuzz;
		this.result += "}";
		
		return this.result;
	}

}
