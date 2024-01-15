import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.random.RandomGenerator;

public class CardDeck {
    private ArrayList <Integer> cardRank = new ArrayList<>();
    private ArrayList <String> cardSuit = new ArrayList<>();
    private int cardValue;

    public CardDeck(){
        cardSuit.add("Hearts");
        cardSuit.add("Spades");
        cardSuit.add("Clubs");
        cardSuit.add("Diamonds");
        cardRank.add(1);
        cardRank.add(13);
        cardRank.add(12);
        cardRank.add(11);
        cardRank.add(10);
        cardRank.add(9);
        cardRank.add(8);
        cardRank.add(7);
        cardRank.add(6);
        cardRank.add(5);
        cardRank.add(4);
        cardRank.add(3);
        cardRank.add(2);
        this.cardValue = cardValue;
    }

    public void drawCard(){
        Random random = new Random();
        int randomRank = random.nextInt( 0,13);
        int drawnCard = cardRank.get(randomRank);

        int randomSuit = random.nextInt(0, 4);
        String drawnSuit = cardSuit.get(randomSuit);

        switch (drawnCard) {
            case 1:
                System.out.println("Your drawn card is Ace of " + drawnSuit);
                if(this.cardValue + 11 > 21){
                    this.cardValue += 1;
                    System.out.println("Current hand value is: " + this.cardValue);
                }
                else{
                    this.cardValue += 11;
                    System.out.println("Current hand value is: " + this.cardValue);
                }
                break;
            case 11:
                System.out.println("Your drawn card is Jack of " + drawnSuit);
                this.cardValue += 10;
                System.out.println("Current hand value is: " + this.cardValue);
                break;
            case 12:
                System.out.println("Your drawn card is Queen of " + drawnSuit);
                this.cardValue += 10;
                System.out.println("Current hand value is: " + this.cardValue);
                break;
            case 13:
                System.out.println("Your drawn card is King of " + drawnSuit);
                this.cardValue += 10;
                System.out.println("Current hand value is: " + this.cardValue);
                break;
            default:
                System.out.println("Your drawn card is " + drawnCard + " of " + drawnSuit);
                this.cardValue += drawnCard;
                System.out.println("Current hand value is: " + this.cardValue);
                break;
        }

    }

    public int getCardValue() {
        return this.cardValue;
    }
}
