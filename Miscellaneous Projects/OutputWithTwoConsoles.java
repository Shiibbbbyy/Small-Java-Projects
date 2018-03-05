// Working with more than one console
import hsa.Console;
import java.awt.Color;
public class OutputWithTwoConsoles
{
    public static void main (String[] args)
    {
	// Create a console with 15 rows and 30 columns
	Console firstConsole = new Console (15, 30, "First Console");
	firstConsole.println ("This is the first console");
	firstConsole.setTextColor (Color.GREEN);
	firstConsole.setTextBackgroundColor (Color.BLACK);
	firstConsole.clear ();
	firstConsole.println ("No of Rows: " + firstConsole.getMaxRows ());
	firstConsole.println ("No of Columns: " + firstConsole.getMaxColumns ());
	firstConsole.println ("Press any key to continue");
	firstConsole.getChar ();
	// Create a console with 10 rows and 40 columns
	// All text in this console will use a 16-point font
	Console secondConsole = new Console (10, 40, 16, "Second Console");
	secondConsole.println ("This is the second console");
	secondConsole.setTextColor (Color.RED);
	secondConsole.setTextBackgroundColor (Color.BLACK);
	secondConsole.clear ();
	secondConsole.println ("No of Rows: " + secondConsole.getMaxRows ());
	secondConsole.println ("No of Columns: " + secondConsole.getMaxColumns ());
	secondConsole.println ("Press any key to continue");
	secondConsole.getChar ();
	secondConsole.close ();
	firstConsole.println ("Back to the first console");
	firstConsole.println ("Program is complete");
    } // main method
} // OutputWithTwoConsoles class
