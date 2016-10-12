package klondike.models;

import java.util.Stack;

public class Tableau extends CardStack implements ConditionalCardStack{
    
    public static int MAX_TABLEAUS = 7;
    
    @Override
    public boolean canPush(Card card) {
        if (cards.peek().getRank().getValue() == card.getRank().getValue() + 1){
            if (cards.peek().getColor().equals(card.getColor())){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean canPush(Stack<Card> cards) {
        if (this.cards.peek().getRank().getValue() == cards.peek().getRank().getValue() + 1){
            if (!this.cards.peek().getColor().equals(cards.peek().getColor())){
                return true;
            }
        }
        return false;
    }

}
