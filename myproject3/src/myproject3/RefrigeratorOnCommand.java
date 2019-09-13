package myproject3;

public class RefrigeratorOnCommand implements Command {
	
	Refrigerator refrigerator;
	
	public RefrigeratorOnCommand(Refrigerator refrigerator) {
		this.refrigerator = refrigerator;
	}

	public void execute() {
		refrigerator.on();
	}

	public void undo() {
		refrigerator.off();
	}
	

}
