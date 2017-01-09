package klondike.view.console;

import klondike.controllers.GameController;

class GameView {

	void interact(GameController gameController){
		gameController.start();
		new BoardView(gameController).write();
		gameController.end();
	}
}
