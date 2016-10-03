package klondike.models;

import java.util.Stack;

public interface ConditionalCardStack {

    boolean canPush(Card card);
    
    boolean canPush(Stack<Card> cards);
}
