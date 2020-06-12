
public abstract class Animal {
	private String type;
	private static final String cellComposition = "multicellular";

	public Animal() {
	}

	public Animal(String type) {

		this.setType(type);

	}

	public abstract void eat();

	public abstract void makeSound();

	public abstract void walk();

	public static String getCellcomposition() {
		return cellComposition;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
