package klondike.view.console;

import klondike.utils.IO;

public class VictoryView {  
    private IO io;
    
    public VictoryView(){
        io = new IO();
    }
    
    public void write(){
        io.write("Victoria!!!");
    }
}
