/**********

NAME:                              Shoaib Khan
STUDENT NUMBER:                    507285

ICS4U0-A, Sep-Jan 2016

THIS FILE IS PART OF THE PROGRAM:  Stacks Assignment (The "Computer" class)
Purpose: This class is used to set up and add attributes to the Computer Object.

**********/

public class Computer //Item class with attributes listed below
{
    private String company;
    private int hDDSize;
    private int ram;
    private Computer next;
    private Computer previous;

    public Computer (String company, int hDDSize, int ram) //Constructor
    {
	this.company = company;
	this.hDDSize = hDDSize;
	this.ram = ram;
    }


    public String getCompany ()
    {
	return company;
    }


    public int getHDDSize ()
    {
	return hDDSize;
    }


    public int getRam ()
    {
	return ram;
    }


    public Computer getNext ()
    {
	return next;
    }


    public void setNext (Computer next)
    {
	this.next = next;
    }


    public Computer getPrevious ()
    {
	return previous;
    }


    public void setPrevious (Computer previous)
    {
	this.previous = previous;
    }
}
