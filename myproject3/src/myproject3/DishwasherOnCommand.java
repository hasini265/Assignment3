package myproject3;

public class DishwasherOnCommand implements Command {
	
	Dishwasher dishwasher;

	public DishwasherOnCommand(Dishwasher dishwasher) {
		this.dishwasher = dishwasher;
	}
	public void execute() {
		dishwasher.on();
		dishwasher.setTemperature(104);
		dishwasher.start();
	}
	public void undo() {
		dishwasher.off();
	}

}
