package myproject3;

public class OvenLightOnCommand implements Command {
	
	OvenLight ovenlight;

	public OvenLightOnCommand(OvenLight ovenlight) {
		this.ovenlight = ovenlight;
	}

	public void execute() {
		ovenlight.on();
	}

	public void undo() {
		ovenlight.off();
	}
}
