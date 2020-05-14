package model;

public class Hybrid extends Car implements GasolineConsumable, BatteryConsumable, Soldable {

	//	attributes

	private String typeCharger;
	private double batteryLifeH;
	private double batteryConsumeH;
	private double tankCapacityH;
	private String typeGasoline;
	private double gasolineConsumeH;

	//	methods

	/**
	 * This method is the constructor of a new hybrid car 
	 * <b><pre>:<br><br>
	 * 
	 * @param basePrice double base price of vehicle
	 * @param brand String about the vehicle brand
	 * @param model integer year of model
	 * @param cylinder double cylinder of vehicle
	 * @param mileage integer of kilometers traveled
	 * @param time String is the vehicle is new or used
	 * @param bodyType String is sedan or van
	 * @param doors integer quantity of doors
	 * @param windows String if the windows are polarized or no
	 * @param typeCar is the number assigned to choose this type of car
	 * @param typeCharger String type of charger
	 * @param batteryLifeH double battery life per kilometer
	 * @param tankCapacityH double capacity of the gas tank
	 * @param typeGasoline String type of gasoline
	 * @return a new hybrid vehicle
	 * <b><post>:<br><br>
	 */
	public Hybrid(double basePrice, String brand, int model, int cylinder, int mileage, String time, String bodyType, int doorsNumber, String windows, int typeCar, String typeCharger, double batteryLifeH, double tankCapacityH, String typeGasoline) {
		super(basePrice, brand, model, cylinder, mileage, time, bodyType, doorsNumber, windows, typeCar);
		this.typeCharger = typeCharger;
		this.batteryLifeH = batteryLifeH;
		this.batteryConsumeH = batteryConsume(typeCharger, batteryLifeH, cylinder);
		this.tankCapacityH = tankCapacityH;
		this.typeGasoline = typeGasoline;
		this.gasolineConsumeH = gasolineConsume(tankCapacityH, cylinder);
		this.sellPrice = calculateSellPriceNew(basePrice);
	}
	/**
	 * This method is the constructor of an used hybrid car 
	 * <b><pre>:<br><br>
	 * 
	 * @param basePrice double base price of vehicle
	 * @param brand String about the vehicle brand
	 * @param model integer year of model
	 * @param cylinder double cylinder of vehicle
	 * @param mileage integer of kilometers traveled
	 * @param time String is the vehicle is new or used
	 * @param plaque String plaque
	 * @param bodyType String is sedan or van
	 * @param doors integer quantity of doors
	 * @param windows String if the windows are polarized or no
	 * @param typeCar is the number assigned to choose this type of car
	 * @param typeCharger String type of charger
	 * @param batteryLifeH double battery life per kilometer
	 * @param tankCapacityH double capacity of the gas tank
	 * @param typeGasoline String type of gasoline
	 * @param priceS double price of soat document
	 * @param priceM double price of mechanical technician document
	 * @param yearS integer year of documents
	 * @param yearM integer year of mechanical technician
	 * @param accidents double price of accidents cover
	 * @param gasLevel double of gas level
	 * @return an used hybrid vehicle
	 * <b><post>:<br><br>
	 */
	public Hybrid(double basePrice, String brand, int model, int cylinder, int mileage, String time, String plaque, String bodyType, int doorsNumber, String windows, int typeCar, String typeCharger, double batteryLifeH, double tankCapacityH, String typeGasoline, double priceS, double priceM, int yearS, int yearM, double accidents, double gasLevel) {
		super(basePrice, brand, model, cylinder, mileage, time, plaque, bodyType, doorsNumber, windows, typeCar, priceS, priceM, yearS, yearM, accidents, gasLevel);
		this.typeCharger = typeCharger;
		this.batteryLifeH = batteryLifeH;
		this.batteryConsumeH = batteryConsume(typeCharger, batteryLifeH, cylinder);
		this.tankCapacityH = tankCapacityH;
		this.typeGasoline = typeGasoline;
		this.gasolineConsumeH = gasolineConsume(tankCapacityH, cylinder);
		this.sellPrice = calculateSellPriceUsed(basePrice);
	}
	public String getTypeCharger() {
		return this.typeCharger;
	}

	public void setTypeCharger(String typeCharger) {
		this.typeCharger = typeCharger;
	}

	public double getBatteryLifeH() {
		return this.batteryLifeH;
	}

	public void setBatteryLifeH(double batteryLifeH) {
		this.batteryLifeH = batteryLifeH;
	}

	public double getBatteryConsumeH() {
		return this.batteryConsumeH;
	}

	public void setBatteryConsumeH(double batteryConsumeH) {
		this.batteryConsumeH = batteryConsumeH;
	}

	public double getTankCapacityH() {
		return this.tankCapacityH;
	}

	public void setTankCapacityH(double tankCapacityH) {
		this.tankCapacityH = tankCapacityH;
	}

	public String getTypeGasoline() {
		return this.typeGasoline;
	}

	public void setTypeGasoline(String typeGasoline) {
		this.typeGasoline = typeGasoline;
	}

	public double getGasolineConsumeH() {
		return this.gasolineConsumeH;
	}

	public void setGasolineConsumeH(double gasolineConsumeH) {
		this.gasolineConsumeH = gasolineConsumeH;
	}
	/**
	 * This method calculate the battery consume depends of the charger type, battery life and cylinder
	 * <b><pre>:<br>A hybrid car must be created as minimum<br>
	 * 
	 * @param chargerType String between FAST or NORMAL
	 * @param batLife double duration of battery 
	 * @param cylinder double cylinder of electric car
	 * @return batteryConsume  
	 * 
	 * <b>post:</b>Battery consume is updated<br>
	 */
	@Override
	public double batteryConsume(String typeCharger, double batteryLife, double cylinder) {
		double batteryConsume = 0;
		if(typeCharger.equalsIgnoreCase("Fast"))
			batteryConsume = batteryLife*(cylinder/100);
		else if(typeCharger.equalsIgnoreCase("Normal"))
			batteryConsume = (batteryLife + 5)*(cylinder/100);
		return batteryConsume;
	}
	/**
	 * This method calculates the sell price of a new hybrid car
	 * <b><pre>:<br>The hybrid car must be create<br>
	 * 
	 * @param basePrice is the base price of the hybrid car
	 * @return sell price calculated
	 * 
	 * <b><post>:<br><br>
	 */
	@Override
	public double calculateSellPriceNew(double basePrice) {
		double mount = basePrice * 0.15;
		double sellPrice = basePrice + mount;
		return sellPrice;
	}
	/**
	 * This method calculates the sell price of an used hybrid car
	 * <b><pre>:<br>The hybrid car must be create<br>
	 * 
	 * @param basePrice is the base price of the hybrid car
	 * @return sell price calculated
	 * 
	 * <b><post>:<br><br>
	 */
	@Override
	public double calculateSellPriceUsed(double basePrice) {
		double mount = basePrice * 0.1;
		double sellPrice = basePrice - mount;
		return sellPrice;
	}
	/**
	 * This method calculate the gasoline consume depend of tank capacity and his cylinder
	 * <b><pre>:<br>A gasoline car must be created as minimum<br>
	 * 
	 * @param tankCapacity double of tank capacity 
	 * @param cylinder double of cylinder
	 * @return gasoline consume already calculated
	 * 
	 * <b><post>:<br><br>
	 */
	@Override
	public double gasolineConsume(double tankCapacityH, double cylinder) {
		double gasolineConsume = tankCapacityH*(cylinder/110);
		return gasolineConsume;
	}
	/**
	 * This method shows the description of hybrid car
	 * <b><pre>:<br>A hybrid car as minimum must be created<br>
	 * 
	 * @return info String returns information
	 * 
	 * <b>post:</b><br>
	 */
	@Override
	public String description() {
		return super.description() + "TypeCharger: " + getTypeCharger() + "\nBattery Life: " + getBatteryLifeH() + "\nBattery Consume: " + getBatteryConsumeH() + "\nTank capacity: " + getTankCapacityH() + "\nType gasoline: " + getTypeGasoline() + "\nGasoline consume: " + getGasolineConsumeH() + "\n";
	}

}