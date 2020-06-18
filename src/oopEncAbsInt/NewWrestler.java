package oopEncAbsInt;

public class NewWrestler extends Wrestler implements HourlyEmployee{

	private String name;
	private int hourlyPay;

	public NewWrestler(String theme, String special, String name,int hourlyPay) {
		super(theme, special);
		this.name = name;
		this.hourlyPay=hourlyPay;
	}

	public String getName() {
		return name;
	}

	public void getPayHourly(int x) {
		int pay= x*hourlyPay;
		if(x<40)	
			System.out.println(name + " makes " + hourlyPay + " dollars an hour and this week made " +
			pay + " dollars.");
		else if (x>40) {
			int y;
			y=x-40;
			int overtimeExtra=y*10;
			pay=(x*hourlyPay)+overtimeExtra;
			System.out.println(name + " makes " + hourlyPay + " dollars an hour and an additional 10 dollars"
					+ " an hour for hours worked over 40 and this week made " + pay + " dollars.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
