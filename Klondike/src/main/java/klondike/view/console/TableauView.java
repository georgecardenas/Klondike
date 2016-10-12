package klondike.view.console;

import klondike.models.Card;
import klondike.models.Tableau;
import klondike.utils.IO;

public class TableauView {
    private Tableau tableau;
    
    private IO io;
    
    public TableauView(Tableau tableau){
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
                for(Card card : tableau.peek()){
                    CardView cardview = new CardView(card);
                    cardview.write();
                }
            }
            io.writeln();
        }
    }
}
