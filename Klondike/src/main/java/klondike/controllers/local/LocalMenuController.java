package klondike.controllers.local;

import klondike.controllers.MenuController;
import klondike.controllers.OperationControllerVisitor;
import klondike.models.Game;
import klondike.models.State;

public class LocalMenuController extends LocalOperationController implements
		MenuController {

	LocalMenuController(Game game) {
		super(game);
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

    @Override
    public void end() {
       this.setState(State.RENDERING);
    }
}
