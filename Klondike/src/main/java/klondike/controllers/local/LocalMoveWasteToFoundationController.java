package klondike.controllers.local;

import klondike.controllers.MenuOptionControllerVisitor;
import klondike.controllers.MoveWasteToFoundationController;
import klondike.models.Game;

public class LocalMoveWasteToFoundationController extends LocalController implements 
MoveWasteToFoundationController{

    protected LocalMoveWasteToFoundationController(Game game) {
        super(game);
    }

    @Override
    public void accept(MenuOptionControllerVisitor menuOptionControllerVisitor) {
        menuOptionControllerVisitor.visit(this);
    }

    @Override
    public void performAction() {
        if (this.getWaste().isEmpty() || this.getWaste().getPeekSize() == 0){
            //TODO Exception
            return;
        }
        
        for (int i = 0; i < this.getFoundations().size(); i++){
            if (this.getFoundations().get(i).canPush(this.getWaste().peek(1).get(0))){
                this.getFoundations().get(i).push(this.getWaste().pop());
                this.getWaste().setPeekSize(this.getWaste().getPeekSize() - 1);
                return;
            }
        }
//TODO excepcion
    }

}
