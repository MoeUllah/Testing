
public class Cow extends Animal implements Herbivore {

	private String name;
	private String color;
	private int age;
	private static final int legs = 4;
	private static final int hooves = 4;

	public Cow(String name) {

		this.name = name;

	}

	public Cow(String color, int age) {
		super("mammal");
		this.color = color;
		this.age = age;
	}

	@Override
	public void eatPlants() {
		System.out.println("A cow is an herbivore.");
	}

	@Override
	public void eat() {
		System.out.println("A cows diet consists of plants.");

	}

	@Override
	public void makeSound() {
		System.out.println("A cow goes \"moo, moo, mooooooooo\"");
	}

	@Override
	public void walk() {
		System.out.println("A cow walks on " + legs + " legs to move" + " with the help of its " + hooves + " hooves.");

	}

	public void graze() {
		System.out.println("The cow grazes the ");
	}

	public String toString() {
		return "A cow is a " + getType() + "." + "The cow is " + color + " color, it's name is " + name + " and is "
				+ age + " years of age.";

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
