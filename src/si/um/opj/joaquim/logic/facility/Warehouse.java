package si.um.opj.joaquim.logic.facility;

import java.util.Arrays;

import si.um.opj.joaquim.logic.FoodItem;
import si.um.opj.joaquim.logic.FoodItemTypeException;
import si.um.opj.joaquim.logic.Location;
import si.um.opj.joaquim.logic.transport.CapacityExceededException;
import si.um.opj.joaquim.logic.transport.Truck;
import si.um.opj.joaquim.logic.transport.Van;
import si.um.opj.joaquim.logic.transport.Vehicle;
import si.um.opj.joaquim.logic.transport.VolumeExceededException;

import java.time.LocalDate;

/**
 * 
 * @author joaquimpacheco 
 * @version 2
 */

public class Warehouse extends BusinessFacilitiy {

	private FoodItem[] foodItems = new FoodItem[10];
	private int capacity,count=0;
	
	public Warehouse(String name, Location location, int capacity) {
		super(name, location);
		this.capacity = capacity;
	}


	/**
	 * Check if the item Still Valid
	 * @param foodItem
	 * @return
	 */
	private boolean stillValid(FoodItem foodItem) {
		LocalDate today = LocalDate.now();
		LocalDate day = foodItem.getExpirationDate();
		if(today.isBefore(day.minusDays(3))) {
			return true;
		}
		return false;

	}
	
	/**
	 * add the item you pass by parameter
	 * @param foodItem this is the foodItem given
	 */
	public void addItem(FoodItem foodItem) {
		for(int i = 0; i<foodItems.length; i++) {
			if((foodItems[i] == null) && (stillValid(foodItem))) {
				foodItems[i]= foodItem;
				break;
			}
		}
	}
	/**
	 * Remove the item you pass by parameter
	 * @param foodItem
	 */
	public void removeItem(FoodItem foodItem) {
		for(int i = 0; i<foodItems.length; i++) {
		
			if((foodItems[i] != null)&&(foodItems[i].getLabel()==foodItem.getLabel())) {
			foodItems[i]=null;
			}
		}
	}
	/**
	 * Return the number of Food Items in the array
	 * @return the count of items exists
	 */
	public int returnTheNumberOfFoodItems() {
		int count=0;
		for(int i = 0; i<foodItems.length; i++) {
			if(foodItems[i] != null){
				count++;
			}
		}
		return count;
		
	}
	
	/**
	 * Check in the whole array if the item you passed by parameter exists
	 * @param foodItem
	 * @return return if exists or not
	 */
	public boolean foodItemExists(FoodItem foodItem) {
		boolean existe = false;
		for(int i = 0; i<foodItems.length; i++) {
			if((foodItems[i] != null)&&(foodItems[i].getLabel()==foodItem.getLabel())) {
				existe =true;
				break;
			}else existe = false;
		}	
	return existe;
	}
	
	
	public void acceptVehicle(Vehicle vehicle) throws Throwable, VolumeExceededException, FoodItemTypeException {
		int volumTot=0, i;

		if(vehicle instanceof Van) {
			
			while(count<foodItems.length) {
				
				if((foodItems[count] != null)){
					
					volumTot+=foodItems[count].getVolume();
					
						if(volumTot <= vehicle.getVolume()) { //consideramos que si el volumen es igual cabe 
							
							if(count < vehicle.getCargo().length) {
								
								if(foodItems[count].getTipo().equals(((Van) vehicle).getTipo())) {
									
									vehicle.loadFoodItem(foodItems[count]);
								}else throw new FoodItemTypeException("Type cannot load on this Van");

							}else throw new CapacityExceededException("You cannot load a Item in the vehicle bc exceed the max capacity");	

						}else throw new VolumeExceededException("You cannot load the foodItem because exceed the volume");
	
					}	
				count++;
				}
		}
		if(vehicle instanceof Truck) {
			
			volumTot=0;
			
			for(i=0;i<foodItems.length;i++) {
				if(foodItems[i]==null) break;
				volumTot+=foodItems[i].getVolume();
 
			}
			
			if(volumTot <= ((Truck) vehicle).getVehiclesMaxVolume()) {
			
				if(i < vehicle.getCargo().length) {
					vehicle.loadFoodItem(foodItems);
				//	for(i=0;i<foodItems.length;i++) vehicle.loadFoodItem(foodItems[i]);
			
				}else {
			
					vehicle.unloadFoodItems();
					throw new CapacityExceededException("You cannot load a Item in the vehicle bc exceed the max capacity");	
				}
			
			}else {
			
				vehicle.unloadFoodItems();
				throw new VolumeExceededException("You cannot load the foodItem because exceed the volume");
			}
			
		}
	}
		
		

	


	@Override
	public String toString() {
		return "Warehouse [foodItems=" + Arrays.toString(foodItems) + ", returnTheNumberOfFoodItems()="
				+ returnTheNumberOfFoodItems() + ", getName()=" + getName() + ", getLocation()=" + getLocation()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
