package klondike.controllers.local;

import klondike.controllers.MenuOptionControllerVisitor;
import klondike.controllers.MoveTableauToFoundationController;
import klondike.models.Game;
import klondike.models.State;
import klondike.view.console.ErrorView;
import klondike.view.console.FromTableauView;
import klondike.controllers.Error;

public class LocalMoveTableauToFoundationController extends LocalController implements 
MoveTableauToFoundationController{

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
            new ErrorView(Error.EMPTY_TABLEAU).write();
            return;
        }
        
        for (int i = 0; i < this.getFoundations().size(); i++){
            if (this.getFoundations().get(i).canPush(this.getTableaus().get(tableau).peek(1).get(0))){
                this.getFoundations().get(i).push(this.getTableaus().get(tableau).pop());
                this.getTableaus().get(tableau).setPeekSize(this.getTableaus().get(tableau).getPeekSize() - 1);
                if (this.isFinished()){
                    this.setState(State.FINAL);
                }
                return;
            }
        }
        new ErrorView(Error.CANT_PUSH_ON_FOUNDATION).write();
    }

}
