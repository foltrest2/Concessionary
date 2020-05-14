package model;

public class SOAT extends Document {

//	attributes
	
	private double accidents;

//	methods
	
	/**
	 * This method is the constructor of Soat
	 * <b><pre>:<br><br>
	 * 
	 * @param price double of Soat price
	 * @param year int of soat year
	 * @param accidents double of accidents cover mount
	 * 
	 * <b><post>:<br><br>
	 */
	public SOAT(double price, int year,double accidents) {
		super(price, year);
		this.accidents = accidents;
	}
	/**
	 * This method decode the matrix on L and then return that code in a String
	 * <b><pre>:<br>matrix is not null<br>
	 * 
	 * @param matrix is the matrix documentation 
	 * @return soatCode as String of the coding on L of documents matrix
	 * 
	 * <b><post>:<br>Coding in L and returned<br>
	 */
	public String goByMatrix(int[][] matrix) {
		String soatCode = "";
		for(int i = 0; i < super.getMatrix().length; i++) {
			soatCode += matrix[i][0];
			}
		for (int i = 1; i < super.getMatrix().length; i++) {
			soatCode += matrix[super.getMatrix().length-1][i];
		}
		return soatCode;
	}
	/**
	 * This method returns the description of soat documentation 
	 * <b><pre>:<br>constructor is not null<br>
	 * 
	 * @return info as String with the information
	 * 
	 * <b><post>:<br><br>
	 */
	@Override
	public String description(){
		String info = super.description()+"\n***SOAT***\nYear: " + super.getYear() + "\nSoat price: "+ super.getPrice() +"\nAccidents cover price: "+accidents+"\nSoat code: "+goByMatrix(super.getMatrix()) + "\n*********************\n";
				return info;
	}
	
	public double getAccidents() {
		return this.accidents;
	}

	public void setAccidents(double accidents) {
		this.accidents = accidents;
	}

}