package model;

public class SOAT extends Document {

//	attributes
	
	private double accidents;

//	methods
	
	/**
	 * 
	 * @param accidents
	 */
	public SOAT(double price, int year,double accidents) {
		super(price, year);
		this.accidents = accidents;
	}
	
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

	@Override
	public String description(){
		String info = super.description()+"\n***SOAT***\nYear: " + super.getYear() + "\nSoat price: "+ super.getPrice() +"\nAccidents cover price: "+accidents+"\nSoat code: "+goByMatrix(super.getMatrix()) + "\n*********************\n";
				return info;
	}
	
	public double getAccidents() {
		return this.accidents;
	}

	/**
	 * 
	 * @param accidents
	 */
	public void setAccidents(double accidents) {
		this.accidents = accidents;
	}

}