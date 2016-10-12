package klondike.models;

import java.util.List;

public class Game {
    
    private State state;
    
    private Board board;
    
    public Game() {
        state = State.INITIAL;
        board = new Board();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    public Deck getDeck(){
        return board.getDeck();
    }
    
    public CardStack getWaste(){
        return board.getWaste();
    }
    
    public List<Foundation> getFoundations(){
        return board.getFoundations();
    }
    
    public List<Tableau> getTableaus(){
        return board.getTableaus();
    }
        
}
