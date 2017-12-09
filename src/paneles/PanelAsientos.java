package paneles;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class PanelAsientos extends PanelFactory{

	@Override
	protected void initComponents() {
		initLabels();
	}
	
	public void initLabels() {
		lblMinuto = new JLabel("Minuto");
		lblMinuto.setBounds(350, 150, 85, 20);
		add(lblMinuto);

		lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(100, 125, 85, 20);
		add(lblFecha);

		lblHora = new JLabel("Hora");
		lblHora.setBounds(350, 120, 85, 20);
		add(lblHora);

		lblSeleccionarObra = new JLabel("Seleccionar obra:");
		lblSeleccionarObra.setBounds(93, 39, 106, 14);
		lblSeleccionarObra.setVisible(true);
		add(lblSeleccionarObra);
	}

}
