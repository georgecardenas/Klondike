package klondike.controllers;

import java.util.List;

import klondike.models.CardStack;

public interface PresenterController {
    public CardStack getDeck();
    
    public CardStack getWaste();
    
    public List<CardStack> getFoundations();
    
    public List<CardStack> getTableaus();
}
