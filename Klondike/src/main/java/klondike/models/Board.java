package klondike.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private Deck deck;
    
    private CardStack waste;
    
    private List<Foundation> foundations;
    
    private List<Tableau> tableaus;
    
    public Board(){
        deck = new Deck();
        deck.shuffle();
        
        waste = new CardStack();
        
        foundations = new ArrayList<>();
        
        for (Symbol symbol: Symbol.values()){
            foundations.add(new Foundation(new Suit(symbol)));
        }
        
        tableaus = new ArrayList<>();
        
        for (int i=0; i < Tableau.MAX_TABLEAUS; i++){
            tableaus.add(new Tableau());
        }
        dealCards();
    }
    
    public Deck getDeck(){
        return deck;
    }
    
    public CardStack getWaste(){
        return waste;
    }
    
    public List<Foundation> getFoundations(){
        return foundations;
    }
    
    public List<Tableau> getTableaus(){
        return tableaus;
    }
    
    public void dealCards(){
        for (int i=0; i < Tableau.MAX_TABLEAUS; i++){
            for(int j=Tableau.MAX_TABLEAUS; j > i ; j--){
                tableaus.get(i).push(deck.pop());
            }
            tableaus.get(i).setPeekSize(1);
        }
    }
}
