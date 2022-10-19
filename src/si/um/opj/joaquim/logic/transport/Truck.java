package si.um.opj.joaquim.logic.transport;

import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class Truck.
 */
public class Truck extends Vehicle  {
	
/**
 * Instantiates a new truck.
 *
 * @param registrationNumber the registration number
 * @param averageSpeed the average speed
 * @param capacity the capacity
 * @param volume the volume
 * @param maxWeight the max weight
 * @param numberOfTrailers the number of trailers
 */
public Truck(int registrationNumber,float averageSpeed, int capacity, double volume, double maxWeight, int numberOfTrailers) {
	super(registrationNumber, averageSpeed, capacity,volume,maxWeight);
	this.numberOfTrailers =	 numberOfTrailers;
	}

/** The number of trailers. */
private int numberOfTrailers;

/**
 * Gets the number of trailers.
 *
 * @return the number of trailers
 */
public int getNumberOfTrailers() {
	return numberOfTrailers;
}

/**
 * Sets the number of trailers.
 *
 * @param numberOfTrailers the new number of trailers
 */
public void setNumberOfTrailers(int numberOfTrailers) {
	this.numberOfTrailers = numberOfTrailers;
}

/**
 * Return the Max volume of all trailers.
 *
 * @return the vehicles max volume
 */
@Override
public double getVehiclesMaxVolume() {
	return numberOfTrailers*volume;
}

@Override
public String toString() {
	return "Truck [numberOfTrailers=" + numberOfTrailers + ", volume=" + volume + ", maxWeight=" + maxWeight
			+ ", getVehiclesMaxVolume()=" + getVehiclesMaxVolume()
			+ ", getRegistrationNumber()=" + getRegistrationNumber()
			+ ", getAverageSpeed()=" + getAverageSpeed() + ", getTakenSpace()="
			+ getTakenSpace() + ", toString()=" + super.toString() + ", getCargo()=" + Arrays.toString(getCargo())
			+ "]";
}



}
