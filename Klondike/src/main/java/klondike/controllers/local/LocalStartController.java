package klondike.controllers.local;

import klondike.controllers.OperationControllerVisitor;
import klondike.controllers.StartController;
import klondike.models.Game;
import klondike.models.State;

public class LocalStartController extends LocalOperationController implements
		StartController {

	LocalStartController(Game game) {
		super(game);
	}

	public void start() {
		assert this.getState() == State.INITIAL;
		this.setState(State.IN_GAME);
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}
}
