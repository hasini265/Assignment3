package myproject3;

public class Oven {
	
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	int speed;
  
	public void high() {
		speed = HIGH;
		System.out.println("Oven temperature is set at high");
	} 

	public void medium() {
		speed = MEDIUM;
		System.out.println("Oven temperature is set at medium");
	}

	public void low() {
		speed = LOW;
		System.out.println("Oven temperature is set at low");
	}
 
	public void off() {
		speed = OFF;
		System.out.println("Oven is turned off");
	}
 
	public int getSpeed() {
		return speed;
	}

}
