import static java.lang.System.*;
public  class doNow15{
public static void main(String[] args){

for(int t = 0; t <= 4; t++){
   for(int tt = 0; tt < t; tt++){
      out.print("*");
   }
         out.println(" ");
  }
  for(int t = 3; t > 0; t--){
     for(int tt = 0; tt < t; tt++){
        out.print("*");
     }
           out.println(" ");
  }


   /*for(int i = 1; i < 1000; i ++){
	   if(i%2 == 0){
		   out.println(i);
	   }
   }*/
int storeNum = 0;
      for(int i = 1; i < 100; i ++){
   	   if(i%2 == 0 && i%3 == 0  && i%5 == 0){
            storeNum = i;

    	   }

   }
    	                  		   out.println(storeNum);

}
}