package klondike.view.console;

import klondike.View;
import klondike.controllers.MenuController;
import klondike.controllers.OperationController;
import klondike.controllers.GameController;

public class ConsoleView implements View {
	
	private GameView gameView;
	
	private MenuView menuView;
	
	public ConsoleView(){
		gameView = new GameView();
		menuView = new MenuView();
	}

	public void interact(OperationController operationController) {
		assert operationController != null;
		operationController.accept(this);
	}
	
	@Override
	public void visit(GameController gameController) {
		gameView.interact(gameController);
	}

    @Override
    public void visit(MenuController menuController) {
        menuView.interact(menuController);
    }

}
