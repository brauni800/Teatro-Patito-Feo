package vista.paneles;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author brauni800
 *
 */
@SuppressWarnings("serial")
public abstract class PanelAgregarEditarRepresentante extends PanelFactory {

	public PanelAgregarEditarRepresentante() {
		setBackground(Color.GREEN);
		setBounds(300, 20, 620, 500);
	}

	@Override
	protected void initComponents() {
		initLabels();
		initTextFields();
		initButtons();
	}

	protected void initLabels() {
		lbl1 = new JLabel("Datos del Representante");
		lbl1.setBounds(250, 80, 200, 20);
		add(lbl1);
		
		lbl2 = new JLabel("Nombre: *");
		lbl2.setBounds(100, 150, 100, 20);
		add(lbl2);
		
		lbl3 = new JLabel("Apellido: *");
		lbl3.setBounds(101, 210, 72, 14);
		add(lbl3);
		
		lbl4 = new JLabel("Telefono: *");
		lbl4.setBounds(101, 270, 72, 14);
		add(lbl4);
		
		lbl5 = new JLabel("Telefono alternativo:");
		lbl5.setBounds(101, 330, 133, 14);
		add(lbl5);
		
		lbl6 = new JLabel("Correo Electronico: *");
		lbl6.setBounds(101, 390, 133, 14);
		add(lbl6);
		
		lbl7 = new JLabel("Los campos con (*) son obligatorios");
		lbl7.setBounds(10, 480, 220, 14);
		add(lbl7);
	}

	protected void initTextFields() {
		txtFieldNombre = new JTextField();
		txtFieldNombre.setBounds(300, 147, 206, 20);
		add(txtFieldNombre);
		
		txtFieldApellido = new JTextField();
		txtFieldApellido.setBounds(300, 207, 206, 20);
		add(txtFieldApellido);
		
		txtFieldTelefono1 = new JTextField();
		txtFieldTelefono1.setBounds(300, 267, 206, 20);
		add(txtFieldTelefono1);
		
		txtFieldTelefono2 = new JTextField();
		txtFieldTelefono2.setBounds(300, 327, 206, 20);
		add(txtFieldTelefono2);
		
		txtFieldCorreoElectronico = new JTextField();
		txtFieldCorreoElectronico.setBounds(300, 387, 206, 20);
		add(txtFieldCorreoElectronico);
	}

	protected abstract void initButtons();
}
