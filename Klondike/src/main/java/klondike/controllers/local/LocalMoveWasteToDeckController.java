package klondike.controllers.local;

import klondike.controllers.MenuOptionControllerVisitor;
import klondike.controllers.MoveDeckToWasteController;
import klondike.models.Game;

public class LocalMoveWasteToDeckController extends LocalController implements 
MoveDeckToWasteController{

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
            this.getDeck().push(this.getWaste().pop(getWaste().size()));
        }
    }

}
