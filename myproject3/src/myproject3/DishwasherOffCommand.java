package myproject3;

public class DishwasherOffCommand implements Command {
	
	Dishwasher dishwasher;

	public DishwasherOffCommand(Dishwasher dishwasher) {
		this.dishwasher = dishwasher;
	}
	
	public void execute() {
		dishwasher.setTemperature(98);
		dishwasher.off();
	}
	
	public void undo() {
		dishwasher.on();
	}

}
