package model;

public interface Soldable {

	/**
	 * This method calculates the sell price of a new vehicle
	 * <b><pre>:<br>The vehicle must be initialized<br>
	 * 
	 * @param basePrice is the base price of the vehicle
	 * @return sell price calculated
	 * 
	 * <b><post>:<br><br>
	 */
	double calculateSellPriceNew(double basePrice);
	/**
	 * This method calculates the sell price of a used vehicle
	 * <b><pre>:<br>The vehicle must be initialized<br>
	 * 
	 * @param basePrice is the base price of the vehicle
	 * @return sell price calculated
	 * 
	 * <b><post>:<br><br>
	 */
	double calculateSellPriceUsed(double basePrice);
	
}
