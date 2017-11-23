/**
 * 
 */
package kenzan;
import java.util.*;
import java.io.*;

/**
 * @author mona
 * This class is houses the functions to solve the FizzBuzz Problem
 */
public class FizzBuzzSolver {
	private ArrayList<Integer> fizz;
	private ArrayList<Integer> buzz;
	private ArrayList<Integer> fizzBuzz;
	private int upperBoundLimit;
	private String result;
	
	FizzBuzzSolver (int upperBoundLimit)
	{
		this.upperBoundLimit = upperBoundLimit;
		this.result = "";
		this.fizz = new ArrayList<Integer>();
		this.buzz = new ArrayList<Integer>();
		this.fizzBuzz = new ArrayList<Integer>();
	}
	
	public void solveFizzBuzz(int newUpperBoundLimit)
	{
		int testValue = 1;
		this.upperBoundLimit = newUpperBoundLimit;
		while (testValue <= this.upperBoundLimit + 1)
		{
			if ( (testValue % 3) == 0)
			{
				this.fizz.add(testValue);
			}
			if ( (testValue % 5) == 0)
			{
				this.buzz.add(testValue);
			}
			if ( (testValue % 15) == 0)
			{
				this.fizzBuzz.add(testValue);
			}
			testValue ++;
		}
	}
	
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
