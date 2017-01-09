package klondike.view.console;

import klondike.utils.IO;
import klondike.controllers.Error;

public class ErrorView {  
    private IO io;
    Error error;
    
    public ErrorView(Error error){
        io = new IO();
        this.error = error;
    }
    
    public void write(){
        io.writeln("ERROR: " + error.toString());
    }
}
