package klondike.controllers.local;

import klondike.controllers.Error;
import klondike.controllers.FlipController;
import klondike.controllers.MenuOptionControllerVisitor;
import klondike.models.Game;
import klondike.view.console.ErrorView;
import klondike.view.console.FromTableauView;

public class LocalFlipController extends LocalController implements 
FlipController{
    
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
            new ErrorView(Error.CANT_FLIP).write();
            return;
        }
        
        if (this.getTableaus().get(tableau).isEmpty()){
            new ErrorView(Error.EMPTY_TABLEAU).write();
            return;
        }
        
        this.getTableaus().get(tableau).setPeekSize(this.getTableaus().get(tableau).getPeekSize() + 1);
    }

}
