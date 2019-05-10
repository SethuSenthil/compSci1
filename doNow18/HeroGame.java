Import java.util.concurrent.TimeUnit ;

public class HeroGame {
public HeroGame(){
	 Hero hero1 = new Hero();
	 Hero hero2 = new Hero("Iron man", 50);
	 	 System.out.println("Name : " + hero1.getName() + "\t Health" + hero1.getHealth());
}
 public static void main(String[] args){
TimeUnit.SECONDS.sleep(1);
	 HeroGame app = new HeroGame();
 }
}