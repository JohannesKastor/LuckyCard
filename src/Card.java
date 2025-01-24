import java.util.Random;

public class Card {


	public static void (String[] args) {
   
    Random rand = new Random();
    int CardNumber = rand.nextInt(14);

    int CardSymbol = rand.nextInt(5);

    System.out.println(CardNumber);
    
    System.out.println(CardSymbol);
    
  }


}
