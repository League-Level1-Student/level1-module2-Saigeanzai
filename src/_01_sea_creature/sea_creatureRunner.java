package _01_sea_creature;

public class sea_creatureRunner {
	public static void main(String[] args) {
		SeaCreature Spongebob = new SeaCreature("Spongebob");
		Spongebob.getName();
		Spongebob.eat();
		Spongebob.laugh();
		SeaCreature Patrick = new SeaCreature("Patrick");
		Patrick.getName();
		Patrick.eat();
		Patrick.laugh();
		SeaCreature Squidward = new SeaCreature("Squidward");
		Squidward.getName();
		Squidward.eat();
		Squidward.laugh();
	}
}
