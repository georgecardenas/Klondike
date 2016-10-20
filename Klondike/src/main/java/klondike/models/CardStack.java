package klondike.models;

import java.util.Stack;

public abstract class CardStack {
    
    protected Stack<Card> cards;
    
    private int peekSize;
    
    public CardStack() {
        this.cards = new Stack<Card>();
        peekSize = 0;
    }
    
    public Card pop(){
        return cards.pop();
    }
    
    public void push(Card card){
        cards.push(card);
    }
    
    public Stack<Card> pop(int n){
        assert cards.size() >= n;
        
        Stack<Card> result = new Stack<Card>();
        
        for (int i = 0; i < n; i++){
            result.push(cards.pop());
        }
        
        return result;
    }
    
    public void push(Stack<Card> cards){
        for (Card card : cards){
            cards.push(card);
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
        
        for (int i = 0; i < peekSize; i++){
            result.push(cards.get(i));
        }
        
        return result;
    }
    
    public abstract boolean canPush(Card card);
    
    public abstract boolean canPush(Stack<Card> cards);
}
