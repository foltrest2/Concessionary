package model;

public interface BatteryConsumable {

	/**
	 * This method is Overrider by electrics vehicles that calculate theirs own gas performance
	 * <b><pre>:<br><br>
	 * 
	 * @param chargerType String between FAST or NORMAL
	 * @param batteryLife double duration of battery 
	 * @param cylinder double cylinder of electric vehicle
	 * @return batteryConsume double of battery consumption  
	 * 
	 * <b><post>:<br><br>
	 */
	double batteryConsume(String typeCharger, double batteryLife, double cylinder);

}