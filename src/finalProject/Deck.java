package finalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//one deck
public class Deck {
	
	List<Card> cards = new ArrayList<Card>(); //Instantiating the 52 cards

	Deck(){ //constructor with array lists
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two", "Three", "Four","Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			int count = 2;
			for (String number : numbers) {
				Card card = new Card(number, suit, count);//this takes the number and adds it as a store valued
				this.cards.add(card);
				count++;//starts at 2 and adds 1 up until the end of the numbersArray length
				}
			}
		}
		
	
	public void shuffle() { //this shuffles the deck
		Collections.shuffle(this.cards);
	}
	
	public Card draw() { //removes card from top of the deck and returns the new card on top.
		Card card = this.cards.remove(0);
		return card;
	}
	
	
	
}
