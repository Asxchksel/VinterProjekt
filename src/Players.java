import java.util.Scanner;

//base class for dealer and player, gives values for who many card they may have aswell ass their current handvaalue
public class Players {
    private int cards;
    private final int maxCards = 5;
    protected Scanner keyb = new Scanner(System.in);
    private int handValue;
    private int pickedCardValue;
    private String pickedCardSuit;

    //generic constructor for the player and dealer
    public Players() {
        this.cards = cards;
        this.handValue = handValue;
    }

    //Output for what card the player gets and tells them that
    public void drawCard() {
        CardDeck cards = new CardDeck();
        pickedCardValue = cards.getCardValue();
        pickedCardSuit = cards.getDrawnSuit();
        switch (pickedCardValue) {
            case 1:
                if (this.handValue + 11 > 21) {
                    this.handValue += 1;
                } else {
                    this.handValue += 11;
                }
                System.out.println("Current hand value is: " + this.handValue);
                break;
            case 11:
                this.handValue += 10;
                System.out.println("Current hand value is: " + this.handValue);
                break;
            case 12:
                this.handValue += 10;
                System.out.println("Current hand value is: " + this.handValue);
                break;
            case 13:
                this.handValue += 10;
                System.out.println("Current hand value is: " + this.handValue);
                break;
            default:
                this.handValue += pickedCardValue;
                System.out.println("Current hand value is: " + this.handValue);
                break;
        }
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

    public int getPickedCardValue() {
        return pickedCardValue;
    }

    public String getPickedCardSuit() {
        return pickedCardSuit;
    }
}
