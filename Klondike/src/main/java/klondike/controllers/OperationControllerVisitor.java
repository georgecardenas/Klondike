package klondike.controllers;

public interface OperationControllerVisitor {

	void visit(GameController gameController);
	
	void visit(MenuController colocateController);
	
	//void visit(FlipController continueController);

}

