package klondike.models;

import java.util.Stack;

public class Waste extends CardStack{

    @Override
    public boolean canPush(Card card) {
        return true;
    }

    @Override
    public boolean canPush(Stack<Card> cards) {
        return true;
    }

}
