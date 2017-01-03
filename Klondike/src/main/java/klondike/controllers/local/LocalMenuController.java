package klondike.controllers.local;

import klondike.controllers.MenuController;
import klondike.controllers.OperationControllerVisitor;
import klondike.models.Game;
import klondike.models.State;

public class LocalMenuController extends LocalOperationController implements
		MenuController {
    
    private LocalMoveDeckToWasteController moveDeckToWasteOptionController;
    private LocalMoveWasteToDeckController moveWasteToDeckOptionController;
    
	LocalMenuController(Game game) {
		super(game);
		moveDeckToWasteOptionController = new LocalMoveDeckToWasteController(game);
		moveWasteToDeckOptionController = new LocalMoveWasteToDeckController(game);
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

    @Override
    public void performAction(int action) {
       this.setState(State.RENDERING);
       switch (action){
           case 1:
               moveDeckToWasteOptionController.performAction();
           break;
           case 2:
               moveWasteToDeckOptionController.performAction();
           break;
       }
    }
}
