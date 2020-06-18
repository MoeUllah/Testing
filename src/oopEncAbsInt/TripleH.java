package oopEncAbsInt;

public class TripleH extends Wrestler implements SalaryEmployee {
	
	private String name;

	public TripleH(String theme, String special, String name) {
		super(theme, special);
		this.name = name;
	}

	
	

	public String getName() {
		return name;
	}

	public void getSalary(double salary) {
		System.out.println(name + " makes " + salary + " dollars annually.");
		}
		
	}




	
		
	


