package si.um.opj.joaquim.logic.facility;

import si.um.opj.joaquim.logic.Location;
import si.um.opj.joaquim.logic.transport.Vehicle;

// TODO: Auto-generated Javadoc
/**
 * The Class Store.
 *
 * @author joaquimpacheco
 * @version 2
 */
public class Store extends BusinessFacilitiy{
	
	

	/**
	 * Instantiates a new store.
	 *
	 * @param name the name
	 * @param location the location
	 */
	public Store(String name, Location location) {
		super(name, location);
		// TODO Auto-generated constructor stub
	}
	
	public void acceptVehicle(Vehicle vehicle) {
		vehicle.unloadFoodItems();
	}

	@Override
	public String toString() {
		return "Store [getName()=" + getName() + ", getLocation()=" + getLocation() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
