package paneles;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import tablas.TablaFunciones;

public class PanelCancelarFuncion extends PanelFactory{

	public PanelCancelarFuncion() {
		setBackground(Color.GREEN);
		setBounds(300, 20, 620, 500);
	}
	@Override
	protected void initComponents() {
		scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 45, 500, 340);
		add(scrollPane);
		
		table = new TablaFunciones();
		scrollPane.setViewportView(table);
		
		lblSeleccion = new JLabel("Seleccion:");
		lblSeleccion.setBounds(70, 424, 84, 14);
		add(lblSeleccion);
		
		txtFieldSeleccion = new JTextField();
		txtFieldSeleccion.setBounds(164, 421, 202, 20);
		txtFieldSeleccion.setEnabled(false);
		add(txtFieldSeleccion);
		
		btnCancelarFuncion = new JButton("Cancelar");
		btnCancelarFuncion.setBounds(441, 420, 89, 23);
		add(btnCancelarFuncion);
		
	}
	

}
