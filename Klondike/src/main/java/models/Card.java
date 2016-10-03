package models;

public class Card {
    
    private Rank rank;
    
    private Suit suit;
    
    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }
    
    public boolean canStack(Card card){
        return !this.getColor().equals(card.getColor());
    }
    
    public void setRank(Rank rank){
        this.rank = rank;
    }
    
    public void setSuit(Suit suit){
        this.suit = suit;
    }
    
    public Rank getRank(){
        return this.rank;
    }
    
    public Suit getSuit(){
        return this.suit;
    }
    
    public Color getColor(){
        return this.suit.getColor();
    }
}
