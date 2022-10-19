package si.um.opj.joaquim.logic.transport;

import java.lang.Math;

import si.um.opj.joaquim.logic.FoodItem;
import si.um.opj.joaquim.logic.Route;

/**
 * @author joaquimpacheco
 * @version 2
 */
public abstract class Vehicle {
		


	private int registrationNumber; 
	protected double volume;
	protected double maxWeight;
	private double averageSpeed;
	private FoodItem[] cargo;
	
	/**
	 * @param registrationNumber
	 * @param averageSpeed2
	 */
	public Vehicle(int registrationNumber, float averageSpeed,int capacity) throws IllegalArgumentException{
		if(averageSpeed>0) {
			this.averageSpeed=averageSpeed;
		}else throw new java.lang.IllegalArgumentException();
		this.registrationNumber=registrationNumber;
		cargo = new FoodItem[capacity];
	}
	
	/**
	 * Constructor with the whole atrb
	 * @param registrationNumber
	 * @param volume
	 * @param maxWeight
	 * @param averageSpeed
	 * @param capacity 
	 */
	public Vehicle(int registrationNumber,float averageSpeed, int capacity, double volume, double maxWeight)throws IllegalArgumentException{
		this(registrationNumber,averageSpeed,capacity);
		if((volume>0)||(maxWeight>0)) {
			this.volume = volume;
			this.maxWeight = maxWeight;
		}else throw new java.lang.IllegalArgumentException();
	}



	/**
	 * Default constructor
	 */
	public Vehicle() {
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double d) {
		this.volume = d;
	}
	public double getMaxWeight() {
		return maxWeight;
	}
	public void setMaxWeight(double d) {
		this.maxWeight = d;
	}
	public double getAverageSpeed() {
		return averageSpeed;
	}
	public void setAverageSpeed(float averageSpeed) {
		this.averageSpeed = averageSpeed;
	}
	
	/**
	 * Calculate the time of the travel with the parameter given distance and speed
	 * @param route
	 * @return the time that the vehicle do in the distance given
	 */
	public int calculateTravelTime(Route route) {
		return (int) Math.ceil(route.getDistance()/averageSpeed/24);
				
		}
	
	/**
	 * Loads a foodItem onto a vehicle
	 * @param foodItem 
	 */
	public void loadFoodItem(FoodItem foodItem) {
		for(int i = 0; i < cargo.length; i++) {
			if((cargo[i] == null)) {
				cargo[i]= foodItem;
			}
		}
	}
	
	/**
	 * Loads a foodItem onto a vehicle
	 * @param foodItem 
	 */
	public void loadFoodItem(FoodItem[] foodItems) {
			for(int i = 0; i < cargo.length; i++) {
				if((cargo[i] == null)) {
					cargo[i]= foodItems [i];
				}
			}
	}
	
	/**
	 * unload foodItems from a vehicle
	 * 
	 */
	public void unloadFoodItems() {
		for(int i = 0; i<cargo.length; i++) {
			if(cargo[i] != null) {
			cargo[i]=null;
			}
		}
	}
	/**
	 * Method which returns the percentage of volume taken up by 
	 * loaded food items in a vehicle
	 * @return
	 */
	public double getTakenSpace() {
	double percentage =0;
	int totalVolum = 0;
		for(int i = 0; i < cargo.length; i++) {
			if(cargo[i]==null) break;
			totalVolum += cargo[i].getVolume();
		}
		percentage = totalVolum * 100 / getVehiclesMaxVolume();
		return percentage;		
	}
	/**
	 * Method which return the max of volume
	 * @return
	 */
	public abstract double getVehiclesMaxVolume();
	

	@Override
	public String toString() {
		return "Vehicle [registrationNumber=" + registrationNumber + ", volume=" + volume + ", maxWeight=" + maxWeight
				+ ", averageSpeed=" + averageSpeed + "]";
	}

	public FoodItem[] getCargo() {
		return cargo;
	}

	public void setCargo(FoodItem[] cargo) {
		this.cargo = cargo;
	}
}
