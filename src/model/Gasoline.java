package model;

public class Gasoline extends Car implements GasolineConsumable, Soldable {

//	attributes
	
	private double tankCapacity;
	private String typeGasoline;
	private double gasolineConsume;
	
//	methods

	/**
	 * 
	 * @param tankCapacity
	 * @param typeGasoline
	 * @param parameter
	 */
	public Gasoline(double basePrice, String brand, int model, int cylinder, int mileage, String time, String bodyType, int doorsNumber, String windows, int typeCar, double tankCapacity, String typeGasoline) {
		super(basePrice, brand, model, cylinder, mileage, time, bodyType, doorsNumber, windows, typeCar);
		this.tankCapacity = tankCapacity;
		this.typeGasoline = typeGasoline;
		this.gasolineConsume = gasolineConsume(tankCapacity, cylinder);
		this.sellPrice = calculateSellPriceNew(basePrice);
	}

	public Gasoline(double basePrice, String brand, int model, int cylinder, int mileage, String time, String plaque, String bodyType, int doorsNumber, String windows, int typeCar, double tankCapacity, String typeGasoline, double priceS, double priceM, int yearS, int yearM, double accidents, double gasLevel) {
		super(basePrice, brand, model, cylinder, mileage, time, plaque, bodyType, doorsNumber, windows, typeCar, priceS, priceM, yearS, yearM, accidents, gasLevel);
		this.tankCapacity = tankCapacity;
		this.typeGasoline = typeGasoline;
		this.gasolineConsume = gasolineConsume(tankCapacity, cylinder);
		this.sellPrice = calculateSellPriceUsed(basePrice);
	}
	public double getTankCapacity() {
		return this.tankCapacity;
	}

	/**
	 * 
	 * @param tankCapacity
	 */
	public void setTankCapacity(double tankCapacity) {
		this.tankCapacity = tankCapacity;
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

	public double getGasolineConsume() {
		return this.gasolineConsume;
	}

	/**
	 * 
	 * @param gasolineConsume
	 */
	public void setGasolineConsume(double gasolineConsume) {
		this.gasolineConsume = gasolineConsume;
	}

	@Override
	public double gasolineConsume(double tankCapacity, double cylinder) {
		double gasolineConsume = tankCapacity*(cylinder/100);
		return gasolineConsume;
	}
	@Override
	public String description() {
		return super.description() + "Tank capacity: " + getTankCapacity() + "\nType gasoline: " + getTypeGasoline() + "\nGasoline consume: " + getGasolineConsume() + "\n";
	}

	@Override
	public double calculateSellPriceNew(double basePrice) {
		return basePrice;
	}

	@Override
	public double calculateSellPriceUsed(double basePrice) {
		double mount = basePrice*0.1;
		double sellPrice = basePrice - mount;
		return sellPrice;
	}

}