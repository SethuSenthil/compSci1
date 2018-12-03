import java.util.Scanner;

public class test3 {
	public static void main(String[] args){
    //System.out.println("it works");
    Scanner txtScan = new Scanner(System.in);
    Scanner numScan = new Scanner(System.in);

    System.out.print("Please enter the length of your rectangle: ");
    int rectL = numScan.nextInt();
    System.out.print("Please enter the width of your rectangle: ");
    int rectW = numScan.nextInt();
    System.out.print("The area of your rectangle is " + rectPeri(rectL,rectW) + " square units.");


    System.out.println("\n");

    System.out.print("Please enter the first base of your trapezoid: ");
    int base1 = numScan.nextInt();
    System.out.print("Please enter the second base of your trapezoid: ");
    int base2 = numScan.nextInt();
    System.out.print("Please enter the height of your trapezoid: ");
    int height = numScan.nextInt();

    System.out.println("The area of your trapezoid is " + heightOfTrap(base1, base2, height) + " square units.");

	}

	public static int rectPeri( int l, int w){
	 return (2*l) + (2*w);
	}
    public static  double heightOfTrap(double b1, double b2, double h){
		 return 0.5 * (b1 + b2)*h;
	}

}