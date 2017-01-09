package klondike.controllers;

public interface OperationControllerVisitor {

	void visit(GameController gameController);
	
	void visit(MenuController menuController);
}

