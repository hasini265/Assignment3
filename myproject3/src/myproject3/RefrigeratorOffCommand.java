package myproject3;

public class RefrigeratorOffCommand implements Command {
	
	Refrigerator refrigerator;
	
	public RefrigeratorOffCommand(Refrigerator refrigerator) {
		this.refrigerator = refrigerator;
	}

	public void execute() {
		refrigerator.off();
	}

	public void undo() {
		refrigerator.on();
	}

}
