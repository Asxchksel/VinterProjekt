public class Hobbyist extends Players {
    public Hobbyist() {
        super();
    }

    //starts the game and asks the player if they want to take another card gives turn to dealer if maximum card are taken
    public void PlayGame() {
        Dealer dealer = new Dealer();
        if (getCards() < getMaxCards()) {
            while (true) {
                System.out.println("Do you want to draw a card? Yes/No");
                try {
                    String drawAgain = keyb.nextLine();
                    if (drawAgain.equalsIgnoreCase("YES")) {
                        drawCard();
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


    //Output for what card the player gets and tells them that
    public void drawCard() {
        CardDeck cards = new CardDeck();
        int pickedCardValue = cards.getCardValue();
        String pickedCardSuit = cards.getDrawnSuit();
        switch (pickedCardValue) {
            case 1:
                System.out.println("Your drawn card is Ace of " + pickedCardSuit);
                if (getHandValue() + 11 > 21) {
                    setHandValue(getHandValue() + 1);
                } else {
                    setHandValue(getHandValue() + 11);
                }
                System.out.println("Current hand value is: " + getHandValue());
                break;
            case 11:
                System.out.println("Your drawn card is Jack of " + pickedCardSuit);
                setHandValue(getHandValue() + 10);
                System.out.println("Current hand value is: " + getHandValue());
                break;
            case 12:
                System.out.println("Your drawn card is Queen of " + pickedCardSuit);
                setHandValue(getHandValue() + 10);
                System.out.println("Current hand value is: " + getHandValue());
                break;
            case 13:
                System.out.println("Your drawn card is King of " + pickedCardSuit);
                setHandValue(getHandValue() + 10);
                System.out.println("Current hand value is: " + getHandValue());
                break;
            default:
                System.out.println("Your drawn card is " + pickedCardValue + " of " + pickedCardSuit);
                setHandValue(getHandValue() + pickedCardValue);
                System.out.println("Current hand value is: " + getHandValue());
                break;
        }
    }
}