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
                        dealer.drawCard();
                        endGame(dealer);
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Not a valid choice");
                }
            }
        } else {
            System.out.println("You cant take another card");
            dealer.drawCard();
            endGame(dealer);
        }
    }

    @Override
    public void drawCard() {
        super.drawCard();
        switch (getPickedCardValue()) {
            case 1:
                System.out.println("Your drawn card is Ace of " + getPickedCardSuit());
                break;
            case 11:
                System.out.println("Your drawn card is Jack of " + getPickedCardSuit());
                break;
            case 12:
                System.out.println("Your drawn card is Queen of " + getPickedCardSuit());
                break;
            case 13:
                System.out.println("Your drawn card is King of " + getPickedCardSuit());
                break;
            default:
                System.out.println("Your drawn card is " + getPickedCardValue() + " of " + getPickedCardSuit());
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
            System.out.println("You win as you should:), House loses");
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