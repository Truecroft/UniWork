package week4.Polymorphism.Starter.Cars;

public class RacingCar extends Car {
    private String driver ;
    public String getDriver() {
		return driver;
	}
	private void setDriver(String driver) {
		this.driver = driver;
	}
	
	private int turboFactor ;

	@Override
	public void accelerate(int seconds) {
		int increase = 5 * seconds * turboFactor;
		setSpeed(getSpeed() + increase);
	}

	@Override
	public String getModel() {
		return "Formula 1 " + super.getModel();
	}

	public int getTurboFactor() {
		return turboFactor;
	}
	private void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}
	
   
	public RacingCar(String model, String driver, int turboFactor)
    {
		super(model);
        setDriver(driver);
        setTurboFactor(turboFactor);
    }
	
}
