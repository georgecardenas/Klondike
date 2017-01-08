package klondike.controllers.local;

import klondike.controllers.MenuOptionControllerVisitor;
import klondike.controllers.MoveDeckToWasteController;
import klondike.models.Game;

public class LocalMoveDeckToWasteController extends LocalController implements 
MoveDeckToWasteController{

    protected LocalMoveDeckToWasteController(Game game) {
        super(game);
    }

    @Override
    public void accept(MenuOptionControllerVisitor menuOptionControllerVisitor) {
        menuOptionControllerVisitor.visit(this);
    }

    @Override
    public void performAction() {
        if (!this.getDeck().isEmpty()){
            int nCards = 0;
            if (this.getDeck().size() < getDeckToWasteSize()){
                nCards = this.getDeck().size();
            }
            else{
                nCards = getDeckToWasteSize();
            }
            this.getWaste().push(this.getDeck().pop(nCards));
            this.getWaste().setPeekSize(3);
        }
    }

}
