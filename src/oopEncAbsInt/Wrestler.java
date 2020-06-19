package oopEncAbsInt;

public abstract class Wrestler implements Fighter {

	
	private String theme;
	private String special;
	private int yearsWorked;
	
	public Wrestler(String theme, String special) {
		this(theme, special, 0);
		
		this.theme = theme;
		this.special = special;
	}

	public Wrestler(String theme, String special, int yearsWorked) {
		
		
		this.theme = theme;
		this.special = special;
		this.yearsWorked = yearsWorked;
	}
	
	private int pinOpponent() {
		int x= (int) (Math.random()*3)+1;
		if(x==1)
			return 1;
		else if(x==2)
			return 2;
		else return 3;
	}
	
	public void outcome() {
		int x=pinOpponent();
		if(x==1)
			System.out.println("\"ONE...\" the opponent kicks out after one pin");
		else if(x==2)
			System.out.println("\"ONE...TWO...\" the opponent kicks out after two pins");
		else if(x==3) 
			System.out.println("\"ONE...TWO...THREE...DING...DING...DING\" we have a winner.");
		
	}
	
	public void block() {
		System.out.println("Blocks the next attack");
	}

	public void punch(int x) {
		if(x==1)
			System.out.println("One punch thrown.");
		else if(x==0)
			block();
		else
			System.out.println(x + " punches thrown.");
		
	}

	public void kick(int x) {
		
		if(x==1)
			System.out.println("One kick thrown.");
		else if(x==0)
			block();
		else
			System.out.println(x + " kicks thrown.");
	}

	public void surrender() {
		System.out.println("Taps out.");
		
	}
	public void special() {
		System.out.println("\"OOOOOO...NOOOOOOOOO...HERE COMES THE\" " + special + ".");
	}
	public void music() {
		System.out.println("Theme music playing in background: " + theme + ".");
	}
	
}
