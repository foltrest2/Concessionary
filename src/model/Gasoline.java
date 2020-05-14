package model;

public class Gasoline extends Car implements GasolineConsumable, Soldable {

//	attributes
	
	private double tankCapacity;
	private String typeGasoline;
	private double gasolineConsume;
	
//	methods

	/**
	 * This method is the constructor of a new gasoline car 
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
	 * @param tankCapacity double capacity of the gas tank
	 * @param typeGasoline String type of gasoline
	 * @return a new Gasoline vehicle
	 * <b><post>:<br><br>
	 */
	public Gasoline(double basePrice, String brand, int model, int cylinder, int mileage, String time, String bodyType, int doorsNumber, String windows, int typeCar, double tankCapacity, String typeGasoline) {
		super(basePrice, brand, model, cylinder, mileage, time, bodyType, doorsNumber, windows, typeCar);
		this.tankCapacity = tankCapacity;
		this.typeGasoline = typeGasoline;
		this.gasolineConsume = gasolineConsume(tankCapacity, cylinder);
		this.sellPrice = calculateSellPriceNew(basePrice);
	}
	/**
	 * This method is the constructor of an used gasoline car 
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
	 * @param tankCapacity double capacity of the gas tank
	 * @param typeGasoline String type of gasoline
	 * @param priceS double price of soat document
	 * @param priceM double price of mechanical technician document
	 * @param yearS integer year of documents
	 * @param yearM integer year of mechanical technician
	 * @param accidents double price of accidents cover
	 * @param gasLevel double of gas level
	 * @return an used Gasoline vehicle
	 * <b><post>:<br><br>
	 */
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

	public void setTankCapacity(double tankCapacity) {
		this.tankCapacity = tankCapacity;
	}

	public String getTypeGasoline() {
		return this.typeGasoline;
	}

	public void setTypeGasoline(String typeGasoline) {
		this.typeGasoline = typeGasoline;
	}

	public double getGasolineConsume() {
		return this.gasolineConsume;
	}

	public void setGasolineConsume(double gasolineConsume) {
		this.gasolineConsume = gasolineConsume;
	}
	/**
	 * This method calculate the gasoline consume depend of gas capacity and his cylinder
	 * <b><pre>:<br>A gasoline car must be created as minimum<br>
	 * 
	 * @param gasCapacity double of tank capacity 
	 * @param cylinder double of cylinder
	 * @return consume already calculated
	 * 
	 * <b><post>:<br><br>
	 */
	@Override
	public double gasolineConsume(double tankCapacity, double cylinder) {
		double gasolineConsume = tankCapacity*(cylinder/100);
		return gasolineConsume;
	}
	/**
	 * This method returns the description of gasoline car
	 * <b><pre>:<br>constructor is not null<br>
	 * 
	 * @return info as String with the information
	 * 
	 * <b><post>:<br><br>
	 */
	@Override
	public String description() {
		return super.description() + "Tank capacity: " + getTankCapacity() + "\nType gasoline: " + getTypeGasoline() + "\nGasoline consume: " + getGasolineConsume() + "\n";
	}
	/**
	 * This method calculates the sell price of a new gasoline car
	 * <b><pre>:<br>The gasoline car must be create<br>
	 * 
	 * @param basePrice is the base price of the gasoline car
	 * @return sell price calculated
	 * 
	 * <b><post>:<br><br>
	 */
	@Override
	public double calculateSellPriceNew(double basePrice) {
		return basePrice;
	}
	/**
	 * This method calculates the sell price of an used gasoline car
	 * <b><pre>:<br>The gasoline car must be create<br>
	 * 
	 * @param basePrice is the base price of the gasoline car
	 * @return sell price calculated
	 * 
	 * <b><post>:<br><br>
	 */
	@Override
	public double calculateSellPriceUsed(double basePrice) {
		double mount = basePrice*0.1;
		double sellPrice = basePrice - mount;
		return sellPrice;
	}

}