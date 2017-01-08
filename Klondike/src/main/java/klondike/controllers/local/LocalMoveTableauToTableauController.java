package klondike.controllers.local;

import klondike.controllers.MenuOptionControllerVisitor;
import klondike.controllers.MoveWasteToFoundationController;
import klondike.models.Game;
import klondike.view.console.CardNumberView;
import klondike.view.console.FromTableauView;
import klondike.view.console.ToTableauView;

public class LocalMoveTableauToTableauController extends LocalController implements 
MoveWasteToFoundationController{

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
        
        if (this.getTableaus().get(from).isEmpty() || this.getTableaus().get(from).size() < cards){
            return;
            // TODO Exception
        }
        
        if (cards > this.getTableaus().get(from).getPeekSize()){
            return;
            // TODO Exception
        }
        
        if(this.getTableaus().get(to).canPush(this.getTableaus().get(from).peek(cards))){
            this.getTableaus().get(to).push(this.getTableaus().get(from).pop(cards));
            this.getTableaus().get(from).setPeekSize(this.getTableaus().get(from).getPeekSize() - cards);
            this.getTableaus().get(to).setPeekSize(this.getTableaus().get(to).getPeekSize() + cards);
        } else{
            //TODO Exception
        }
    }

}
