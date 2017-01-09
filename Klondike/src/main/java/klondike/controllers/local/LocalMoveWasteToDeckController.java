package klondike.controllers.local;

import klondike.controllers.MenuOptionControllerVisitor;
import klondike.controllers.MoveWasteToDeckController;
import klondike.models.Game;

public class LocalMoveWasteToDeckController extends LocalController implements 
MoveWasteToDeckController{

    protected LocalMoveWasteToDeckController(Game game) {
        super(game);
    }

    @Override
    public void accept(MenuOptionControllerVisitor menuOptionControllerVisitor) {
        menuOptionControllerVisitor.visit(this);
    }

    @Override
    public void performAction() {
        if (this.getDeck().isEmpty()){
            while (!this.getWaste().isEmpty()){
                this.getDeck().push(this.getWaste().pop()); 
            }
        }
    }

}
