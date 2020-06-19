package oopEncAbsInt;

public class WrestlerTest {

	public static void main(String[] args) {
		TripleH tripleH= new TripleH("THE GAME", "PEDIGREE", "TripleH");
		BrockLesnar brockLesnar=new BrockLesnar("NEXT BIG THING", "F5", "Brock Lesnar");
		NewWrestler luchadores=new NewWrestler("ITS SHOWTIME", "FIVE FIST OF FURY", "El Luchadores",50);
		
		System.out.print(tripleH.getName() + " ");
		tripleH.punch(4);
		tripleH.kick(3);
		System.out.print(brockLesnar.getName()+ " ");
		brockLesnar.block();
		System.out.print(brockLesnar.getName()+ " ");
		brockLesnar.punch(5);
		brockLesnar.special();
		brockLesnar.outcome();
		System.out.print(tripleH.getName() + " ");
		tripleH.kick(4);
		System.out.print(brockLesnar.getName()+ " ");
		brockLesnar.punch(1);
		System.out.print(tripleH.getName() + " ");
		tripleH.block();
		tripleH.special();
		tripleH.outcome();
		tripleH.getSalary(300000.00);
		brockLesnar.getCommission();
		luchadores.getPayHourly(50);

	}

}