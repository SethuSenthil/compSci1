import static java.lang.System.out;
import java.util.Scanner;
import java.lang.Math;
public class doNow9 {
public static void main (String[] args){
//init
out.println("Program " + Thread.currentThread().getStackTrace()[1] + " is running");

Scanner txtScan = new Scanner(System.in);
Scanner numScan = new Scanner(System.in);
intSum(5,7);


}

public static int intSum(int num1,int num2){
return num1+ num2;
}

public static double  rectArea(double l, double w){
 return 1 * 2;
}

public static double  periSqr(double l){
 return l * 4;
}

public static double  circumD(double d){
 return Math.PI * d;
}

public static double  circumR(double R){
 return Math.PI * (R*2);
}


}
