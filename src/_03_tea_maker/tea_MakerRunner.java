package _03_tea_maker;

public class tea_MakerRunner {
	public static void main(String[] args) {
		TeaBag tea = new TeaBag("Passion Fruit");
		System.out.println(tea.getFlavor());
		Kettle kettle = new Kettle();
		kettle.boil();
		Cup cup = new Cup();
		cup.makeTea(tea, kettle.getWater());
		
	}
}
