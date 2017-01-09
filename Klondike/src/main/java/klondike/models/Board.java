package klondike.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private CardStack deck;
    
    private CardStack waste;
    
    private List<CardStack> foundations;
    
    private List<CardStack> tableaus;
    
    public final int FOUDNATION_MAX = 13;
    
    public Board(int deckToWasteSize){
        deck = new Deck();
        ((Deck)deck).shuffle();
        
        waste = new Waste();
        waste.setPeekSize(deckToWasteSize);
        
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
    
    public CardStack getDeck(){
        return deck;
    }
    
    public CardStack getWaste(){
        return waste;
    }
    
    public List<CardStack> getFoundations(){
        return foundations;
    }
    
    public List<CardStack> getTableaus(){
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

    public boolean isFinished() {
        for(int i=0; i< Foundation.MAX_FOUNDATIONS; i++){
            if (foundations.get(i).size() != FOUDNATION_MAX){
                return false;
            }
        }
        return true;
    }
}
