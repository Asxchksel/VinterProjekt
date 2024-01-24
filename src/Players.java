import java.util.Scanner;

public class Players extends CardDeck {
    private int cards;
    private final int maxCards = 5;
    protected Scanner keyb = new Scanner(System.in);

    public Players() {
        this.cards = cards;
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
}