package model;

public abstract class Car extends Vehicle {

//	attributes
	
	private String bodyType;
	private int doorsNumber;
	private String windows;
	private int typeCar;

//	methods
	
	/**
	 * This method is the constructor of a new car
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
	 * @return a new car
	 * <b><post>:<br><br>
	 */
	public Car(double basePrice, String brand, int model, int cylinder, int mileage, String time,String bodyType, int doorsNumber, String windows, int typeCar) {
		super(basePrice, brand, model, cylinder, mileage, time);
		this.bodyType = bodyType;
		this.doorsNumber = doorsNumber;
		this.windows = windows;
		this.typeCar = typeCar;
	}
	/**
	 * This method is the constructor of an used car
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
	 * @param priceS double price of soat document
	 * @param priceM double price of mechanical technician document
	 * @param yearS integer year of documents
	 * @param yearM integer year of mechanical technician
	 * @param accidents double price of accidents cover
	 * @param gasLevel double of gas level
	 * @return an used car
	 * <b><post>:<br><br>
	 */
	public Car(double basePrice, String brand, int model, int cylinder, int mileage, String time, String plaque,String bodyType, int doorsNumber, String windows, int typeCar, double priceS, double priceM, int yearS, int yearM, double accidents, double gasLevel) {
		super(basePrice, brand, model, cylinder, mileage, time, plaque, priceS, priceM, yearS, yearM, accidents, gasLevel);
		this.bodyType = bodyType;
		this.doorsNumber = doorsNumber;
		this.windows = windows;
		this.typeCar = typeCar;
	}

	public String getBodyType() {
		return this.bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public int getDoorsNumber() {
		return this.doorsNumber;
	}

	public void setDoorsNumber(int doorsNumber) {
		this.doorsNumber = doorsNumber;
	}

	public String getWindows() {
		return this.windows;
	}

	public void setWindows(String windows) {
		this.windows = windows;
	}

	public int getTypeCar() {
		return this.typeCar;
	}

	public void setTypeCar(int typeCar) {
		this.typeCar = typeCar;
	}
	/**
	 * This method returns the information of the car
	 * <b><pre>:<br>A car must be created as minimum<br>
	 * 
	 * @return info String with the information of car
	 * 
	 * <b>post:</b><br>
	 */
	@Override
	public String description() {
		return super.description() +"\nDoors number: " + getDoorsNumber() + "\nAre the windows polarized?: " + getWindows() + "\n";
	}
}