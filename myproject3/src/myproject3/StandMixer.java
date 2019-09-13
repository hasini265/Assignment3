package myproject3;

public class StandMixer {
	
	int speed;

	public void on() {
		System.out.println("StandMixer is on");
	}

	public void off() {
		System.out.println("StandMixer is off");
	}

	public void setInputChannel() {
		this.speed = 3;
		System.out.println("StandMixer speed is set to HIGH");
	}

}
