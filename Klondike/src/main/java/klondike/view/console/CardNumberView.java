package klondike.view.console;

import klondike.utils.IntDialog;

public class CardNumberView {
    
    public int read(){
        return new IntDialog("Cuántas cartas?:")
        .read();
    }
}
