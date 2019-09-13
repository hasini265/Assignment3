package myproject3;

public class OvenLightOffCommand implements Command {
	
	OvenLight ovenlight;

	public OvenLightOffCommand(OvenLight ovenlight) {
		this.ovenlight = ovenlight;
	}

	public void execute() {
		ovenlight.off();
	}

	public void undo() {
		ovenlight.on();
	}
}
