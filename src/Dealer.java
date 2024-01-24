import java.util.Random;

public class Dealer extends Players {

    public Dealer() {
    }
    public void takeCard() {
        while(getCardValue() < 17 && getCardValue() < 21 && getCards() < getMaxCards()) {
            super.drawCard();
            switch (getDrawnCard()) {
                case 1:
                    System.out.println("Dealers drawn card is Ace of " + getDrawnSuit());
                    if (getCardValue() + 11 > 21) {
                        setCardValue(getCardValue() + 1);
                        System.out.println("Dealers hand value is: " + getCardValue());
                        setCards(getCards()+1);
                    } else {
                        setCardValue(getCardValue() + 11);
                        System.out.println("Dealers hand value is: " + getCardValue());
                        setCards(getCards()+1);
                    }
                    break;
                case 11:
                    System.out.println("Dealers drawn card is Jack of " + getDrawnSuit());
                    setCardValue(getCardValue() + 10);
                    System.out.println("Dealers hand value is: " + getCardValue());
                    setCards(getCards()+1);
                    break;
                case 12:
                    System.out.println("Dealers drawn card is Queen of " + getDrawnSuit());
                    setCardValue(getCardValue() + 10);
                    System.out.println("Dealers hand value is: " + getCardValue());
                    setCards(getCards()+1);
                    break;
                case 13:
                    System.out.println("Dealers drawn card is King of " + getDrawnSuit());
                    setCardValue(getCardValue() + 10);
                    System.out.println("Dealers hand value is: " + getCardValue());
                    setCards(getCards()+1);
                    break;
                default:
                    System.out.println("Dealers drawn card is " + getDrawnCard() + " of " + getDrawnSuit());
                    setCardValue(getCardValue() + getDrawnCard());
                    System.out.println("Dealers hand value is: " + getCardValue());
                    setCards(getCards()+1);
                    break;
            }
        }
        System.out.println("Dealer stops");
    }
}