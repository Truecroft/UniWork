package week4.ClassesAndInterfaces.Starter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] things = { new Penguin("Pingu") ,new Duck("Donald") ,new Fish("Freddie")};

		System.out.println("### These are Consumable ###");

		for (Object thing : things){
			if (thing instanceof Consumable){
				Consumable isConsumable = (Consumable) thing;
				System.out.printf("%s, \t%s\n", isConsumable.describeTaste(), isConsumable.isMainCourseDish());
			}
		}

		System.out.println("\n### These are Insurable ###");

		for (Object thing : things){
			if (thing instanceof Insurable){
				Insurable isInsurable = (Insurable) thing;
				System.out.printf("%s, \t%s\n", isInsurable.getPremium(), isInsurable.expires());
			}
		}

		System.out.println();
	}
}
