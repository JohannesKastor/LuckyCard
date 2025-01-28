import java.util.Scanner;



public class Game {
    private Deck deck;
    private Scanner scanner;
    


    public Game() {
        deck = new Deck();
        scanner = new Scanner(System.in);
    }
    
  
    
    

    public void play() {
        while (true) {
            System.out.println("------- Playing a game round");

            // Draw three cards
            Card card1 = deck.draw();
            Card card2 = deck.draw();
            Card card3 = deck.draw();

            System.out.println("Card 1: " + card1);
            System.out.println("Card 2: " + card2);
            System.out.println("Card 3: " + card3);

            // Determine if you win or lose
            int value1 = card1.getValue();
            int value2 = card2.getValue();
            int value3 = card3.getValue();

            if ((value3 > Math.min(value1, value2)) && (value3 < Math.max(value1, value2))) {
                System.out.println("\nYou win!");
            } else {
                System.out.println("\nYou lose!");
            }

            System.out.println("\n=========> Press ENTER to play again or \"q\" to quit: ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                System.out.println("Thank you for playing and welcome back!");
                break;
            }
        }
    }
}

