package klondike.models;

import java.util.Collections;

public class Deck extends CardStack{
    
    public Deck(){
        super();
        initializeDeck();
    }

    private void initializeDeck() {
        for (Symbol symbol : Symbol.values()){
            for (Rank rank : Rank.values()){
                super.push(new Card(rank, symbol));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }
}
