import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
public class doNow12 {
public static void main (String[] args){
//init
out.println("Program " + Thread.currentThread().getStackTrace()[1] + " is running");

Scanner txtScan = new Scanner(in);
Scanner numScan = new Scanner(in);

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
Scanner txtScan = new Scanner(in);
Scanner numScan = new Scanner(in);

int test = numScan.nextInt();
switch(test) {
	case 1: out.println("ok");
	break;
}
}


public static void prompt2(){
String name = new Object(){}.getClass().getEnclosingMethod().getName();
out.println("running " + name);
Scanner txtScan = new Scanner(in);
Scanner numScan = new Scanner(in);


}


public static void prompt3(){
String name = new Object(){}.getClass().getEnclosingMethod().getName();
out.println("running " + name);
Scanner txtScan = new Scanner(in);
Scanner getNum = new Scanner(in);

}


public static void prompt4(){
String name = new Object(){}.getClass().getEnclosingMethod().getName();
out.println("running " + name);

}

}
