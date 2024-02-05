public class Hobbyist extends Players {
    public Hobbyist() {
        super();
    }

    //starts the game and asks the player if they want to take another card gives turn to dealer if maximum card are taken
    public void PlayGame() {
        Dealer dealer = new Dealer();
        if (getCards() < getMaxCards() && getHandValue() < 21) {
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
                        endGame(dealer);
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Not a valid choice");
                }
            }
        } else {
            System.out.println("You cant take another card");
            dealer.takeCard();
            endGame(dealer);
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

    //Compares results from dealer and the player to see who won
    public void endGame(Dealer dealer) {
        if (dealer.getHandValue() >= getHandValue() && dealer.getHandValue() <= 21 || getHandValue() > 21) {
            System.out.println("You lose, House wins as intended :)");
            setCards(0);
            setHandValue(0);
            dealer.setHandValue(0);
            dealer.setCards(0);
            System.out.println("Do you want to try again?: Yes/No");
            try {
                String playAgain = keyb.nextLine();
                if (playAgain.equalsIgnoreCase("YES")) {
                    PlayGame();
                } else if (playAgain.equalsIgnoreCase("NO")) {
                    System.out.println("Too bad");
                }
            } catch (Exception e) {
                System.out.println("Not a valid choice");
            }
        } else if (dealer.getHandValue() < getHandValue() && getHandValue() <= 21 || dealer.getHandValue() > 21) {
            System.out.println("You win, House loses as you should :)");
            setCards(0);
            setHandValue(0);
            dealer.setHandValue(0);
            dealer.setCards(0);
            System.out.println("Do you want to try again?: Yes/No");
            try {
                String playAgain = keyb.nextLine();
                if (playAgain.equalsIgnoreCase("YES")) {
                    PlayGame();
                } else if (playAgain.equalsIgnoreCase("NO")) {
                    System.out.println("Too bad");
                }
            } catch (Exception e) {
                System.out.println("Not a valid choice");
            }
        }
    }
}