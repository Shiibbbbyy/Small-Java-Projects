// The "NewConsoleProgram" class.
import java.awt.*;
import hsa.Console;

public class NewConsoleProgram
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	Console myConsole = new Console ("NewConsoleProgram");
	myConsole.setTextColor (Color.ORANGE);
	myConsole.setCursor (10, 20);
	myConsole.println ("Templates are easy");

	// Place your program here.  'c' is the output console
    } // main method
} // NewConsoleProgram class
