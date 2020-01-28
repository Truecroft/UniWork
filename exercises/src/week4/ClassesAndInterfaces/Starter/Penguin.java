package week4.ClassesAndInterfaces.Starter;

public class Penguin extends Bird {

	public Penguin(String name) { super(name); }

	public String describeTaste() { return getName() + ": Chocolaty"; }
	public String isMainCourseDish() { return getName() + ": " + false; }
}
