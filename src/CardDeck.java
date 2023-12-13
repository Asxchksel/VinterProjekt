import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.random.RandomGenerator;

public class CardDeck {
    private ArrayList <Integer> cardRank = new ArrayList<>();
    private ArrayList <String> cardSuit = new ArrayList<>();

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

    }

    public void drawCard(){
        Random random = new Random();
        int randomRank = random.nextInt( 0,13);
        int drawnCard = cardRank.get(randomRank);

        int randomSuit = random.nextInt(0, 4);
        String drawnSuit = cardSuit.get(randomSuit);

        System.out.println("Your drawn card is " + drawnCard + " of " + drawnSuit);
    }
}
