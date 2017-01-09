package klondike.view.console;

import java.util.Stack;

import klondike.models.Card;
import klondike.models.CardStack;
import klondike.utils.IO;

public class TableauView {
    private CardStack tableau;
    
    private IO io;
    
    public TableauView(CardStack tableau){
        this.tableau = tableau;
        
        io = new IO();
    }
    
    public void write(String tableauName){
        io.write(tableauName + ": ");
        if (tableau.isEmpty()){
            io.writeln("<vacío>");
        }else{
            for(int i=0; i < tableau.size()- tableau.getPeekSize(); i++){
                io.write("[");
            }
            
            if (tableau.getPeekSize() == 0){
                io.write("X,X]");
            }
            else{
                Stack<Card> peek = tableau.peek();
                for (int i=peek.size()-1; i >= 0; i --){
                    CardView cardview = new CardView(peek.get(i));
                    cardview.write();
                }
            }
            io.writeln();
        }
    }
}
