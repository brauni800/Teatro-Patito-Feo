package paneles;

import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import com.toedter.calendar.JDateChooser;

import combobox.ComboBoxObras;
import tablas.TablaFunciones;

public class PanelCrearFuncion extends PanelFactory {

	public PanelCrearFuncion() {
		setBounds(300, 20, 620, 500);
	}

	@Override
	protected void initComponents() {
		initComboBox();
		initTables();
		initButtons();
		initTables();
		initLables();
		initCalendar();
	}

	protected void initCalendar() {
		calendario = new JDateChooser();
		calendario.setMinSelectableDate(new Date());
		calendario.setBounds(150, 125, 100, 26);
		add(calendario);
	}

	protected void initComboBox() {
		cmBoxHoras = new JComboBox<Integer>();
		cmBoxHoras.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
				14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 00 }));
		cmBoxHoras.setBounds(395, 120, 85, 20);
		add(cmBoxHoras);

		cmBoxMinutos = new JComboBox<Integer>();
		cmBoxMinutos.setModel(
				new DefaultComboBoxModel<Integer>(new Integer[] { 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55 }));
		cmBoxMinutos.setBounds(395, 150, 85, 20);
		add(cmBoxMinutos);

		cmBoxSeleccionarObra = new ComboBoxObras();
		cmBoxSeleccionarObra.setBounds(231, 36, 311, 20);
		add(cmBoxSeleccionarObra);
	}

	protected void initTables() {
		scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 200, 500, 200);
		add(scrollPane);
		
		tableFunciones = new TablaFunciones(0);
		//tableFunciones.setVisible(false);
		scrollPane.setViewportView(tableFunciones);
	}

	protected void initButtons() {
		btnCrearFuncion = new JButton("Crear Funcion");
		btnCrearFuncion.setBounds(263, 445, 100, 23);
		btnCrearFuncion.setEnabled(true);
		add(btnCrearFuncion);
	}

	protected void initLables() {
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
