package si.um.opj.pacheco.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import si.um.opj.joaquim.logic.FoodItem;
import si.um.opj.joaquim.logic.FoodItemType;
import si.um.opj.joaquim.logic.Location;
import si.um.opj.joaquim.logic.facility.Store;
import si.um.opj.joaquim.logic.facility.Warehouse;
import si.um.opj.joaquim.logic.transport.Truck;
import si.um.opj.joaquim.logic.transport.Van;

import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Window extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField volumenFI;
	private JTextField weightFI;
	private JTextField exdataFI;
	private JTextField type;
	private JTextField NameWa;
	private JTextField LocationWa;
	private JTextField CapacityWa;
	private JTextField NameSto;
	private JTextField LocationSto;
	private JTextField numtrailers;
	private JTextField avvan;
	private JTextField regVan;
	private JTextField vovan;
	private JTextField cavan;
	private JTextField maxwevan;
	private JTextField avtruck;
	private JTextField regtruck;
	private JTextField votruck;
	private JTextField catruck;
	private JTextField maxweTruck;
	private JTextField labelFI;
	private JTextField tipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_elegir = new JPanel();
		contentPane.add(panel_elegir, BorderLayout.CENTER);
		panel_elegir.setLayout(new CardLayout(0, 0));
		
		JPanel Bussiness = new JPanel();
		panel_elegir.add(Bussiness, "business");
		
		
		JButton btnNewButton_5 = new JButton("Warehouse");
		btnNewButton_5.setForeground(Color.GREEN);
		Bussiness.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Store");
		btnNewButton_6.setForeground(Color.GREEN);
		Bussiness.add(btnNewButton_6);
	
		
		JPanel Food_items = new JPanel();
		panel_elegir.add(Food_items, "Food items");
		
		JPanel Vehicle = new JPanel();
		panel_elegir.add(Vehicle, "vehicle");
		
				JButton btnNewButton_7 = new JButton("Van");
				Vehicle.add(btnNewButton_7);
				
				JButton btnNewButton_10 = new JButton("Truck");
				Vehicle.add(btnNewButton_10);
				
		
				
				
				
				
		JPanel Adding = new JPanel();
		panel_elegir.add(Adding, "Adding");
		

		
		
		
		
		
		JPanel LoadUnload = new JPanel();
		panel_elegir.add(LoadUnload, "LoadUnload");
		LoadUnload.setLayout(null);
		

		
		JButton btnNewButton = new JButton("Business management");
		panel.add(btnNewButton);
		
		
		
		btnNewButton.addActionListener(null);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_elegir.removeAll();
				panel_elegir.add(Bussiness);
				panel_elegir.repaint();
				panel_elegir.revalidate();


				
			}
		});

		
		JButton btnNewButton_1 = new JButton("Vehicle management");
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(null);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_elegir.removeAll();
				panel_elegir.add(Vehicle);
				panel_elegir.repaint();
				panel_elegir.revalidate();


			}
		});

		JButton btnNewButton_2 = new JButton("Food item management");
		panel.add(btnNewButton_2);
		

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_elegir.removeAll();
				panel_elegir.add(Food_items);
				panel_elegir.repaint();
				panel_elegir.revalidate();


			}
		});
		
		
		JButton btnNewButton_3 = new JButton("Add into warehouse");
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel_elegir.removeAll();
				panel_elegir.add(Adding);
				panel_elegir.repaint();
				panel_elegir.revalidate();

			}
			
			
		});
		
		JButton btnNewButton_4 = new JButton("Load &  Unload");
		panel.add(btnNewButton_4);
	
		
		btnNewButton_4.addActionListener(null);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_elegir.removeAll();
				panel_elegir.add(LoadUnload);
				panel_elegir.repaint();
				panel_elegir.revalidate();
			   

			}
		});
		
		
		
		//panel Warehouse
		
		JPanel Wa = new JPanel();
		panel_elegir.add(Wa, "name_338055053572551");
	
		ArrayList<Warehouse> listArrayWa= new ArrayList<Warehouse>();
		String[] list = {};
		DefaultComboBoxModel<Object> model = new DefaultComboBoxModel<>(list);
		JComboBox<Object> comboBox = new JComboBox<>(model);
		Wa.add(comboBox, BorderLayout.NORTH);
		
		JLabel lblNewLabel_6 = new JLabel("Name: ");
		Wa.add(lblNewLabel_6);
		    
		NameWa = new JTextField();
		Wa.add(NameWa);
		NameWa.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Location: ");
		Wa.add(lblNewLabel_10);
		
		LocationWa = new JTextField();
		Wa.add(LocationWa);
		LocationWa.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Capacity");
		Wa.add(lblNewLabel_11);
		
		CapacityWa = new JTextField();
		Wa.add(CapacityWa);
		CapacityWa.setColumns(10);
		
		JButton btnNewButton_8 = new JButton("Create");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = NameWa.getText();
				Location location = new Location();
				location.setCity(LocationWa.getText());
				int capacity = Integer.parseInt(CapacityWa.getText());
				Warehouse warehouse = new Warehouse(name,location,capacity);
				model.addElement(warehouse);
				listArrayWa.add(warehouse);
				
			}
		});
		Wa.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Edit");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Warehouse warehouse = (Warehouse)comboBox.getSelectedItem();
				warehouse.setName(NameWa.getText());
				Location location = new Location();
				location.setCity(LocationWa.getText());
				warehouse.setLocation(location);
				warehouse.setCapacity(Integer.parseInt(CapacityWa.getText()));
				model.removeElement(comboBox.getSelectedItem());
				model.addElement(warehouse);
				
			}
		});
		Wa.add(btnNewButton_9);
		
		JButton btnNewButton_11 = new JButton("Delete");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.removeElement(comboBox.getSelectedItem());
				Warehouse warehouse = (Warehouse)comboBox.getSelectedItem();
				listArrayWa.remove(warehouse);
			}
		});
		Wa.add(btnNewButton_11);
		
		
		//panel store
		
		JPanel Sto = new JPanel();
		panel_elegir.add(Sto, "name_338076732972974");
	
		ArrayList<Store> listArraySto= new ArrayList();

		String[] listSto = {};
		DefaultComboBoxModel<Object> modelSto = new DefaultComboBoxModel<>(listSto);
		JComboBox<Object> comboBoxSto = new JComboBox<>(modelSto);
		Sto.add(comboBoxSto, BorderLayout.NORTH);
		

		JLabel lblNewLabel_8 = new JLabel("Name: ");
		Sto.add(lblNewLabel_8);
		
		NameSto = new JTextField();
		Sto.add(NameSto);
		NameSto.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Location: ");
		Sto.add(lblNewLabel_9);
		
		LocationSto = new JTextField();
		Sto.add(LocationSto);
		LocationSto.setColumns(10);
		
		JButton btnNewButton_12 = new JButton("Create");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = NameSto.getText();
				Location location = new Location();
				location.setCity(LocationSto.getText());
				Store store = new Store(name,location);
				modelSto.addElement(store);
				listArraySto.add(store);

			}
		});
		Sto.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Edit");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Store store = (Store)comboBoxSto.getSelectedItem();
				store.setName(NameSto.getText());
				Location location = new Location();
				location.setCity(LocationSto.getText());
				store.setLocation(location);
				modelSto.removeElement(comboBoxSto.getSelectedItem());
				modelSto.addElement(store);
			}
		});
		Sto.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("Delete");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Store store = (Store)comboBoxSto.getSelectedItem();
				modelSto.removeElement(comboBoxSto.getSelectedItem());
				listArraySto.remove(store);
			}
		});
		Sto.add(btnNewButton_14);

		
		//panel truck
		
		JPanel truck = new JPanel();
		panel_elegir.add(truck);
		
		ArrayList<Truck> listArrayTruck = new ArrayList();

		String[] listTruck = {};
		DefaultComboBoxModel<Object> modelTruck = new DefaultComboBoxModel<>(listTruck);
		JComboBox<Object> comboBoxTruck = new JComboBox<>(modelTruck);
		truck.add(comboBoxTruck, BorderLayout.NORTH);
		
		JLabel regNumTruck = new JLabel("Registration Number: ");
		truck.add(regNumTruck);
		
		regtruck = new JTextField();
		regtruck.setColumns(10);
		truck.add(regtruck);
		
		

		JLabel avTruck = new JLabel("Average Speed: ");
		truck.add(avTruck);
		
		avtruck = new JTextField();
		avtruck.setColumns(10);
		truck.add(avtruck);
		
		JLabel voTruck = new JLabel("Volume: ");
		truck.add(voTruck);
		
		votruck = new JTextField();
		votruck.setColumns(10);
		truck.add(votruck);
		
		JLabel capacityTruck = new JLabel("Capacity: ");
		truck.add(capacityTruck);
		
		catruck = new JTextField();
		catruck.setColumns(10);
		truck.add(catruck);
		
		JLabel maxweightTruck = new JLabel("Max. weight: ");
		truck.add(maxweightTruck);
		
		maxweTruck = new JTextField();
		maxweTruck.setColumns(10);
		truck.add(maxweTruck);
		
		JLabel Notrailers = new JLabel("Number of trailers: ");
		truck.add(Notrailers);
						
		numtrailers = new JTextField();
		truck.add(numtrailers);
		numtrailers.setColumns(10);
						
		JButton btnNewButton_15 = new JButton("Create");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int regNum = Integer.parseInt(regtruck.getText());
				float aVtruck = Float.parseFloat(avtruck.getText());
				double volum= Double.parseDouble(votruck.getText());
				double maxwei= Double.parseDouble(maxweTruck.getText());
				int numtrail = Integer.parseInt(numtrailers.getText());

				Truck truck = new Truck(regNum,aVtruck,5,volum,maxwei,numtrail);
				modelTruck.addElement(truck);
				listArrayTruck.add(truck);
			}
		});
		truck.add(btnNewButton_15);
						
		JButton btnNewButton_16 = new JButton("Edit");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Truck truck = (Truck)comboBoxTruck.getSelectedItem();
				truck.setAverageSpeed(Float.parseFloat(avtruck.getText()));
				truck.setMaxWeight(Double.parseDouble(maxweTruck.getText()));
				truck.setRegistrationNumber(Integer.parseInt(regtruck.getText()));
				truck.setNumberOfTrailers(Integer.parseInt(numtrailers.getText()));
				truck.setVolume(Double.parseDouble(votruck.getText()));

				modelTruck.removeElement(comboBoxTruck.getSelectedItem());
				modelTruck.addElement(truck);
			}
		});
		truck.add(btnNewButton_16);
						
		JButton btnNewButton_17 = new JButton("Delete");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Truck truck = (Truck)comboBoxTruck.getSelectedItem();
				modelTruck.removeElement(comboBoxTruck.getSelectedItem());
				listArrayTruck.add(truck);
			}
		});
		truck.add(btnNewButton_17);
		

		

		panel.add(btnNewButton_3);
		



		
		//aqui warehouse
		btnNewButton_5.addActionListener(null);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_elegir.removeAll();
				panel_elegir.add(Wa);
				panel_elegir.repaint();
				panel_elegir.revalidate();
			   

			}
		});

		//aqui store
		btnNewButton_6.addActionListener(null);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_elegir.removeAll();
				panel_elegir.add(Sto);
				panel_elegir.repaint();
				panel_elegir.revalidate();
			   

			}
		});

		btnNewButton_10.addActionListener(null);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_elegir.removeAll();
				panel_elegir.add(truck);
				panel_elegir.repaint();
				panel_elegir.revalidate();
			   

			}
		});

	
		
		
		
		
		JLabel lblNewLabel = new JLabel("Label: ");
		Food_items.add(lblNewLabel);
		
		labelFI = new JTextField();
		Food_items.add(labelFI);
		labelFI.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Volume: ");
		Food_items.add(lblNewLabel_2);
		
		volumenFI = new JTextField();
		Food_items.add(volumenFI);
		volumenFI.setColumns(10);	
		
		JLabel lblNewLabel_3 = new JLabel("Weight: ");
		Food_items.add(lblNewLabel_3);
		
		weightFI = new JTextField();
		Food_items.add(weightFI);
		weightFI.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Expiration data: ");
		Food_items.add(lblNewLabel_4);
		
		exdataFI = new JTextField();
		Food_items.add(exdataFI);
		exdataFI.setColumns(10);
		
		
		JLabel lblNewLabel_5 = new JLabel("Type (FROZEN | FRESH): ");
		Food_items.add(lblNewLabel_5);
		
		type = new JTextField();
		Food_items.add(type);
		type.setColumns(10);


		//fooditem panel
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		ArrayList<FoodItem> listArrayFI =  new ArrayList();

		String[] listFooodItem = {};
		DefaultComboBoxModel<Object> modelFoodItem = new DefaultComboBoxModel<>(listFooodItem);
		JComboBox<Object> comboBoxFoodItem = new JComboBox<>(modelFoodItem);
		Food_items.add(comboBoxFoodItem, BorderLayout.NORTH);
		
		JButton btnNewButton_10_2 = new JButton("Create");
		btnNewButton_10_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FoodItem fooditem = new FoodItem();
				String label = labelFI.getText();
				String exdate = exdataFI.getText();
			//	LocalDate localDate = LocalDate.parse(exdate, formatter);
				int volume = Integer.parseInt((volumenFI.getText()));
				int weight = Integer.parseInt((weightFI.getText()));
				String tipo = type.getText();
				if(tipo == "FROZEN") {
					fooditem.setTipo(FoodItemType.FROZEN);
				}else if(tipo == "FRESH") {
					fooditem.setTipo(FoodItemType.FRESH);
				}
				FoodItem foodItem = new FoodItem(label,LocalDate.parse(exdate, formatter),volume,weight);
				modelFoodItem.addElement(foodItem);
				listArrayFI.add(foodItem);
				
			}
		});
		btnNewButton_10_2.setBackground(Color.GREEN);
		Food_items.add(btnNewButton_10_2);
		
		JButton btnNewButton_8_2 = new JButton("Edit");
		btnNewButton_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FoodItem fooditem = (FoodItem)comboBoxSto.getSelectedItem();
				fooditem.setLabel(labelFI.getText());
				fooditem.setExpirationDate(null);
				fooditem.setVolume(Integer.parseInt(volumenFI.getText()));
				fooditem.setWeight(Integer.parseInt(weightFI.getText()));
				fooditem.setTipo(null);
				
				modelFoodItem.removeElement(comboBoxFoodItem.getSelectedItem());
				modelFoodItem.addElement(fooditem);
			}
		});
		Food_items.add(btnNewButton_8_2);
		
		JButton btnNewButton_9_2 = new JButton("Delete");
		btnNewButton_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FoodItem fooditem = (FoodItem)comboBoxSto.getSelectedItem();

				modelFoodItem.removeElement(comboBoxFoodItem.getSelectedItem());
				listArrayFI.remove(fooditem);
			}
		});
		btnNewButton_9_2.setBackground(Color.RED);
		Food_items.add(btnNewButton_9_2);
		
		
		
		//panel añadir
		
		
		JComboBox<Object> comboBoxWA = new JComboBox<>(model);
		Adding.add(comboBoxWA);
		
		
		JComboBox<Object> comboBoxFOIT = new JComboBox<>(modelFoodItem);
		Adding.add(comboBoxFOIT);
		
		JButton AddItem = new JButton("Add item");
		AddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FoodItem fooditem = (FoodItem)comboBoxFOIT.getSelectedItem();
				Warehouse warehouse = (Warehouse)comboBoxWA.getSelectedItem();
				warehouse.addItem(fooditem);

			}
		});
		Adding.add(AddItem);

		
		//panel van
		
		JPanel van = new JPanel();
		panel_elegir.add(van, "name_402036991370840");
		
		
		ArrayList<Van> listArrayVan =  new ArrayList();

		String[] listVan= {};
		DefaultComboBoxModel<Object> modelvan = new DefaultComboBoxModel<>(listVan);
		JComboBox<Object> comboBoxVan = new JComboBox<>(modelvan);
		van.add(comboBoxVan, BorderLayout.NORTH);

		btnNewButton_7.addActionListener(null);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_elegir.removeAll();
				panel_elegir.add(van);
				panel_elegir.repaint();
				panel_elegir.revalidate();
			}
		});
		
				JLabel AvVan = new JLabel("Average Speed: ");
				van.add(AvVan);
				
				avvan = new JTextField();
				avvan.setColumns(10);
				van.add(avvan);
				
				JLabel regNumber = new JLabel("Registration Number: ");
				van.add(regNumber);
				
				regVan = new JTextField();
				regVan.setColumns(10);
				van.add(regVan);
				
				JLabel volum = new JLabel("Volume: ");
				van.add(volum);
				
				vovan = new JTextField();
				vovan.setColumns(10);
				van.add(vovan);
				
				JLabel lblNewLabel_1 = new JLabel("Capacity: ");
				van.add(lblNewLabel_1);
				
				cavan = new JTextField();
				cavan.setColumns(10);
				van.add(cavan);
				
				JLabel weightmax = new JLabel("Max. weight: ");
				van.add(weightmax);
				
				maxwevan = new JTextField();
				maxwevan.setColumns(10);
				van.add(maxwevan);
				
				JLabel tipova = new JLabel("Type (FROZEN, FRESH): ");
				van.add(tipova);
				
				tipo = new JTextField();
				van.add(tipo);
				tipo.setColumns(10);
				
				JButton CreateVan = new JButton("Create");
				CreateVan.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Van van = new Van();
						int regNum = Integer.parseInt(regVan.getText());
						float aVvan = Float.parseFloat(avvan.getText());
						double volum= Double.parseDouble(vovan.getText());
						double maxwei= Double.parseDouble(maxwevan.getText());

						String tipo = type.getText();
						if(tipo == "FROZEN") {
							van.setTipo(FoodItemType.FROZEN);
						}else if(tipo == "FRESH") {
							van.setTipo(FoodItemType.FRESH);
						}
						
						van = new Van(regNum,aVvan,5,volum,maxwei);
						modelvan.addElement(van);
						listArrayVan.add(van);
					}
				});
				

				van.add(CreateVan);
				
				
				JButton EditVan = new JButton("Edit: ");
				EditVan.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Van van = (Van)comboBoxVan.getSelectedItem();
						van.setAverageSpeed(Float.parseFloat(avvan.getText()));
						van.setMaxWeight(Double.parseDouble(maxwevan.getText()));
						van.setRegistrationNumber(Integer.parseInt(regVan.getText()));
						van.setVolume(Double.parseDouble(vovan.getText()));
						modelvan.removeElement(comboBoxVan.getSelectedItem());
						modelvan.addElement(van);
					}
				});
				van.add(EditVan);
				
				JButton deleteVan = new JButton("Delete: ");
				deleteVan.addActionListener(new ExternalListener(comboBoxVan));
			//	Van van = (Van)comboBoxVan.getSelectedItem();
			//	listArrayVan.remove(van);

			/*	deleteVan.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						modelvan.removeElement(comboBoxVan.getSelectedItem());
					}
				});*/
				van.add(deleteVan);
				
				
		
				JComboBox<Object> comboBoxFoodIte = new JComboBox<>(modelFoodItem);
				comboBoxFoodIte.setBounds(440, 6, 52, 27);
				LoadUnload.add(comboBoxFoodIte);
				
				JComboBox<Object> comboBoxTRUCK = new JComboBox<>(modelTruck);
				comboBoxTRUCK.setBounds(440, 47, 52, 27);
				LoadUnload.add(comboBoxTRUCK);
				
				JComboBox<Object> comboBoxVAN = new JComboBox<>(modelvan);
				comboBoxVAN.setBounds(440, 86, 52, 27);
				LoadUnload.add(comboBoxVAN);
				
				JButton LOAD = new JButton("LOAD");
				LOAD.setBounds(436, 125, 80, 29);
				LOAD.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(comboBoxTRUCK.getSelectedItem() != null) {
							Truck truck = (Truck) comboBoxTRUCK.getSelectedItem();
							FoodItem item = (FoodItem) comboBoxFoodIte.getSelectedItem();
							truck.loadFoodItem(item);
							
						}else if(comboBoxVAN.getSelectedItem() != null) {
							Van van = (Van) comboBoxVAN.getSelectedItem();
							FoodItem item = (FoodItem) comboBoxFoodIte.getSelectedItem();
							van.loadFoodItem(item);
						}
					}
				});
				LoadUnload.add(LOAD);
				
				JButton UNLOAD = new JButton("UNLOAD");
				UNLOAD.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(comboBoxTRUCK.getSelectedItem() != null) {
							Truck truck = (Truck) comboBoxTRUCK.getSelectedItem();
							truck.unloadFoodItems();
							
						}else if(comboBoxVAN.getSelectedItem() != null) {
							Van van = (Van) comboBoxVAN.getSelectedItem();
							van.unloadFoodItems();
						}
					}
				});
				UNLOAD.setBounds(605, 125, 99, 29);
				LoadUnload.add(UNLOAD);
				
				JLabel lblNewLabel_7 = new JLabel("VAN");
				lblNewLabel_7.setBounds(352, 90, 61, 16);
				LoadUnload.add(lblNewLabel_7);
				
				JLabel lblNewLabel_12 = new JLabel("WAREHOUSE");
				lblNewLabel_12.setBounds(352, 10, 61, 16);
				LoadUnload.add(lblNewLabel_12);
				
				JLabel lblNewLabel_13 = new JLabel("TRUCK");
				lblNewLabel_13.setBounds(352, 51, 61, 16);
				LoadUnload.add(lblNewLabel_13);
				
				
				


		
		setVisible(true);


	}
}
