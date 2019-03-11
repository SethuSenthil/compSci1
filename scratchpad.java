import static java.lang.System.*;
import java.util.Scanner;
public  class scratchpad{
public static void main(String[] args){
int[] arr = new int[10];
int sum = 0;
 for(int i = 0; i < arr.length; i++){
	 int curl = arr[0];
  curl = i;
 sum += curl;
 }
System.out.println(sum);

int[] arr2 = new int[8];
int maxVal = Integer.MIN_VALUE;

 for(int i = 0; i < arr2.length; i++){
	 int curl = arr[0];
  curl = (int) Math.round(Math.random() * 19) + 2;
 min = curl;
 if(curl > maxVal){
	 maxVal = curl;
 }
 }
 System.out.println(maxVal);

}


//4
int[] n = {1,2,3,4,5};
int firstVal = n[0];
int fk = n.length - 1;
int lastVal = n[fk];
n[0] = lastVal;
n[fk] = firstVal;
for(int kk : n){
System.out.println(kk);
}
}