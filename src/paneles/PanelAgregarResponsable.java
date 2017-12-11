package paneles;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelAgregarResponsable extends PanelFactory {

	public PanelAgregarResponsable() {
		setBounds(300, 20, 620, 500);
	}

	@Override
	protected void initComponents() {
		initButtons();
		initLabels();
		initTextFields();
	}

	protected void initTextFields() {
		txtFieldNombreRepre = new JTextField();
		txtFieldNombreRepre.setBounds(304, 83, 200, 20);
		add(txtFieldNombreRepre);

		txtFieldApellidoRepre = new JTextField();
		txtFieldApellidoRepre.setBounds(304, 143, 200, 20);
		add(txtFieldApellidoRepre);

		txtFieldTelefonoRepre = new JTextField();
		txtFieldTelefonoRepre.setBounds(304, 200, 200, 20);
		add(txtFieldTelefonoRepre);

		txtFieldTelefonoAlternativoRepre = new JTextField();
		txtFieldTelefonoAlternativoRepre.setBounds(304, 263, 200, 20);
		add(txtFieldTelefonoAlternativoRepre);

		txtFieldEmailRepre = new JTextField();
		txtFieldEmailRepre.setBounds(304, 314, 200, 20);
		add(txtFieldEmailRepre);

	}

	protected void initLabels() {
		lblNombreRepresentante = new JLabel("Nombre del Representante:");
		lblNombreRepresentante.setBounds(116, 86, 155, 14);
		add(lblNombreRepresentante);

		lblApellidoRepresentante = new JLabel("Apellido:");
		lblApellidoRepresentante.setBounds(116, 146, 153, 14);
		add(lblApellidoRepresentante);

		lblTelefonoRepresentante = new JLabel("Telefono:");
		lblTelefonoRepresentante.setBounds(116, 206, 153, 14);
		add(lblTelefonoRepresentante);

		lblTelAlternativoRepresentante = new JLabel("Telefono Alternativo:");
		lblTelAlternativoRepresentante.setBounds(116, 266, 153, 14);
		add(lblTelAlternativoRepresentante);

		lblEmailRepresentante = new JLabel("Correo Electronico:");
		lblEmailRepresentante.setBounds(116, 318, 153, 14);
		add(lblEmailRepresentante);
	}

	protected void initButtons() {
		btnAgregarResponsable = new JButton("Agregar Responsable");
		btnAgregarResponsable.setBounds(263, 445, 165, 23);
		add(btnAgregarResponsable);

	}

}
