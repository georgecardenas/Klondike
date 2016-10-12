package klondike.view.console;

import klondike.models.Deck;
import klondike.utils.IO;

public class DeckView {
    private Deck deck;
    
    private IO io;
    
    public DeckView(Deck deck){
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
