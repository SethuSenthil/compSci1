import java.util.Scanner;

public class test4{
    public static void main(String[] args){
		Scanner txt = new Scanner(System.in);
		System.out.println("Welcome to The Olde Ice Cream Shoppe!");

		final double cPrice = 2.50;
		final double vPrice = 2.00;
	    final double SPrice = 1.00;
	    final double HPrice = 1.00;

		System.out.println("\nPrices as follows:");
	    System.out.println("Choclate: \t $ 2.50");
	    System.out.println("Vanilla: \t $2.00" );
	    System.out.println("Sprinkles: \t $2.00");
	    System.out.println("Hot Fudge: \t $1.00");

        System.out.println("\nWhat flavor would you like?");

      String flav = txt.nextLine().toUpperCase();

       Double total = 0.00;
	                     String track = "hi";
	                 if(flav.equals("CHOCLATE")){
	  				   total = cPrice;
	  				   track = "cool";
	  			   }else if(flav.equals("VANILLA")){
	                    total = vPrice;
	                    				   track = "cool";
	  			   }else if(flav.equals("HOT FUDGE")) {
	  				   total = HPrice;
	  				   				   track = "hi";
			   }

 if(track.equals("cool")){
        System.out.println("Would you like sprinkles?");
        String sprin = txt.nextLine().toUpperCase();
          if(sprin.equals("YES") && track.equals("cool")){
						   total += SPrice;
					   }

}




        System.out.println("\nTotal: $" + total + "0" );

	}
}