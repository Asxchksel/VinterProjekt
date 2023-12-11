import java.util.ArrayList;
import java.util.Random;
import java.util.random.RandomGenerator;

public class CardDeck {
    private ArrayList <String> cardRank = new ArrayList<>();

    private ArrayList <String> cardSuit = new ArrayList<>();



    public CardDeck(){}

    public void drawCard(){
        Random rand = new Random();
        int randomCard = rand.nextInt( 1,14 );

        int suit = rand.nextInt(1, 5);

        System.out.println(randomCard);

    }
}
