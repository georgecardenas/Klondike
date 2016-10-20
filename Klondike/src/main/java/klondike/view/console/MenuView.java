package klondike.view.console;

import klondike.controllers.MenuController;
import klondike.utils.IO;
import klondike.utils.LimitedIntDialog;

public class MenuView {
    
    private IO io;
    
    public static int MAX_OPTIONS = 9;
    
    public MenuView(){
        io = new IO();
    }
    
    public void write(){
        io.writeln("1. Mover de baraja a descarte");
        io.writeln("2. Mover de descarte a baraja");
        io.writeln("3. Mover de descarte a palo");
        io.writeln("4. Mover de descarte a escalera");
        io.writeln("5. Mover de escalera a palo");
        io.writeln("6. Mover de escalera a escalera");
        io.writeln("7. Mover de palo a escalera");
        io.writeln("8. Voltear en escalera");
        io.writeln("9. Salir");
    }
    
    public void read(){
        new LimitedIntDialog("Opción?", MAX_OPTIONS)
        .read();
    }
    
    void interact(MenuController menuController){
        write();
        read();
        menuController.end();
    }
}
