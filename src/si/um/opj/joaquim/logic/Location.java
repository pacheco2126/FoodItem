package si.um.opj.joaquim.logic;

// TODO: Auto-generated Javadoc
/**
 * The Class Location.
 *
 * @author joaquimpacheco
 * @version 2
 */
public class Location {
	
	/** The country. */
	String city, country;
	
	/**
	 * Instantiates a new location.
	 *
	 * @param city the city
	 * @param country the country
	 */
	public Location(String city, String country) {
		super();
		this.city=city;
		this.country=country;
	}


	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Location [city=" + city + ", country=" + country + "]";
	}


	/**
	 * Instantiates a new location.
	 */
	public Location() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(String country) {
		this.country = country;
	}
}
