// The "TriangleArea" class.
import hsa.Console;
public class TriangleArea
{
    /** Finds the area of a triangle
    *@param base the length of the base of the triangle
    *@param height the height of the triangle *@return
    the area of the triangle */
    private static double areaOfTriangle (double base, double height)
    {
	double area = base * height / 2;
	return area;
    }


    public static void main (String[] args)
    {
	Console c = new Console ("Triangle Area");
	c.println ("Finding the area of a triangle");
	c.print ("Please enter the base of the triangle: ");
	double enteredBase = c.readDouble ();
	c.print ("Please enter the heightof the triangle: ");
	double enteredHeight = c.readDouble ();
	double triangleArea = areaOfTriangle (enteredBase, enteredHeight);
	c.print ("The area of the triangle with base: ");
	c.print (enteredBase, 0, 1);
	c.print (" and height: ");
	c.print (enteredHeight, 0, 1);
	c.print (" is: ");
	c.print (triangleArea, 0, 1);
	c.println (" units" + '\u00b2');
	c.println ("End of Program");
    } // main method
} // TriangleArea class
