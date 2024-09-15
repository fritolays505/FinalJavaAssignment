package finalProject;

import java.util.ArrayList;
import java.util.List;

//2 players
public class Player {
	
	List<Card> hand; //cards the player holds
	int score; //player's score
	String name;//player name
	
	public Player(String name) { //Constructor
		this.name = name;
		this.hand = new ArrayList<>();
		this.score = 0;
	}
	//added this getters and setters using the assistance of Eclipse, not sure if I am going to need all of them. 
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void describe() { //prints out information about the player and calls method for each card in hand list.
		System.out.println(name + "'s hand: ");
		for (Card card : hand) {
			card.describe();
			
		}
	}
	
	public Card flip() { //removes and returns top card from the players hand
		return hand.remove(0);
	}
	public void draw(Deck deck) { //draw card from the deck and add it the player's hand
		hand.add(deck.draw());
	}
	
	
	public void incrementScore() { //this is void, because we do no need to show the user what is happening.
		score++;
	}
	
	
	

}
