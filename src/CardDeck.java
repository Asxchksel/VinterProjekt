import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.random.RandomGenerator;

public class CardDeck {
    private int randomRank;
    private int randomSuit;

    public CardDeck() {
        this.cardValue = cardValue;
    }

    public void drawCard() {
        Random random = new Random();
        randomRank = random.nextInt(13) + 1;
        randomSuit = random.nextInt(4) + 1;
    }

    public int getCardValue() {
        return this.cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public int getRandomRank() {
        return randomRank;
    }

    public int getRandomSuit() {
        return randomSuit;
    }
}
