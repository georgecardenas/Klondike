package klondike.controllers.local;

import java.util.List;

import klondike.models.CardStack;
import klondike.models.Game;
import klondike.models.State;

public abstract class LocalController {

	private Game game;

	protected LocalController(Game game) {
		assert game != null;
		this.game = game;
	}
	
	protected State getState(){
		return game.getState();
	}
	
	public void setState(State state){
		assert state != null;
		game.setState(state);
	}
	
	public CardStack getDeck(){
	    return game.getDeck();
	}
	
	public CardStack getWaste(){
        return game.getWaste();
    }
    
    public List<CardStack> getFoundations(){
        return game.getFoundations();
    }
    
    public List<CardStack> getTableaus(){
        return game.getTableaus();
    }
    
    public int getDeckToWasteSize(){
        return game.DECK_TO_WASTE_SIZE;
    }
}
