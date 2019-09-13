package myproject3;

public class Refrigerator {
	
	String location;
	int level;

	public Refrigerator(String location) {
		this.location = location;
	}

	public void on() {
		level = 100;
		System.out.println(location + " Refrigerator is on");
	}

	public void off() {
		level = 0;
		System.out.println(location + " Refrigerator is off");
	}

	public void dim(int level) {
		this.level = level;
		if (level == 0) {
			off();
		}
		else {
			System.out.println("Refrigerator mode is changed to " + level + "%");
		}
	}

	public int getLevel() {
		return level;
	}

}
