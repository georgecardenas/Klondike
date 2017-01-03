package klondike.controllers;

public interface MenuOptionControllerVisitor {
    void visit(MoveDeckToWasteController moveDeckToWasteController);
    void visit(MoveWasteToDeckController moveWasteToDeckController);
    void visit(FlipController flipController);
}
