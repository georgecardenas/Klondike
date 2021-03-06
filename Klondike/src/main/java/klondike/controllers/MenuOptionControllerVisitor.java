package klondike.controllers;

public interface MenuOptionControllerVisitor {
    void visit(MoveDeckToWasteController moveDeckToWasteController);
    void visit(MoveWasteToDeckController moveWasteToDeckController);
    void visit(MoveWasteToFoundationController moveWasteToFoundationController);
    void visit(MoveWasteToTableauController moveWasteToTableauController);
    void visit(MoveTableauToFoundationController moveTableauToFoundationController);
    void visit(MoveTableauToTableauController moveTableauToTableauController);
    void visit(MoveFoundationToTableauController moveFoundationToTableauController);
    void visit(FlipController flipController);
    void visit(ExitController exitController);
}
