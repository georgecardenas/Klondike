package klondike.controllers.local;

import java.util.List;

import klondike.models.CardStack;
import klondike.models.Deck;
import klondike.models.Foundation;
import klondike.models.Game;
import klondike.models.State;
import klondike.models.Tableau;

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
	
	public Deck getDeck(){
	    return game.getDeck();
	}
	
	public CardStack getWaste(){
        return game.getWaste();
    }
    
    public List<Foundation> getFoundations(){
        return game.getFoundations();
    }
    
    public List<Tableau> getTableaus(){
        return game.getTableaus();
    }
}
