package finalProject;

//52 cards
public class Card {
	
	int value;
	String name;
	String suit;
	
	Card(String name, String suit, int value){ //this defines the constructor called Card
		this.name = name; //this refers to the instance variables of the object that is being created. assign values passed as name to the variable "string" of the class
		this.suit = suit;
		this.value = value;
	}
	public String getName() { //this method returns name of the card
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuit()	{ //this method returns name of the suit
		return suit;
	}
	public void setSuit(String suit) {
		this.name = suit;
	}
	public int getValue() { //this method returns the number of the card
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public String describe() { //this method will print out the information about a card, instead of void I did string to print on one line
		//System.out.println(name + " of " + suit); 
		return name + " of " + suit; //this did work
	}
	
}
