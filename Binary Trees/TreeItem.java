/**********

NAME:                              Shoaib Khan
STUDENT NUMBER:                    507285

ICS4U0-A, Sep-Jan 2016

THIS FILE IS PART OF THE PROGRAM: Binary Tree Assignment (The "TreeItem" class)
Purpose: This class is used to set up and add attributes to the TreeItem Object.

**********/

public class TreeItem //Item class with attributes listed below
{
    private int keyValue;
    private String firstName;
    private TreeItem left;
    private TreeItem right;

    public TreeItem (int keyValue, String firstName)  //TreeItem constuctor
    {
	this.keyValue = keyValue;
	this.firstName = firstName;
	left = null;
	right = null;
    }


    public int getKeyValue ()
    {
	return keyValue;
    }


    public String getFirstName ()
    {
	return firstName;
    }


    public TreeItem getLeft ()
    {
	return left;
    }


    public void setLeft (TreeItem left)
    {
	this.left = left;
    }


    public TreeItem getRight ()
    {
	return right;
    }


    public void setRight (TreeItem right)
    {
	this.right = right;
    }
}
