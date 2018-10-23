import java.util.Scanner;
import java.lang.Math;
public class doNow5
{
    public static void main(String[]args)
    {
		int num1 = (int)(Math.random() * 20) + 1;
		     System.out.println("First Number: " + num1);

     	int num2 = (int)(Math.random() * 13) + 5;
     	     System.out.println("Second number: " + num2);

     	int num3 = (int)(Math.random() * 178) + 37;
     	     System.out.println("Third number: " + num3);

     	int sumNum = num1 + num2 + num3;
     	     System.out.println("Sum of numbers: " + sumNum);

     	int avgNum = (num1 + num2 + num3)/3;
     	     System.out.println("Avg of numbers: "+avgNum);

     	int divNum = num1/num2;
     	     System.out.println("Num1/Num2: " + divNum);

     	int modNum = num3%num1;
     	     System.out.println("num 1 mode 3: "+modNum);
    }
}
