package si.um.opj.joaquim.logic.facility;

import si.um.opj.joaquim.logic.Location;

// TODO: Auto-generated Javadoc
/**
 * The Class BusinessFacilitiy.
 */
public class BusinessFacilitiy {

	/** The name. */
	private String name;
	
	/** The location. */
	private Location location;
	
	/**
	 * Instantiates a new business facilitiy.
	 *
	 * @param name the name
	 * @param location the location
	 */
	public BusinessFacilitiy(String name, Location location) {
		this.name = name;
		this.location = location;
	}
	
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}
	
	/**
	 * Sets the location.
	 *
	 * @param location the new location
	 */
	public void setLocation(Location location) {
		this.location = location;
	}
	
}
