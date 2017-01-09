package klondike.view.console;

import klondike.models.CardStack;
import klondike.utils.IO;

public class DeckView {
    private CardStack deck;
    
    private IO io;
    
    public DeckView(CardStack deck){
        this.deck = deck;
        
        io = new IO();
    }
    
    public void write(){
        io.write("Baraja: ");
        if (deck.isEmpty()){
            io.writeln("<vacío>");
        }else{
            io.writeln("[X,X]");
        }
    }
}
