package Animals;
public class Spider extends Animal implements Carniverous {
	private String name;
	private String color;
	private int age;
	private static final int legs = 8;

	public Spider(String color) {
		super("Insect");
		this.color = color;
	}

	public Spider(String name, String color, int age) {
		super("Insect");
		this.name = name;
		this.color = color;
		this.age = age;
	}

	@Override
	public void eatAnimals() {
		System.out.println("A spider has a carniverous diet, it loves" + " to feast on " + getType());
	}

	@Override
	public void hunt() {
		System.out.println("The spider walks on its " + legs + " legs in search of its prey.");

	}

	@Override
	public void eat() {
		System.out.println(
				"The spider vomits digestive fluid on its prey" + " and it munches on its prey with its mighty jaws");

	}

	@Override
	public void makeSound() {
		System.out.println("The spider silently munches on its prey without making a noise");

	}

	@Override
	public void walk() {
		System.out.println("The spider starts crawling with its " + legs + " legs");

	}

	@Override
	public String toString() {
		return "The name of the spider is " + name + ", has a " + color + " hue and is of" + age + " years of age.";
	}

}
