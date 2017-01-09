package klondike.models;

public class Suit {
    
    private Color color;
    
    private Symbol symbol;
    
    public Suit (Symbol symbol, Color color){
        this.symbol = symbol;
        this.color = color;
    }
    
    public Suit (Symbol symbol){
        this.symbol = symbol;
        if (symbol.equals(Symbol.HEARTS) || symbol.equals(Symbol.DIAMONDS)){
            this.color = Color.RED;
        } else {
            this.color = Color.BLACK;
        }
    }
    
    public Color getColor(){
        return color;
    }
    
    public Symbol getSymbol(){
        return symbol;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Suit other = (Suit) obj;
        if (color != other.color)
            return false;
        if (symbol != other.symbol)
            return false;
        return true;
    }
    
    @Override
    public String toString(){
        return this.symbol.toString();
    }
}
