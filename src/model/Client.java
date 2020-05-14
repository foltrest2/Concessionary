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

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @return the assigned
	 */
	public boolean isAssigned() {
		return assigned;
	}

	/**
	 * @param assigned the assigned to set
	 */
	public void setAssigned(boolean assigned) {
		this.assigned = assigned;
	}

	/**
	 * This method sets the telephone of client
	 * <b><pre>:<br><br>
	 * 
	 * @param phoneNumber
	 * 
	 * <b>post:</b><br>
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * This method gets the telephone of client
	 * <b><pre>:<br><br>
	 * 
	 * @return phoneNumber
	 * 
	 * <b>post:</b><br>
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * This method sets the mail of client
	 * <b><pre>:<br><br>
	 * 
	 * @param email
	 * 
	 * <b>post:</b><br>
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * This method gets the mail of client
	 * <b><pre>:<br><br>
	 * 
	 * @return email
	 * 
	 * <b>post:</b><br>
	 */
	public String getEmail() {
		return email;
	}
	

}