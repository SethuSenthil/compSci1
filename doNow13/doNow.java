import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
public class doNow {
public static void main (String[] args){

//init
out.println("Program " + Thread.currentThread().getStackTrace()[1] + " is running");


Scanner txtScan = new Scanner(in);
Scanner numScan = new Scanner(in);
out.println("How many scores");
//int numOfScore = numScan.nextInt();
	 int good = 0;
	 int ok = 0;
 int bad = 0;
for(int i = 0; i < 4;i++ ){

int[] score = {63,75,72,73,78};

		if(score[i] >= 100){
			good++;
		}else if(score[i] >= 70){
			ok++;
		}else{
			bad++;
		}

	}
		out.println("Good stuff:" + good);
				out.println("Ok stuff:" + good);
		out.println("Bad stuff:" + good);



}
public int ranGrade(){
int store = intGen();
for(int i = 0; store > 60; i++){
	store = intGen();
}
	return store;

}
public int intGen(){
		int gradeGen = (int) Math.round(Math.random() * 100);
		return gradeGen;
}
}
