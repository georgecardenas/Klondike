package klondike.controllers.local;

import klondike.controllers.MenuOptionControllerVisitor;
import klondike.controllers.MoveDeckToWasteController;
import klondike.models.Game;
import klondike.view.console.FromTableauView;

public class LocalFlipController extends LocalController implements 
MoveDeckToWasteController{
    
    FromTableauView toTableauView;
    
    protected LocalFlipController(Game game) {
        super(game);
        toTableauView = new FromTableauView();
    }

    @Override
    public void accept(MenuOptionControllerVisitor menuOptionControllerVisitor) {
        menuOptionControllerVisitor.visit(this);
    }

    @Override
    public void performAction() {
        int tableau = toTableauView.read() - 1;
        
        if (this.getTableaus().get(tableau).getPeekSize() > 0){
            return;
            // TODO Exception
        }
        
        if (this.getTableaus().get(tableau).isEmpty()){
            return;
            // TODO Exception
        }
        
        this.getTableaus().get(tableau).setPeekSize(this.getTableaus().get(tableau).getPeekSize() + 1);
    }

}
