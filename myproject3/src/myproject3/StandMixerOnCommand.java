package myproject3;

public class StandMixerOnCommand implements Command {
	StandMixer standmixer;

	public StandMixerOnCommand(StandMixer standmixer) {
		this.standmixer= standmixer;
	}

	public void execute() {
		standmixer.on();
		standmixer.setInputChannel();
	}

	public void undo() {
		standmixer.off();
	}

}
