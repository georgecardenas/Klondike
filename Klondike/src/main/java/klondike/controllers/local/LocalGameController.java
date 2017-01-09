package klondike.controllers.local;

import klondike.controllers.OperationControllerVisitor;
import klondike.controllers.GameController;
import klondike.models.Game;
import klondike.models.State;

public class LocalGameController extends LocalOperationController implements
		GameController {

	LocalGameController(Game game) {
		super(game);
	}

	public void start() {
		this.setState(State.RENDERING);
	}
	
	public void end() {
        this.setState(State.WAITING_ACTION);
    }

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}
}
