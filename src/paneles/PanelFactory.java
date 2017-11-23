package paneles;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import elementos.ElementoFactory;

/**
 * @author b1796
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
	public static final String CREAR_FUNCION = "CREAR_FUNCION";
	public static final String CANCELAR_FUNCION = "CANCELAR_FUNCION";
	public static final String FUNCION = "FUNCION";
	public static final String EDITAR_FUNCION = "EDITAR_FUNCION";

	protected ElementoFactory elementoDinamico;
	protected PanelFactory panelDinamico;
	protected JButton btnCrear, btnEliminar, btnEditar, btnRegresar, btnAgregarResponsable, btnObras, btnVenderBoletos,
			btnCrearFuncion, btnCancelarFuncion, btnFuncion, btnEditarFuncion;
	protected JButton btnAceptarCrearFuncion;
	protected JTextField txtFieldNombreObra, txtFieldPrecio, txtFieldSeleccion;
	protected JLabel lblNombreObra, lblPrecio, lblDuracion, lblRepresentante, lblDescripcion, lblSeleccionarObra,
			lblSeleccion;
	protected JLabel lblHorario, lblHora, lblMinuto, lblFecha;
	protected JComboBox<Integer> cmBoxHoras, cmBoxMinutos;
	protected JComboBox<String> cmBoxRepresentantes, cmBoxSeleccionarObra;
	protected JTextArea textAreaDescripcion;
	protected JTable table, tableFunciones;
	protected JScrollPane scrollPane;
	protected JCalendar calendarioFunciones;
	protected JDateChooser calendario;

	public PanelFactory() {
		super();
		setSize(950, 550);
		setLayout(null);
		setVisible(true);
		initComponents();
	}

	protected abstract void initComponents();

	/**
	 * El panel dinamico que contiene este panel. Si no existe un panel regresa
	 * null.
	 * 
	 * @return PanelFactory - el panel dinamico.
	 */
	public PanelFactory getPanelDinamico() {
		return this.panelDinamico;
	}

	public void setPanelDinamico(PanelFactory panelDinamico) {
		this.panelDinamico = panelDinamico;
		add(panelDinamico);
		repaint();
	}

	public ElementoFactory getElementoDinamico() {
		return elementoDinamico;
	}

	public void setElementoDinamico(ElementoFactory elementoDinamico) {
		this.elementoDinamico = elementoDinamico;
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}

	public void setBtnCrear(JButton btnCrear) {
		this.btnCrear = btnCrear;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JButton getBtnEditar() {
		return btnEditar;
	}

	public void setBtnEditar(JButton btnEditar) {
		this.btnEditar = btnEditar;
	}

	public JButton getBtnRegresar() {
		return btnRegresar;
	}

	public void setBtnRegresar(JButton btnRegresar) {
		this.btnRegresar = btnRegresar;
	}

	public JButton getBtnAgregarResponsable() {
		return btnAgregarResponsable;
	}

	public void setBtnAgregarResponsable(JButton btnAgregarResponsable) {
		this.btnAgregarResponsable = btnAgregarResponsable;
	}

	public JButton getBtnObras() {
		return btnObras;
	}

	public void setBtnObras(JButton btnObras) {
		this.btnObras = btnObras;
	}

	public JButton getBtnVenderBoletos() {
		return btnVenderBoletos;
	}

	public void setBtnVenderBoletos(JButton btnVenderBoletos) {
		this.btnVenderBoletos = btnVenderBoletos;
	}

	public JTextField getTxtFieldNombreObra() {
		return txtFieldNombreObra;
	}

	public void setTxtFieldNombreObra(JTextField txtFieldNombreObra) {
		this.txtFieldNombreObra = txtFieldNombreObra;
	}

	public JTextField getTxtFieldPrecio() {
		return txtFieldPrecio;
	}

	public void setTxtFieldPrecio(JTextField txtFieldPrecio) {
		this.txtFieldPrecio = txtFieldPrecio;
	}

	public JTextField getTxtFieldSeleccion() {
		return txtFieldSeleccion;
	}

	public void setTxtFieldSeleccion(JTextField txtFieldSeleccion) {
		this.txtFieldSeleccion = txtFieldSeleccion;
	}

	public JLabel getLblNombreObra() {
		return lblNombreObra;
	}

	public void setLblNombreObra(JLabel lblNombreObra) {
		this.lblNombreObra = lblNombreObra;
	}

	public JLabel getLblPrecio() {
		return lblPrecio;
	}

	public void setLblPrecio(JLabel lblPrecio) {
		this.lblPrecio = lblPrecio;
	}

	public JLabel getLblDuracion() {
		return lblDuracion;
	}

	public void setLblDuracion(JLabel lblDuracion) {
		this.lblDuracion = lblDuracion;
	}

	public JLabel getLblRepresentante() {
		return lblRepresentante;
	}

	public void setLblRepresentante(JLabel lblRepresentante) {
		this.lblRepresentante = lblRepresentante;
	}

	public JLabel getLblDescripcion() {
		return lblDescripcion;
	}

	public void setLblDescripcion(JLabel lblDescripcion) {
		this.lblDescripcion = lblDescripcion;
	}

	public JLabel getLblSeleccionarObra() {
		return lblSeleccionarObra;
	}

	public void setLblSeleccionarObra(JLabel lblSeleccionarObra) {
		this.lblSeleccionarObra = lblSeleccionarObra;
	}

	public JLabel getLblSeleccion() {
		return lblSeleccion;
	}

	public void setLblSeleccion(JLabel lblSeleccion) {
		this.lblSeleccion = lblSeleccion;
	}

	public JComboBox<Integer> getCmBoxHoras() {
		return cmBoxHoras;
	}

	public void setCmBoxHoras(JComboBox<Integer> cmBoxHoras) {
		this.cmBoxHoras = cmBoxHoras;
	}

	public JComboBox<Integer> getCmBoxMinutos() {
		return cmBoxMinutos;
	}

	public void setCmBoxMinutos(JComboBox<Integer> cmBoxMinutos) {
		this.cmBoxMinutos = cmBoxMinutos;
	}

	public JComboBox<String> getCmBoxRepresentantes() {
		return cmBoxRepresentantes;
	}

	public void setCmBoxRepresentantes(JComboBox<String> cmBoxRepresentantes) {
		this.cmBoxRepresentantes = cmBoxRepresentantes;
	}

	public JComboBox<String> getCmBoxSeleccionarObra() {
		return cmBoxSeleccionarObra;
	}

	public void setCmBoxSeleccionarObra(JComboBox<String> cmBoxSeleccionarObra) {
		this.cmBoxSeleccionarObra = cmBoxSeleccionarObra;
	}

	public JTextArea getTextAreaDescripcion() {
		return textAreaDescripcion;
	}

	public void setTextAreaDescripcion(JTextArea textAreaDescripcion) {
		this.textAreaDescripcion = textAreaDescripcion;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JButton getBtnCrearFuncion() {
		return btnCrearFuncion;
	}

	public void setBtnCrearFuncion(JButton btnCrearFuncion) {
		this.btnCrearFuncion = btnCrearFuncion;
	}

	public JButton getBtnCancelarFuncion() {
		return btnCancelarFuncion;
	}

	public void setBtnCancelarFuncion(JButton btnCancelarFuncion) {
		this.btnCancelarFuncion = btnCancelarFuncion;
	}

	public JButton getBtnFuncion() {
		return btnFuncion;
	}

	public void setBtnFuncion(JButton btnFuncion) {
		this.btnFuncion = btnFuncion;
	}

	public JButton getBtnEditarFuncion() {
		return btnEditarFuncion;
	}

	public void setBtnEditarFuncion(JButton btnEditarFuncion) {
		this.btnEditarFuncion = btnEditarFuncion;
	}

	public JButton getBtnAceptarCrearFuncion() {
		return btnEditarFuncion;
	}

	public void setBtnAceptarCrearFuncion(JButton btnAceptarCrearFuncion) {
		this.btnAceptarCrearFuncion = btnAceptarCrearFuncion;
	}

	public JLabel getLblHorario() {
		return lblHorario;
	}

	public void setLblHorario(JLabel lblHorario) {
		this.lblHorario = lblHorario;
	}

	public JLabel getLblHora() {
		return lblHora;
	}

	public void setLblHora(JLabel lblHora) {
		this.lblHora = lblHora;
	}

	public JLabel getLblMinuto() {
		return lblMinuto;
	}

	public void setLblMinuto(JLabel lblMinuto) {
		this.lblMinuto = lblMinuto;
	}

	public JTable getTableFunciones() {
		return tableFunciones;
	}

	public void setTableFunciones(JTable tableFunciones) {
		this.tableFunciones = tableFunciones;
	}

	public JCalendar getCalendarioFunciones() {
		return calendarioFunciones;
	}

	public void setCalendarioFunciones(JCalendar calendarioFunciones) {
		this.calendarioFunciones = calendarioFunciones;
	}

	public JLabel getLblFecha() {
		return lblFecha;
	}

	public void setLblFecha(JLabel lblFecha) {
		this.lblFecha = lblFecha;
	}

	public JDateChooser getCalendario() {
		return calendario;
	}

	public void setCalendario(JDateChooser calendario) {
		this.calendario = calendario;
	}

}
