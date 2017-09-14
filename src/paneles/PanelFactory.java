package paneles;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import elementos.ElementoFactory;

/**
 * 
 * @author b1796
 *
 */
public abstract class PanelFactory extends JPanel {
	
	public static final String OBRAS = "OBRAS";
	public static final String VENDER_BOLETOS = "VENDER_BOLETOS";
	public static final String REGRESAR = "REGRESAR";
	public static final String CREAR_OBRA = "CREAR_OBRA";
	public static final String ELIMINAR_OBRA = "ELIMINAR_OBRA";
	public static final String EDITAR_OBRA = "EDITAR_OBRA";
	public static final String CREAR_EDITAR = "CREAR_EDITAR";
	public static final String ELIMINAR = "ELIMINAR";
	
	protected ElementoFactory elementoDinamico;
	protected PanelFactory panelDinamico;
	protected JButton crear, eliminar, editar, regresar, agregarResponsable, obras, venderBoletos;
	protected JTextField txtFieldNombreObra, txtFieldPrecio;
	protected JLabel lblNombreObra, lblPrecio, lblDuracion, lblRepresentante, lblDescripcion, lblSeleccionarObra;
	protected JComboBox<String> cmBoxHoras, cmBoxMinutos, cmBoxRepresentantes, cmBoxSeleccionarObra;
	protected JTextArea textAreaDescripcion;

	public PanelFactory() {
		super();
		setSize(950, 550);
		setBackground(Color.CYAN);
		setLayout(null);
		setVisible(true);
		initComponents();
	}

	protected abstract void initComponents();
	
	/**
	 * El panel dinamico que contiene este panel. Si no existe un panel regresa null.
	 * @return PanelFactory - el panel dinamico.
	 */
	public PanelFactory getPanelDinamico() {
		return this.panelDinamico;
	}
	
	public void setElementoDinamico(ElementoFactory elementoDinamico) {
		this.elementoDinamico = elementoDinamico;
	}
	
	public void setPanelDinamico(PanelFactory panelDinamico) {
		this.panelDinamico = panelDinamico;
		add(panelDinamico);
		repaint();
	}

	public ElementoFactory getElementoDinamico() {
		return elementoDinamico;
	}

	public JButton getCrear() {
		return crear;
	}

	public JButton getEliminar() {
		return eliminar;
	}

	public JButton getEditar() {
		return editar;
	}

	public JButton getRegresar() {
		return regresar;
	}

	public JButton getAgregarResponsable() {
		return agregarResponsable;
	}

	public JButton getObras() {
		return obras;
	}

	public JButton getVenderBoletos() {
		return venderBoletos;
	}

	public JTextField getTxtFieldNombreObra() {
		return txtFieldNombreObra;
	}

	public JTextField getTxtFieldPrecio() {
		return txtFieldPrecio;
	}

	public JLabel getLblNombreObra() {
		return lblNombreObra;
	}

	public JLabel getLblPrecio() {
		return lblPrecio;
	}

	public JLabel getLblDuracion() {
		return lblDuracion;
	}

	public JLabel getLblRepresentante() {
		return lblRepresentante;
	}

	public JLabel getLblDescripcion() {
		return lblDescripcion;
	}

	public JLabel getLblSeleccionarObra() {
		return lblSeleccionarObra;
	}

	public JComboBox<String> getCmBoxHoras() {
		return cmBoxHoras;
	}

	public JComboBox<String> getCmBoxMinutos() {
		return cmBoxMinutos;
	}

	public JComboBox<String> getCmBoxRepresentantes() {
		return cmBoxRepresentantes;
	}

	public JComboBox<String> getCmBoxSeleccionarObra() {
		return cmBoxSeleccionarObra;
	}

	public JTextArea getTextAreaDescripcion() {
		return textAreaDescripcion;
	}
	
}
