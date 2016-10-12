package klondike.view.console;

import klondike.controllers.StartController;

class StartView {

	void interact(StartController startController){
		startController.start();
		new BoardView(startController).write();
	}
}
