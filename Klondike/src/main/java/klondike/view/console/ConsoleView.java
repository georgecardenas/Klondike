package klondike.view.console;

import klondike.View;
import klondike.controllers.OperationController;
import klondike.controllers.StartController;

public class ConsoleView implements View {
	
	private StartView startView;
	
	public ConsoleView(){
		startView = new StartView();
	}

	public void interact(OperationController operationController) {
		assert operationController != null;
		operationController.accept(this);
	}
	
	@Override
	public void visit(StartController startController) {
		startView.interact(startController);
	}

}
