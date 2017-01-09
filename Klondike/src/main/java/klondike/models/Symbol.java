package klondike.models;

public enum Symbol {
    CLUBS('c'),
    DIAMONDS('d'),
    HEARTS('h'),
    SPADES('s');
    
    private char value;

    Symbol(char value) {
        this.value = value;
    }
    
    @Override
    public String toString(){
        return String.valueOf(value);
    }
}
