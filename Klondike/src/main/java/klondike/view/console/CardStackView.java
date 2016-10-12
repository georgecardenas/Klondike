package klondike.view.console;

import klondike.models.Card;
import klondike.models.CardStack;
import klondike.utils.IO;

public class CardStackView {
    private CardStack cardStack;
    
    private IO io;
    
    public CardStackView(CardStack cardStack){
        this.cardStack = cardStack;
        
        io = new IO();
    }
    
    public void write(String cardStackName){
        io.write(cardStackName + ": ");
        if (cardStack.isEmpty()){
            io.writeln("<vacío>");
        }else{
            for(Card card : cardStack.peek()){
                CardView cardview = new CardView(card);
                cardview.write();
            }
            io.writeln();
        }
    }
}
