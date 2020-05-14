package model;

public abstract class Person {

//	attributes
	
	private String name;
	private String lastName;
	private String id;

//	methods
	
	/**
	 * 
	 * @param name
	 * @param lastName
	 * @param id
	 */
	public Person(String name, String lastName, String id) {
		this.id = id;
		this.lastName = lastName;
		this.name = name;
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

	public String getLastName() {
		return this.lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

}