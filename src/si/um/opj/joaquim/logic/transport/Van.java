package si.um.opj.joaquim.logic.transport;

import java.util.Arrays;

import si.um.opj.joaquim.logic.FoodItemType;

// TODO: Auto-generated Javadoc
/**
 * The Class Van.
 */
public class Van extends Vehicle {

	private FoodItemType tipo;
	/**
	 * Instantiates a new van.
	 *
	 * @param registrationNumber the registration number
	 * @param averageSpeed the average speed
	 * @param capacity the capacity
	 * @param volume the volume
	 * @param maxWeight the max weight
	 */
	public Van(int registrationNumber,float averageSpeed, int capacity, double volume, double maxWeight) {
		super(registrationNumber, averageSpeed, capacity,volume,maxWeight);
	}

	public Van() {
	}

	/**
	 * Gets the vehicles max volume.
	 *
	 * @return the vehicles max volume
	 */
	@Override
	public double getVehiclesMaxVolume() {

		return volume;
	}
	
	public FoodItemType getTipo() {
		return tipo;
	}


	public void setTipo(FoodItemType tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Van [tipo=" + tipo + ", volume=" + volume + ", maxWeight=" + maxWeight + ", getVehiclesMaxVolume()="
				+ getVehiclesMaxVolume()+ ", getRegistrationNumber()="
				+ getRegistrationNumber() + ", getAverageSpeed()=" + getAverageSpeed() + ", getTakenSpace()=" + getTakenSpace() + ", toString()="
				+ super.toString() + ", getCargo()=" + Arrays.toString(getCargo()) + "]";
	}




}
