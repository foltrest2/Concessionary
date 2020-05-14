package model;

public interface GasolineConsumable {

	/**
	 * This interface method is Override by gas vehicles that calculate theirs own gas performance
	 * <b><pre>:<br><br>
	 * 
	 * @param tankCapacity double of vehicle tank capacity
	 * @param cylinder double of vehicle cylinder
	 * @return gasPerformance already calculated
	 * 
	 * <b><post>:<br><br>
	 */
	double gasolineConsume(double tankCapacity, double cylinder);

}