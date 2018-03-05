// The "SurfaceArea_Volume_Calc" class.
import java.awt.*;
import hsa.Console;

public class SurfaceArea_Volume_Calc
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.println ("Welcome to the Cylinder Surface Area and Volume Calculator");
	c.print ("Enter the height: ");
	double height = c.readDouble ();
	c.print ("Enter the radius: ");
	double radius = c.readDouble ();
	c.println ("Press any key to Continue...");
	char key = c.getChar ();
	c.clear ();
	c.print ("The surface area is: ");
	double sArea = 2 * 3.1415 * radius * height + 2 * 3.1415 * Math.pow (radius, 2);
	c.println (sArea, 0, 2);
	c.print ("The Volume is: ");
	double volume = 3.1415 * Math.pow (radius, 2) * height;
	c.println (volume, 0, 2);

    }
}
