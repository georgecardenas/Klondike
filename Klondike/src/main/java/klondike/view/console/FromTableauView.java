package klondike.view.console;

import klondike.models.Tableau;
import klondike.utils.LimitedIntDialog;

public class FromTableauView {
    public int read(){
        return new LimitedIntDialog("De qué escalera?", Tableau.MAX_TABLEAUS)
        .read();
    }
}
