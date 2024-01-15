import java.util.Random;

public class Dealer extends Players{

    public Dealer(){

    }

    public void takeCard(){
        drawCard();
        if(getCardValue() >= 17 || getCardValue() > 21){
            System.out.println("Dealer stops");
        }
    }
}
