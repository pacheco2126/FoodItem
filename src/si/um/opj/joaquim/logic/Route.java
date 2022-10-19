package si.um.opj.joaquim.logic;

import si.um.opj.joaquim.logic.facility.Store;
import si.um.opj.joaquim.logic.facility.Warehouse;

/**
 * @author joaquimpacheco
 * @version 2
 */
public class Route {
	
	private Store store;
	private Warehouse warehouse;
	private float distance;

	public Route() {
	}

	/**
	 * Constructor with the whole atrb
	 * @param store
	 * @param warehouse
	 * @param distance
	 */
	public Route(Store store, Warehouse warehouse,float distance) {

		this.setDistance(distance);
		this.setStore(store);
		this.setWarehouse(warehouse);
	}

	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public Warehouse getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(Warehouse warehouse2) {
		this.warehouse = warehouse2;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Route [store=" + store + ", distance=" + distance + "]";
	}
}
