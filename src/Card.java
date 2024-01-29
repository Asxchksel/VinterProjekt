import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Card {
    private int cardValue;
    private String drawnSuit;
    private final ArrayList<String> suit = new ArrayList<String>();

    //lägger till olika korttyper i en list medans man gör klassen
    public Card() {
        Collections.addAll(suit, "Hearts", "Spades", "Diamonds", "Clubs");
    }


    //draws a random card with value and suit på kortet
    public void drawCard() {
        Random random = new Random();
        cardValue = random.nextInt(13) + 1;
        int randomSuit = random.nextInt(4);
        drawnSuit = suit.get(randomSuit);

    }

    public int getCardValue() {
        return cardValue;
    }

    public String getDrawnSuit() {
        return drawnSuit;
    }

    public ArrayList<String> getSuit() {
        return suit;
    }


}
