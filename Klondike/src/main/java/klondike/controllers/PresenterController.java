package klondike.controllers;

import java.util.List;

import klondike.models.CardStack;
import klondike.models.Deck;
import klondike.models.Foundation;
import klondike.models.Tableau;

public interface PresenterController {
    public Deck getDeck();
    
    public CardStack getWaste();
    
    public List<Foundation> getFoundations();
    
    public List<Tableau> getTableaus();
}
