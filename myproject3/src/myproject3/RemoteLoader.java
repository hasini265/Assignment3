package myproject3;

public class RemoteLoader {
	
	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();

		Refrigerator refrigerator = new Refrigerator("In Kitchen");
		StandMixer standmixer = new StandMixer();
		OvenLight ovenlight = new OvenLight();
		Oven oven = new Oven();
		Dishwasher dishwasher = new Dishwasher();
 
		RefrigeratorOnCommand refrigeratorOn = new RefrigeratorOnCommand(refrigerator);
		StandMixerOnCommand standmixerOn = new StandMixerOnCommand(standmixer);
		OvenLightOnCommand ovenlightOn = new OvenLightOnCommand(ovenlight);
		OvenHighCommand ovenHigh = new OvenHighCommand(oven);
		OvenMediumCommand ovenMedium = new OvenMediumCommand(oven);
		OvenLowCommand ovenLow = new OvenLowCommand(oven);
		DishwasherOnCommand dishwasherOn = new DishwasherOnCommand(dishwasher);
		RefrigeratorOffCommand refrigeratorOff = new RefrigeratorOffCommand(refrigerator);
		StandMixerOffCommand standmixerOff = new StandMixerOffCommand(standmixer);
		OvenLightOffCommand ovenlightOff = new OvenLightOffCommand(ovenlight);
		OvenOffCommand ovenOff = new OvenOffCommand(oven);
		DishwasherOffCommand dishwasherOff = new DishwasherOffCommand(dishwasher);

		Command[] partyOn = { refrigeratorOn, standmixerOn, ovenlightOn, ovenHigh, ovenMedium, ovenLow, dishwasherOn};
		Command[] partyOff = { refrigeratorOff, standmixerOff, ovenlightOff, ovenOff, dishwasherOff};
  
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(0);
	}

}
