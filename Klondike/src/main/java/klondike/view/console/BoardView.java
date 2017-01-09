package klondike.view.console;

import klondike.controllers.PresenterController;
import klondike.controllers.GameController;
import klondike.models.CardStack;
import klondike.models.Foundation;
import klondike.utils.IO;

public class BoardView {
    private PresenterController controller;

    BoardView(GameController controller) {
        assert controller != null;
        this.controller = controller;
    }

    void write() {
        IO io = new IO();
        io.writeln("===========================");
        new DeckView(controller.getDeck()).write();
        new CardStackView(controller.getWaste()).write("Descarte");
        for(CardStack foundation : controller.getFoundations()){
            new CardStackView(foundation).write("Palo " + ((Foundation)foundation).getSuit().toString());
        }
        int n = 1;
        for(CardStack tableau : controller.getTableaus()){
            new TableauView(tableau).write("Escalera " + n);
            n++;
        }
        io.writeln("---------------------------");
    }
}
