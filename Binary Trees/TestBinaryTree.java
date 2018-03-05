/**********

NAME:                              Shoaib Khan
STUDENT NUMBER:                    507285

ICS4U0-A, Sep-Jan 2016

THIS FILE IS PART OF THE PROGRAM:  Binary Tree Assignment (The "TestBinaryTree" class), Uses MyBinaryTree.java and TreeItem.java
Purpose: This class is used to create a new binary tree and call upon methods from the MyBinaryTree class. Contains the main method

**********/

public class TestBinaryTree //Test class which calls upon the methods created in the MyBinaryTree class
{


    public static void main (String[] args)
    {
	TreeItem tempItem;

	MyBinaryTree theTree = new MyBinaryTree ();
	tempItem = new TreeItem (15, "A");
	theTree.insert (theTree.getRoot (), tempItem);
	tempItem = new TreeItem (25, "B");
	theTree.insert (theTree.getRoot (), tempItem);
	tempItem = new TreeItem (19, "C");
	theTree.insert (theTree.getRoot (), tempItem);
	tempItem = new TreeItem (7, "D");
	theTree.insert (theTree.getRoot (), tempItem);
	tempItem = new TreeItem (11, "E");
	theTree.insert (theTree.getRoot (), tempItem);
	tempItem = new TreeItem (12, "F");
	theTree.insert (theTree.getRoot (), tempItem);
	tempItem = new TreeItem (18, "G");
	theTree.insert (theTree.getRoot (), tempItem);
	tempItem = new TreeItem (4, "H");
	theTree.insert (theTree.getRoot (), tempItem);
	tempItem = new TreeItem (1, "I");
	theTree.insert (theTree.getRoot (), tempItem);
	tempItem = new TreeItem (20, "J");
	theTree.insert (theTree.getRoot (), tempItem);
	tempItem = new TreeItem (22, "K");
	theTree.insert (theTree.getRoot (), tempItem);
	tempItem = new TreeItem (3, "L");
	theTree.insert (theTree.getRoot (), tempItem);
	tempItem = new TreeItem (39, "M");
	theTree.insert (theTree.getRoot (), tempItem);
	tempItem = new TreeItem (36, "N");
	theTree.insert (theTree.getRoot (), tempItem);
	tempItem = new TreeItem (29, "O");
	theTree.insert (theTree.getRoot (), tempItem);

	theTree.preorder (theTree.getRoot ());

	theTree.inorder (theTree.getRoot ());

	theTree.postorder (theTree.getRoot ());
    }
}
