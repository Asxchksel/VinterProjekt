public class Players extends CardDeck{
private int cards;
private int maxCards = 5;

public Players(){}

    @Override
    public void drawCard() {
    if (cards < maxCards){
        super.drawCard();
        cards += 1;
        if(getCardValue() > 21 ){
            System.out.println("You lose!");
            }
        }
    else {
        System.out.println("Too many Cards");
    }
    }
}