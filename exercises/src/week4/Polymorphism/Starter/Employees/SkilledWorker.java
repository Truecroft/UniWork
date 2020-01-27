package week4.Polymorphism.Starter.Employees;

import java.util.ArrayList;

public class SkilledWorker extends Employee {
    private ArrayList<String> skills = new ArrayList<>();

    public SkilledWorker(String name, String jobTitle) {
        super(name, jobTitle);
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkill(String skill) {
        skills.add(skill);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Employee has the following skills: ");
        for (String skill : skills){
            System.out.println("\t" + skill);
        }
    }
}
