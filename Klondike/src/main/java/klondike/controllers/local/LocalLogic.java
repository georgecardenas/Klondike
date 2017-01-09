package klondike.controllers.local;

import klondike.Logic;
import klondike.models.Game;
import klondike.view.console.ExitView;
import klondike.view.console.VictoryView;

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
    		    new VictoryView().write();
    			return null;
    		case EXIT:
    		    new ExitView().write();
    		    return null;
    		default:
    			return null;
		}
	}
}
