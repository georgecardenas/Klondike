package klondike.models;

import java.util.List;

public class Game {
    
    private State state;
    
    private Board board;
    
    public final int DECK_TO_WASTE_SIZE = 3;
    
    public Game() {
        state = State.RENDERING;
        board = new Board(DECK_TO_WASTE_SIZE);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    public CardStack getDeck(){
        return board.getDeck();
    }
    
    public CardStack getWaste(){
        return board.getWaste();
    }
    
    public List<CardStack> getFoundations(){
        return board.getFoundations();
    }
    
    public List<CardStack> getTableaus(){
        return board.getTableaus();
    }
    
    public boolean isFinished(){
        return board.isFinished();
    }
}
