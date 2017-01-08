package klondike.controllers.local;

import klondike.controllers.MenuOptionControllerVisitor;
import klondike.controllers.MoveWasteToFoundationController;
import klondike.models.Game;
import klondike.view.console.FromTableauView;

public class LocalMoveTableauToFoundationController extends LocalController implements 
MoveWasteToFoundationController{

    FromTableauView fromTableauView;

    protected LocalMoveTableauToFoundationController(Game game) {
        super(game);
        fromTableauView = new FromTableauView();
    }

    @Override
    public void accept(MenuOptionControllerVisitor menuOptionControllerVisitor) {
        menuOptionControllerVisitor.visit(this);
    }

    @Override
    public void performAction() {
        int tableau = fromTableauView.read() - 1;
        
        if(this.getTableaus().get(tableau).getPeekSize() == 0){
            return;
            //TODO Exception
        }
        
        for (int i = 0; i < this.getFoundations().size(); i++){
            if (this.getFoundations().get(i).canPush(this.getTableaus().get(tableau).peek(1).get(0))){
                this.getFoundations().get(i).push(this.getTableaus().get(tableau).pop());
                this.getTableaus().get(tableau).setPeekSize(this.getTableaus().get(tableau).getPeekSize() - 1);
                return;
            }
        }
        //TODO Exception
    }

}
