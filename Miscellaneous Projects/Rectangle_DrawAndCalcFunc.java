// The "Rectangle_DrawAndCalcFunc" class.
import java.awt.*;
import hsa.Console;

public class Rectangle_DrawAndCalcFunc
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();

	c.println ("Welcome to the Rectangle Drawer/Calculator");
	c.print ("Enter the Length: ");
	double length = c.readDouble ();
	c.print ("Enter the Width: ");
	double width = c.readDouble ();
	c.println ("Press any key to Continue.. ");
	char key = c.getChar ();
	c.clear();
	
	double area = length*width;
	c.print("The area of the rectangle is: ");
	c.print (area,0,2);
	c.println(" Units^2");

    }
}
