import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Card {
    private final int cardValue;
    private final String drawnSuit;
    private final ArrayList<String> suit = new ArrayList<String>();

    //gives card their value and rank seperate from the deck
    public Card(int cardValue, String drawnSuit) {
        this.drawnSuit = drawnSuit;
        this.cardValue = cardValue;
    }

    public int getCardValue() {
        return cardValue;
    }
}
