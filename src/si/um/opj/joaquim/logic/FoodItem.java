package si.um.opj.joaquim.logic;

import java.time.LocalDate;

/**
 * @author joaquimpacheco
 * @version 2
 */
public class FoodItem {
	
	private String label;
	private LocalDate expirationDate;
	private int volume, weight;
	private FoodItemType tipo;
	
	//todos atrb
	/**
	 * @param label
	 * @param expirationDate
	 * @param volume
	 * @param weight
	 */
	public FoodItem(String label, LocalDate expirationDate, int volume, int weight) {
		this(label);
		this.expirationDate = expirationDate;
		this.volume = volume;
		this.weight = weight;
	}

	
	/**
	 * @param label
	 */
	public FoodItem(String label) {
		super();
		this.label = label;
	}
	public FoodItem() {
		super();
	}
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	@Override
	public String toString() {
		return "FoodItem [label=" + label + ", expirationDate=" + expirationDate + ", volume=" + volume + ", weight="
				+ weight + "]";
	}




	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public LocalDate getExpirationDate() {
		return expirationDate;
	}


	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}


	public FoodItemType getTipo() {
		return tipo;
	}


	public void setTipo(FoodItemType tipo) {
		this.tipo = tipo;
	
	}


}
