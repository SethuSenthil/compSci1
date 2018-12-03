import static java.lang.System.out;
import java.util.Scanner;
import java.lang.Math;
public class doNow10 {
public static void main (String[] args){
//init
out.println("Program " + Thread.currentThread().getStackTrace()[1] + " is running");

Scanner txtScan = new Scanner(System.in);
Scanner numScan = new Scanner(System.in);

out.println("Enter Do Now prompt number to run");
int prompt = numScan.nextInt();


//router
if(prompt == 1){
	prompt1();
} else if (prompt == 2){
	prompt2();
} else if (prompt == 3){
	prompt3();
} else if (prompt == 4){
	prompt4();
}else{
 out.println("Prompt does not exist");
}
}

public static void prompt1(){
String name = new Object(){}.getClass().getEnclosingMethod().getName();
out.println("running " + name);
Scanner txtScan = new Scanner(System.in);
Scanner numScan = new Scanner(System.in);

int num  = numScan.nextInt();


}


public static void prompt2(){
String name = new Object(){}.getClass().getEnclosingMethod().getName();
out.println("running " + name);
Scanner txtScan = new Scanner(System.in);
Scanner numScan = new Scanner(System.in);


}


public static void prompt3(){
String name = new Object(){}.getClass().getEnclosingMethod().getName();
out.println("running " + name);
Scanner txtScan = new Scanner(System.in);
Scanner getNum = new Scanner(System.in);

out.println("enter a number");
int num  = getNum.nextInt();
String oddOrEven;
if (num % 2 == 0) {
oddOrEven = "even";
} else {
	oddOrEven = "odd";
}

out.println("The number you typed is" + oddOrEven);

}


public static void prompt4(){
String name = new Object(){}.getClass().getEnclosingMethod().getName();
out.println("running " + name);

}

}
