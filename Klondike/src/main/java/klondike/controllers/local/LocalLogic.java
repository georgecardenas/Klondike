package klondike.controllers.local;

import klondike.Logic;
import klondike.models.Game;

public class LocalLogic implements Logic {

	private Game game;
	
	private LocalGameController gameController;
	
	private LocalMenuController menuController;

	public LocalLogic() {
		game = new Game();
		gameController = new LocalGameController(game);
		menuController = new LocalMenuController(game);
	}

	public LocalOperationController getOperationController() {
		switch (game.getState()){
    		case RENDERING:
    			return gameController;
    		case WAITING_ACTION:
                return menuController;
    		case FINAL:
    			return null;
    		case EXIT:
    		    return null;
    		default:
    			return null;
		}
	}
}
