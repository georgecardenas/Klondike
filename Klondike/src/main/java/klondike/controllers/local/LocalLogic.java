package klondike.controllers.local;

import klondike.Logic;
import klondike.models.Game;

public class LocalLogic implements Logic {

	private Game game;
	
	private LocalStartController startController;

	public LocalLogic() {
		game = new Game();
		startController = new LocalStartController(game);
	}

	public LocalOperationController getOperationController() {
		switch (game.getState()){
		case INITIAL:
			return startController;
		case IN_GAME:
			return null;
		case FINAL:
			return null;
		case EXIT:
		default:
			return null;
		}
	}
}
