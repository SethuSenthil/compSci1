import java.util.Scanner;
import java.lang.Math;
public class doNow6
{
    public static void main(String[]args)
    {
	   Scanner txtScan = new Scanner(System.in);
	   	   Scanner txtScan2 = new Scanner(System.in);
	   Scanner numScan = new Scanner(System.in);

	   System.out.print("Please enter the name of the student:");
	   String name =  txtScan.next();
	   System.out.print(" \n");

      System.out.print("Please enter the name of the first class:");
      String clss =  numScan.next();
      System.out.print("How many credits is this course worth:");
      int cred =  numScan.nextInt();
      System.out.print("How many grade points did you earn:");
      Double gpnt =  numScan.nextDouble();

           System.out.println("\n");

            System.out.print("Please enter the name of the second class:");
	        String clss2 = txtScan2.next();
	        System.out.print("How many credits is this course worth:");
	        int cred2 =  numScan.nextInt();
	        System.out.print("How many grade points did you earn:");
            Double gpnt2 =  numScan.nextDouble();

           System.out.println("\n");

            System.out.print("Please enter the name of the third class:");
	        String clss3 =  txtScan2.next();
	        System.out.print("How many credits is this course worth:");
	        int cred3 =  numScan.nextInt();
	        System.out.print("How many grade points did you earn:");
      Double gpnt3 =  numScan.nextDouble();
           System.out.println("\n");

//GPA calc
//double totalCred = cred + cred2 + cred3;
double earnedCred = gpnt + gpnt2 + gpnt3;
double gpa = Math.round((earnedCred/3)*100.0) /100.0;
System.out.println(name);
System.out.println("Class \t Credits \t Grade Points");
System.out.println(clss + " \t" + cred + "\t \t " + gpnt);
System.out.println(clss2 + " \t" + cred2 + "\t \t " + gpnt2);
System.out.println(clss3 + " \t" + cred3 + "\t \t " + gpnt3);
System.out.println("GPA:" + gpa);


    }
}
;