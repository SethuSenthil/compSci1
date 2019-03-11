import static java.lang.System.*;
import java.util.Scanner;
public  class doNow17{
public static void main(String[] args){
int[] arr = new int[6];
		arr[0] = 7;
		arr[1] = 2;
		arr[2] = 8;
		arr[3] = -5;
		arr[4] = -1;
		arr[5] = 11;//this is a bad way to fill
		System.out.println(arr.length);
		//if you know the terms ahead of time
		//fill like this.
		int[] arr1 = {4,6,2,-3,7,9,10,-2};
		System.out.println(arr1.length);
		System.out.println(arr1[2]);
		arr1[2] = 19;
		System.out.println(arr1[2]);
		//if you want to fill randomly
		//fill like this
		int[] arr2 = new int[25];
		int sum = 0;
		for (int i = 0; i < arr2.length; i ++)
		{
			arr2[i] = (int)(Math.random()*100)+1;
			sum += arr2[i];
			System.out.print(arr2[i] + " ");
		}
		System.out.println(sum);
		//to fill with user-entered data
		//do this
		Scanner readStr = new Scanner(System.in);
		String[] arr3 = new String[10];
		System.out.println("Enter 10 words");
		for (int i = 0; i < arr3.length; i ++)
		{
			arr3[i] = readStr.nextLine();
		}
		System.out.print("You Entered ");
		for ( String idk : arr3)
		{
			System.out.print(idk + "");
		}
//String fruit : fruits)



}
}