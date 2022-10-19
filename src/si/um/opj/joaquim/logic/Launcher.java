package si.um.opj.joaquim.logic;
import java.time.LocalDate;

import si.um.opj.joaquim.logic.facility.Store;
import si.um.opj.joaquim.logic.facility.Warehouse;
import si.um.opj.joaquim.logic.transport.Truck;
import si.um.opj.joaquim.logic.transport.Van;


/**
 * @author joaquimpacheco
 * @version 2
 */
public class Launcher {

	public static void main(String[] args) {
		Location location1 = new Location();
		location1.setCity("Tarragona");
		location1.setCountry("España");
		
		Warehouse warehouse1 = new Warehouse("Samsung",location1, 10);

		Van carabana = new Van(1310,60,4,40,100);
		carabana.setTipo(FoodItemType.FRESH);

		Truck thunder = new Truck(2130,30,5,25,1300,5);
		
		FoodItem hielos = new FoodItem("hielos");
		hielos.setLabel("hielitos");
		hielos.setTipo(FoodItemType.FROZEN);
		hielos.setExpirationDate(LocalDate.of(2022, 5, 28));
		hielos.setVolume(5);
		hielos.setWeight(2);
		
		
		FoodItem fish = new FoodItem("fish");
		fish.setLabel("pescao");
		fish.setTipo(FoodItemType.FRESH);
		fish.setVolume(10);
		fish.setWeight(5);
		fish.setExpirationDate(LocalDate.of(2022, 6, 26));

		warehouse1.addItem(fish);
		warehouse1.addItem(fish);
		warehouse1.addItem(fish);
		warehouse1.addItem(fish);
		try {
			warehouse1.acceptVehicle(carabana);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(carabana.toString());
		


		
	}

}

