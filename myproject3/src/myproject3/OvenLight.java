package myproject3;

public class OvenLight {
	
	int level;

	public void on() {
		level = 100;
		System.out.println("Oven Light is on");
	}

	public void off() {
		level = 0;
		System.out.println("Oven Light is off");
	}

	public void dim(int level) {
		this.level = level;
		if (level == 0) {
			off();
		}
		else {
			System.out.println("Light is dimmed to " + level + "%");
		}
	}

	public int getLevel() {
		return level;
	}

}
