package si.um.opj.pacheco.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ExternalListener implements ActionListener{

	private JComboBox<Object> comboBoxVan;
	
	public ExternalListener(JComboBox<Object> comboBoxVan) {
	this.comboBoxVan=comboBoxVan;
	}

	public void actionPerformed(ActionEvent e) {
		DefaultComboBoxModel<Object> modelvan = (DefaultComboBoxModel<Object>) this.comboBoxVan.getModel();
		modelvan.removeElement(comboBoxVan.getSelectedItem());


	}

}