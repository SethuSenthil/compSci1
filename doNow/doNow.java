import java.util.Scanner;


public class doNow
{
	public static void printer(String str) {
  		System.out.print(str);
    }
    public static void printerNew(String str) {
			System.out.println(" ");
	  		System.out.print(str);
    }
	public static void main (String[] args){
  	    Scanner uinput = new Scanner(System.in);
  	    System.out.println("Hi there. What is your name?");
  	    String name = uinput.nextLine();
  	    System.out.println("What adjective describes you?");
  	    String adj = uinput.nextLine();
  	    System.out.println("My name is " + name + " I am " + adj);
 }
}