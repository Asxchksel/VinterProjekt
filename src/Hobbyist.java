public class Hobbyist extends Players {
    public Hobbyist() {
        super();
    }

    //startar hela systemet och gör så man få välja om man vill ta fler kort
    public void PlayGame() {
        Dealer dealer = new Dealer();
        Hand playerHand1 = new Hand();
        Card cards = new Card();
        if (getCards() < getMaxCards() && getCardValue() < 21) {
            while (true) {
                System.out.println("Do you want to draw a card? Yes/No");
                try {
                    String drawAgain = keyb.nextLine();
                    if (drawAgain.equalsIgnoreCase("YES")) {
                        cards.drawCard();
                        setCards(getCards() + 1);
                        PlayGame();
                        break;
                    } else if (drawAgain.equalsIgnoreCase("NO")) {
                        dealer.takeCard();
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Not a valid choice");
                }
            }
        } else {
            System.out.println("You cant take another card");
            dealer.takeCard();
        }
    }


    //Output för vilket kort man får och sitt värde på handen
    @Override
    public void drawCard() {
        switch (getCardValue()) {
            case 1:
                System.out.println("Your drawn card is Ace of " + getDrawnSuit());
                if (getHandValue() + 11 > 21) {
                    setHandValue(getHandValue() + 1);
                } else {
                    setHandValue(getHandValue() + 11);
                }
                System.out.println("Current hand value is: " + getHandValue());
                break;
            case 11:
                System.out.println("Your drawn card is Jack of " + getDrawnSuit());
                setHandValue(getHandValue() + 10);
                System.out.println("Current hand value is: " + getHandValue());
                break;
            case 12:
                System.out.println("Your drawn card is Queen of " + getDrawnSuit());
                setHandValue(getHandValue() + 10);
                System.out.println("Current hand value is: " + getHandValue());
                break;
            case 13:
                System.out.println("Your drawn card is King of " + getDrawnSuit());
                setHandValue(getHandValue() + 10);
                System.out.println("Current hand value is: " + getHandValue());
                break;
            default:
                System.out.println("Your drawn card is " + getCardValue() + " of " + getDrawnSuit());
                setHandValue(getHandValue() + getCardValue());
                System.out.println("Current hand value is: " + getHandValue());
                break;
        }
    }
}