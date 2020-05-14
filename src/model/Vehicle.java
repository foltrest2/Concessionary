package model;

import java.util.ArrayList;

public abstract class Vehicle {

//	attributes
	
	protected double sellPrice;
	private double basePrice;
	private String brand;
	private int model;
	private int cylinder;
	private int mileage;
	private String time;
	private String plaque;
	private String owner;
	private boolean sold;
	
//	relations
	
	public ArrayList<Document> legalDocumentation;

//	methods
	
	/**
	 * This method is the constructor of a new vehicle
	 * <b><pre>:<br><br>
	 * 
	 * @param basePrice double base price of vehicle
	 * @param brand String about the vehicle brand
	 * @param model integer year of model
	 * @param cylinder double cylinder of vehicle
	 * @param mileage integer of kilometers traveled
	 * @param time String is the vehicle is new or used
	 * @return a new vehicle
	 * <b><post>:<br><br>
	 */
	public Vehicle(double basePrice, String brand, int model, int cylinder, int mileage, String time) {
		this.basePrice = basePrice;
		this.brand = brand;
		this.model = model;
		this.cylinder = cylinder;
		this.mileage = mileage;
		this.time = time;
		this.owner = "Volkswagen Group";
		this.sold = false;
		legalDocumentation = new ArrayList<>();
		}
	/**
	 * This method is the constructor of an used vehicle
	 * <b><pre>:<br><br>
	 * 
	 * @param basePrice double base price of vehicle
	 * @param brand String about the vehicle brand
	 * @param model integer year of model
	 * @param cylinder double cylinder of vehicle
	 * @param mileage integer of kilometers traveled
	 * @param time String is the vehicle is new or used
	 * @param priceS double price of soat document
	 * @param priceM double price of mechanical technician document
	 * @param yearS integer year of documents
	 * @param yearM integer year of mechanical technician
	 * @param accidents double price of accidents cover
	 * @param gasLevel double of gas level
	 * @return an used vehicle
	 * <b><post>:<br><br>
	 */
	public Vehicle(double basePrice, String brand, int model, int cylinder, int mileage, String time, String plaque, double priceS, double priceM, int yearS, int yearM, double accidents, double gasLevel) {
		this.basePrice = basePrice;
		this.brand = brand;
		this.model = model;
		this.cylinder = cylinder;
		this.mileage = mileage;
		this.time = time;
		this.plaque = plaque;
		this.owner = "Volkswagen Group";
		this.sold = false;
		legalDocumentation = new ArrayList<>();
		Document soat  = new SOAT(priceS, yearS, accidents);
		Document mech  = new MechanicalTechnician(priceM, yearM, gasLevel);
		legalDocumentation.add(soat);
		legalDocumentation.add(mech);
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPlaque() {
		return plaque;
	}

	public void setPlaque(String plaque) {
		this.plaque = plaque;
	}

	public double getSellPrice() {
		return this.sellPrice;
	}

	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public double getBasePrice() {
		return this.basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getModel() {
		return this.model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getCylinder() {
		return this.cylinder;
	}

	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}

	public int getMileage() {
		return this.mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

		public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public boolean isSold() {
		return sold;
	}
	
	public void setSold(boolean sold) {
		this.sold = sold;
	}
	
	public String soldToString() {
		String info = "";
		if(sold == true)
			info = "Yes";
		else
			info = "No";
		return info;
	}

	/**
	 * This method returns the information of the vehicle
	 * <b><pre>:<br>A vehicle must be created as minimum<br>
	 * 
	 * @return info String with the information of the vehicle
	 * 
	 * <b>post:</b><br>
	 */
	public String description() {
		String info = "\nCurrent owner: "+owner+"\n\nSold: "+soldToString()+"\nSell price: "+sellPrice+"\nBase price: "+basePrice+"\nBrand: "+brand+"\nModel: "+model+"\nCylinder: "+cylinder+"\nMileage: "+mileage+"\nIs new or used?: "+time+"\nPlaque: "+plaque + "\n";
		if(Vehicle.this.getPlaque() == null) { 
			return info += "\nNo documents yet until car its sould\n";	
		}
		else
		info += legalDocumentation.get(legalDocumentation.size()-2).description()+legalDocumentation.get(legalDocumentation.size()-1).description() + "\n"; 
		return info;
	}
}