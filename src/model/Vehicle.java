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
	 * 
	 * @param sellPrice
	 * @param basePrice
	 * @param brand
	 * @param model
	 * @param cylinder
	 * @param mileage
	 * @param time
	 * @param document
	 * @param owner
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

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the plaque
	 */
	public String getPlaque() {
		return plaque;
	}

	/**
	 * @param plaque the plaque to set
	 */
	public void setPlaque(String plaque) {
		this.plaque = plaque;
	}

	public double getSellPrice() {
		return this.sellPrice;
	}

	/**
	 * 
	 * @param sellPrice
	 */
	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public double getBasePrice() {
		return this.basePrice;
	}

	/**
	 * 
	 * @param basePrice
	 */
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public String getBrand() {
		return this.brand;
	}

	/**
	 * 
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getModel() {
		return this.model;
	}

	/**
	 * 
	 * @param model
	 */
	public void setModel(int model) {
		this.model = model;
	}

	public int getCylinder() {
		return this.cylinder;
	}

	/**
	 * This method gets the cylinder of vehicle
	 * <b><pre>:<br><br>
	 * 
	 * @return cylinder
	 * 
	 * <b>post:</b><br>
	 */
	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}

	public int getMileage() {
		return this.mileage;
	}

	/**
	 * 
	 * @param mileage
	 */
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

		public String getOwner() {
		return this.owner;
	}

	/**
	 * 
	 * @param owner
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the sold
	 */
	public boolean isSold() {
		return sold;
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
	 * @param sold the sold to set
	 */
	public void setSold(boolean sold) {
		this.sold = sold;
	}
	
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