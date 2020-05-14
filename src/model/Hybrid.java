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
	 * 
	 * @param typeCharger
	 * @param batteryLifeH
	 * @param batteryConsumeH
	 * @param tankCapacity
	 * @param typeGasoline
	 * @param gasolineConsumeH
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

	/**
	 * 
	 * @param typeCharger
	 */
	public void setTypeCharger(String typeCharger) {
		this.typeCharger = typeCharger;
	}

	public double getBatteryLifeH() {
		return this.batteryLifeH;
	}

	/**
	 * 
	 * @param batteryLifeH
	 */
	public void setBatteryLifeH(double batteryLifeH) {
		this.batteryLifeH = batteryLifeH;
	}

	public double getBatteryConsumeH() {
		return this.batteryConsumeH;
	}

	/**
	 * 
	 * @param batteryConsumeH
	 */
	public void setBatteryConsumeH(double batteryConsumeH) {
		this.batteryConsumeH = batteryConsumeH;
	}

	public double getTankCapacityH() {
		return this.tankCapacityH;
	}

	/**
	 * 
	 * @param tankCapacityH
	 */
	public void setTankCapacityH(double tankCapacityH) {
		this.tankCapacityH = tankCapacityH;
	}

	public String getTypeGasoline() {
		return this.typeGasoline;
	}

	/**
	 * 
	 * @param typeGasoline
	 */
	public void setTypeGasoline(String typeGasoline) {
		this.typeGasoline = typeGasoline;
	}

	public double getGasolineConsumeH() {
		return this.gasolineConsumeH;
	}

	/**
	 * 
	 * @param gasolineConsumeH
	 */
	public void setGasolineConsumeH(double gasolineConsumeH) {
		this.gasolineConsumeH = gasolineConsumeH;
	}

	@Override
	public double batteryConsume(String typeCharger, double batteryLife, double cylinder) {
		double batteryConsume = 0;
		if(typeCharger.equalsIgnoreCase("Fast"))
			batteryConsume = batteryLife*(cylinder/100);
		else if(typeCharger.equalsIgnoreCase("Normal"))
			batteryConsume = (batteryLife + 5)*(cylinder/100);
		return batteryConsume;
	}
	
	@Override
	public double calculateSellPriceNew(double basePrice) {
		double mount = basePrice * 0.15;
		double sellPrice = basePrice + mount;
		return sellPrice;
	}

	@Override
	public double calculateSellPriceUsed(double basePrice) {
		double mount = basePrice * 0.1;
		double sellPrice = basePrice - mount;
		return sellPrice;
	}

	@Override
	public double gasolineConsume(double tankCapacityH, double cylinder) {
		double gasolineConsume = tankCapacityH*(cylinder/110);
		return gasolineConsume;
	}
	@Override
	public String description() {
		return super.description() + "TypeCharger: " + getTypeCharger() + "\nBattery Life: " + getBatteryLifeH() + "\nBattery Consume: " + getBatteryConsumeH() + "\nTank capacity: " + getTankCapacityH() + "\nType gasoline: " + getTypeGasoline() + "\nGasoline consume: " + getGasolineConsumeH() + "\n";
	}

}