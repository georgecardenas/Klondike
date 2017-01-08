package klondike.utils;

public class IntDialog {

	private String title;
	private int min;
	
	public IntDialog(String title, int min){
		assert title != null;
		this.min = min;
		this.title = title;
	}
	
	public IntDialog(String title){
		this(title, 1);
	}
	
	public int read(){
		IO io = new IO();
		int value;
		boolean ok;
		do {
			value = io.readInt(title);
			ok = value >= min;
			if (!ok) {
				io.writeln("Valor incorrecto");
			}
		} while (!ok);
		return value;
	}
}
