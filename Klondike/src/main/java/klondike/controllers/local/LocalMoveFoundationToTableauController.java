package klondike.controllers.local;

import klondike.controllers.Error;
import klondike.controllers.MenuOptionControllerVisitor;
import klondike.controllers.MoveFoundationToTableauController;
import klondike.models.Game;
import klondike.view.console.ErrorView;
import klondike.view.console.FromFoundationView;
import klondike.view.console.ToTableauView;

public class LocalMoveFoundationToTableauController extends LocalController implements 
MoveFoundationToTableauController{

    FromFoundationView fromFoundationView;
    ToTableauView toTableauView;

    protected LocalMoveFoundationToTableauController(Game game) {
        super(game);
        fromFoundationView = new FromFoundationView();
        toTableauView = new ToTableauView();
    }

    @Override
    public void accept(MenuOptionControllerVisitor menuOptionControllerVisitor) {
        menuOptionControllerVisitor.visit(this);
    }

    @Override
    public void performAction() {
        int foundation = fromFoundationView.read() - 1;
        int tableau = toTableauView.read() -1;
        
        if(this.getFoundations().get(foundation).isEmpty()){
            new ErrorView(Error.EMPTY_FOUNDATION).write();
            return;
        }
        
        if (this.getTableaus().get(tableau).canPush(this.getFoundations().get(foundation).peek(1).get(0))){
            this.getTableaus().get(tableau).push(this.getTableaus().get(foundation).pop());
            return;
        }else{
            new ErrorView(Error.CANT_PUSH_ON_TABLEAU).write();
        }
    }

}
