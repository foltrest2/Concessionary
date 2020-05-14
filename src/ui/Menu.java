package ui;

import model.Company;

import java.util.*;
import java.time.LocalDate;

public class Menu {

	public static final int ADD_CLIENTS = 1;
	public static final int SHOW_CLIENTS = 2;
	public static final int SHOW_CLIENTS_PER_SELLER = 3;
	public static final int CLIENTS_WAITING = 4;
	public static final int ATTEND_WAITING_CLIENT = 5;
	public static final int REMOVE_CLIENT = 6;
	public static final int ENTER_SELLER = 7;
	public static final int SHOW_SELLERS = 8;
	public static final int ADD_VEHICLES = 9;
	public static final int CATALOGUE = 10;
	public static final int ADD_FAVORITE_VEHICLE_OF_CLIENT = 11;
	public static final int SHOW_CLIENT_FAVORITES = 12;
	public static final int SELL_VEHICLE = 13;
	public static final int ORGANIZE_PARKING = 14;
	public static final int EXIT = 15;
	public static final int CLIENT_FAVORITES = 1;
	public static final int SELL = 2;
	public static final int REMOVE = 1;
	public static final int SHOW_FAVORITES = 2;
	private Company company = new Company("Volkswagen Group","800.169.756-8",0,0);
	static Scanner lector;

	/**
	 *This method initialize the menu.
	 *<pre>:<br><br>
	 *<b>post:</b> The Menu is ready.<br>
	 */
	public Menu() {
		this.company = readInitialData();
	}
	/**
	 *This method initialize the company.
	 *
	 *<b>pre:<br><br>
	 *
	 *post:<br> The company is already created.<br>
	 *@return returns company. 
	 */
	public Company readInitialData() {
		System.out.println("**********\nWelcome!\n**********\nProgram made for " + company.getName() + "\nNIT: " + company.getNit() + "\n© Copyright 2020\n");
		lector = new Scanner(System.in);
		return company;
	}
	/**
	 *This method read the information of a new client and then is assigned to a seller.
	 *<b>pre:</b>The sellers array must be created.<br>
	 *
	 *<b>post:</b>A new client was created and assigned to a seller.<br>
	 */
	public void enterClient() {
		System.out.println("Enter the client name");
		String name = lector.nextLine();
		System.out.println("Enter the client last name");
		String lastName = lector.nextLine();
		System.out.println("Enter the client ID");
		String id = lector.nextLine();
		System.out.println("Enter the client telephone");
		String phoneNumber = lector.nextLine();
		System.out.println("Enter the client email");
		String email = lector.nextLine();
		System.out.println("With which seller do you want to inscribe him?");
		System.out.println(company.showSellersComplete()+"\n");
		int choose = lector.nextInt();
		int d = 0;
		for (int i = 0; i < company.sellers.length; i++) {
			if(company.sellers[i] != null) {	
				d+=1;
			}
		}
		while(choose<1 || choose>d) {
			System.out.println("Choose him with his seller number\n");
			choose = lector.nextInt();
		}
		choose-=1;
		lector.nextLine();
		System.out.println(company.addClientToSeller(choose, name, lastName, id, phoneNumber, email));
	}
	/**
	 *This method read the information of a new seller.
	 *<b>pre:</b>The sellers array must be created.<br>
	 *
	 *<b>post:</b>A new seller was created<br>
	 */
	public void enterSeller() {
		System.out.println("Enter the seller name");
		String name = lector.nextLine();
		System.out.println("Enter the seller last name");
		String lastName = lector.nextLine();
		System.out.println("Enter the seller ID");
		String id = lector.nextLine();
		System.out.println(company.addSeller(name, lastName, id));
	}
	/**
	 *This method is a sub menu for select the type of car between Gasoline, electric or hybrid car to add to company.
	 *<b>pre:</b>Company already created.<br>
	 *
	 * @param choose is the number of vehicle 
	 * @return info to report the state of the process.
	 * 
	 *<b>post:</b>A selection was done and then can continue to the process of add a car.<br>
	 */
	public String vehicleChosen(int choose) {
		String info = "";
		switch (choose) {
		case 1:
			int typeCar = 0;
			while(typeCar < 1 || typeCar > 3) {
				System.out.println("Which of these type of cars do you buy?\n1. Gasoline\n2. Electric\n3. Hybrid");
				typeCar = lector.nextInt();
			}
			info += carChosen(typeCar);
			break;

		case 2:
			info += createMotorcycle();
			break;

		default: System.out.println("Choose a valid option please");
		break;
		}

		return info;
	}
	/**
	 * This method request the information of a motorcycle and then create it. 
	 * <b>pre<b>:</b>Company already created.<br> 
	 * 
	 * @return info to report the state of the process.
	 * 
	 * <b>post:</b>The motorcycle was created.<br>
	 */
	public String createMotorcycle() {
		String info = "";
		System.out.println("Type his base price");
		double basePrice = lector.nextDouble();
		lector.nextLine();
		System.out.println("Type his brand");
		String brand = lector.nextLine();
		System.out.println("Type his model");
		int model = lector.nextInt();
		System.out.println("Type his cylinder");
		int cylinder = lector.nextInt();
		System.out.println("Enter his mileage");
		int mileage = lector.nextInt();
		lector.nextLine();
		String time = "";
		while(time.equals("")) {
			System.out.println("The motorcycle is new or used?\n1. New\n2. Used");
			int numberTime = lector.nextInt();
			if(numberTime==1)
				time = "new";
			else if(numberTime==2)
				time = "used";
		}
		String typeMotorcycle = "";
		while(typeMotorcycle.equals("")) {
			System.out.println("Enter the type of the motorcycle\n1. Standard\n2. Sport\n3. Scooter\n4. Croos");
			int typeNumber = lector.nextInt();
			if(typeNumber == 1)
				typeMotorcycle = "Standard";
			else if(typeNumber == 2)
				typeMotorcycle = "Sport";
			else if(typeNumber == 3)
				typeMotorcycle = "Scooter";
			else if(typeNumber == 4)
				typeMotorcycle = "Cross";
		}
		lector.nextLine();
		if(time.equalsIgnoreCase("used")) {
			System.out.println("Enter his plaque");
			String plaque = lector.nextLine();
			System.out.println("Type the gasoline capacity of the motorcycle");
			double capacityGasoline = lector.nextDouble();
			System.out.println("Enter the SOAT cost");
			double priceS = lector.nextDouble();
			System.out.println("Enter the Mechanical technician cost");
			double priceM = lector.nextDouble();
			System.out.println("Enter SOAT year");
			int yearS = lector.nextInt();
			System.out.println("Enter mechanical technician year");
			int yearM = lector.nextInt();
			System.out.println("Enter cover cost of accidents: ");
			double accidents = lector.nextDouble();
			lector.nextLine();
			System.out.println("Enter the gases levels");
			double gasLevel = lector.nextDouble();
			lector.nextLine();
			company.createMotorcycle(basePrice, brand, model, cylinder, mileage, time, plaque, typeMotorcycle, capacityGasoline, priceS, priceM, yearS, yearM, accidents, gasLevel);
		}
		else if(time.equalsIgnoreCase("new")) {
			System.out.println("Type the gasoline capacity of the motorcycle");
			double capacityGasoline = lector.nextDouble();
			company.createMotorcycle(basePrice, brand, model, cylinder, mileage, time, typeMotorcycle, capacityGasoline);
		}
		return info += "The motorcycle was succesfully created";
	}
	/**This method receives the type of car to add, and request all information.
	 * <b>pre<b>:</b>Company already created.<br> 
	 * 
	 * @param typeCar Integer of the selection of what type of car to add.
	 * 
	 * <b>post:</b>The car information is saved to continue to the process of ad a car.<br>
	 */
	public void createNewCar(int typeCar) {
		System.out.println("Type his base price");
		double basePrice = lector.nextDouble();
		lector.nextLine();
		System.out.println("Type his brand");
		String brand = lector.nextLine();
		System.out.println("Type his model");
		int model = lector.nextInt();
		System.out.println("Type his cylinder");
		int cylinder = lector.nextInt();
		System.out.println("Enter his mileage");
		int mileage = lector.nextInt();
		lector.nextLine();
		String time = "";
		while(time.equals("")) {
			System.out.println("The car is new or used?\n1. New\n2. Used");
			int numberTime = lector.nextInt();
			if(numberTime==1)
				time = "new";
			else if(numberTime==2)
				time = "used";
		}
		String bodyType = "";
		while(bodyType.equals("")) {
			System.out.println("What is the body type?\n1. Sedan\n2. Van");
			int numBodyType = lector.nextInt();
			if(numBodyType==1)
				bodyType = "Sedan";
			else if(numBodyType==2)
				bodyType = "Van";
		}
		lector.nextLine();
		System.out.println("Type the doors number in the car");
		int doorsNumber = lector.nextInt();
		String windows = "";
		while(windows.equals("")) {
			System.out.println("Are the windows polarized?\n1. Yes\n2. No");
			int polarized = lector.nextInt();
			if(polarized==1)
				windows = "Yes";
			else if(polarized==2)
				windows = "No";
		}
		lector.nextLine();
		if(time.equalsIgnoreCase("used")) {
			System.out.println("Enter his plaque");
			String plaque = lector.nextLine();
			switch (typeCar) {
			case 1:
				System.out.println("Enter the tank capacity");
				double tankCapacity = lector.nextInt();
				lector.nextLine();
				String typeGasoline = "";
				while(typeGasoline.equals("")) {
					System.out.println("What is the type of the gasoline?\n1. Corriente\n2. Diesel\n3. Extra");
					int choose = lector.nextInt();
					if(choose == 1)
						typeGasoline = "Corriente";
					else if(choose == 2)
						typeGasoline = "Diesel";
					else if(choose == 3)
						typeGasoline = "Extra";
				}
				System.out.println("Enter the SOAT cost");
				double priceS = lector.nextDouble();
				System.out.println("Enter the Mechanical technician cost");
				double priceM = lector.nextDouble();
				System.out.println("Enter SOAT year");
				int yearS = lector.nextInt();
				System.out.println("Enter mechanical technician year");
				int yearM = lector.nextInt();
				System.out.println("Enter cover cost of accidents: ");
				double accidents = lector.nextDouble();
				lector.nextLine();
				System.out.println("Enter the gases levels");
				double gasLevel = lector.nextDouble();
				lector.nextLine();
				company.createGasolineCar(basePrice, brand, model, cylinder, mileage, time, plaque, bodyType, doorsNumber, windows, typeCar, tankCapacity, typeGasoline, priceS, priceM, yearS, yearM, accidents, gasLevel);
				break;

			case 2:
				String typeCharger = "";
				while(typeCharger.equals("")) {
					System.out.println("What is the type of the charger?\n1. Normal\n2. Fast");
					int choose = lector.nextInt();
					if(choose == 1)
						typeCharger = "Normal";
					else if(choose == 2)
						typeCharger = "Fast";
				}
				System.out.println("Enter the battery life");
				double batteryLife = lector.nextDouble();
				System.out.println("Enter the SOAT cost");
				double priceSE = lector.nextDouble();
				System.out.println("Enter the Mechanical technician cost");
				double priceME = lector.nextDouble();
				System.out.println("Enter SOAT year");
				int yearSE = lector.nextInt();
				System.out.println("Enter mechanical technician year");
				int yearME = lector.nextInt();
				System.out.println("Enter cover cost of accidents: ");
				double accidentsE = lector.nextDouble();
				lector.nextLine();
				System.out.println("Enter the gases levels");
				double gasLevelE = lector.nextDouble();
				lector.nextLine();
				company.createElectricCar(basePrice, brand, model, cylinder, mileage, time, plaque, bodyType, doorsNumber, windows, typeCar, typeCharger, batteryLife,priceSE, priceME, yearSE, yearME, accidentsE, gasLevelE);
				break;

			case 3:
				System.out.println("Enter the tank capacity");
				double tankCapacityH = lector.nextInt();
				lector.nextLine();
				String typeGasolineH = "";
				while(typeGasolineH.equals("")) {
					System.out.println("What is the type of the gasoline?\n1. Corriente\n2. Diesel\n3. Extra");
					int choose = lector.nextInt();
					if(choose == 1)
						typeGasolineH = "Corriente";
					else if(choose == 2)
						typeGasolineH = "Diesel";
					else if(choose == 3)
						typeGasolineH = "Extra";
				}
				String typeChargerH = "";
				while(typeChargerH.equals("")) {
					System.out.println("What is the type of the charger?\n1. Normal\n2. Fast");
					int choose = lector.nextInt();
					if(choose == 1)
						typeChargerH = "Normal";
					else if(choose == 2)
						typeChargerH = "Fast";
				}
				System.out.println("Enter the battery life");
				double batteryLifeH = lector.nextDouble();
				System.out.println("Enter the SOAT cost");
				double priceSH = lector.nextDouble();
				System.out.println("Enter the Mechanical technician cost");
				double priceMH = lector.nextDouble();
				System.out.println("Enter SOAT year");
				int yearSH = lector.nextInt();
				System.out.println("Enter mechanical technician year");
				int yearMH = lector.nextInt();
				System.out.println("Enter cover cost of accidents: ");
				double accidentsH = lector.nextDouble();
				lector.nextLine();
				System.out.println("Enter the gases levels");
				double gasLevelH = lector.nextDouble();
				lector.nextLine();
				company.createHybridCar(basePrice, brand, model, cylinder, mileage, time, plaque, bodyType, doorsNumber, windows, typeCar, typeChargerH, batteryLifeH, tankCapacityH, typeGasolineH, priceSH, priceMH, yearSH, yearMH, accidentsH, gasLevelH);
				break;

			default: System.out.println("Enter a valid option");
			break;
			}
		}
		else if(time.equalsIgnoreCase("new")) {
			switch (typeCar) {
			case 1:
				System.out.println("Enter the tank capacity");
				double tankCapacity = lector.nextInt();
				lector.nextLine();
				String typeGasoline = "";
				while(typeGasoline.equals("")) {
					System.out.println("What is the type of the gasoline?\n1. Corriente\n2. Diesel\n3. Extra");
					int choose = lector.nextInt();
					if(choose == 1)
						typeGasoline = "Corriente";
					else if(choose == 2)
						typeGasoline = "Diesel";
					else if(choose == 3)
						typeGasoline = "Extra";
				}
				company.createGasolineCar(basePrice, brand, model, cylinder, mileage, time, bodyType, doorsNumber, windows, typeCar, tankCapacity, typeGasoline);
				break;

			case 2:
				String typeCharger = "";
				while(typeCharger.equals("")) {
					System.out.println("What is the type of the charger?\n1. Normal\n2. Fast");
					int choose = lector.nextInt();
					if(choose == 1)
						typeCharger = "Normal";
					else if(choose == 2)
						typeCharger = "Fast";
				}
				System.out.println("Enter the battery life");
				double batteryLife = lector.nextDouble();
				company.createElectricCar(basePrice, brand, model, cylinder, mileage, time, bodyType, doorsNumber, windows, typeCar, typeCharger, batteryLife);
				break;

			case 3:
				System.out.println("Enter the tank capacity");
				double tankCapacityH = lector.nextInt();
				lector.nextLine();
				String typeGasolineH = "";
				while(typeGasolineH.equals("")) {
					System.out.println("What is the type of the gasoline?\n1. Corriente\n2. Diesel\n3. Extra");
					int choose = lector.nextInt();
					if(choose == 1)
						typeGasolineH = "Corriente";
					else if(choose == 2)
						typeGasolineH = "Diesel";
					else if(choose == 3)
						typeGasolineH = "Extra";
				}
				String typeChargerH = "";
				while(typeChargerH.equals("")) {
					System.out.println("What is the type of the charger?\n1. Normal\n2. Fast");
					int choose = lector.nextInt();
					if(choose == 1)
						typeChargerH = "Normal";
					else if(choose == 2)
						typeChargerH = "Fast";
				}
				System.out.println("Enter the battery life");
				double batteryLifeH = lector.nextDouble();
				company.createHybridCar(basePrice, brand, model, cylinder, mileage, time, bodyType, doorsNumber, windows, typeCar, typeChargerH, batteryLifeH, tankCapacityH, typeGasolineH);
				break;

			default: System.out.println("Choose a valid option please");
			break;
			}
		}
	}
	/**
	 * This method notify about the car was added without problems.
	 * <b>pre<b>:</b>A car was created.<br> 
	 * 
	 * @param selection integer depend of the type of car that was created.
	 * @return info as String of the notification.
	 * 
	 * <b>post:</b>The new car now is visible on the list.<br>
	 */
	public String carChosen(int selection) {
		String info = "";
		switch (selection) {
		case 1:
			createNewCar(selection);
			info += "Your gasoline car was created";
			break;

		case 2:
			createNewCar(selection);
			info += "Your electric car was created";
			break;

		case 3:
			createNewCar(selection);
			info += "Your hybrid car was created";
			break;

		default: System.out.println("Choose a correct option");
		break;
		}
		return info;
	}
	/**
	 * This method select the type of vehicle to add between Car o Motorcycle.
	 * <b>pre<b>:</b>The company was created.<br>
	 * 
	 * @return info as String of the notification of process.
	 * 
	 * <b>post:</b>Continues on the process to add a vehicle.<br>
	 */
	public String enterVehicle() {
		int choose = 0;
		while(choose < 1 || choose > 2) {
			System.out.println("What vehicle do you buy?\n1. Car\n2. Motorcycle");
			choose = lector.nextInt();
		}
		String info = vehicleChosen(choose);
		return info;
	}
	/**
	 * This method show the historical clients
	 * <b>pre<b>:</b>The historical clients was initialized.<br>
	 * <b>post:</b>Deploy a list.<br>
	 */
	public void showClientsHistorial() {
		String info = "";
		for (int i = 0; i < company.clientsHistorial.size(); i++) {
			System.out.println("***Client***\n");
			info = "Name: "+company.clientsHistorial.get(i).getName()+"\nLast name: "+company.clientsHistorial.get(i).getLastName()+"\nID: "+company.clientsHistorial.get(i).getId()+"\n" + "Phone number: " + company.clientsHistorial.get(i).getPhoneNumber() + "\n" + "Email: " + company.clientsHistorial.get(i).getEmail() + "\n" + "Is the client active? " + toString(company.clientsHistorial.get(i).isActive()) + "\nIs the client assigned? " + toString(company.clientsHistorial.get(i).isAssigned()) + "\n" + "This was the client # " + (i+1) + "\n";
			System.out.println(info);
		} 
		System.out.println("\nThe company has attend " + company.clientsHistorial.size() + " clients at the moment\n");
	}
	/**
	 * This method makes the discount of a selected vehicle and then apply it, used on the Main menu.
	 * <b>pre<b>:</b>A vehicle must be created as minimum.<br>
	 * 
	 * @param vehicleNumber is the position of the vehicle to apply the discount
	 * 
	 * <b>post:</b>The discount was applied to selected vehicle.<br>
	 */
	public void discount(int vehicleNumber) {
		double value = 0;
		double amount = 0;
		double finalValue = 0;
		System.out.println("How many discount do you want to apply?");
		value = 0;
		while(value < 1 || value >99) {
			System.out.println("Enter values between 1 and 99 percent");
			value = lector.nextInt();
		}
		value /= 100;
		amount = company.vehicles.get(vehicleNumber).getSellPrice() * value;
		finalValue = company.vehicles.get(vehicleNumber).getSellPrice() - amount;
		company.vehicles.get(vehicleNumber).setSellPrice(finalValue);
		System.out.println("Discount of "+value*100+"% Was applied to vehicle!\nPlease check on the vehicle list\n");
	}
	/**
	 * This method decide with the information that it receives if is necessary to appply a discount or not
	 * <b>pre<b>:</b>A vehicle must be created as minimum.<br>
	 * 
	 * @param decision is the decision to apply or not the discount
	 * @param vehicleNumber is the position of the vehicle
	 * 
	 * <b>post:</b><br>
	 */
	public void applyDiscount(int decision, int vehicleNumber) {
		switch (decision) {
		case 1:
			discount(vehicleNumber);
			break;
		case 2:
			System.out.println("\nNo discount applied\n");
			break;
		default:
			break;
		}
	}
	/**
	 * This method makes the pay for a vehicle.
	 * <b>pre<b>:</b>A vehicle must be created as minimum.<br>
	 * 
	 * @param vehicleNumber Integer of position on the arrayList
	 * @param sellerNumber Integer of position on sales Man array
	 * @param clientNumber Integer of position of client on clients arrayList
	 * 
	 * <b>post:</b>The paid was finalized and the vehicle now have a new owner.<br>
	 */ 
	public void pay(int vehicleNumber, int sellerNumber, int clientNumber) {
		int docSoat = company.vehicles.get(vehicleNumber).legalDocumentation.size()-2;
		int docMech = company.vehicles.get(vehicleNumber).legalDocumentation.size()-1;
		int sells = company.sellers[sellerNumber].getTotalSells()+1;
		company.sellers[sellerNumber].setTotalSells(sells);
		int companySells = company.getSells()+1;
		company.setSells(companySells);
		if(LocalDate.now().getYear()!= company.vehicles.get(vehicleNumber).legalDocumentation.get(docSoat).getYear()) {
			System.out.println("\nThe mount for the SOAT is $" + company.vehicles.get(vehicleNumber).legalDocumentation.get(docSoat).getPrice() + "\n");
			System.out.println("Your SOAT is out of date, you need to pay a extrapay. This equals to $250.000 extra\n");
			double pay = company.vehicles.get(vehicleNumber).getSellPrice() + company.vehicles.get(vehicleNumber).legalDocumentation.get(docSoat).getPrice() + 250000;
			company.vehicles.get(vehicleNumber).setSellPrice(pay);
		}
		else {
			System.out.println("\nThe mount for the SOAT is $" + company.vehicles.get(vehicleNumber).legalDocumentation.get(docSoat).getPrice() + "\n");
			double pay = company.vehicles.get(vehicleNumber).getSellPrice() + company.vehicles.get(vehicleNumber).legalDocumentation.get(docSoat).getPrice();
			company.vehicles.get(vehicleNumber).setSellPrice(pay);
		}
		if(LocalDate.now().getYear()!= company.vehicles.get(vehicleNumber).legalDocumentation.get(docMech).getYear()) {
			System.out.println("\nThe mount for the mechanical technician is $" + company.vehicles.get(vehicleNumber).legalDocumentation.get(docMech).getPrice() + "\n");
			System.out.println("Your mechanical technician is out of date, you need to pay a extrapay. This equals to $250.000 extra\n");
			double pay = company.vehicles.get(vehicleNumber).getSellPrice()+company.vehicles.get(vehicleNumber).legalDocumentation.get(docMech).getPrice()+250000;
			company.vehicles.get(vehicleNumber).setSellPrice(pay);
		}
		else {
			System.out.println("\nThe mount for the mechanical technician is $" + company.vehicles.get(vehicleNumber).legalDocumentation.get(docMech).getPrice() + "\n");
			double pay = company.vehicles.get(vehicleNumber).getSellPrice() + company.vehicles.get(vehicleNumber).legalDocumentation.get(docMech).getPrice();
			company.vehicles.get(vehicleNumber).setSellPrice(pay);
		}
		int decision = 0;
		while(decision<1 || decision>2) {
			System.out.println("\nYou want to do some discount?\n1. Yes\n2. No");
			decision = lector.nextInt();
		}
		applyDiscount(decision, vehicleNumber);
		double pay = company.vehicles.get(vehicleNumber).getSellPrice();
		company.setTotalGain(pay);
	}
	/**
	 * This method receives the operation to do with a client, between add a vehicle to favorites or do the documentation for a vehicle to sell.
	 * <b>pre<b>:</b>A vehicle and a client must be created as minimum.<br>
	 * 
	 * @param choose Integer of the option selected. 
	 * 
	 * <b>post:</b>Makes the operation that was selected.<br>
	 */
	public void operationsWithSpecificClient(int choose) {
		System.out.println("The company has these sellers with those assigned clients");
		System.out.println(company.clientsPerSeller()+"\n");
		System.out.println("With which seller are the client inscribe?\n");
		int sellerNumber = 0;
		int d = 0;
		for (int i = 0; i < company.sellers.length; i++) {
			if(company.sellers[i] != null) {	
				d+=1;
			}
		}
		while(sellerNumber<1 || sellerNumber>d) {
			System.out.println("Choose him with his seller number\n");
			sellerNumber = lector.nextInt();
		}
		sellerNumber-=1;
		if(company.sellers[sellerNumber].clients[0]!=null) {
			System.out.println("\nWhich of the assigned clients you need?\n");
			int clientNumber = 0;
			int k = 0;
			for (int i = 0; i < company.sellers[sellerNumber].clients.length; i++) {
				if(company.sellers[sellerNumber].clients[i] != null) {	
					k+=1;
				}
			}
			while(clientNumber<1 || clientNumber>k) {
				System.out.println("Choose him with his seller number\n");
				clientNumber = lector.nextInt();
			}
			clientNumber-=1;
			if(company.vehicles.size() > 0) {
				System.out.println();
				System.out.println("Which vehicle do you want to use?\n");
				System.out.println(company.showVehicles(3)+"\n");
				int vehicleNumber = 0;
				while(vehicleNumber < 1 || vehicleNumber>company.vehicles.size()) {
					System.out.println("Choose it with it's vechicle number\n");
					vehicleNumber = lector.nextInt();
				}
				vehicleNumber-=1;
				lector.nextLine();
				switch (choose) {

				case CLIENT_FAVORITES:
					company.sellers[sellerNumber].clients[clientNumber].favorites.add(company.vehicles.get(vehicleNumber));
					System.out.println("Vehicle added to favorites to the client: " + company.sellers[sellerNumber].clients[clientNumber].getName());
					break;

				case SELL:
					if(company.vehicles.get(vehicleNumber).isSold()==true)
						System.out.println("This vehicle is already sold");
					else {
						company.vehicles.get(vehicleNumber).setSold(true);
						company.vehicles.get(vehicleNumber).setOwner(company.sellers[sellerNumber].clients[clientNumber].getName());
						if(company.vehicles.get(vehicleNumber).getTime().equalsIgnoreCase("new")) {
							System.out.println("Type a plaque for the vehicle: ");
							String plaque = lector.nextLine();
							company.vehicles.get(vehicleNumber).setPlaque(plaque);
							System.out.println("Now, let's do the documentation");
							System.out.println("Enter the SOAT cost");
							double priceS = lector.nextDouble();
							System.out.println("Enter the Mechanical technician cost");
							double priceM = lector.nextDouble();
							int yearS = LocalDate.now().getYear();
							int yearM = LocalDate.now().getYear();
							System.out.println("Enter the mount to cover accidents");
							double accidents = lector.nextDouble();
							System.out.println("Enter the gas levels");
							double gasLevel = lector.nextDouble();
							company.addDocumentation(vehicleNumber, priceS, priceM, yearS, yearM, accidents, gasLevel);
							pay(vehicleNumber, sellerNumber, clientNumber);
							System.out.println("Vehicle sold!");
						}
						else if(company.vehicles.get(vehicleNumber).getTime().equalsIgnoreCase("used")){
							if(company.vehicles.get(vehicleNumber).legalDocumentation.get(company.vehicles.get(vehicleNumber).legalDocumentation.size()-2).getYear() != LocalDate.now().getYear() && company.vehicles.get(vehicleNumber).legalDocumentation.get(company.vehicles.get(vehicleNumber).legalDocumentation.size()-1).getYear() != LocalDate.now().getYear()) {
								System.out.println("Now, let's actualice the documentation (Your both documents are expired. This doesn't exempt you from payment)");
								System.out.println("Enter the SOAT price");
								double priceS = lector.nextDouble();
								company.vehicles.get(vehicleNumber).legalDocumentation.get(company.vehicles.get(vehicleNumber).legalDocumentation.size()-2).setPrice(priceS);
								System.out.println("Enter the mount to cover accidents");
								double accidents = lector.nextDouble();
								System.out.println("Enter the mechanical technician price");
								double priceM = lector.nextDouble();
								company.vehicles.get(vehicleNumber).legalDocumentation.get(company.vehicles.get(vehicleNumber).legalDocumentation.size()-1).setPrice(priceM);
								System.out.println("Enter the gas levels");
								double gasLevel = lector.nextDouble();
								pay(vehicleNumber, sellerNumber, clientNumber);
								int yearS = LocalDate.now().getYear();
								int yearM = LocalDate.now().getYear();
								company.addDocumentation(vehicleNumber, priceS, priceM, yearS, yearM, accidents, gasLevel);
								System.out.println("Vehicle sold!");
							}
							if(company.vehicles.get(vehicleNumber).legalDocumentation.get(company.vehicles.get(vehicleNumber).legalDocumentation.size()-2).getYear() != LocalDate.now().getYear()) {
								System.out.println("Now, let's actualice the documentation (Your SOAT is expired. This doesn't exempt you from payment)");
								System.out.println("Enter the SOAT price");
								double priceS = lector.nextDouble();
								company.vehicles.get(vehicleNumber).legalDocumentation.get(company.vehicles.get(vehicleNumber).legalDocumentation.size()-2).setPrice(priceS);
								System.out.println("Enter the mount to cover accidents");
								double accidents = lector.nextDouble();
								pay(vehicleNumber, sellerNumber, clientNumber);
								int yearS = LocalDate.now().getYear();
								company.addDocumentationSoat(vehicleNumber, priceS, yearS, accidents);
								System.out.println("Vehicle sold!");
							}
							if(company.vehicles.get(vehicleNumber).legalDocumentation.get(company.vehicles.get(vehicleNumber).legalDocumentation.size()-1).getYear() != LocalDate.now().getYear()) {
								System.out.println("Now, let's actualice the documentation (Your mechanical technician is expired. This doesn't exempt you from payment)");
								System.out.println("Enter the mechanical technician price");
								double priceM = lector.nextDouble();
								company.vehicles.get(vehicleNumber).legalDocumentation.get(company.vehicles.get(vehicleNumber).legalDocumentation.size()-1).setPrice(priceM);
								System.out.println("Enter the gas levels");
								double gasLevel = lector.nextDouble();
								pay(vehicleNumber, sellerNumber, clientNumber);
								int yearM = LocalDate.now().getYear();
								company.addDocumentationSoat(vehicleNumber, priceM, yearM, gasLevel);	
								System.out.println("Vehicle sold!");
							}
						}
					}
					break;

				default: System.out.println("Enter a valid number");
				break;
				}
			}
			else
				System.out.println("No vehicles in the concessionary yet");
		}
		else
			System.out.println("No clients with the seller yet");
	}
	/**
	 * This method receives the model year to know on the parking lot.
	 * <b>pre:</b>A vehicle of 2014 or less model must be created as minimum.<br>
	 * <b>pre:</b>Must be select an option between 1 to 5.<br>
	 * 
	 * <b>post:</b>Will continue to know the information of that model on the parking lot.<br>
	 */
	public void selectModelOrganize() {
		int select = 0; 
		boolean cont = false;
		if(company.vehicles.size()>0) {
			System.out.println("\nTo show the organization of parking loat please select the year");
			System.out.println("\n1. 2014 \n2. 2013 \n3. 2012\n4. 2011\n5. Below 2011\n");
			select = lector.nextInt();
			while(!cont) {
				switch (select) {
				case 1:
					select = 2014;
					cont = true;
					break;
				case 2:
					select = 2013;
					cont = true;
					break;
				case 3:
					select = 2012;
					cont = true;
					break;
				case 4:
					select = 2011;
					cont = true;
					break;
				case 5:
					select = 2010;
					cont = true;
					break;
				default:
					System.out.println("**please select a correct option**");
					break;
				}
			}
			System.out.println(company.getInfoParking(select));
		}
		else
			System.out.println("\nNo vehicles in the concessionary yet\n");
	}
	/**
	 * This method convert a boolean to a String yes or not
	 * 
	 * <b>pre:</b>a boolean its required<br>
	 * 
	 * @param x boolean received
	 * @return boolean converted into yes or not
	 * 
	 * <b>post:</b><br>
	 */
	public String toString(boolean x) {
		String converted = "";
		if(x==true)
			converted = "Yes";
		else
			converted = "No";
		return converted;
	}
	/**
	 * This method collect the information for attend a waiting client
	 * <b>pre:</b>A client as minimum was created.<br>
	 * 
	 * <b>post:</b>The waiting client is assigned to the seller chosen<br>
	 */
	public void attendWaitingClient() {
		System.out.println("The company has these sellers with those assigned clients");
		System.out.println(company.clientsPerSeller()+"\n");
		System.out.println("With which seller want the waiting client to be attend?\n");
		int sellerNumber = 0;
		while(sellerNumber<1 || sellerNumber>10) {
			System.out.println("Choose him with his seller number\n");
			sellerNumber = lector.nextInt();
		}
		sellerNumber-=1;
		System.out.println(company.attendClientWaiting(sellerNumber));
	}
	/**
	 *This method add read the necessary information for remove a client of a array of sellers and show his favorites, depending of the integer choose.
	 *<b>pre:</b>A client as minimum was created.<br>
	 *
	 *@param choose is the number of the select option 
	 *
	 *<b>post:</b>The selected client has a favorite vehicle on his list or is in the array of sellers.<br>
	 */
	public void same(int choose) {
		System.out.println("The company has these sellers with those assigned clients");
		System.out.println(company.clientsPerSeller()+"\n");
		System.out.println("With which seller are the client inscribe?\n");
		int sellerNumber = 0;
		int d = 0;
		for (int i = 0; i < company.sellers.length; i++) {
			if(company.sellers[i] != null) {	
				d+=1;
			}
		}
		while(sellerNumber<1 || sellerNumber>d) {
			System.out.println("Choose him with his seller number\n");
			sellerNumber = lector.nextInt();
		}
		sellerNumber-=1;
		if(company.sellers[sellerNumber].clients[0]!=null) {
			System.out.println("\nWhich of the assigned clients you need?\n");
			int clientNumber = 0;
			int k = 0;
			for (int i = 0; i < company.sellers[sellerNumber].clients.length; i++) {
				if(company.sellers[sellerNumber].clients[i] != null) {	
					k+=1;
				}
			}
			while(clientNumber<1 || clientNumber>k) {
				System.out.println("Choose him with his seller number\n");
				clientNumber = lector.nextInt();
			}
			clientNumber-=1;
			switch (choose) {
			case REMOVE:
				System.out.println(company.removeClient(sellerNumber, clientNumber));
				break;

			case SHOW_FAVORITES:
				System.out.println(company.favoriteVehicles(sellerNumber, clientNumber));
				break;
			default:
				break;
			}

		}
		else
			System.out.println("No clients with the seller yet");
	}
	/**
	 * This method show the catalog of vehicles depend of the choose to show
	 *  <b>pre:</b>Select a number between 1 or 3.<br>
	 *  
	 *  <b>post:</b><br>
	 */
	public void showCatalogue() {
		int choose = 0;
		while(choose < 1 || choose > 3) {
			System.out.println("What vehicles do you want to see?\n1. New vehicles\n2. Used vehicles\n3. Both kind of vehicles");
			choose = lector.nextInt();
		}
		System.out.println(company.showVehicles(choose));
	}
	/**
	 * This method show the actualized information of the company
	 * <b>pre:</b>Company must be initialized<br>
	 * 
	 * <b>post:</b><br>
	 */
	public void showInfoCompany() {
		System.out.println("\n***************\nThis is the latest information of the company: \n\nThe company sold a total of " + company.getSells() + " vehicles\nThe company gain a total of $" + company.getTotalGain() + "\n***************\n");
	}
	/**
	 * This method is the operation of the options to select on Main menu.
	 * <b>pre:</b>Select numbers between that options.<br>
	 * 
	 * @param choice
	 * 
	 * <b>post:</b><br>
	 */
	public void operation(int choice) {
		switch (choice) {

		case ADD_CLIENTS:
			enterClient();
			break;

		case SHOW_CLIENTS:
			showClientsHistorial();
			break;

		case SHOW_CLIENTS_PER_SELLER:
			System.out.println(company.clientsPerSeller());
			break;

		case CLIENTS_WAITING:
			System.out.println(company.clientsWaiting());
			break;

		case ATTEND_WAITING_CLIENT:
			attendWaitingClient();
			break;

		case REMOVE_CLIENT:
			same(REMOVE);
			break;

		case ENTER_SELLER:
			enterSeller();
			break;

		case SHOW_SELLERS:
			System.out.println(company.showSellersComplete());
			break;
		case ADD_VEHICLES:
			System.out.println(enterVehicle());
			break;

		case CATALOGUE:
			showCatalogue();
			break;

		case ADD_FAVORITE_VEHICLE_OF_CLIENT:
			operationsWithSpecificClient(CLIENT_FAVORITES);
			break;

		case SHOW_CLIENT_FAVORITES:
			same(SHOW_FAVORITES);
			break;

		case SELL_VEHICLE:
			operationsWithSpecificClient(SELL);
			break;

		case ORGANIZE_PARKING:
			System.out.println(company.organizeParking());
			selectModelOrganize();
			break;

		case EXIT:
			System.out.println("**********\\nThanks for use the program!\\n**********\n\nThis program was made for " + company.getName() + "\nNIT: " + company.getNit() + "\n© Copyright 2020");
			break;

		default: System.out.println("Select a valid choice");
		break;
		}
	}
	/**
	 * This method deploy the main program menu.
	 * <b>pre:</b>Company and employees must be initialized.<br>
	 * <b>pre:</b>Select a valid option.<br>
	 * 
	 * <b>post:</b><br>
	 */
	public void showMenu() {
		System.out.println("What do you want to do?\n 1. Enter clients\n 2. Show clients historial\n 3. Show clients per seller\n 4. Clients waiting\n 5. Attend waiting client\n 6. Remove client from the array of sellers\n 7. Enter seller\n 8. Show sellers\n 9. Enter vehicles\n 10. Show catalogue of vehicles in the concessionary\n 11. Add a vehicle favorite to the list of the client\n 12. Show the favorites of a client\n 13. Sell a vehicle\n 14. View of the parking\n 15. Exit\n");
	}
	/**
	 *This method read the option entry by the client for the Main menu.
	 *<b>pre:</b>Select an option between 1 to 11. <br>
	 *
	 *@return the select option of the menu
	 *<b>post:</b><br>
	 */
	public int readOption() {	
		int choice = lector.nextInt();
		lector.nextLine();
		return choice;
	}
	/**
	 * This method start the program, initialize some sellers, company and show the information of the company.
	 * <b>pre:</b><br>
	 * 
	 * <b>post:</b><br>
	 */
	public void startProgram() {
		int choice;
		do {
			showInfoCompany();
			showMenu();
			choice = readOption();
			operation(choice);
		}
		while(choice!=EXIT);
	}
}