package week4.Polymorphism.Starter.Employees;

public class Employee {
	private String name;
	private String jobTitle;	
	private int id;

	public String getName() { return name; }
	public String getJobTitle() { return jobTitle; }
	public int getId() { return id; }

	public void setName(String name) { this.name = name; }
	public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }
	public void setId(int id) { this.id = id; }

	public Employee(String name, String jobTitle ) {
		generateId();
		setName(name);
		setJobTitle(jobTitle);

	}
	
	protected static int idCount;
	public void generateId() { setId(++Employee.idCount * 10); }
	
	public void showInfo() {
		System.out.println("\n**** *****");
		
		System.out.printf("Name: %s\n", getName());
        System.out.printf("Job Title: %s\n", getJobTitle());
        System.out.printf("Employee ID: %d\n", getId());
	}
}
