import java.util.Random;

public class Dealer extends Players {

    public Dealer() {
    }

    //automatically is run after the player is done to give dealer their cards
    public void drawCard() {
        super.drawCard();
        while (getHandValue() < 17 && getHandValue() < 21 && getCards() < getMaxCards()) {
            switch (getPickedCardValue()) {
                case 1:
                    System.out.println("Dealer drawn card is Ace of " + getPickedCardSuit());
                    setCards(getCards() + 1);
                    drawCard();
                    break;
                case 11:
                    System.out.println("Dealer drawn card is Jack of " + getPickedCardSuit());
                    setCards(getCards() + 1);
                    drawCard();
                    break;
                case 12:
                    System.out.println("Dealer drawn card is Queen of " + getPickedCardSuit());
                    setCards(getCards() + 1);
                    drawCard();
                    break;
                case 13:
                    System.out.println("Dealer drawn card is King of " + getPickedCardSuit());
                    setCards(getCards() + 1);
                    drawCard();
                    break;
                default:
                    System.out.println("Dealer drawn card is " + getPickedCardValue() + " of " + getPickedCardSuit());
                    setCards(getCards() + 1);
                    drawCard();
                    break;
            }
        }
    }
}