package klondike.models;

import java.util.Stack;

public class Foundation extends CardStack {

    public static int MAX_FOUNDATIONS = 4;
    
    private Suit suit;
    
    public Foundation(Suit suit){
        super();
        this.suit = suit;
    }
    
    public Suit getSuit(){
        return suit;
    }
    
    @Override
    public boolean canPush(Card card) {
        if (cards.isEmpty() && card.getRank() == Rank.A && card.getSuit().equals(suit)){
            return true;
        }
        if (!cards.isEmpty() && cards.peek().getRank().getValue() == card.getRank().getValue() - 1){
            if (cards.peek().getSuit().equals(card.getSuit())){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean canPush(Stack<Card> cards) {
        return false;
    }

}
