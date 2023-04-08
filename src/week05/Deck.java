package week05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	
	// Constructor
	
	public Deck() {
		
		String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
		
		
		int[] values = {14, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		String[] names = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		for (String suit : suits) {
			for (int i = 0; i < names.length; i++) {
				Card card = new Card(names[i], suit, values[i]);
				cards.add(card);
			}
		}
	}
		
	// Describe Method
		
	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}
	
	// Shuffle Method
	
	public void shuffle() {
        Collections.shuffle(this.cards);
    }
	
	// Draw Method
	
	public Card draw() {
        if (this.cards.size() > 0) {
            Card drawCard = this.cards.get(0);
            this.cards.remove(0);
            return drawCard;
        } else {
            return null;
        }
    }
}
