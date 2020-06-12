package MultConstructors;

public class TestBeachHouse {

	public static void main(String[] args) {
		Address ad1= new Address("America","Florida","McKinley Street");
		BeachHouse bh1= new BeachHouse("blue", 3, ad1);
		
		Address ad2=new Address("America","California","Adams Street");
		Owner owner=  new Owner("Max", 5);
		BeachHouse bh2= new BeachHouse("red", 4, ad2, owner); 
		
		bh1.hasOwner();
		System.out.println();
		
		bh2.hasOwner();
		System.out.println();
		
		bh2.bathRoom();
		bh2.maintainHygiene(TimeOfDay.MORNING);
		
		bh2.kitchen();
		bh2.cook(TimeOfDay.MORNING);
		owner.eat(TimeOfDay.MORNING);
		
		bh2.kitchen();
		bh2.cook(TimeOfDay.AFTERNOON);
		owner.eat(TimeOfDay.AFTERNOON);
		
		bh2.sleep(TimeOfDay.AFTERNOON);
		
		bh2.kitchen();
		bh2.cook(TimeOfDay.ANYTIME);
		owner.eat(TimeOfDay.ANYTIME);
		
		bh2.livingRoom();
		bh2.doRecreationalActivity(TimeOfDay.EVENING, Days.SUNDAY);
		
		bh2.kitchen();
		bh2.cook(TimeOfDay.EVENING);
		owner.eat(TimeOfDay.EVENING);
		
		bh2.bathRoom();
		bh2.maintainHygiene(TimeOfDay.MIDNIGHT);
		
		bh2.bedroom();
		bh2.sleep(TimeOfDay.MIDNIGHT);
	}

}
