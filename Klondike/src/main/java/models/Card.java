package models;

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
}
