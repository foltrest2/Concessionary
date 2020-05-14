package model;

public class Electric extends Car implements BatteryConsumable, Soldable {

//	attributes
	
	private String typeCharger;
	private double batteryLife;
	private double batteryConsume;

//	methods
	
	/**
	 * 
	 * @param typeCharger
	 * @param batteryLife
	 * @param batteryConsume
	 */
	public Electric(double basePrice, String brand, int model, int cylinder, int mileage, String time,String bodyType, int doorsNumber, String windows, int typeCar, String typeCharger, double batteryLife) {
		super(basePrice, brand, model, cylinder, mileage, time, bodyType, doorsNumber, windows, typeCar);
		this.typeCharger = typeCharger;
		this.batteryLife = batteryLife;
		this.batteryConsume = batteryConsume(typeCharger, batteryLife, cylinder);
		this.sellPrice = calculateSellPriceNew(basePrice);
	}

	public Electric(double basePrice, String brand, int model, int cylinder, int mileage, String time, String plaque, String bodyType, int doorsNumber, String windows, int typeCar, String typeCharger, double batteryLife, double priceS, double priceM, int yearS, int yearM, double accidents, double gasLevel) {
		super(basePrice, brand, model, cylinder, mileage, time, plaque, bodyType, doorsNumber, windows, typeCar, priceS, priceM, yearS, yearM, accidents, gasLevel);
		this.typeCharger = typeCharger;
		this.batteryLife = batteryLife;
		this.batteryConsume = batteryConsume(typeCharger, batteryLife, cylinder);
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

	public double getBatteryLife() {
		return this.batteryLife;
	}

	/**
	 * 
	 * @param batteryLife
	 */
	public void setBatteryLife(double batteryLife) {
		this.batteryLife = batteryLife;
	}

	public double getBatteryConsume() {
		return this.batteryConsume;
	}

	/**
	 * 
	 * @param batteryConsume
	 */
	public void setBatteryConsume(double batteryConsume) {
		this.batteryConsume = batteryConsume;
	}

	@Override
	public double batteryConsume(String typeCharger, double batteryLife, double cylinder) {
		double batteryConsume = 0;
		if(typeCharger.equalsIgnoreCase("Fast"))
			batteryConsume = (batteryLife + 10)*(cylinder/100);
		else if(typeCharger.equalsIgnoreCase("Normal"))
			batteryConsume = (batteryLife + 15)*(cylinder/100);
		return batteryConsume;
	}
	@Override
	public String description() {
		return super.description() + "TypeCharger: " + getTypeCharger() + "\nBattery Life: " + getBatteryLife() + "\nBattery Consume: " + getBatteryConsume() + "\n";
	}

	@Override
	public double calculateSellPriceNew(double basePrice) {
		double mount = basePrice*0.2;
		double sellPrice = basePrice + mount;
		return sellPrice;
	}

	@Override
	public double calculateSellPriceUsed(double basePrice) {
		double mount = basePrice*0.1;
		double sellPrice = basePrice - mount;
		return sellPrice;
	}
}