package week4.Casting.Starter;

class Sphere extends Circle {
	
	public double getVolume() {
		return 4 / 3.0 * Math.PI * Math.pow(getRadius(), 3);
	}

	public double getArea() { return (4 * Math.PI * Math.pow(getRadius(), 2)); }

	public void printCharacteristics() {
		super.printCharacteristics();
		System.out.printf("Volume:        %7.2f\n", getVolume());

		if (getClassNameOnly().equals("Sphere")){
			System.out.println();
		}
	}
}
