package cse360assignment02;

/**
 * Austin Buford
 * CSE 360
 * Assignment 1
 */

public class AddingMachine {

    private int total;
    private String operations;

    /**
     * Constructs an adding machine
     * The total is the int that the actions are added or subtracted from
     */

    public AddingMachine ()
    {

        total = 0;  // not needed - included for clarity
        operations = "0 ";

    }

    /**
     * Returns the int total when called
     */

    public int getTotal ()
    {

        return total;

    }

    /**
     * Adds a value to the total and adds to the operation string
     * Operation string is a string that prints all operations performed
     *
     * @param value is the value passed into the add function that is added to the total
     */

    public void add (int value)
    {

        total = total + value;
        operations = operations + "+ " + value + " ";

    }

    /**
     * subtracts a value to the total and adds to the operation string
     * Operation string is a string that prints all operations performed
     *
     * @param value is the value passed into the subtract function that is subtracted from the total
     */

    public void subtract (int value)
    {

        total = total - value;
        operations = operations + "- " + value + " ";

    }

    /**
     * Prints the final operation string
     * Operation string is a string that prints all operations performed
     */

    public String toString ()
    {

        return operations;

    }

    /**
     * Resets the values to their original values
     */

    public void clear()
    {

        total = 0;
        operations = "0 ";

    }
}