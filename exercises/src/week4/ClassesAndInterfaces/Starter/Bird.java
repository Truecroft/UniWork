package week4.ClassesAndInterfaces.Starter;

public abstract class Bird implements Consumable {

	private String name;

	public String getName() {
		return name;
	}

	public Bird(String name) {
		this.name = name;
	}

	public String describeTaste() { return getName() + ": Tastes delicate"; }

	public String isMainCourseDish() { return getName() + ": " + true; }


}
