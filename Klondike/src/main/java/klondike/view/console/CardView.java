package klondike.view.console;

import klondike.models.Card;
import klondike.utils.IO;

public class CardView {
    private Card card;
    
    private IO io;
    
    public CardView(Card card){
        this.card = card;
        
        io = new IO();
    }
    
    public void write(){
        io.write("[" + card.getRank().toString() + "," + card.getSuit().toString() + "]");
    }
}
