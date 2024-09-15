package finalProject;

public class App {

	public static void main(String[] args) {
	
		Deck deck = new Deck(); //creates new deck
		deck.shuffle(); //shuffles deck
		Player player1 = new Player("Player 1"); //Instantiate players
		Player player2 = new Player("Player 2");
		for (int i = 0; i < 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
		}

		System.out.println("Welcome!");
		System.out.println("Shall we play a game of WAR?");
		System.out.println("May the best hand win.");
		
		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip(); //flips the card for player 1
			Card card2 = player2.flip(); //flips the card for player 2
			
			System.out.println("----------------------------");
			System.out.println("----------------------------");
			System.out.println(player1.getName() + " plays: " + card1.describe());
			System.out.println(player2.getName() + " plays: " + card2.describe());
			System.out.println("----------------------------");
			
			if (card1.getValue() > card2.getValue()) { //player 1's card value is greater than player 2's card value
				System.out.println(player1.getName() + " wins the round!\n" + "Point awarded to player 1\n");//player 1 wins
				player1.incrementScore();//add the score to player1
			} else if (card2.getValue() > card1.getValue()) { //player 2's card value is greater than player 1's card value
				System.out.println(player2.getName() + " wins the round!\n" + "Point awarded to player 2\n");//player 2 wins
				player2.incrementScore(); //add the score to player2
			} else {
				System.out.println("It's a tie!\n No point was awarded.\n");
			}
			System.out.println("Current Scores:");
			System.out.println(player1.getName() + ": " + player1.getScore());
			System.out.println(player2.getName() + ": " + player2.getScore());
			
		} //ends the loop of the game with store scores for each player
		System.out.println("----------------------------");
		System.out.println("----------------------------");
		System.out.println("----------------------------");
		System.out.println("Final Scores:");
		System.out.println(player1.getName() + ": " + player1.getScore());
		System.out.println(player2.getName() + ": " + player2.getScore());
		
		if (player1.getScore() > player2.getScore()) { //if player 1's score is greater than player 2. Player 1 wins
			System.out.println(player1.getName() + " wins the game!");
		} else if (player2.getScore() > player1.getScore()) { //if player 2's score is greater than player 1. Player 2 wins
			System.out.println(player2.getName() + " wins the game!");
		} else {
			System.out.println("The game is a tie!");
		}

		
		
	}

}
