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
	 * 
	 * @param name
	 * @param nit
	 * @param totalGain
	 * @param sells
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
		sellers[1] = new Seller("Juan", "Rodriguez", "1027475261");
		sellers[2] = new Seller("Mario", "Casas", "1056871202");
		sellers[3] = new Seller("Valentina", "Solarte", "1007334770");
		sellers[4] = new Seller("José", "Ordoñez", "1002358351");
		sellers[5] = new Seller("Miguel", "Monitor", "1006327241");
		Vehicle m1 = new Gasoline(1000, "BMW", 2020, 10, 10, "new", "sedan", 4, "yes", 1, 20, "Diesel");
		Vehicle m2 = new Electric(1000, "Tesla", 2020, 10, 10, "new", "sedan", 4, "yes", 2, "Fast", 10);
		Vehicle m3 = new Hybrid(1000, "Nissan", 2020, 10, 10, "new", "sedan", 4, "yes", 1, "Fast", 10, 20, "Diesel");
		Vehicle m4 = new Motorcycle(1000, "Honda", 2020, 10, 10, "new", "Cross", 10);
		Vehicle m5 = new Electric(1000, "Tesla", 2020, 10, 10, "new", "sedan", 4, "yes", 2, "Normal", 10);
		vehicles.add(m1);
		vehicles.add(m2);
		vehicles.add(m3);
		vehicles.add(m4);
		vehicles.add(m5);
	}
	public Gasoline createGasolineCar(double basePrice, String brand, int model, int cylinder, int mileage, String time, String bodyType, int doorsNumber, String windows, int typeCar, double tankCapacity, String typeGasoline) {
		Gasoline gasoline = new Gasoline(basePrice, brand, model, cylinder, mileage, time, bodyType, doorsNumber, windows, typeCar, tankCapacity, typeGasoline);
		addVehicle(gasoline);
		return gasoline;
	}

	public Gasoline createGasolineCar(double basePrice, String brand, int model, int cylinder, int mileage, String time, String plaque, String bodyType, int doorsNumber, String windows, int typeCar, double tankCapacity, String typeGasoline, double priceS, double priceM, int yearS, int yearM,  double accidents, double gasLevel) {
		Gasoline gasoline = new Gasoline(basePrice, brand, model, cylinder, mileage, time, plaque, bodyType, doorsNumber, windows, typeCar, tankCapacity, typeGasoline, priceS, priceM, yearS, yearM, accidents, gasLevel);
		addVehicle(gasoline);
		return gasoline;
	}

	public Electric createElectricCar(double basePrice, String brand, int model, int cylinder, int mileage, String time,String bodyType, int doorsNumber, String windows, int typeCar, String typeCharger, double batteryLife) {
		Electric electric = new Electric(basePrice, brand, model, cylinder, mileage, time, bodyType, doorsNumber, windows, typeCar, typeCharger, batteryLife);
		addVehicle(electric);
		return electric;
	}

	public Electric createElectricCar(double basePrice, String brand, int model, int cylinder, int mileage, String time, String plaque, String bodyType, int doorsNumber, String windows, int typeCar, String typeCharger, double batteryLife, double priceS, double priceM, int yearS, int yearM,  double accidents, double gasLevel) {
		Electric electric = new Electric(basePrice, brand, model, cylinder, mileage, time, plaque, bodyType, doorsNumber, windows, typeCar, typeCharger, batteryLife, priceS, priceM, yearS, yearM, accidents, gasLevel);
		addVehicle(electric);
		return electric;
	}

	public Hybrid createHybridCar(double basePrice, String brand, int model, int cylinder, int mileage, String time, String bodyType, int doorsNumber, String windows, int typeCar, String typeCharger, double batteryLifeH, double tankCapacityH, String typeGasoline) {
		Hybrid hybrid = new Hybrid(basePrice, brand, model, cylinder, mileage, time, bodyType, doorsNumber, windows, typeCar, typeCharger, batteryLifeH, tankCapacityH, typeGasoline);
		addVehicle(hybrid);
		return hybrid;
	}

	public Hybrid createHybridCar(double basePrice, String brand, int model, int cylinder, int mileage, String time, String plaque, String bodyType, int doorsNumber, String windows, int typeCar, String typeCharger, double batteryLifeH, double tankCapacityH, String typeGasoline, double priceS, double priceM, int yearS, int yearM,  double accidents, double gasLevel) {
		Hybrid hybrid = new Hybrid(basePrice, brand, model, cylinder, mileage, time, plaque, bodyType, doorsNumber, windows, typeCar, typeCharger, batteryLifeH, tankCapacityH, typeGasoline, priceS, priceM, yearS, yearM, accidents, gasLevel);
		addVehicle(hybrid);
		return hybrid;
	}

	public Motorcycle createMotorcycle(double basePrice, String brand, int model, int cylinder, int mileage, String time, String typeMotorcycle, double capacityGasoline) {
		Motorcycle motorcycle = new Motorcycle(basePrice, brand, model, cylinder, mileage, time, typeMotorcycle, capacityGasoline);
		addVehicle(motorcycle);
		return motorcycle;
	}
	public Motorcycle createMotorcycle(double basePrice, String brand, int model, int cylinder, int mileage, String time, String plaque, String typeMotorcycle, double capacityGasoline, double priceS, double priceM, int yearS, int yearM,  double accidents, double gasLevel) {
		Motorcycle motorcycle = new Motorcycle(basePrice, brand, model, cylinder, mileage, time, plaque, typeMotorcycle, capacityGasoline, priceS, priceM, yearS, yearM, accidents, gasLevel);
		addVehicle(motorcycle);
		return motorcycle;
	}
	public String getName() {
		return this.name;
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	public String getNit() {
		return this.nit;
	}
	/**
	 * 
	 * @param nit
	 */
	public void setNit(String nit) {
		this.nit = nit;
	}
	public int getSells() {
		return this.sells;
	}
	/**
	 * 
	 * @param sells
	 */
	public void setSells(int sells) {
		this.sells = sells;
	}
	public double getTotalGain() {
		return this.totalGain;
	}
	/**
	 * 
	 * @param totalGain
	 */
	public void setTotalGain(double totalGain) {
		this.totalGain = totalGain;
	}

	public String showVehicles(int choose) {
		String info = "";
		boolean stop = false;
		if(vehicles.size()>0) {
			if(choose == 1) {
				for(int i = 0; i < vehicles.size() && !stop; i++) { 
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
					else {
						info += "No new vehicles in the concessionary yet";
						stop = true;
					}
				}
			}
			if(choose == 2) {
				for(int i = 0; i < vehicles.size() && !stop; i++) { 
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
					else {
						info += "No used vehicles in the concessionary yet";
						stop = true;
					}
				}
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

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	/**
	 * 
	 * @param choose
	 * @param name
	 * @param lastName
	 * @param id
	 * @param phoneNumber
	 * @param mail
	 */
	public String addClientToSeller(int choose, String name, String lastName, String id, String phoneNumber, String mail) {
		boolean add = true;
		String info = "";
		if(sellers[choose].clients[4] != null) {
			info += "The client will be added, but he will be in the waiting list";
			Client client = new Client(name, lastName, id, phoneNumber, mail);
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
				sellers[choose].clients[i] = new Client(name, lastName, id, phoneNumber,mail);
				sellers[choose].clients[i].setAssigned(true);
				clientsHistorial.add(sellers[choose].clients[i]);
				info += "Client added!";
				add = false;
			}
		}
		return info;
	}
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
	public String attendClientWaiting(int sellerNumber) {
		String info = "";
		boolean stop = false;
		if(sellers[sellerNumber] != null) {
			if(sellers[sellerNumber].clients[0] != null) {
				for (int i = 0; i < sellers.length && !stop; i++) {
					if(sellers[sellerNumber].clients[i].equals(null)) {
						sellers[sellerNumber].clients[i] = getClientWaiting();
						stop = true;
						info += "The client was assigned to the seller " + sellers[sellerNumber].getName();
					}
				}
			}
			else
				info += "No clients waiting to be assign\n";
		}
		else
			info += "No sellers in this position";
		return info;
	}
	public String removeClient(int sellerNumber, int clientNumber) {
		String info = "";
		sellers[sellerNumber].clients[clientNumber].setAssigned(false);
		sellers[sellerNumber].clients[clientNumber].setActive(false);
		sellers[sellerNumber].clients[clientNumber] = null;
		info += "Client removed of the array of the seller";
		return info;
	}
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
	public String showSellersComplete() {
		String info = "";
		for (int i = 0; i < sellers.length; i++) {
			if(sellers[i] != null)
				info += "\nSeller #" + (i+1) + "\nID: "+sellers[i].getId()+"\nName: "+sellers[i].getName()+"\nLast name: "+sellers[i].getLastName()+"\nHad sold: "+sellers[i].getTotalSells()+" vehicles\n";
		}
		return info;
	}

	public void addDocumentation(int vehicleNumber, double priceS, double priceM, int yearS, int yearM, double accidents, double gasLevel) {
		Document soat  = new SOAT(priceS, yearS, accidents);
		Document mech  = new MechanicalTechnician(priceM, yearM, gasLevel);
		vehicles.get(vehicleNumber).legalDocumentation.add(soat);
		vehicles.get(vehicleNumber).legalDocumentation.add(mech);
	}
	public void addDocumentationSoat(int vehicleNumber, double priceS, int yearS, double accidents) {
		Document soat  = new SOAT(priceS, yearS, accidents);
		vehicles.get(vehicleNumber).legalDocumentation.add(soat);
	}
	public void addDocumentationMech(int vehicleNumber, double priceM, int yearM, double gasLevel) {
		Document mech  = new MechanicalTechnician(priceM, yearM, gasLevel);
		vehicles.get(vehicleNumber).legalDocumentation.add(mech);
	}
	public Car[][] getParking() {
		return parkingLot;
	}	
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