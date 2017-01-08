package klondike.controllers.local;

import klondike.controllers.MenuController;
import klondike.controllers.OperationControllerVisitor;
import klondike.models.Game;
import klondike.models.State;

public class LocalMenuController extends LocalOperationController implements
		MenuController {
    
    private LocalMoveDeckToWasteController moveDeckToWasteOptionController;
    private LocalMoveWasteToDeckController moveWasteToDeckOptionController;
    private LocalMoveWasteToFoundationController moveWasteToFoundationOptionController;
    private LocalMoveWasteToTableauController moveWasteToTableauOptionController;
    private LocalMoveTableauToFoundationController moveTableauToFoundationController;
    private LocalMoveTableauToTableauController moveTableauToTableauController;
    private LocalFlipController flipController;
    
	LocalMenuController(Game game) {
		super(game);
		moveDeckToWasteOptionController = new LocalMoveDeckToWasteController(game);
		moveWasteToDeckOptionController = new LocalMoveWasteToDeckController(game);
		moveWasteToFoundationOptionController = new LocalMoveWasteToFoundationController(game);
		moveWasteToTableauOptionController = new LocalMoveWasteToTableauController(game);
		moveTableauToFoundationController = new LocalMoveTableauToFoundationController(game);
		moveTableauToTableauController = new LocalMoveTableauToTableauController(game);
		flipController = new LocalFlipController(game);
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
           case 3:
               moveWasteToFoundationOptionController.performAction();
           break;
           case 4:
               moveWasteToTableauOptionController.performAction();
           break;
           case 5:
               moveTableauToFoundationController.performAction();
           break;
           case 6:
               moveTableauToTableauController.performAction();
           break;
           case 8:
               flipController.performAction();
           break;
       }
    }
}
