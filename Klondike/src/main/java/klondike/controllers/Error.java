package klondike.controllers;

public enum Error {
	
	EMPTY_TABLEAU("La escalera seleccionada está vacía"),
	EMPTY_FOUNDATION("El palo seleccionado está vacío"),
	EMPTY_DECK("La baraja está vacía"),
	EMPTY_WASTE("No hay cartas seleccionables en el descarte"),
	NOT_EMPTY_DECK("La baraja aún contiene cartas"),
	NOT_ENOUGH_CARDS("No hay suficientes cartas en la escalera"),
	CANT_PUSH_ON_FOUNDATION("No es posible instertar la carta en ningún palo"),
	CANT_PUSH_ON_TABLEAU("No es posible instertar la selección en la escalera seleccionada"),
	CANT_FLIP("La escalera seleccionada tiene cartas visibles");
	
	private String message;
	
	private Error(String message){
		this.message = message;
	}
	
	@Override
	public String toString(){
		return message;
	}
}
