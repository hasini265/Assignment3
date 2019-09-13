package myproject3;

public class StandMixerOffCommand implements Command {
	StandMixer standmixer;

	public StandMixerOffCommand(StandMixer standmixer) {
		this.standmixer= standmixer;
	}

	public void execute() {
		standmixer.off();
	}

	public void undo() {
		standmixer.on();
	}

}
