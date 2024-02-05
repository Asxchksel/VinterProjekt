import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.random.RandomGenerator;

public class CardDeck {
    private final String[] suit = {"Hearts", "Clubs", "Spades", "Diamonds"};
    private String drawnSuit;
    private int cardValue;
    private final Card pickedCard = new Card(cardValue, drawnSuit);

    public CardDeck() {
        DrawCard();
    }

    //Generates a new card for the player or dealer
    public void DrawCard() {
        Random random = new Random();
        cardValue = random.nextInt(13) + 1;
        int randomSuit = random.nextInt(4);
        drawnSuit = suit[randomSuit];
    }

    public Card getPickedCard() {
        return pickedCard;
    }

    public String getDrawnSuit() {
        return drawnSuit;
    }

    public int getCardValue() {
        return cardValue;
    }
}
