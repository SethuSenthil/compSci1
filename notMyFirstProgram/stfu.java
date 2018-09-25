public class stfu
{
	public static void printer(String str) {
  		System.out.print(str);
    }
    public static void printerNew(String str) {
			System.out.println(' ');
	  		System.out.print(str);
    }
	public static void main (String[] args)
	{
   	    printerNew("First Prompt:");

  		printerNew("A");
  		printer("B");
  	    printer("C");
  		printerNew("D");
  		printer("E");
  	    printerNew("F");

  	   printerNew("Second Prompt:");
  	     		printerNew("A");
  	     		printerNew("B");
  	     		printerNew("C");
  	     		printerNew("D");
  	     		printer("E");

  	   printerNew("3rd Prompt:");
  	     		printerNew("A");
  	     		printer("B");
  	     		printer("C");
  	     		printer("D");


  	   printerNew( "4th Prompt:");
  	     		printerNew("A");
  	     		printer("B");
  	     		printerNew("C");
  	     		printer("D");
  	     		printerNew("E");
  	     		printer("F");

  	   printerNew( "5th Prompt:");
  	     		printerNew("A");
  	     		printerNew("B");
  	     		printer("C");
  	     		printerNew("D");
  	     		printer("E");
  	     		printer("F");
			System.out.println(' ');

	}
}
