/**********

NAME:                              Shoaib Khan
STUDENT NUMBER:                    507285

ICS4U0-A, Sep-Jan 2016

THIS FILE IS PART OF THE PROGRAM:  Stacks Assignment (The "TheBoss" class), Uses LAN.java and Computer.java
Purpose: This class is used to create a new LAN stack and call upon methods from the LAN class. Contains the main method

**********/

public class TheBoss //Test class which calls upon the methods created in the LAN class
{
    public static void main (String[] args)
    {
	Computer newComputer;

	LAN stack1 = new LAN ("LAN Stack", 0);

	newComputer = new Computer ("Corsair", 1000, 32);
	stack1.push (newComputer);

	newComputer = new Computer ("Dell", 5000, 8);
	stack1.push (newComputer);
	stack1.pop ();

	newComputer = new Computer ("MacBook", 750, 4);
	stack1.push (newComputer);

	stack1.isEmpty ();
	stack1.size ();
	stack1.display (newComputer);
	stack1.peek ();
    }
}
