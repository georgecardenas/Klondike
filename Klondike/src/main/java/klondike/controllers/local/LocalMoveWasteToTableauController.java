package klondike.controllers.local;

import klondike.controllers.Error;
import klondike.controllers.MenuOptionControllerVisitor;
import klondike.controllers.MoveWasteToTableauController;
import klondike.models.Game;
import klondike.view.console.ErrorView;
import klondike.view.console.ToTableauView;

public class LocalMoveWasteToTableauController extends LocalController implements 
MoveWasteToTableauController{

    ToTableauView toTableauView;

    protected LocalMoveWasteToTableauController(Game game) {
        super(game);
        toTableauView = new ToTableauView();
    }

    @Override
    public void accept(MenuOptionControllerVisitor menuOptionControllerVisitor) {
        menuOptionControllerVisitor.visit(this);
    }

    @Override
    public void performAction() {
        if (this.getWaste().isEmpty() || this.getWaste().getPeekSize() == 0){
            new ErrorView(Error.EMPTY_WASTE).write();
            return;
        }
        int tableau = toTableauView.read() - 1;
        if(this.getTableaus().get(tableau).canPush(this.getWaste().peek(1))){
            this.getTableaus().get(tableau).push(this.getWaste().pop());
            this.getTableaus().get(tableau).setPeekSize(this.getTableaus().get(tableau).getPeekSize() + 1);
            this.getWaste().setPeekSize(this.getWaste().getPeekSize() - 1);
        } else{
            new ErrorView(Error.CANT_PUSH_ON_TABLEAU).write();
        }
    }

}
