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
	 * 
	 * @param name
	 * @param lastName
	 * @param id
	 * @param totalSells
	 */
	public Seller(String name, String lastName, String id) {
		super(name, lastName, id);
		this.totalSells = 0;
		clients = new Client [MAX_CLIENTS];
	}

	public int getTotalSells() {
		return this.totalSells;
	}

	/**
	 * 
	 * @param totalSells
	 */
	public void setTotalSells(int totalSells) {
		this.totalSells = totalSells;
	}

}