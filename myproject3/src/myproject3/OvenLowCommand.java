package myproject3;

public class OvenLowCommand implements Command{
	
	Oven oven;
	int prevSpeed;

	public OvenLowCommand(Oven oven) {
		this.oven = oven;
	}
	public void execute() {
		prevSpeed = oven.getSpeed();
		oven.low();
	}
	public void undo() {
		switch (prevSpeed) {
			case Oven.HIGH:   oven.high(); break;
			case Oven.MEDIUM: oven.medium(); break;
			case Oven.LOW: 	  oven.low(); break;
			default: 		  oven.off(); break;
		}
	}

}
