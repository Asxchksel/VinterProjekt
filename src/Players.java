import java.util.Scanner;

//Ger Dealer och spelare ett max antal kort man kan ha samt även hur mycket kort man har då
public class Players extends Hand {
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