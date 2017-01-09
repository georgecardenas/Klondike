package klondike.controllers.local;

import klondike.controllers.ExitController;
import klondike.controllers.MenuOptionControllerVisitor;
import klondike.models.Game;
import klondike.models.State;

public class LocalExitController extends LocalController implements 
ExitController{
    
    protected LocalExitController(Game game) {
        super(game);
    }

    @Override
    public void accept(MenuOptionControllerVisitor menuOptionControllerVisitor) {
        menuOptionControllerVisitor.visit(this);
    }

    @Override
    public void performAction() {
        this.setState(State.EXIT);
    }

}
