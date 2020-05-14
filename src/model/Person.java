package model;

public abstract class Person {

//	attributes
	
	private String name;
	private String lastName;
	private String id;

//	methods
	
	/**
	 * This method is the constructor of person
	 * <b><pre>:<br><br>
	 * 
	 * @param name is the name of the person
	 * @param lastName is the last name of the person
	 * @param id is the id of the person
	 * 
	 * <b><post>:<br><br>
	 */
	public Person(String name, String lastName, String id) {
		this.id = id;
		this.lastName = lastName;
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

}