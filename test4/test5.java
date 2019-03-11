import java.util.Scanner;
import static java.lang.System.*;
public class test5 {
public static void main(String[] args){
 out.println("running program");
 int[] arr = new int[20];
  int sum = 0;
  double avg = 0;
  int min = 1000;
//setter
 for(int i = 0; i < arr.length; i++ ){
	 arr[i] = ranNum();
 }

//getter
 for(int i = 0; i < arr.length; i++ ){
	  if(arr[i] < min){
	 	 min = arr[i];
 }
	 if(i % 5 == 0){
		 	 out.println( arr[i] + " ");
	 }else{
		 	 out.print( arr[i] + " ");
 }
 sum += arr[i];
 }
 avg =  avg = sum / arr.length;
  out.println("" );
 out.println("SUM: " + sum);
  out.println("AVERAGE: " + avg);
    out.println("MIN: " + min);



 //Inteage.MAX_VALUE
}
public static int ranNum(){
 int ranNum = (int) Math.round(Math.random() * 38) + 13;
 return ranNum;
}
}