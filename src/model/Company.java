package model;

import java.util.ArrayList;

public class Company {

	//	attributes

	private String name;
	private String nit;
	private int sells;
	private double totalGain;
	private Car[][] parkingLot;
	public static int parkRows = 10;
	public static int parkCols = 5;

	//	constants

	public static final int MAX_SELLERS = 10;

	//	relations

	public ArrayList<Vehicle> vehicles;
	public Seller[] sellers;
	public ArrayList<Client> clientsHistorial;

	//	methods

	/**
	 * This method is the constructor of Company
	 * <b><pre>:<br>
	 * 
	 * @param name is the name of company
	 * @param nit is the of company
	 * @param totalGain of the price vehicles sold
	 * @param sells quantity of sales
	 * 
	 * <b>post: Create a Company object</b>
	 */
	public Company(String name, String nit, double totalGain, int sells) {
		this.name = name;
		this.nit = nit;
		this.sells = sells;
		this.totalGain = totalGain;
		vehicles = new ArrayList<>();
		sellers = new Seller[MAX_SELLERS];
		clientsHistorial = new ArrayList<>();
		sellers[0] = new Seller("Kevin", "Mera", "1007778208");
		sellers[1] = new Seller("Valentina", "Solarte", "1007334770");
		sellers[2] = new Seller("Miguel", "Monitor", "1006327241");
	}
	/**
	 * This method create and add a new gasoline car 
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
	public Gasoline createGasolineCar(double basePrice, String brand, int model, int cylinder, int mileage, String time, String bodyType, int doorsNumber, String windows, int typeCar, double tankCapacity, String typeGasoline) {
		Gasoline gasoline = new Gasoline(basePrice, brand, model, cylinder, mileage, time, bodyType, doorsNumber, windows, typeCar, tankCapacity, typeGasoline);
		addVehicle(gasoline);
		return gasoline;
	}
	/**
	 * This method create and add an used gasoline car 
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
	public Gasoline createGasolineCar(double basePrice, String brand, int model, int cylinder, int mileage, String time, String plaque, String bodyType, int doorsNumber, String windows, int typeCar, double tankCapacity, String typeGasoline, double priceS, double priceM, int yearS, int yearM,  double accidents, double gasLevel) {
		Gasoline gasoline = new Gasoline(basePrice, brand, model, cylinder, mileage, time, plaque, bodyType, doorsNumber, windows, typeCar, tankCapacity, typeGasoline, priceS, priceM, yearS, yearM, accidents, gasLevel);
		addVehicle(gasoline);
		return gasoline;
	}
	/**
	 * This method create and add a new electric car 
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
	 * @param typeCharger String type of charger
	 * @param batteryLife double battery life per kilometer
	 * @return a new electric vehicle
	 * <b><post>:<br><br>
	 */
	public Electric createElectricCar(double basePrice, String brand, int model, int cylinder, int mileage, String time,String bodyType, int doorsNumber, String windows, int typeCar, String typeCharger, double batteryLife) {
		Electric electric = new Electric(basePrice, brand, model, cylinder, mileage, time, bodyType, doorsNumber, windows, typeCar, typeCharger, batteryLife);
		addVehicle(electric);
		return electric;
	}
	/**
	 * This method create and add an used electric car 
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
	public Electric createElectricCar(double basePrice, String brand, int model, int cylinder, int mileage, String time, String plaque, String bodyType, int doorsNumber, String windows, int typeCar, String typeCharger, double batteryLife, double priceS, double priceM, int yearS, int yearM,  double accidents, double gasLevel) {
		Electric electric = new Electric(basePrice, brand, model, cylinder, mileage, time, plaque, bodyType, doorsNumber, windows, typeCar, typeCharger, batteryLife, priceS, priceM, yearS, yearM, accidents, gasLevel);
		addVehicle(electric);
		return electric;
	}
	/**
	 * This method create and add a new hybrid car 
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
	 * @param typeCharger String type of charger
	 * @param batteryLifeH double battery life per kilometer
	 * @param tankCapacityH double capacity of the gas tank
	 * @param typeGasoline String type of gasoline
	 * @return a new hybrid vehicle
	 * <b><post>:<br><br>
	 */
	public Hybrid createHybridCar(double basePrice, String brand, int model, int cylinder, int mileage, String time, String bodyType, int doorsNumber, String windows, int typeCar, String typeCharger, double batteryLifeH, double tankCapacityH, String typeGasoline) {
		Hybrid hybrid = new Hybrid(basePrice, brand, model, cylinder, mileage, time, bodyType, doorsNumber, windows, typeCar, typeCharger, batteryLifeH, tankCapacityH, typeGasoline);
		addVehicle(hybrid);
		return hybrid;
	}
	/**
	 * This method create and add an used hybrid car 
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
	 * @param batteryLifeH double battery life per kilometer
	 * @param tankCapacityH double capacity of the gas tank
	 * @param typeGasoline String type of gasoline
	 * @param priceS double price of soat document
	 * @param priceM double price of mechanical technician document
	 * @param yearS integer year of documents
	 * @param yearM integer year of mechanical technician
	 * @param accidents double price of accidents cover
	 * @param gasLevel double of gas level
	 * @return an used hybrid vehicle
	 * <b><post>:<br><br>
	 */
	public Hybrid createHybridCar(double basePrice, String brand, int model, int cylinder, int mileage, String time, String plaque, String bodyType, int doorsNumber, String windows, int typeCar, String typeCharger, double batteryLifeH, double tankCapacityH, String typeGasoline, double priceS, double priceM, int yearS, int yearM,  double accidents, double gasLevel) {
		Hybrid hybrid = new Hybrid(basePrice, brand, model, cylinder, mileage, time, plaque, bodyType, doorsNumber, windows, typeCar, typeCharger, batteryLifeH, tankCapacityH, typeGasoline, priceS, priceM, yearS, yearM, accidents, gasLevel);
		addVehicle(hybrid);
		return hybrid;
	}
	/**
	 * This method create and add a new motorcycle 
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
	public Motorcycle createMotorcycle(double basePrice, String brand, int model, int cylinder, int mileage, String time, String typeMotorcycle, double capacityGasoline) {
		Motorcycle motorcycle = new Motorcycle(basePrice, brand, model, cylinder, mileage, time, typeMotorcycle, capacityGasoline);
		addVehicle(motorcycle);
		return motorcycle;
	}
	/**
	 * This method create and add an used motorcycle 
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
	public Motorcycle createMotorcycle(double basePrice, String brand, int model, int cylinder, int mileage, String time, String plaque, String typeMotorcycle, double capacityGasoline, double priceS, double priceM, int yearS, int yearM,  double accidents, double gasLevel) {
		Motorcycle motorcycle = new Motorcycle(basePrice, brand, model, cylinder, mileage, time, plaque, typeMotorcycle, capacityGasoline, priceS, priceM, yearS, yearM, accidents, gasLevel);
		addVehicle(motorcycle);
		return motorcycle;
	}
	/**
	 * This method get the parking lot in a matrix form
	 * 
	 *<b><pre>:<br>The matrix Car[][] is already initialize<br>
	 *
	 *@return Car matrix of parking lot
	 *
	 *<b>post:</b>
	 */
	public Car[][] getParking() {
		return parkingLot;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNit() {
		return this.nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public int getSells() {
		return this.sells;
	}
	public void setSells(int sells) {
		this.sells = sells;
	}
	public double getTotalGain() {
		return this.totalGain;
	}
	public void setTotalGain(double totalGain) {
		this.totalGain = totalGain;
	}
	/**
	 * This method deploy a list of vehicles on the concessioner 
	 * <b><pre>:<br>A vehicle must be created as minimum<br>
	 * 
	 * @param choose is the integer to choose the vehicle to show
	 * @return info as String with all information of vehicles
	 * 
	 * <b><post>:<br><br>
	 */
	public String showVehicles(int choose) {
		String info = "";
		if(vehicles.size()>0) {
			if(choose == 1) {
				for(int i = 0; i < vehicles.size(); i++) { 
					if(vehicles.get(i).getTime().equalsIgnoreCase("new")) {
						if(vehicles.get(i) instanceof Gasoline) {
							info += "\n**Gasoline Cars**"+"\n"+vehicles.get(i).description()+"\n"+"Number of vehicle in list: #"+(i+1)+"\n";
						}	
						if(vehicles.get(i) instanceof Electric) {
							info += "\n**Electric Cars**"+"\n"+vehicles.get(i).description()+"\n"+"Number of vehicle in list: #"+(i+1)+"\n";
						}
						if(vehicles.get(i) instanceof Hybrid) {
							info += "\n**Hybrid Cars**"+"\n"+vehicles.get(i).description()+"\n"+"Number of vehicle in list: #"+(i+1)+"\n";
						}
						if(vehicles.get(i) instanceof Motorcycle) {
							info += "\n**Motorcycle**"+"\n"+vehicles.get(i).description()+"\n"+"Number of vehicle in list: #"+(i+1)+"\n";
						}
					}
				}
				if (info.equals(""))
					info += "No used vehicles in the concessionary yet";
			}
			if(choose == 2) {
				for(int i = 0; i < vehicles.size(); i++) { 
					if(vehicles.get(i).getTime().equalsIgnoreCase("used")) {
						if(vehicles.get(i) instanceof Gasoline) {
							info += "\n**Gasoline Cars**"+"\n"+vehicles.get(i).description()+"\n"+"Number of vehicle in list: #"+(i+1)+"\n";
						}	
						if(vehicles.get(i) instanceof Electric) {
							info += "\n**Electric Cars**"+"\n"+vehicles.get(i).description()+"\n"+"Number of vehicle in list: #"+(i+1)+"\n";
						}
						if(vehicles.get(i) instanceof Hybrid) {
							info += "\n**Hybrid Cars**"+"\n"+vehicles.get(i).description()+"\n"+"Number of vehicle in list: #"+(i+1)+"\n";
						}
						if(vehicles.get(i) instanceof Motorcycle) {
							info += "\n**Motorcycle**"+"\n"+vehicles.get(i).description()+"\n"+"Number of vehicle in list: #"+(i+1)+"\n";
						}
					}			
				}
				if (info.equals(""))
					info += "No used vehicles in the concessionary yet";
			}
			if(choose == 3) {
				for(int i = 0; i < vehicles.size(); i++) { 
					if(vehicles.get(i) instanceof Gasoline) {
						info += "\n**Gasoline Cars**"+"\n"+vehicles.get(i).description()+"\n"+"Number of vehicle in list: #"+(i+1)+"\n";
					}	
					if(vehicles.get(i) instanceof Electric) {
						info += "\n**Electric Cars**"+"\n"+vehicles.get(i).description()+"\n"+"Number of vehicle in list: #"+(i+1)+"\n";
					}
					if(vehicles.get(i) instanceof Hybrid) {
						info += "\n**Hybrid Cars**"+"\n"+vehicles.get(i).description()+"\n"+"Number of vehicle in list: #"+(i+1)+"\n";
					}
					if(vehicles.get(i) instanceof Motorcycle) {
						info += "\n**Motorcycle**"+"\n"+vehicles.get(i).description()+"\n"+"Number of vehicle in list: #"+(i+1)+"\n";
					}
				}
			}
		}
		else
			info += "\nNo vehicles in the concessionary yet\n";
		return info;
	}
	/**
	 * This method add a vehicle to the arrayList
	 * <b><pre>:<br>ArrayList of vehicle is already initialize<br>
	 * 
	 * @param vehicle object vehicle type
	 * 
	 * <b><post>:<br>Vehicle must be visible on the list<br>
	 */
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	/**
	 * This method add a client with his respective seller 
	 * <b><pre>:<br>The sellers are already created<br>
	 * 
	 * @param choose position of the sales Man array
	 * @param name String name of the client
	 * @param lastName String last name of the client
	 * @param id integer id of client
	 * @param phoneNumber integer telephone of client 
	 * @param email String mail of client
	 * @return String info notifying the state of client adding 
	 * 
	 * <b><post>:<br><br>
	 */
	public String addClientToSeller(int choose, String name, String lastName, String id, String phoneNumber, String email) {
		boolean add = true;
		String info = "";
		if(sellers[choose].clients[4] != null) {
			info += "The client will be added, but he will be in the waiting list";
			Client client = new Client(name, lastName, id, phoneNumber, email);
			clientsHistorial.add(client);
		}
		for (int i = 0; i < sellers[choose].clients.length && add; i++) {
			if((sellers[choose].clients[i] != null) && id.equalsIgnoreCase(sellers[choose].clients[i].getId())) {
				add = false;
				info += "Cannot add client due ID is already registered for this seller\n";
				info += "Please re enter a client with different ID\n";
			}
		}
		for (int i = 0; i < sellers[choose].clients.length&&add; i++) {
			if(sellers[choose].clients[i] == null) {	
				sellers[choose].clients[i] = new Client(name, lastName, id, phoneNumber,email);
				sellers[choose].clients[i].setAssigned(true);
				clientsHistorial.add(sellers[choose].clients[i]);
				info += "Client added!";
				add = false;
			}
		}
		return info;
	}
	/**
	 * This method check if any client is waiting
	 * <b><pre>:<br> a client is already create<br>
	 * 
	 * @return String info notifying if any client is waiting or not  
	 * 
	 * <b><post>:<br><br>
	 */
	public String clientsWaiting() {
		String info = "";
		for (int i = 0; i < clientsHistorial.size(); i++) {
			if(clientsHistorial.get(i).isAssigned() == false && clientsHistorial.get(i).isActive() == true) {
				info += "The clients waiting are:\n" + clientsHistorial.get(i).getName() + " " + clientsHistorial.get(i).getLastName() + " with ID " + clientsHistorial.get(i).getId() + "\n";
			}		
		}
		if(info.equals(""))
			info += "No clients waiting there";
		return info;
	}
	/**
	 * This method gets the first client waiting in the arrayList clientsHistorial
	 * <b><pre>:<br> a client is already create<br>
	 * 
	 * @return returns the client
	 * 
	 * <b><post>:<br><br>
	 */
	public Client getClientWaiting() {
		Client client = null;
		if(clientsHistorial.get(0) != null)
			for (int i = 0; i < clientsHistorial.size(); i++) {
				if(clientsHistorial.get(i).isActive() == true && clientsHistorial.get(i).isAssigned() == false) {
					client = clientsHistorial.get(i);
				}
			}
		return client;
	}
	/**
	 * This method assign the client founded with the method getClientWaiting to a seller chosen
	 * <b><pre>:<br> a client and a seller is already create <br>
	 * 
	 * @param sellerNumber is the number of the position of a specific seller in the array of sellers
	 * @return String info notifying if the operation was successful or not
	 * 
	 * <b><post>:<br><br>
	 */
	public String attendClientWaiting(int sellerNumber) {
		String info = "";
		boolean stop = false;
		if(sellers[sellerNumber] != null && clientsHistorial.size() > 0) {
			for (int i = 0; i < sellers.length && !stop; i++) {
				if(sellers[sellerNumber].clients[i] == null) {
					sellers[sellerNumber].clients[i] = getClientWaiting();
					sellers[sellerNumber].clients[i].setAssigned(true);
					stop = true;
					info += "The client was assigned to the seller " + sellers[sellerNumber].getName();
				}	
			}
		}
		else
			info += "You maybe have one of these problems:\nNo clients in the company yet\nNo sellers in that position\nNo clients waiting";
		return info;
	}
	/**
	 * This method remove a specific client of the array of a specific seller
	 * <b><pre>:<br> a client and a seller is already create <br>
	 * 
	 * @param sellerNumber is the number of the position of a specific seller in the array of sellers
	 * @param clientNumber is the number of the position of a specific client in the array of clients
	 * @return String info notifying that the operation was successful
	 * 
	 * <b><post>:<br><br>
	 */
	public String removeClient(int sellerNumber, int clientNumber) {
		String info = "";
		sellers[sellerNumber].clients[clientNumber].setAssigned(false);
		sellers[sellerNumber].clients[clientNumber].setActive(false);
		sellers[sellerNumber].clients[clientNumber] = null;
		info += "Client removed of the array of the seller";
		return info;
	}
	/**
	 * This method deploy a list of clients per sellers
	 * <b><pre>:<br>A client must be created as minimum<br>
	 * 
	 * @return info as String with the information of client and his seller attend
	 * 
	 * <b><post>:<br>Notify slots remaining per seller<br>
	 */
	public String clientsPerSeller() {
		String info = "";
		int k = 0;
		for (int i = 0; i < sellers.length; i++) {
			if(sellers[i] != null) {
				info += "\nThe seller #" + (i+1) + " named "+ sellers[i].getName() + " has assigned: \n";
				for (int j = 0; j < sellers[i].clients.length; j++) {
					if(sellers[i].clients[j] != null) {
						info += "Client # "+ (j+1) + ": " + sellers[i].clients[j].getName() + " " + sellers[i].clients[j].getLastName() + " with the ID " + sellers[i].clients[j].getId()+"\n";	
					}
					if(sellers[i].clients[j] == null) {
						k+=1;
					}
				}
				info += "This seller has #"+ k +" positions free to add a client\n";
				k = 0;
			}
		}
		return info;
	}
	/**
	 * This method show the vehicles on the arrayList of a specific client 
	 * <b><pre>:<br><br>
	 * 
	 * @param sellerNumber integer position of arrayList salesMan
	 * @param clientNumber integer position of array clients
	 * @return info String returns information of favorite vehicle
	 * 
	 * <b><post>:<br>Deploy a list<br>
	 */
	public String favoriteVehicles(int sellerNumber, int clientNumber) {
		String info = "";
		if(sellers[sellerNumber].clients[clientNumber].favorites.size() > 0) {
			for (int i = 0; i < sellers[sellerNumber].clients[clientNumber].favorites.size(); i++) {
				info += sellers[sellerNumber].clients[clientNumber].favorites.get(i).description();
			}
		}
		else
			info += "This client hasn't vehicles added in his favorites";
		return info;
	}
	/**
	 * This method add a seller to the array of sellers
	 * <b><pre>:<br> The array of sellers is already initialize<br>
	 * 
	 * @param name is the name of the seller
	 * @param lastName is the last name of the seller
	 * @param id is the id of the seller
	 * @return String info notifying what happened with the seller
	 * 
	 * <b><post>:<br><br>
	 */
	public String addSeller(String name, String lastName, String id) {
		boolean add = true;
		String info = "";
		if(sellers[9] != null && add) {
			info += "The company alredy has 10 sellers";
			add = false;
		}
		for (int i = 0; i < sellers.length && add; i++) {
			if((sellers[i] != null) && id.equalsIgnoreCase(sellers[i].getId())){
				info += "Alredy exist a seller with this ID, the seller can't be added.\nTry with other one";
			}
		}
		for (int i = 0; i < sellers.length && add; i++) {
			if(sellers[i] == null) {
				sellers[i] = new Seller(name, lastName, id);
				info += "Seller registered!";
				add = false;
			}
		}
		return info;
	}
	/**
	 * This method show the complete information per seller
	 *  <b><pre>:<br>array of sellers must be already initialize<br>
	 *  
	 * @return info String with the information
	 * 
	 * <b><post>:<br>Deploy a list<br>
	 */
	public String showSellersComplete() {
		String info = "";
		for (int i = 0; i < sellers.length; i++) {
			if(sellers[i] != null)
				info += "\nSeller #" + (i+1) + "\nID: "+sellers[i].getId()+"\nName: "+sellers[i].getName()+"\nLast name: "+sellers[i].getLastName()+"\nHad sold: "+sellers[i].getTotalSells()+" vehicles\n";
		}
		return info;
	}
	/**
	 * This method add the documentation of a vehicle
	 * <b><pre>:<br>A vehicle is created as minimum<br>
	 * 
	 * @param vehicleNumber number on the arrayList of vehicles
	 * @param yearS year of soat
	 * @param yearM year of mechanical technician
	 * @param accidents cover of accidents price
	 * @param priceS price of soat
	 * @param priceM price of mechanical technician 
	 * @param gas level of gas
	 * 
	 * <b><post>:<br>A vehicle added documentation was sold too<br>
	 */
	public void addDocumentation(int vehicleNumber, double priceS, double priceM, int yearS, int yearM, double accidents, double gasLevel) {
		Document soat  = new SOAT(priceS, yearS, accidents);
		Document mech  = new MechanicalTechnician(priceM, yearM, gasLevel);
		vehicles.get(vehicleNumber).legalDocumentation.add(soat);
		vehicles.get(vehicleNumber).legalDocumentation.add(mech);
	}
	/**
	 * This method add the soat of a vehicle
	 * <b><pre>:<br>A vehicle is created as minimum<br>
	 * 
	 * @param vehicleNumber number on the arrayList of vehicles
	 * @param priceS price of soat
	 * @param yearS year of soat
	 * @param accidents cover of accidents price
	 * 
	 * <b><post>:<br>A vehicle added soat was sold too<br>
	 */
	public void addDocumentationSoat(int vehicleNumber, double priceS, int yearS, double accidents) {
		Document soat  = new SOAT(priceS, yearS, accidents);
		vehicles.get(vehicleNumber).legalDocumentation.add(soat);
	}
	/**
	 * This method add the mechanical technician of a vehicle
	 * <b><pre>:<br>A vehicle is created as minimum<br>
	 * 
	 * @param vehicleNumber number on the arrayList of vehicles
	 * @param priceM price of mechanical technician
	 * @param yearM year of mechanical technician
	 * @param accidents cover of accidents price
	 * 
	 * <b><post>:<br>A vehicle added mechanical technician was sold too<br>
	 */
	public void addDocumentationMech(int vehicleNumber, double priceM, int yearM, double gasLevel) {
		Document mech  = new MechanicalTechnician(priceM, yearM, gasLevel);
		vehicles.get(vehicleNumber).legalDocumentation.add(mech);
	}
	/**
	 * This method get the information of the car on the parking lot depend of the model year
	 * <b><pre>:<br>The matrix Car[][] is already initialize<br>
	 * <b><pre>:<br>The matrix Car[][] is already initialize<br>
	 * 
	 * @param request integer of the year model to request.
	 * @return info String with the information about the car requested.
	 * 
	 * <b><post>:<br>Returns the information os the specific car<br>
	 */
	public String getInfoParking(int request) {
		String info = "";
		boolean cont = true;
		boolean go = true;
		if(request == 2010) {
			info += "\nUsed cars of models below "+(request+1)+" on the parking lot are: \n";
		}
		else {
			info += "\nUsed cars models "+request+" on the parking lot are: \n";
		}	
		for (int i = 0; i < vehicles.size() && go; i++) {
			if(vehicles.get(i) instanceof Car && vehicles.get(i).getModel() == 2014 && request == 2014) {
				for(int k = 0; k < parkRows; k++) {
					if(parkingLot[k][0] != null && cont) {
						info +=	"\n**Car #"+(k+1)+"*"+"\n"+parkingLot[k][0].description()+"\n";
						go = false;
					}
					else if(cont) {
						info += "\n*There "+(10-k)+" parkings free for 2014 cars models \n*";
						cont = false;
					}	
				}
			}
			if(vehicles.get(i) instanceof Car && vehicles.get(i).getModel() == 2013 && request == 2013) {
				for(int k = 0; k < parkRows; k++) {
					if(parkingLot[k][1] != null && cont) {
						info +=	"\n**Car #"+(k+1)+"*"+"\n"+parkingLot[k][1].description()+"\n";
						go = false;
					}
					else if(cont) {
						info += "\n*There "+(10-k)+" parkings free for 2013 cars models \n*";
						cont = false;
					}	
				}
			}
			if(vehicles.get(i) instanceof Car && vehicles.get(i).getModel() == 2012 && request == 2012) {
				for(int k = 0; k < parkRows; k++) {
					if(parkingLot[k][2] != null && cont) {
						info +=	"\n**Car #"+(k+1)+"*"+"\n"+parkingLot[k][2].description()+"\n";
						go = false;
					}
					else if(cont) {
						info += "\n*There "+(10-k)+" parkings free for 2012 cars models \n*";
						cont = false;
					}	
				}
			}
			if(vehicles.get(i) instanceof Car && vehicles.get(i).getModel() == 2011 && request == 2011) {
				for(int k = 0; k < parkRows; k++) {
					if(parkingLot[k][3] != null && cont) {
						info +=	"\n**Car #"+(k+1)+"*"+"\n"+parkingLot[k][3].description()+"\n";
						go = false;
					}
					else if(cont) {
						info += "\n*There "+(10-k)+" parkings free for 2011 cars models \n*";
						cont = false;
					}	
				}
			}
			if(vehicles.get(i) instanceof Car && vehicles.get(i).getModel() == 2010 && request == 2010) {
				for(int k = 0; k < parkRows; k++) {
					if(parkingLot[k][4] != null && cont) {
						info +=	"\n**Car #"+(k+1)+"*"+"\n"+parkingLot[k][4].description()+"\n";
						go = false;
					}
					else if(cont) {
						info += "\n*There "+(10-k)+" parkings free for cars models below 2011  \n*";
						cont = false;
					}	
				}
			}
		}
		return info;
	}
	/**
	 * This method organize the used cars on the parking lot matrix depend of their models year.
	 * <b><pre>:<br>The matrix Car[][] is already initialize<br>
	 * <b><pre>:<br>An used car is created as minimum<br>
	 * 
	 * @return info String in case if the parking lot is full.
	 * 
	 * <b><post>:<br><br>
	 */
	public String organizeParking() {
		String info = "";
		boolean cont = true;
		boolean go = true;
		parkingLot = new Car[parkRows][parkCols];
		for (int i = 0; i < vehicles.size(); i++) {
			go = true;
			if(vehicles.get(i) instanceof Car && vehicles.get(i).getModel() == 2014 && vehicles.get(i).getTime().equalsIgnoreCase("used")){
				for(int k = 0; k < parkRows; k++) {
					if(parkingLot[k][0] == null && cont && go) {
						parkingLot[k][0] = (Car) vehicles.get(i);	
						go = false;
					}
					else if(!cont) {
						info = "Parking lot must be extended for the model 2014";
						cont = false;
					}
				}
			}
			if(vehicles.get(i) instanceof Car && vehicles.get(i).getModel() == 2013 && vehicles.get(i).getTime().equalsIgnoreCase("used")){
				for(int k = 0; k < parkRows; k++) {
					if(parkingLot[k][1] == null && cont && go) {
						parkingLot[k][1] = (Car) vehicles.get(i);	
						go = false;
					}
					else if(!cont) {
						info = "Parking lot must be extended for the model 2013";
						cont = false;
					}
				}
			}
			if(vehicles.get(i) instanceof Car && vehicles.get(i).getModel() == 2012 && vehicles.get(i).getTime().equalsIgnoreCase("used")){
				for(int k = 0; k < parkRows; k++) {
					if(parkingLot[k][2] == null && cont && go) {
						parkingLot[k][2] = (Car) vehicles.get(i);	
						go = false;
					}
					else if(!cont) {
						info = "Parking lot must be extended for the model 2012";
						cont = false;
					}
				}
			}
			if(vehicles.get(i) instanceof Car && vehicles.get(i).getModel() == 2011 && vehicles.get(i).getTime().equalsIgnoreCase("used")){
				for(int k = 0; k < parkRows; k++) {
					if(parkingLot[k][3] == null && cont && go) {
						parkingLot[k][3] = (Car) vehicles.get(i);	
						go = false;
					}
					else if(!cont) {
						info = "Parking lot must be extended for the models 2011 and below it";
						cont = false;
					}
				}
			}
			if(vehicles.get(i) instanceof Car && vehicles.get(i).getModel() <= 2010 && vehicles.get(i).getTime().equalsIgnoreCase("used")){
				for(int k = 0; k < parkRows; k++) {
					if(parkingLot[k][4] == null && cont && go) {
						parkingLot[k][4] = (Car) vehicles.get(i);	
						go = false;
					}
					else if(!cont) {
						info = "Parking lot must be extended";
						cont = false;
					}
				}
			}
		}
		return info;
	}
}