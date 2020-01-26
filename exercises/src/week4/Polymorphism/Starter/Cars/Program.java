package week4.Polymorphism.Starter.Cars;

public class Program {

	public static void main(String[] args) {

		Car[] cars = { 
				new Car("Ford"),
				new Car("Skoda"),
				new RacingCar("Mercedes", "Hamilton", 7),
				new RacingCar("Ferrari", "Alonso", 6)
				};

		processCars(cars);

		System.out.println();

	}

	static void processCars(Car[] cars) {
		for (Car c : cars) {

			c.getToSixty();
			c.accelerate(2);
			System.out.printf("This car is a %s and current speed is %d\n",
					c.getModel(), c.getSpeed());
			if (c instanceof  RacingCar){
				System.out.printf("The Driver is: %s\n", ((RacingCar) c).getDriver());
			}
// Got to Number 11 of polymorphism end of chapter exercises.

		}
	}
}
