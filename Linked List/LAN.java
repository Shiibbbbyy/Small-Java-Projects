/**********

NAME:                              Shoaib Khan
STUDENT NUMBER:                    507285

ICS4U0-A, Sep-Jan 2016

THIS FILE IS PART OF THE PROGRAM:  Stacks Assignment (The "LAN" class), uses Computer.java
Purpose: This class is used to set up and add attributes to the LAN stack. Includes methods to alter or display the stack.

**********/
import hsa.Console; //Imports the console class which allows the program to create a new display console.

public class LAN //Stack class with attributes listed below
{
    Console c = new Console ();
    private Computer firstComputer;
    private String nameLAN;
    private int numComputers;

    public LAN (String nameLAN, int numComputers)  //Constructor which creates the LAN stack
    {
	this.nameLAN = nameLAN;
	this.numComputers = numComputers;
    }


    public int isEmpty ()
    {
	if (numComputers == 0)
	    c.println ("The Stack is Empty.");
	else
	    c.println ("The Stack is NOT Empty.");
	return numComputers;
    }


    public Computer peek ()
    {
	if (numComputers != 0)
	    c.println ("The object at the top of the stack is: " + firstComputer.getCompany ());
	return firstComputer;
    }


    public void push (Computer newComputer)
    {
	newComputer.setNext (firstComputer);
	firstComputer = newComputer;
	numComputers++;
    }


    public Computer pop ()
    {
	if (numComputers != 0)
	{
	    firstComputer.setPrevious (firstComputer);
	    firstComputer = firstComputer.getNext ();
	    numComputers--;
	}
	else
	    c.println (nameLAN + " is Empty.");
	return firstComputer;
    }


    public void size ()
    {
	c.println ("There are " + numComputers + " Computers in the LAN.");
    }


    public void display (Computer newComputer)
    {
	newComputer = firstComputer;
	c.println ("Name of the LAN: " + nameLAN);
	while (newComputer != null)
	{
	    c.print (newComputer.getCompany (), 10);
	    c.print (newComputer.getHDDSize (), 10);
	    c.println (newComputer.getRam (), 10);
	    newComputer = newComputer.getNext ();
	}
    }
}
