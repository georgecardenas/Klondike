package klondike.utils;

public class Suit {
    
    private Color color;
    
    private Symbol symbol;
    
    public Suit (Symbol symbol, Color color){
        this.symbol = symbol;
        this.color = color;
    }
    
    public Color getColor(){
        return color;
    }
    
    public Symbol getSymbol(){
        return symbol;
    }
}
