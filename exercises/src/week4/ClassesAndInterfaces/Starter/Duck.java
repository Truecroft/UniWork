package week4.ClassesAndInterfaces.Starter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Duck extends Bird implements Insurable {
	public Duck(String name) { super(name); }

	public String getPremium() { return getName() + ": Has no premium"; }

	public String expires() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
		Date date = new Date();

		return getName() + ": " + dateFormat.format(date);


	}
}
