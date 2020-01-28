package week4.Casting.Starter;

class Sphere extends Circle {
	
	public double getVolume() {
		return 4 / 3 * Math.PI * Math.pow(getRadius(), 3);
	}

	public void printCharacteristics() {
		super.printCharacteristics();
		System.out.printf("Volume:        %7.2f\n", getVolume());
		System.out.println();
	}
}
