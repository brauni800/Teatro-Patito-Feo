package paneles;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import elementos.ElementoFactory;
import tablas.TablaObras;

/**
 * 
 * @author b1796
 *
 */
@SuppressWarnings("serial")
public abstract class PanelFactory extends JPanel {
	
	public static final String ACTUALIZAR = "ACTUALIZAR";
	public static final String ANTERIOR = "ANTERIOR";
	public static final String CREAR = "CREAR";
	public static final String EDITAR = "EDITAR";
	public static final String ELIMINAR = "ELIMINAR";
	public static final String FUNCIONES = "FUNCIONES";
	public static final String OBRAS = "OBRAS";
	public static final String REGRESAR = "REGRESAR";
	public static final String SELECCIONAR = "SELECCIONAR";
	public static final String SIGUIENTE = "SIGUIENTE";
	public static final String VENDER_BOLETOS = "VENDER_BOLETOS";

	protected ElementoFactory elementoDinamico;
	protected PanelFactory panelDinamico;
	protected JButton btnCrear, btnEliminar, btnEditar, btnRegresar, btnAgregarResponsable, btnObras, btnVenderBoletos, btnSiguiente, btnAnterior, btnActualizar, btnFunciones;
	protected JTextField txtFieldNombre, txtFieldApellido, txtFieldPrecio, txtFieldSeleccion, txtFieldTelefono1, txtFieldTelefono2, txtFieldCorreoElectronico, txtFieldRepresentantes;
	protected JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7;
	protected JComboBox<Integer> cmBoxHoras, cmBoxMinutos;
	protected JComboBox<String> cmBoxSeleccionar;
	protected JTextArea textAreaDescripcion;
	protected TablaObras table;
	protected JScrollPane scrollPane;
	protected String email;

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

	public JButton getBtnFunciones() {
		return btnFunciones;
	}

	public void setBtnFunciones(JButton btnFunciones) {
		this.btnFunciones = btnFunciones;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}

	public JLabel getLbl7() {
		return lbl7;
	}

	public void setLbl7(JLabel lbl7) {
		this.lbl7 = lbl7;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public JButton getBtnAnterior() {
		return btnAnterior;
	}

	public void setBtnAnterior(JButton btnAnterior) {
		this.btnAnterior = btnAnterior;
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

	public JTextField getTxtFieldNombre() {
		return txtFieldNombre;
	}

	public void setTxtFieldNombre(JTextField txtFieldNombre) {
		this.txtFieldNombre = txtFieldNombre;
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

	public JLabel getLbl1() {
		return lbl1;
	}

	public void setLbl1(JLabel lbl1) {
		this.lbl1 = lbl1;
	}

	public JLabel getLbl2() {
		return lbl2;
	}

	public void setLbl2(JLabel lbl2) {
		this.lbl2 = lbl2;
	}

	public JLabel getLbl3() {
		return lbl3;
	}

	public void setLbl3(JLabel lbl3) {
		this.lbl3 = lbl3;
	}

	public JLabel getLbl4() {
		return lbl4;
	}

	public void setLbl4(JLabel lbl4) {
		this.lbl4 = lbl4;
	}

	public JLabel getLbl5() {
		return lbl5;
	}

	public void setLbl5(JLabel lbl5) {
		this.lbl5 = lbl5;
	}

	public JLabel getLbl6() {
		return lbl6;
	}

	public void setLbl6(JLabel lbl6) {
		this.lbl6 = lbl6;
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

	public JTextField getTxtFieldRepresentantes() {
		return txtFieldRepresentantes;
	}

	public void setTxtFieldRepresentantes(JTextField txtFieldRepresentantes) {
		this.txtFieldRepresentantes = txtFieldRepresentantes;
	}

	public JComboBox<String> getCmBoxSeleccionar() {
		return cmBoxSeleccionar;
	}

	public void setCmBoxSeleccionar(JComboBox<String> cmBoxSeleccionar) {
		this.cmBoxSeleccionar = cmBoxSeleccionar;
	}

	public JTextArea getTextAreaDescripcion() {
		return textAreaDescripcion;
	}

	public void setTextAreaDescripcion(JTextArea textAreaDescripcion) {
		this.textAreaDescripcion = textAreaDescripcion;
	}

	public TablaObras getTable() {
		return table;
	}

	public void setTable(TablaObras table) {
		this.table = table;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JButton getBtnSiguiente() {
		return btnSiguiente;
	}

	public void setBtnSiguiente(JButton btnSiguiente) {
		this.btnSiguiente = btnSiguiente;
	}

	public JTextField getTxtFieldApellido() {
		return txtFieldApellido;
	}

	public void setTxtFieldApellido(JTextField txtFieldApellido) {
		this.txtFieldApellido = txtFieldApellido;
	}

	public JTextField getTxtFieldTelefono1() {
		return txtFieldTelefono1;
	}

	public void setTxtFieldTelefono1(JTextField txtFieldTelefono1) {
		this.txtFieldTelefono1 = txtFieldTelefono1;
	}

	public JTextField getTxtFieldTelefono2() {
		return txtFieldTelefono2;
	}

	public void setTxtFieldTelefono2(JTextField txtFieldTelefono2) {
		this.txtFieldTelefono2 = txtFieldTelefono2;
	}

	public JTextField getTxtFieldCorreoElectronico() {
		return txtFieldCorreoElectronico;
	}

	public void setTxtFieldCorreoElectronico(JTextField txtFieldCorreoElectronico) {
		this.txtFieldCorreoElectronico = txtFieldCorreoElectronico;
	}
	
}
