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
	 * 
	 * @param price
	 * @param year
	 * @param imageCode
	 * @param code
	 */
	public Document(double price, int year) {
		this.price = price;
		this.year = year;
		this.matrix = makeMatrix();
	}
	
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
	
	public String description() {
		String info ="";
		return info;
	}

	public double getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return this.year;
	}

	/**
	 * 
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}

	public int[][] getMatrix() {
		return this.matrix;
	}

	/**
	 * 
	 * @param matrix
	 */
	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}

}