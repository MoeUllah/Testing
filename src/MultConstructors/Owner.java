package MultConstructors;

public class Owner {
	private String name;
	private int yearsOwned;
	
	public Owner(String name) {
		
		this.setName(name);
		
	}

	public Owner(String name, int yearsOwned) {
		
		this.setName(name);
		this.yearsOwned = yearsOwned;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat(TimeOfDay time) {
		if(time==TimeOfDay.MORNING) {
			System.out.println("Eating breakfast.");
			System.out.println("\"CHEW, CHEW, YUM, YUM, CHEW....\"");
		}
		else if(time==TimeOfDay.AFTERNOON) {
			System.out.println("Munching on some lunch.");
			System.out.println("\"MUNCH, MUNCH, MUNCH...., Delicious.");
		}
		else if(time==TimeOfDay.EVENING) {
			System.out.println("Feasting on some dinner.");
			System.out.println("\"CHEW, CHEW, SIP, SIP, CHEW....\"");
		}
		else {
			System.out.println("Enjoying a little snack");
			System.out.println("\"CRUNCH, CRUNCH, CRUNCH....\"");
		}
			
	}
	
	

}
