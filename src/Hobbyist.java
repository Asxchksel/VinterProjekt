import java.util.Scanner;

public class Hobbyist extends Players{
    private int cards;
    private int maxCards = 5;
    public Scanner keyb = new Scanner(System.in);

    public Hobbyist(){
        super();
    }

    @Override
    public void drawCard() {
        Dealer dealer = new Dealer();
        if (this.cards < maxCards){
            super.drawCard();
            this.cards += 1;
            if(getCardValue() > 21 ){
                System.out.println("You lose!");
            } else if (getCardValue() < 21) {
                System.out.println("Do you want to draw another? Yes/No");
                String drawAgain = keyb.nextLine();
                if (drawAgain.equalsIgnoreCase("YES")){
                    drawCard();
                } else if (drawAgain.equalsIgnoreCase("NO")) {
                    dealer.drawCard();
                }
            }
        }
        else {
            System.out.println("Too many Cards");
        }
    }


    }