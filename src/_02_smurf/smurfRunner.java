package _02_smurf;

public class smurfRunner {
	public static void main(String[] args) {
	Smurf HandySmurf = new Smurf("Handy Smurf");
	HandySmurf.getName();
	HandySmurf.eat();
	Smurf PapaSmurf = new Smurf("PapaSmurf");
	PapaSmurf.getName();
	System.out.println(PapaSmurf.getName());
	PapaSmurf.getHatColor();
	System.out.println(PapaSmurf.getHatColor());
	PapaSmurf.isGirlOrBoy();
	System.out.println(PapaSmurf.isGirlOrBoy());
	Smurf Smurfette = new Smurf("Smurfette");
	Smurfette.getName();
	System.out.println(Smurfette.getName());
	Smurfette.getHatColor();
	System.out.println(Smurfette.getHatColor());
	Smurfette.isGirlOrBoy();
	System.out.println(Smurfette.isGirlOrBoy());
	
	}
}
