package _04_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		new Backpack().packAndCheck();
		Pencil pencil = new Pencil();
		Ruler ruler = new Ruler();
		Textbook textbook = new Textbook();
		Backpack backpack = new Backpack();
		backpack.putInBackpack(pencil);
		pencil.write("once upon a time...");
		backpack.putInBackpack(ruler);
		ruler.measure();
		backpack.putInBackpack(textbook);
		textbook.read();
	}
}
