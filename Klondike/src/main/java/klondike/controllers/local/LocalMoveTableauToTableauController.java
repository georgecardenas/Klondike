package klondike.controllers.local;

import klondike.controllers.Error;
import klondike.controllers.MenuOptionControllerVisitor;
import klondike.controllers.MoveTableauToTableauController;
import klondike.models.Game;
import klondike.view.console.CardNumberView;
import klondike.view.console.ErrorView;
import klondike.view.console.FromTableauView;
import klondike.view.console.ToTableauView;

public class LocalMoveTableauToTableauController extends LocalController implements 
MoveTableauToTableauController{

    ToTableauView toTableauView;
    FromTableauView fromTableauView;
    CardNumberView cardNumberView;

    protected LocalMoveTableauToTableauController(Game game) {
        super(game);
        toTableauView = new ToTableauView();
        fromTableauView = new FromTableauView();
        cardNumberView = new CardNumberView();
    }

    @Override
    public void accept(MenuOptionControllerVisitor menuOptionControllerVisitor) {
        menuOptionControllerVisitor.visit(this);
    }

    @Override
    public void performAction() {
        int from = fromTableauView.read() - 1;
        int cards = cardNumberView.read();
        int to = toTableauView.read() - 1;
        
        if (this.getTableaus().get(from).isEmpty()){
            new ErrorView(Error.EMPTY_TABLEAU).write();
            return;
        }
        
        if (this.getTableaus().get(from).size() < cards ||
                cards > this.getTableaus().get(from).getPeekSize()){
            new ErrorView(Error.NOT_ENOUGH_CARDS).write();
            return;
        }
        
        if(this.getTableaus().get(to).canPush(this.getTableaus().get(from).peek(cards))){
            this.getTableaus().get(to).push(this.getTableaus().get(from).pop(cards));
            this.getTableaus().get(from).setPeekSize(this.getTableaus().get(from).getPeekSize() - cards);
            this.getTableaus().get(to).setPeekSize(this.getTableaus().get(to).getPeekSize() + cards);
        } else{
            new ErrorView(Error.CANT_PUSH_ON_TABLEAU).write();
        }
    }

}
