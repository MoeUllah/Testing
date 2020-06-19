package oopEncAbsInt;

public class BrockLesnar extends Wrestler implements CommissionEmployee{

	private String name;

	public BrockLesnar(String theme, String special, String name) {
		super(theme, special);
		this.name = name;
	}


	public void getCommission() {
		System.out.println(name + " makes a million dollars per match.");
		
	}


	public String getName() {
		return name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
