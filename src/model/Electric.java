package model;

public class Electric extends Car implements BatteryConsumable, Soldable {

//	attributes
	
	private String typeCharger;
	private double batteryLife;
	private double batteryConsume;

//	methods
	
	/**
	 * This method is the constructor of a new electric car 
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
	 * @param batteryLife double battery life per kilometer
	 * @return a new electric vehicle
	 * <b><post>:<br><br>
	 */
	public Electric(double basePrice, String brand, int model, int cylinder, int mileage, String time,String bodyType, int doorsNumber, String windows, int typeCar, String typeCharger, double batteryLife) {
		super(basePrice, brand, model, cylinder, mileage, time, bodyType, doorsNumber, windows, typeCar);
		this.typeCharger = typeCharger;
		this.batteryLife = batteryLife;
		this.batteryConsume = batteryConsume(typeCharger, batteryLife, cylinder);
		this.sellPrice = calculateSellPriceNew(basePrice);
	}
	/**
	 * This method is the constructor of an used electric car 
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
	 * @param batteryLife double battery life per kilometer
	 * @param priceS double price of soat document
	 * @param priceM double price of mechanical technician document
	 * @param yearS integer year of documents
	 * @param yearM integer year of mechanical technician
	 * @param accidents double price of accidents cover
	 * @param gasLevel double of gas level
	 * @return an used electric vehicle
	 * <b><post>:<br><br>
	 */
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

	public void setTypeCharger(String typeCharger) {
		this.typeCharger = typeCharger;
	}

	public double getBatteryLife() {
		return this.batteryLife;
	}

	public void setBatteryLife(double batteryLife) {
		this.batteryLife = batteryLife;
	}

	public double getBatteryConsume() {
		return this.batteryConsume;
	}

	public void setBatteryConsume(double batteryConsume) {
		this.batteryConsume = batteryConsume;
	}
	/**
	 * This method calculate the battery consume depends of the charger type, battery life and cylinder
	 * <b><pre>:<br>A hybrid car must be created as minimum<br>
	 * 
	 * @param chargerType String between FAST or NORMAL
	 * @param batteryLife double duration of battery 
	 * @param cylinder double cylinder of electric car
	 * @return bateryConsume
	 * 
	 * <b>post:</b>Battery consume is updated<br>
	 */
	@Override
	public double batteryConsume(String typeCharger, double batteryLife, double cylinder) {
		double batteryConsume = 0;
		if(typeCharger.equalsIgnoreCase("Fast"))
			batteryConsume = (batteryLife + 10)*(cylinder/100);
		else if(typeCharger.equalsIgnoreCase("Normal"))
			batteryConsume = (batteryLife + 15)*(cylinder/100);
		return batteryConsume;
	}
	/**
	 * This method returns the information of the electric car
	 * <b><pre>:<br>An electric car must be created as minimum<br>
	 * 
	 * @return info String with the information of electric car
	 * 
	 * <b>post:</b><br>
	 */
	@Override
	public String description() {
		return super.description() + "TypeCharger: " + getTypeCharger() + "\nBattery Life: " + getBatteryLife() + "\nBattery Consume: " + getBatteryConsume() + "\n";
	}
	/**
	 * This method calculates the sell price of a new electric car
	 * <b><pre>:<br>The electric car must be create<br>
	 * 
	 * @param basePrice is the base price of the electric car
	 * @return sell price calculated
	 * 
	 * <b><post>:<br><br>
	 */
	@Override
	public double calculateSellPriceNew(double basePrice) {
		double mount = basePrice*0.2;
		double sellPrice = basePrice + mount;
		return sellPrice;
	}
	/**
	 * This method calculates the sell price of an used electric car
	 * <b><pre>:<br>The electric car must be create<br>
	 * 
	 * @param basePrice is the base price of the electric car
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