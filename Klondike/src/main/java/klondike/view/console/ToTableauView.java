package klondike.view.console;

import klondike.models.Tableau;
import klondike.utils.LimitedIntDialog;

public class ToTableauView {
    
    public int read(){
        return new LimitedIntDialog("A qué escalera?", Tableau.MAX_TABLEAUS)
        .read();
    }
}
