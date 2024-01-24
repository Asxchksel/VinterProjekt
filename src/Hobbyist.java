public class Hobbyist extends Players {
    public Hobbyist() {
        super();
    }

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
}