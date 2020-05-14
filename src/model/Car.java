package model;

public abstract class Car extends Vehicle {

//	attributes
	
	private String bodyType;
	private int doorsNumber;
	private String windows;
	private int typeCar;

//	methods
	
	/**
	 * 
	 * @param bodyType
	 * @param dooresNumber
	 * @param windows
	 * @param typeCar
	 */
	public Car(double basePrice, String brand, int model, int cylinder, int mileage, String time,String bodyType, int doorsNumber, String windows, int typeCar) {
		super(basePrice, brand, model, cylinder, mileage, time);
		this.bodyType = bodyType;
		this.doorsNumber = doorsNumber;
		this.windows = windows;
		this.typeCar = typeCar;
	}
	
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

	/**
	 * 
	 * @param type
	 */
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public int getDoorsNumber() {
		return this.doorsNumber;
	}

	/**
	 * 
	 * @param doorsNumber
	 */
	public void setDoorsNumber(int doorsNumber) {
		this.doorsNumber = doorsNumber;
	}

	public String getWindows() {
		return this.windows;
	}

	/**
	 * 
	 * @param windows
	 */
	public void setWindows(String windows) {
		this.windows = windows;
	}

	public int getTypeCar() {
		return this.typeCar;
	}

	/**
	 * 
	 * @param typeCar
	 */
	public void setTypeCar(int typeCar) {
		this.typeCar = typeCar;
	}
	@Override
	public String description() {
		return super.description() +"\nDoors number: " + getDoorsNumber() + "\nAre the windows polarized?: " + getWindows() + "\n";
	}
}