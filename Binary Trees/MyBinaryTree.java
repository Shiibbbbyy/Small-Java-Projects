/**********

NAME:                              Shoaib Khan
STUDENT NUMBER:                    507285

ICS4U0-A, Sep-Jan 2016

THIS FILE IS PART OF THE PROGRAM: Binary Tree Assignment (The "MyBinaryTree" class), uses TreeItem.java
Purpose: This class is used to set up and add attributes to the binary tree. Includes methods to alter or display the binary tree.

**********/

public class MyBinaryTree //MyBinaryTree class with attributes listed below
{
    private TreeItem root;
    private int numItems;
    private int counter = 0; //Only used for formatting the display.

    public MyBinaryTree ()  //Constructor which creates the binary tree
    {
	root = null;
	numItems = 0;
    }


    public void insert (TreeItem currentRoot, TreeItem itemToAdd)
    {
	if (currentRoot == null) //If itemToAdd is the first item being added, it becomes the root
	{
	    root = itemToAdd;
	    numItems++;
	}
	else if (itemToAdd.getKeyValue () < currentRoot.getKeyValue ()) //Insert left branch
	{
	    if (currentRoot.getLeft () == null)
	    {
		currentRoot.setLeft (itemToAdd);
		numItems++;
	    }
	    else
		insert (currentRoot.getLeft (), itemToAdd);
	}
	else //Insert right branch
	{
	    if (currentRoot.getRight () == null)
	    {
		currentRoot.setRight (itemToAdd);
		numItems++;
	    }
	    else
		insert (currentRoot.getRight (), itemToAdd);
	}
    }


    public void preorder (TreeItem currentRoot)  //root, left, right
    {
	if (currentRoot != null)
	{
	    if (counter == 0) //If statement used for formatting display purposes only
		System.out.println ("Preorder");
	    System.out.println (currentRoot.getFirstName () + " with the value of " + currentRoot.getKeyValue ());
	    counter++;
	    if (counter == numItems) //If statement used for formatting display purposes only
	    {
		System.out.println ("");
		counter = 0;
	    }
	    preorder (currentRoot.getLeft ());
	    preorder (currentRoot.getRight ());
	}
    }


    public void inorder (TreeItem currentRoot)  // left, root, right
    {
	if (currentRoot != null)
	{
	    inorder (currentRoot.getLeft ());
	    if (counter == 0) //If statement used for formatting display purposes only
		System.out.println ("Inorder");
	    System.out.println (currentRoot.getFirstName () + " with the value of " + currentRoot.getKeyValue ());
	    counter++;
	    if (counter == numItems) //If statement used for formatting display purposes only
	    {
		System.out.println ("");
		counter = 0;
	    }
	    inorder (currentRoot.getRight ());
	}

    }


    public void postorder (TreeItem currentRoot)  // left, right, root
    {
	if (currentRoot != null)
	{
	    postorder (currentRoot.getLeft ());
	    postorder (currentRoot.getRight ());
	    if (counter == 0) //If statement used for formatting display purposes only
		System.out.println ("Postorder");
	    System.out.println (currentRoot.getFirstName () + " with the value of " + currentRoot.getKeyValue ());
	    counter++;
	    if (counter == numItems) //If statement used for formatting display purposes only
	    {
		System.out.println ("");
		counter = 0;
	    }
	}
    }


    public TreeItem getRoot ()
    {
	return root;
    }
}


