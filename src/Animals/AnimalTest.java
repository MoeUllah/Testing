package Animals;

public class AnimalTest {

	public static void main(String[] args) {
		Cow aCow = new Cow("black", 15);
		System.out.println(aCow.toString());
		aCow.eatPlants();
		aCow.eat();
		aCow.walk();
		aCow.makeSound();
		aCow.setName("Macy");
	
		System.out.println();
		Spider aspider = new Spider("Spidy", "brown and black", 18);
		aspider.toString();
		aspider.eatAnimals();
		aspider.hunt();
		aspider.walk();
		aspider.eat();
		aspider.makeSound();
	}

}
