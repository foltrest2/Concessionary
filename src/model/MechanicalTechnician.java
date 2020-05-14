package model;

public class MechanicalTechnician extends Document {

//	attributes
	
	private double gasLevel;

//	methods
	
	/**
	 * 
	 * @param gas
	 */
	public MechanicalTechnician(double price, int year,double gasLevel) {
		super(price, year);
		this.gasLevel = gasLevel;
	}
	
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
	
	@Override
	public String description(){
		String info = super.description()+"\n***MECHANICAL TECHNICIAN***\nYear: " + super.getYear() + "\nMechanical technician price: "+ super.getPrice() +"\nGas level: "+gasLevel+"\nMech code: "+goByMatrix(super.getMatrix()) + "\n*********************\n";
				return info;
	}

	public double getGasLevel() {
		return this.gasLevel;
	}

	/**
	 * 
	 * @param gasLevel
	 */
	public void setGasLevel(double gasLevel) {
		this.gasLevel = gasLevel;
	}

}