import java.util.Scanner;

public class test2{

public static void main(String[] args){
	//Code starts here

Scanner askName = new Scanner(System.in);
Scanner askNum = new Scanner(System.in);


//item 1
System.out.print("Item 1: ");
String item = askName.nextLine();
System.out.print("Enter the price of the "+ item + ": ");
Double price = askNum.nextDouble();
System.out.print("Enter the sales tax percentage for the "+ item + ": ");
Double tax = askNum.nextDouble();

System.out.println(" ");

//item 2
System.out.print("Item 2: ");
String item2 = askName.nextLine();
System.out.print("Enter the price of the "+ item2 + ": ");
Double price2 = askNum.nextDouble();
System.out.print("Enter the sales tax percentage for the "+ item2 + ": ");
Double tax2 = askNum.nextDouble();

System.out.println(" ");

//item 3
System.out.print("Item 3: ");
String item3 = askName.nextLine();
System.out.print("Enter the price of the "+ item3 + ": ");
Double price3 = askNum.nextDouble();
System.out.print("Enter the sales tax percentage for the "+ item3 + ": ");
Double tax3 = askNum.nextDouble();

//calc
Double total = (price * (tax/100)) + price;
Double total2 = (price2 * (tax2/100)) + price2;
Double total3 = (price3 * (tax3/100)) + price3;

//table
System.out.println("\n");
System.out.println("Item \t Sales Price \t Sales Tax \t Total");
System.out.println( item + " \t $"+ price + " \t " + tax +"% \t $" + Math.round(total));
System.out.println( item2 + " \t $"+ price2 + " \t " + tax2 +"% \t $" +  Math.round(total2));
System.out.println( item3 + " \t $"+ price3 + " \t " + tax3 +"% \t $" +  Math.round(total3));






}
}