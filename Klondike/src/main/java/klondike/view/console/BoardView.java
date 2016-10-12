package klondike.view.console;

import klondike.controllers.PresenterController;
import klondike.controllers.StartController;
import klondike.models.Foundation;
import klondike.models.Tableau;
import klondike.utils.IO;

public class BoardView {
    private PresenterController controller;

    BoardView(StartController controller) {
        assert controller != null;
        this.controller = controller;
    }

    void write() {
        IO io = new IO();
        io.writeln("===========================");
        new DeckView(controller.getDeck()).write();
        new CardStackView(controller.getWaste()).write("Descarte");
        for(Foundation foundation : controller.getFoundations()){
            new CardStackView(foundation).write("Palo " + foundation.getSuit().toString());
        }
        int n = 1;
        for(Tableau tableau : controller.getTableaus()){
            new TableauView(tableau).write("Escalera " + n);
            n++;
        }
        io.writeln("---------------------------");
    }
}
