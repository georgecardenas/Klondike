package klondike.models;

import java.util.Stack;

public abstract class CardStack {
    
    protected Stack<Card> cards;
    
    private int peekSize;
    
    public CardStack() {
        this.cards = new Stack<Card>();
        peekSize = 1;
    }
    
    public Card pop(){
        return cards.pop();
    }
    
    public void push(Card card){
        cards.push(card);
    }
    
    public Stack<Card> pop(int n){
        Stack<Card> result = new Stack<Card>();
        
        for (int i = 0; i < n; i++){
            result.push(cards.pop());
        }
        
        return result;
    }
    
    public void push(Stack<Card> cards){
        while(cards.size() > 0){
            this.cards.push(cards.pop());
        }
    }
    
    public int size(){
        return cards.size();
    }
    
    public boolean isEmpty(){
        return cards.isEmpty();
    }
    
    public void setPeekSize(int peekSize){
        this.peekSize = peekSize;
    }
    
    public int getPeekSize(){
        return peekSize;
    }
    
    public Stack<Card> peek(){
        return peek(this.peekSize);
    }
    
    public Stack<Card> peek(int peekSize){
        Stack<Card> result = new Stack<Card>();
        
        int limit = (cards.size() - 1) - peekSize;
        
        if (cards.size() <= peekSize){
            limit = -1;
        }
        
        for (int i = cards.size() - 1; i > limit; i--){
            result.push(cards.get(i));
        }
        
        return result;
    }
    
    public abstract boolean canPush(Card card);
    
    public abstract boolean canPush(Stack<Card> cards);
}
