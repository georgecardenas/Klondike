package klondike.view.console;

import klondike.utils.IO;

public class ExitView {  
    private IO io;
    
    public ExitView(){
        io = new IO();
    }
    
    public void write(){
        io.write("Adios!!!");
    }
}
