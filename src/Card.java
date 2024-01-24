public class Card extends CardDeck {
    private int cardValue;
    private String cardRank;

    private boolean takenFromDeck;

    @Override
    public void drawCard() {
        super.drawCard();
        switch (getRandomRank()) {
            case 1:
                System.out.println("Your drawn card is Ace");
                if (getCardValue() + 11 > 21) {
                    setCardValue(getCardValue() + 1);
                } else {
                    setCardValue(getCardValue() + 11);
                }
                System.out.println("Current hand value is: " + getCardValue());
                break;
            case 11:
                System.out.println("Your drawn card is Jack of " + getDrawnSuit());
                setCardValue(getCardValue() + 10);
                System.out.println("Current hand value is: " + getCardValue());
                break;
            case 12:
                System.out.println("Your drawn card is Queen of " + getDrawnSuit());
                setCardValue(getCardValue() + 10);
                System.out.println("Current hand value is: " + getCardValue());
                break;
            case 13:
                System.out.println("Your drawn card is King of " + getDrawnSuit());
                setCardValue(getCardValue() + 10);
                System.out.println("Current hand value is: " + getCardValue());
                break;
            default:
                System.out.println("Your drawn card is " + getDrawnCard() + " of " + getDrawnSuit());
                setCardValue(getCardValue() + getDrawnCard());
                System.out.println("Current hand value is: " + getCardValue());
                break;
        }
        switch (getRandomSuit()) {
            case 1:
                System.out.println("of Hearts");
            case 2:
                System.out.println("of Clubs");
            case 3:
                System.out.println("of Spades");
            case 4:
                System.out.println("of Diamonds");
        }
    }
}
