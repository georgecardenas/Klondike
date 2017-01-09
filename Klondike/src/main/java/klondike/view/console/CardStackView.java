package klondike.view.console;

import java.util.Stack;

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
            Stack<Card> peek = cardStack.peek();
            for (int i=peek.size()-1; i >= 0; i --){
                CardView cardview = new CardView(peek.get(i));
                cardview.write();
            }
            io.writeln();
        }
    }
}
