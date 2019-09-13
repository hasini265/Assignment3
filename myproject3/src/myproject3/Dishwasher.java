package myproject3;

public class Dishwasher {
	
	boolean on;
	int temperature;

	public Dishwasher() {
	}

	public void on() {
		on = true;
	}

	public void off() {
		on = false;
	}

	public void start() {
		if (on) {
			System.out.println("Dishwasher is kept on Hi Temp!");
		}
	}

	public void watersaverOn() {
		if (on) {
			System.out.println("Dishwasher water saver is on");
		}
	}

	public void watersaverOff() {
		if (on) {
			System.out.println("Dishwasher water saver is off");
		}
	}

	public void setTemperature(int temperature) {
		if (temperature > this.temperature) {
			System.out.println("Dishwasher is heating to a temperature of " + temperature + " degrees");
		}
		else {
			System.out.println("Dishwasher is cooling to " + temperature + " degrees");
		}
		this.temperature = temperature;
	}

}
