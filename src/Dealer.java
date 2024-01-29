import java.util.Random;

public class Dealer extends Players {

    public Dealer() {
    }

    //körs autmoatiskt efter spelaren har kört färdigt ger delaern sina kort, kollar även vem som vinner huset eller spelare
    public void takeCard() {
        while (getCardValue() < 17 && getCardValue() < 21 && getCards() < getMaxCards()) {
            super.drawCard();
            switch (getCardValue()) {
                case 1:
                    System.out.println("Dealers drawn card is Ace of " + getDrawnSuit());
                    if (getCardValue() + 11 > 21) {
                        setHandValue(getHandValue() + 1);
                        System.out.println("Dealers hand value is: " + getCardValue());
                        setCards(getCards() + 1);
                    } else {
                        setHandValue(getHandValue() + 11);
                        System.out.println("Dealers hand value is: " + getCardValue());
                        setCards(getCards() + 1);
                    }
                    break;
                case 11:
                    System.out.println("Dealers drawn card is Jack of " + getDrawnSuit());
                    setHandValue(getHandValue() + 10);
                    System.out.println("Dealers hand value is: " + getCardValue());
                    setCards(getCards() + 1);
                    break;
                case 12:
                    System.out.println("Dealers drawn card is Queen of " + getDrawnSuit());
                    setHandValue(getHandValue() + 10);
                    System.out.println("Dealers hand value is: " + getCardValue());
                    setCards(getCards() + 1);
                    break;
                case 13:
                    System.out.println("Dealers drawn card is King of " + getDrawnSuit());
                    setHandValue(getHandValue() + 10);
                    System.out.println("Dealers hand value is: " + getHandValue());
                    setCards(getCards() + 1);
                    break;
                default:
                    System.out.println("Dealers drawn card is " + getCardValue() + " of " + getDrawnSuit());
                    setHandValue(getHandValue() + getCardValue());
                    System.out.println("Dealers hand value is: " + getHandValue());
                    setCards(getCards() + 1);
                    break;
            }
        }/*
        System.out.println("Dealer stops");
        if (player1.handValue > getHandValue()) {
            System.out.println("Player wins");
        } else if (player1.handValue <= getHandValue()) {
            System.out.println("House wins");
        }*/
    }
}