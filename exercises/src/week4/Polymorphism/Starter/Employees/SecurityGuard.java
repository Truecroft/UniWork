package week4.Polymorphism.Starter.Employees;

public class SecurityGuard extends SkilledWorker{
    SecurityGuard(String name, String jobTitle) {super(name, jobTitle); }
    private boolean prefersNightWork;
    public String getPrefersNightWork() { return (prefersNightWork) ? "Night" : "Day"; }

    public void setPrefersNightWork(boolean prefersNightWork) {
        this.prefersNightWork = prefersNightWork;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("\t- prefers %s work\n", getPrefersNightWork());
    }
}