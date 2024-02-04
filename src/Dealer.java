import java.util.Random;

public class Dealer extends Players {

    public Dealer() {
    }

    //automatically is run after the player is done to give dealer their cards
    public void takeCard() {
        while (getHandValue() < 17 && getHandValue() < 21 && getCards() < getMaxCards()) {
            CardDeck cards = new CardDeck();
            int pickedCardValue = cards.getCardValue();
            String pickedCardSuit = cards.getDrawnSuit();
            switch (pickedCardValue) {
                case 1:
                    System.out.println("Dealers drawn card is Ace of " + pickedCardSuit);
                    if (getHandValue() + 11 > 21) {
                        setHandValue(getHandValue() + 1);
                        System.out.println("Dealers hand value is: " + pickedCardSuit);
                        setCards(getCards() + 1);
                    } else {
                        setHandValue(getHandValue() + 11);
                        System.out.println("Dealers hand value is: " + getHandValue());
                        setCards(getCards() + 1);
                    }
                    break;
                case 11:
                    System.out.println("Dealers drawn card is Jack of " + pickedCardSuit);
                    setHandValue(getHandValue() + 10);
                    System.out.println("Dealers hand value is: " + getHandValue());
                    setCards(getCards() + 1);
                    break;
                case 12:
                    System.out.println("Dealers drawn card is Queen of " + pickedCardSuit);
                    setHandValue(getHandValue() + 10);
                    System.out.println("Dealers hand value is: " + getHandValue());
                    setCards(getCards() + 1);
                    break;
                case 13:
                    System.out.println("Dealers drawn card is King of " + pickedCardSuit);
                    setHandValue(getHandValue() + 10);
                    System.out.println("Dealers hand value is: " + getHandValue());
                    setCards(getCards() + 1);
                    break;
                default:
                    System.out.println("Dealers drawn card is " + pickedCardValue + " of " + pickedCardSuit);
                    setHandValue(getHandValue() + pickedCardValue);
                    System.out.println("Dealers hand value is: " + getHandValue());
                    setCards(getCards() + 1);
                    break;
            }
        }
    }
}