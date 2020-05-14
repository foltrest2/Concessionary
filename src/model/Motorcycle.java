package model;

public class Motorcycle extends Vehicle implements GasolineConsumable, Soldable{

//	attributes
	
	private String typeMotorcycle;
	private double capacityGasoline;
	private double consumeGasolineM;

//	methods
	/**
	 * 
	 * @param typeMotorcycle
	 * @param capacityGasoline
	 * @param consumeGasolineM
	 */
	public Motorcycle(double basePrice, String brand, int model, int cylinder, int mileage, String time, String typeMotorcycle, double capacityGasoline) {
		super(basePrice, brand, model, cylinder, mileage, time);
		this.typeMotorcycle = typeMotorcycle;
		this.capacityGasoline = capacityGasoline;
		this.consumeGasolineM = gasolineConsume(capacityGasoline, cylinder);
		this.sellPrice = calculateSellPriceNew(basePrice);
	}

	public Motorcycle(double basePrice, String brand, int model, int cylinder, int mileage, String time, String plaque, String typeMotorcycle, double capacityGasoline, double priceS, double priceM, int yearS, int yearM, double accidents, double gasLevel) {
		super(basePrice, brand, model, cylinder, mileage, time, plaque, priceS, priceM, yearS, yearM, accidents, gasLevel);
		this.typeMotorcycle = typeMotorcycle;
		this.capacityGasoline = capacityGasoline;
		this.consumeGasolineM = gasolineConsume(capacityGasoline, cylinder);
		this.sellPrice = calculateSellPriceUsed(basePrice);
	}
	
	public String getTypeMotorcycle() {
		return this.typeMotorcycle;
	}

	/**
	 * 
	 * @param typeMotorcycle
	 */
	public void setTypeMotorcycle(String typeMotorcycle) {
		this.typeMotorcycle = typeMotorcycle;
	}

	public double getCapacityGasoline() {
		return this.capacityGasoline;
	}

	/**
	 * 
	 * @param capacityGasoline
	 */
	public void setCapacityGasoline(double capacityGasoline) {
		this.capacityGasoline = capacityGasoline;
	}

	public double getConsumeGasolineM() {
		return this.consumeGasolineM;
	}

	/**
	 * 
	 * @param consumeGasolineM
	 */
	public void setConsumeGasolineM(double consumeGasolineM) {
		this.consumeGasolineM = consumeGasolineM;
	}

	@Override
	public double gasolineConsume(double capacityGasoline, double cylinder) {
		double gasolineConsume = capacityGasoline*(cylinder/90);
		return gasolineConsume;
	}

	@Override
	public double calculateSellPriceNew(double basePrice) {
		double mount = basePrice*0.04;
		double sellPrice = basePrice + mount;
		return sellPrice;
	}

	@Override
	public double calculateSellPriceUsed(double basePrice) {
		double mount = basePrice*0.02;
		double sellPrice = basePrice - mount;
		return sellPrice;
	}
	@Override
	  public String description() { 
		String info = super.description()+"Motorcycle type: "+typeMotorcycle+"\nGas Capacity: "+capacityGasoline+"\nConsume: "+consumeGasolineM + "\n";
				return info;
	}

}