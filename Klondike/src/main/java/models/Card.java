package models;

import klondike.utils.Color;
import klondike.utils.Rank;
import klondike.utils.Suit;

public class Card {
    
    private klondike.utils.Card card;
    
    public Card(){
        card = new klondike.utils.Card();
    }
    
    public Card(Rank rank, Suit suit){
        this();
        this.setRank(rank);
        this.setSuit(suit);
    }
    
    public boolean canStack(Card card){
        return !this.getColor().equals(card.getColor());
    }
    
    public void setRank(Rank rank){
        card.setRank(rank);
    }
    
    public void setSuit(Suit suit){
        card.setSuit(suit);
    }
    
    public Rank getRank(){
        return card.getRank();
    }
    
    public Suit getSuit(){
        return card.getSuit();
    }
    
    public Color getColor(){
        return card.getColor();
    }
}
