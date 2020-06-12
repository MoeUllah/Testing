package MultConstructors;

public class BeachHouse implements House{
	
	private String color;
	private int floors;
	private Address address;
	private Owner owner;
	
	
	
	public BeachHouse(String color, int floors, Address address) {
		
		this.color = color;
		this.floors = floors;
		this.address = address;
	}

	public BeachHouse(String color, int floors, Address address, Owner owner) {
		
		this.color = color;
		this.floors = floors;
		this.address = address;
		this.owner = owner;
	}

	@Override
	public void kitchen() {
		System.out.println(owner.getName() +" enters the kitchen and starts preparing food.");
		
		
	}

	@Override
	public void bedroom() {
		System.out.println(owner.getName() +" enters the bedroom and goes to sleep.");
	}

	@Override
	public void livingRoom() {
		System.out.println(owner.getName() + " spends some time with the family in the living room.");
		
	}

	@Override
	public void bathRoom() {
		System.out.println(owner.getName() + " enters the bathroom.");
		
	}

	
	
	public void hasOwner() {
		System.out.println(address.toString());
		if(owner==null) System.out.println("Currently this beachhouse has no owner.");
		else System.out.println("The house is currently owned by an individual named " + owner.getName());
	}
	
	@Override
	public void cook(TimeOfDay time) {
		if(time==TimeOfDay.MORNING) {
			System.out.println("Cook some eggs with some turkey bacon for breakfast.");
		}
		else if(time==TimeOfDay.AFTERNOON) {
			System.out.println("Make some burgers and french fries for lunch");
		}
		else if(time==TimeOfDay.EVENING) {
			System.out.println("Make some steak in the evening.");
		}
		else {
			System.out.println("Made some peanut butter and jelly sandwich for a quick snack.");
		}
			
			
		
	}

	@Override
	public void sleep(TimeOfDay time) {
		if(time==TimeOfDay.MIDNIGHT) {
			System.out.println("Sleeping in the bedroom.");
		}
		else {System.out.println("Just taking a quick nap.");
			 System.out.println("\"zzzzzzz......\"");
		}
		
	}

	@Override
	public void doRecreationalActivity(TimeOfDay time, Days certainDay) {
		if(time==TimeOfDay.EVENING && (certainDay==Days.SATURDAY || certainDay==Days.SUNDAY)){
			if(certainDay==Days.SATURDAY)
			System.out.println("The whole family plays a game of charades.");
			else if (certainDay==Days.SUNDAY)
			System.out.println("The whole family watches sunday night football.");
		}
		
		
		
		
		
	}

	@Override
	public void maintainHygiene(TimeOfDay time) {
		if(time==TimeOfDay.MORNING) {
			brushTeeth();
			relieveYourself();
			takeShower();
		}
		
		else if(time==TimeOfDay.MIDNIGHT){
			System.out.println("It's midnight.");
			bathRoom();
			brushTeeth();
		
			
		}
	}
		
	

	@Override
	public void brushTeeth() {
		System.out.println("Brushes teeth in the bathroom.");
		System.out.println("\"BRUSH, BUSH, RINSE, BRUSH, RINSE....\"");
	}

	@Override
	public void takeShower() {
		System.out.println("Takes shower in the bathroom.");
		
	}

	@Override
	public void relieveYourself() {
		System.out.println("Handling business in the bathroom.");
		System.out.println("FLUSH");
		
	}

	
}
