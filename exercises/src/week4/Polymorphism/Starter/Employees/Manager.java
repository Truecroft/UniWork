package week4.Polymorphism.Starter.Employees;


import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<Employee> employees = new ArrayList<>();

    public Manager(String name, String jobTitle) {super(name, jobTitle);}

    public ArrayList<Employee> getEmployees() { return employees; }

    public void addEmployee(Employee employee){ employees.add(employee); }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Manager has the following employees: ");
        for (Employee employee : employees){
            System.out.println("\t" + employee.getName());
        }
    }



}
