package model;

import java.util.Random;

public abstract class Document {

//	attributes
	
	private double price;
	private int year;
	private int [][] matrix;
	private final static int SIZE = 4;

//	methods
	
	/**
	 * This method is the constructor of documents 
	 * <b><pre>:<br><br>
	 * 
	 * @param price double documents price
	 * @param year int documents year
	 * @param matrix int[][] is the general random matrix for documentations
	 * 
	 * <b><post>:<br><br>
	 */
	public Document(double price, int year) {
		this.price = price;
		this.year = year;
		this.matrix = makeMatrix();
	}
	/**
	 * This method make a random matrix of integers
	 * <b><pre>:<br><br>
	 * 
	 * @return matrix of integers ready to coding
	 * 
	 * <b><post>:<br>Matrix is randomly and ready to use it<br>
	 */
	public int[][] makeMatrix() {
		matrix = new int[SIZE][SIZE];
		Random ran = new Random();
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				matrix[i][j] = ran.nextInt(99);
			}
		}
		return matrix;
	}
	/**
	 * This method initialize the description for the heritage
	 * 
	 * @return String info null
	 */
	public String description() {
		String info ="";
		return info;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int[][] getMatrix() {
		return this.matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}

}