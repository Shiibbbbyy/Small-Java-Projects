import hsa.Console;
/** The "TemperatureConversion" class. from Celsius to Fahrenheit
* @author G. Ridout * @version February 2001
* Purpose: To convert a temperature from Fahrenheit to Celsius or *
*/
public class TemperatureConversion
{
    public static void main (String[] args)
    {
	Console c = new Console ("Temperature Conversion");
	double celsiusTemp, fahrenheitTemp;
	char tryAgain;
	c.println ("Welcome to the Temperature Conversion Program");
	// Loop to process each conversion
	do
	{
	    // Inputs the type of conversion you would like to do
	    // \u00b0 is the Unicode for the degrees symbol
	    c.println ("Enter 1 to convert from \u00b0F to \u00b0C");
	    c.println ("Enter 2 to convert from \u00b0C to \u00b0F");
	    c.print ("Enter your Choice: ");
	    int typeOfConv = c.readInt ();
	    // Check that the input is valid. User will re-enter until valid
	    while (typeOfConv < 1 || typeOfConv > 2)
	    {
		c.print ("Choose 1 or 2, please re-enter");
		typeOfConv = c.readInt ();
	    }
	    // Ask for a temperature and convert it and then
	    // display the results. There are two different
	    // routines depending on the type of conversion
	    if (typeOfConv == 1)
	    {
		c.print ("Enter the temperature in degrees Fahrenheit: ");
		fahrenheitTemp = c.readDouble ();
		celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;
		c.print (fahrenheitTemp, 0, 1);
		c.print ("\u00b0F is equal to ");
		c.print (celsiusTemp, 0, 1);
		c.println ("\u00b0C");
	    }


	    else
	    {
		c.print ("Enter the temperature in degrees Celsius: ");
		celsiusTemp = c.readDouble ();
		fahrenheitTemp = celsiusTemp * 9 / 5 + 32;
		c.print (celsiusTemp, 0, 1);
		c.print ("\u00b0C is equal to ");
		c.print (fahrenheitTemp, 0, 1);
		c.println ("\u00b0F");
	    }
	    // Ask if the user would like to try again
	    // Include an error check to see that answer is y or n
	    c.print ("Would you like to convert another temperature (y/n)? ");
	    do
		tryAgain = Character.toLowerCase (c.getChar ());
	    while (tryAgain != 'y' && tryAgain != 'n');
	    c.println (tryAgain);
	    // Included because we are using getChar()
	}
	while (tryAgain == 'y');
	c.println ("Thank you for using the Temperature Conversion Program");
    } // main method
} // TemperatureConversion class


