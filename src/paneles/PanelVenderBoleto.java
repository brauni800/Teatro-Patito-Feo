package paneles;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import combobox.ComboBoxObras;
import tablas.TablaFunciones;

/**
 * 
 * @author ArmandoCarvajal
 *
 */
@SuppressWarnings("serial")
public class PanelVenderBoleto extends PanelFactory{
	
	public PanelVenderBoleto() {
		setBounds(300, 20, 620, 500);
		url = getClass().getResource("imagenes/boletos4.jpg");
		image = new ImageIcon(url).getImage();
	}
	
	
    public void paint(Graphics g){
		Dimension d = getSize();
		g.drawImage(image, 0, 0, d.width, d.height, this);
		this.setOpaque(false);
        super.paint(g);
    } 
	
	@Override
	protected void initComponents() {
		
		initComboBox();
		initTable();
		initButtons();
		initLables();
	}


	protected void initComboBox() {
		cmBoxSeleccionarObra = new ComboBoxObras();
		cmBoxSeleccionarObra.setBounds(231, 36, 311, 20);
		add(cmBoxSeleccionarObra);

	}

	protected void initTable() {
		scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 150, 500, 200);
		add(scrollPane);

		table = new TablaFunciones(0);
		scrollPane.setViewportView(table);
	}

	protected void initButtons() {
		
		btnVenderAsientos = new JButton("Comprar Boletos");
		btnVenderAsientos.setBounds(263, 445, 150, 23);
		btnVenderAsientos.setEnabled(true);
		add(btnVenderAsientos);
		
		btnMostrarFunciones = new JButton("Mostrar Funciones");
		btnMostrarFunciones.setBounds(100, 445, 150, 23);
		btnMostrarFunciones.setEnabled(true);
		add(btnMostrarFunciones);
	}

	protected void initLables() {

		lblSeleccionarObra = new JLabel("Seleccionar obra:");
		lblSeleccionarObra.setBounds(93, 39, 106, 14);
		lblSeleccionarObra.setVisible(true);
		add(lblSeleccionarObra);
	}

}
