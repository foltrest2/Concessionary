package model;

import java.util.ArrayList;

public class Client extends Person {

	//	attributes

	private String phoneNumber;
	private String email;
	private boolean active;
	private boolean assigned;

	//	relations

	public ArrayList<Vehicle> favorites;

	//	methods

	/**
	 * This method is the constructor of Client
	 * <b><pre>:<br><br>
	 * 
	 * @param name String name of client
	 * @param lastName String last name of client
	 * @param id integer is the id of client
	 * @param phoneNumber integer is the telephone
	 * @param email String mail is the mail of client
	 * 
	 * <b>post:</b><br>
	 */
	public Client(String name, String lastName, String id, String phoneNumber, String email) {
		super(name, lastName, id);
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.active = true;
		this.assigned = false;
		favorites = new ArrayList<>();
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isAssigned() {
		return assigned;
	}

	public void setAssigned(boolean assigned) {
		this.assigned = assigned;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
	
}