package model;

public class MechanicalTechnician extends Document {

//	attributes
	
	private double gasLevel;

//	methods
	
	/**
	 * This is the constructor of mechanic technical documentation
	 * <b><pre>:<br><br>
	 * 
	 * @param price double mech price
	 * @param year int mech year
	 * @param gas double of gases level on mech
	 * 
	 * <b><post>:<br><br>
	 */
	public MechanicalTechnician(double price, int year,double gasLevel) {
		super(price, year);
		this.gasLevel = gasLevel;
	}
	/**
	 * This method decode the matrix on Z and then return that code in a String
	 * <b><pre>:<br>matrix is not null<br>
	 * 
	 * @param matrix is the matrix documentation 
	 * @return MechCode as String of the coding on Z of documents matrix
	 * 
	 * <b><post>:<br>Coding in Z and returned<br>
	 */
	public String goByMatrix(int[][] matrix) {	
		String MechCode = "";
		// print first row 
		for (int j = 0; j < super.getMatrix().length - 1; j++) { 
			MechCode += matrix[0][j];
		} 
		// Print diagonal 
		int k = 1;
		for (int i = 0; i < super.getMatrix().length - 1; i++) { 
			for (int j = 0; j < super.getMatrix().length; j++) { 
				if (j == super.getMatrix().length - k) { 
					MechCode += matrix[i][j]; 
				} 
			} 
			k++; 
		} 
		// Print last row 
		int l = super.getMatrix().length - 1; 
		for (int j = 0; j < super.getMatrix().length; j++) { 
			MechCode += matrix[l][j];
		}
		return MechCode;
	} 
	/**
	 * This method returns the description of mechanical technician documentation 
	 * <b><pre>:<br>constructor is not null<br>
	 * 
	 * @return info as String with the information
	 * 
	 * <b><post>:<br><br>
	 */
	@Override
	public String description(){
		String info = super.description()+"\n***MECHANICAL TECHNICIAN***\nYear: " + super.getYear() + "\nMechanical technician price: "+ super.getPrice() +"\nGas level: "+gasLevel+"\nMech code: "+goByMatrix(super.getMatrix()) + "\n*********************\n";
				return info;
	}

	public double getGasLevel() {
		return this.gasLevel;
	}

	public void setGasLevel(double gasLevel) {
		this.gasLevel = gasLevel;
	}

}