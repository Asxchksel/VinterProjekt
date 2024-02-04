import java.util.Scanner;

//base class for dealer and player, gives values for who many card they may have aswell ass their current handvaalue
public class Players {
    private int cards;
    private final int maxCards = 5;
    protected Scanner keyb = new Scanner(System.in);
    private int handValue;

    //generic constructor for the player and dealer
    public Players() {
        this.cards = cards;
        this.handValue = handValue;
    }

    public int getCards() {
        return this.cards;
    }

    public void setCards(int cards) {
        this.cards = cards;
    }

    public int getMaxCards() {
        return this.maxCards;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }
}