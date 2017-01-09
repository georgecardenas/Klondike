package klondike.view.console;

import klondike.models.Foundation;
import klondike.utils.LimitedIntDialog;

public class FromFoundationView {
    public int read(){
        return new LimitedIntDialog("De qué palo?", Foundation.MAX_FOUNDATIONS)
        .read();
    }
}
