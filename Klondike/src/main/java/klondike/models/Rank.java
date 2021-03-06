package klondike.models;

public enum Rank {
    A(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    J(11),
    Q(12),
    K(13);
    
    private int value;

    Rank(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    @Override
    public String toString(){
        switch(value){
        case 1:
            return "A";
        case 11:
            return "J";
        case 12:
            return "Q";
        case 13: 
            return "K";
        default:
            return String.valueOf(value);
        }
    }
}
