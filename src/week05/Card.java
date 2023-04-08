package week05;

public class Card {
	
	private String name;
	private String suit;
	private int value;		
	
	
	// Constructor
	
	public Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	// Setters and Getters
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSuit() {
		return suit;
	}
	
	// Describe Method
	
	public void describe() {
		System.out.println(name.toString() + " of " + suit.toString());
	}

}