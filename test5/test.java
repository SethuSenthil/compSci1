import java.lang.System.*;
import java.util.Scanner;
public class test {
 public static void main(String[] args){

   System.out.println("Running Program");
	  Scanner txtScan = new Scanner(System.in);
	  	  Scanner numScan = new Scanner(System.in);
	int odd = 0,
	eve = 0,
	sum = 0,
	track = 0;
do{
	    System.out.print("Enter a value: ");
	   int userNum = numScan.nextInt();
	    if(userNum%2 == 0){
	   	 eve++;
	   	 sum += userNum;
 }else{
	 	   	 sum += userNum;
	 odd++;
 }
     System.out.println("Would you like to enter another value (y/n)?");
   String goOn = txtScan.nextLine().toUpperCase();
   if(goOn.equals("Y")){
	   	   	 track = 0;
   }else{
	   track = 1;
   }

}while(track == 0);
String Os = "";
if(odd == 1){
  Os = "";
}else{
	Os = "s";
}
String Es = "";

if(eve == 1){
  Es = "";
}else{
	Es = "s";
}

System.out.println("You entered" + odd + "odd number" + Os);
System.out.println("You entered" + eve + "even number" + Es);

 }





}