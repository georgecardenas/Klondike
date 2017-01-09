package klondike;

import klondike.controllers.OperationController;
import klondike.controllers.local.LocalLogic;
import klondike.view.console.ConsoleView;
import klondike.view.console.ExitView;

public class Klondike {
    private Logic logic;
    
    private View view;
    
    public Klondike(View view, Logic logic) {
        this.view = view;
        this.logic = logic;
    }
    
    public void play() {
        OperationController controller;
        do {
            controller = logic.getOperationController();
            if (controller != null){
                view.interact(controller);
            }
        } while (controller != null);   
        new ExitView().write();
    }
    
    public static void main(String[] args) {
        new Klondike(new ConsoleView(), new LocalLogic()).play();
    }
}
