package model;

public class Motorcycle extends Vehicle implements GasolineConsumable, Soldable{

//	attributes
	
	private String typeMotorcycle;
	private double capacityGasoline;
	private double consumeGasolineM;

//	methods

	/**
	 * This method is the constructor of a new motorcycle 
	 * <b><pre>:<br><br>
	 * 
	 * @param basePrice double base price of vehicle
	 * @param brand String about the vehicle brand
	 * @param model integer year of model
	 * @param cylinder double cylinder of vehicle
	 * @param mileage integer of kilometers traveled
	 * @param time String is the vehicle is new or used
	 * @param typeMotorcycle String is standard, sport, scooter or cross
	 * @param capacityGasoline double capacity of the gas tank
	 * @return a new motorcycle
	 * <b><post>:<br><br>
	 */
	public Motorcycle(double basePrice, String brand, int model, int cylinder, int mileage, String time, String typeMotorcycle, double capacityGasoline) {
		super(basePrice, brand, model, cylinder, mileage, time);
		this.typeMotorcycle = typeMotorcycle;
		this.capacityGasoline = capacityGasoline;
		this.consumeGasolineM = gasolineConsume(capacityGasoline, cylinder);
		this.sellPrice = calculateSellPriceNew(basePrice);
	}
	/**
	 * This method is the constructor of an used motorcycle 
	 * <b><pre>:<br><br>
	 * 
	 * @param basePrice double base price of vehicle
	 * @param brand String about the vehicle brand
	 * @param model integer year of model
	 * @param cylinder double cylinder of vehicle
	 * @param mileage integer of kilometers traveled
	 * @param time String is the vehicle is new or used
	 * @param plaque String plaque
	 * @param typeMotorcycle String is standard, sport, scooter or cross
	 * @param capacityGasoline double capacity of the gas tank
	 * @param priceS double price of soat document
	 * @param priceM double price of mechanical technician document
	 * @param yearS integer year of documents
	 * @param yearM integer year of mechanical technician
	 * @param accidents double price of accidents cover
	 * @param gasLevel double of gas level
	 * @return an used motorcycle
	 * <b><post>:<br><br>
	 */
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

	public void setTypeMotorcycle(String typeMotorcycle) {
		this.typeMotorcycle = typeMotorcycle;
	}

	public double getCapacityGasoline() {
		return this.capacityGasoline;
	}

	public void setCapacityGasoline(double capacityGasoline) {
		this.capacityGasoline = capacityGasoline;
	}

	public double getConsumeGasolineM() {
		return this.consumeGasolineM;
	}

	public void setConsumeGasolineM(double consumeGasolineM) {
		this.consumeGasolineM = consumeGasolineM;
	}
	/**
	 * This method calculate the gasoline consume depend of gas capacity and his cylinder
	 * <b><pre>:<br>A motorcycle must be created as minimum<br>
	 * 
	 * @param gasCapacity double of tank capacity 
	 * @param cylinder double of cylinder
	 * @return consume already calculated
	 * 
	 * <b><post>:<br><br>
	 */
	@Override
	public double gasolineConsume(double capacityGasoline, double cylinder) {
		double gasolineConsume = capacityGasoline*(cylinder/90);
		return gasolineConsume;
	}
	/**
	 * This method calculates the sell price of a new motorcycle
	 * <b><pre>:<br>The motorcycle must be create<br>
	 * 
	 * @param basePrice is the base price of the motorcycle
	 * @return sell price calculated
	 * 
	 * <b><post>:<br><br>
	 */
	@Override
	public double calculateSellPriceNew(double basePrice) {
		double mount = basePrice*0.04;
		double sellPrice = basePrice + mount;
		return sellPrice;
	}
	/**
	 * This method calculates the sell price of a used motorcycle
	 * <b><pre>:<br>The motorcycle must be create<br>
	 * 
	 * @param basePrice is the base price of the motorcycle
	 * @return sell price calculated
	 * 
	 * <b><post>:<br><br>
	 */
	@Override
	public double calculateSellPriceUsed(double basePrice) {
		double mount = basePrice*0.02;
		double sellPrice = basePrice - mount;
		return sellPrice;
	}
	/**
	 * This method returns the description of motorcycle
	 * <b><pre>:<br>constructor is not null<br>
	 * 
	 * @return info as String with the information
	 * 
	 * <b><post>:<br><br>
	 */
	@Override
	  public String description() { 
		String info = super.description()+"Motorcycle type: "+typeMotorcycle+"\nGas Capacity: "+capacityGasoline+"\nConsume: "+consumeGasolineM + "\n";
				return info;
	}

}