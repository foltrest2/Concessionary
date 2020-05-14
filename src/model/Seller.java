package model;

public class Seller extends Person {

//	attributes
	
	private int totalSells;
	
//	relations
	
	public Client [] clients;
	
//	constant
	
	public static final int MAX_CLIENTS = 5;
	
//	methods


	/**
	 * This method is the constructor of seller
	 * <b><pre>:<br><br>
	 * 
	 * @param name String is the name of employee
	 * @param lastName String if the last name of employee
	 * @param id integer is the id of employee
	 * 
	 * <b><post>:<br><br>
	 */
	public Seller(String name, String lastName, String id) {
		super(name, lastName, id);
		this.totalSells = 0;
		clients = new Client [MAX_CLIENTS];
	}

	public int getTotalSells() {
		return this.totalSells;
	}

	public void setTotalSells(int totalSells) {
		this.totalSells = totalSells;
	}

}