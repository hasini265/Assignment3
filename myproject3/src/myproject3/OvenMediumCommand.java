package myproject3;

public class OvenMediumCommand implements Command {
	Oven oven;
	int prevSpeed;

	public OvenMediumCommand(Oven oven) {
		this.oven = oven;
	}
	public void execute() {
		prevSpeed = oven.getSpeed();
		oven.medium();
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
