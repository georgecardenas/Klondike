package klondike.utils;

import models.Rank;
import models.Suit;

public class Card {
    private Rank rank;
    private Suit suit;
    
    public Rank getRank(){
        return rank;
    }
    
    public Suit getSuit(){
        return suit;
    }
    
    public void setRank(Rank rank){
        this.rank = rank;
    }
    
    public void setSuit(Suit suit){
        this.suit = suit;
    }
}
