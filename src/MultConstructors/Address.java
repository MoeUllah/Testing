package MultConstructors;

public class Address {

	private String country;
	private String state;
	private String street;
	private String apt;
	
	
	
	public Address(String country, String state, String street) {
		super();
		this.country = country;
		this.state = state;
		this.street = street;
	}



	public Address(String country, String state, String street, String apt) {
		super();
		this.country = country;
		this.state = state;
		this.street = street;
		this.apt = apt;
	}
	
	public String toString() {
		String description="This house is located in " + country + " in the state of "
		+ state + " on " + street;
		return description;
		
	}
	
	
	
	
}
