package paneles;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
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
@SuppressWarnings("serial")
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
	public static final String AGREGAR_RESPONSABLE = "AGREGAR_RESPONSABLE";
	public static final String CANCELAR_BOLETO = "CANCELAR_BOLETO";
	public static final String VER_SALA = "VER_SALA";
	public static final String BOLETOS = "BOLETOS";
	public static final String INFORME_VENTAS = "INFORME_VENTAS";
	public static final String MOSTRAR_FUNCIONES = "MOSTRAR_FUNCIONES";
	public static final String IR_FUNCIONES = "IR_FUNCIONES";
	public static final String VENDER_ASIENTOS = "VENDER_ASIENTOS";
	public static final String ASIENTOS_SELECCIONADOS = "ASIENTOS_SELECCIONADOS";

	protected ElementoFactory elementoDinamico;
	protected PanelFactory panelDinamico;
	protected JButton btnCrear, btnEliminar, btnEditar, btnRegresar, btnAgregarResponsable, btnObras, btnInformes,
			btnCrearFuncion, btnCancelarFuncion, btnFuncion, btnEditarFuncion, btnIrAFunciones;
	protected JButton btnAceptarCrearFuncion, btnVenderBoleto, btnCancelarBoleto, btnVerSala, btnBoleto,
			btnMostrarFunciones, btnVenderAsientos, btnVerFunciones, btnAsientosSeleccionados;
	protected JTextField txtFieldNombreObra, txtFieldPrecio, txtFieldSeleccion, txtFieldNombreRepre,
			txtFieldApellidoRepre, txtFieldTelefonoRepre, txtFieldTelefonoAlternativoRepre, txtFieldEmailRepre;
	protected JLabel lblNombreObra, lblPrecio, lblDuracion, lblRepresentante, lblDescripcion, lblSeleccionarObra,
			lblSeleccion, lblNombreRepresentante, lblApellidoRepresentante, lblTelefonoRepresentante,
			lblTelAlternativoRepresentante, lblEmailRepresentante;
	protected JLabel lblHorario, lblHora, lblMinuto, lblFecha;
	protected JComboBox<Integer> cmBoxHoras, cmBoxMinutos;
	protected JComboBox<String> cmBoxRepresentantes, cmBoxSeleccionarObra, cmBoxSeleccionarFunciones;
	protected JTextArea textAreaDescripcion;
	protected JTable table, tableFunciones;
	protected JScrollPane scrollPane;
	protected JCalendar calendarioFunciones;
	protected JDateChooser calendario;
	protected URL url;
	Image image;
	protected javax.swing.JLabel A;
    protected javax.swing.JLabel A1;
    protected javax.swing.JLabel A10;
    protected javax.swing.JLabel A11;
    protected javax.swing.JLabel A12;
    protected javax.swing.JLabel A13;
    protected javax.swing.JLabel A14;
    protected javax.swing.JLabel A15;
    protected javax.swing.JLabel A16;
    protected javax.swing.JLabel A17;
    protected javax.swing.JLabel A18;
    protected javax.swing.JLabel A19;
    protected javax.swing.JLabel A2;
    protected javax.swing.JLabel A20;
    protected javax.swing.JLabel A3;
    protected javax.swing.JLabel A4;
    protected javax.swing.JLabel A5;
    protected javax.swing.JLabel A6;
    protected javax.swing.JLabel A7;
    protected javax.swing.JLabel A8;
    protected javax.swing.JLabel A9;
    protected javax.swing.JLabel B;
    protected javax.swing.JLabel B1;
    protected javax.swing.JLabel B10;
    protected javax.swing.JLabel B11;
    protected javax.swing.JLabel B12;
    protected javax.swing.JLabel B13;
    protected javax.swing.JLabel B14;
    protected javax.swing.JLabel B15;
    protected javax.swing.JLabel B16;
    protected javax.swing.JLabel B17;
    protected javax.swing.JLabel B18;
    protected javax.swing.JLabel B19;
    protected javax.swing.JLabel B2;
    protected javax.swing.JLabel B20;
    protected javax.swing.JLabel B3;
    protected javax.swing.JLabel B4;
    protected javax.swing.JLabel B5;
    protected javax.swing.JLabel B6;
    protected javax.swing.JLabel B7;
    protected javax.swing.JLabel B8;
    protected javax.swing.JLabel B9;
    protected javax.swing.JLabel C;
    protected javax.swing.JLabel C1;
    protected javax.swing.JLabel C10;
    protected javax.swing.JLabel C11;
    protected javax.swing.JLabel C12;
    protected javax.swing.JLabel C13;
    protected javax.swing.JLabel C14;
    protected javax.swing.JLabel C15;
    protected javax.swing.JLabel C16;
    protected javax.swing.JLabel C17;
    protected javax.swing.JLabel C18;
    protected javax.swing.JLabel C19;
    protected javax.swing.JLabel C2;
    protected javax.swing.JLabel C20;
    protected javax.swing.JLabel C3;
    protected javax.swing.JLabel C4;
    protected javax.swing.JLabel C5;
    protected javax.swing.JLabel C6;
    protected javax.swing.JLabel C7;
    protected javax.swing.JLabel C8;
    protected javax.swing.JLabel C9;
    protected javax.swing.JLabel D;
    protected javax.swing.JLabel D1;
    protected javax.swing.JLabel D10;
    protected javax.swing.JLabel D11;
    protected javax.swing.JLabel D12;
    protected javax.swing.JLabel D13;
    protected javax.swing.JLabel D14;
    protected javax.swing.JLabel D15;
    protected javax.swing.JLabel D16;
    protected javax.swing.JLabel D17;
    protected javax.swing.JLabel D18;
    protected javax.swing.JLabel D19;
    protected javax.swing.JLabel D2;
    protected javax.swing.JLabel D20;
    protected javax.swing.JLabel D3;
    protected javax.swing.JLabel D4;
    protected javax.swing.JLabel D5;
    protected javax.swing.JLabel D6;
    protected javax.swing.JLabel D7;
    protected javax.swing.JLabel D8;
    protected javax.swing.JLabel D9;
    protected javax.swing.JLabel E;
    protected javax.swing.JLabel E1;
    protected javax.swing.JLabel E10;
    protected javax.swing.JLabel E11;
    protected javax.swing.JLabel E12;
    protected javax.swing.JLabel E13;
    protected javax.swing.JLabel E14;
    protected javax.swing.JLabel E15;
    protected javax.swing.JLabel E16;
    protected javax.swing.JLabel E17;
    protected javax.swing.JLabel E18;
    protected javax.swing.JLabel E19;
    protected javax.swing.JLabel E2;
    protected javax.swing.JLabel E20;
    protected javax.swing.JLabel E3;
    protected javax.swing.JLabel E4;
    protected javax.swing.JLabel E5;
    protected javax.swing.JLabel E6;
    protected javax.swing.JLabel E7;
    protected javax.swing.JLabel E8;
    protected javax.swing.JLabel E9;
    protected javax.swing.JLabel Escenario;
    protected javax.swing.JLabel F;
    protected javax.swing.JLabel F1;
    protected javax.swing.JLabel F10;
    protected javax.swing.JLabel F11;
    protected javax.swing.JLabel F12;
    protected javax.swing.JLabel F13;
    protected javax.swing.JLabel F14;
    protected javax.swing.JLabel F15;
    protected javax.swing.JLabel F16;
    protected javax.swing.JLabel F17;
    protected javax.swing.JLabel F18;
    protected javax.swing.JLabel F19;
    protected javax.swing.JLabel F2;
    protected javax.swing.JLabel F20;
    protected javax.swing.JLabel F3;
    protected javax.swing.JLabel F4;
    protected javax.swing.JLabel F5;
    protected javax.swing.JLabel F6;
    protected javax.swing.JLabel F7;
    protected javax.swing.JLabel F8;
    protected javax.swing.JLabel F9;
    protected javax.swing.JLabel G;
    protected javax.swing.JLabel G1;
    protected javax.swing.JLabel G10;
    protected javax.swing.JLabel G11;
    protected javax.swing.JLabel G12;
    protected javax.swing.JLabel G13;
    protected javax.swing.JLabel G14;
    protected javax.swing.JLabel G15;
    protected javax.swing.JLabel G16;
    protected javax.swing.JLabel G17;
    protected javax.swing.JLabel G18;
    protected javax.swing.JLabel G19;
    protected javax.swing.JLabel G2;
    protected javax.swing.JLabel G20;
    protected javax.swing.JLabel G3;
    protected javax.swing.JLabel G4;
    protected javax.swing.JLabel G5;
    protected javax.swing.JLabel G6;
    protected javax.swing.JLabel G7;
    protected javax.swing.JLabel G8;
    protected javax.swing.JLabel G9;
    protected javax.swing.JLabel H;
    protected javax.swing.JLabel H1;
    protected javax.swing.JLabel H10;
    protected javax.swing.JLabel H11;
    protected javax.swing.JLabel H12;
    protected javax.swing.JLabel H13;
    protected javax.swing.JLabel H14;
    protected javax.swing.JLabel H15;
    protected javax.swing.JLabel H16;
    protected javax.swing.JLabel H17;
    protected javax.swing.JLabel H18;
    protected javax.swing.JLabel H19;
    protected javax.swing.JLabel H2;
    protected javax.swing.JLabel H20;
    protected javax.swing.JLabel H3;
    protected javax.swing.JLabel H4;
    protected javax.swing.JLabel H5;
    protected javax.swing.JLabel H6;
    protected javax.swing.JLabel H7;
    protected javax.swing.JLabel H8;
    protected javax.swing.JLabel H9;
    protected javax.swing.JLabel Num1;
    protected javax.swing.JLabel Num10;
    protected javax.swing.JLabel Num11;
    protected javax.swing.JLabel Num12;
    protected javax.swing.JLabel Num13;
    protected javax.swing.JLabel Num14;
    protected javax.swing.JLabel Num15;
    protected javax.swing.JLabel Num16;
    protected javax.swing.JLabel Num17;
    protected javax.swing.JLabel Num18;
    protected javax.swing.JLabel Num19;
    protected javax.swing.JLabel Num2;
    protected javax.swing.JLabel Num20;
    protected javax.swing.JLabel Num3;
    protected javax.swing.JLabel Num4;
    protected javax.swing.JLabel Num5;
    protected javax.swing.JLabel Num6;
    protected javax.swing.JLabel Num7;
    protected javax.swing.JLabel Num8;
    protected javax.swing.JLabel Num9;
	
    /**
     * Inicialización de los paneles.
     */
	public PanelFactory() {
		super();
		setSize(950, 550);
		setLayout(null);
		setVisible(true);
		initComponents();
		url = getClass().getResource("imagenes/telon.jpg");
		image = new ImageIcon(url).getImage();
	}

	/**
	 * Inicialización de componentes en el sistema.
	 */
	protected abstract void initComponents();
	
	@Override
    public void paint(Graphics g){
		Dimension d = getSize();
		g.drawImage(image, 0, 0, d.width, d.height, this);
		this.setOpaque(false);
        super.paint(g);
    } 
	
	public JButton getBtnAsientosSeleccionados() {
		return btnAsientosSeleccionados;
	}

	public void setBtnAsientosSeleccionados(JButton btnAsientosSeleccionados) {
		this.btnAsientosSeleccionados = btnAsientosSeleccionados;
	}

	public JButton getBtnVerFunciones() {
		return btnVerFunciones;
	}

	public void setBtnVerFunciones(JButton btnVerFunciones) {
		this.btnVerFunciones = btnVerFunciones;
	}

	public JButton getBtnVenderAsientos() {
		return btnVenderAsientos;
	}

	public void setBtnVenderAsientos(JButton btnVenderAsientos) {
		this.btnVenderAsientos = btnVenderAsientos;
	}

	public PanelFactory getPanelDinamico() {
		return this.panelDinamico;
	}

	public JButton getBtnBoleto() {
		return btnBoleto;
	}

	public JComboBox<String> getCmBoxSeleccionarFunciones() {
		return cmBoxSeleccionarFunciones;
	}

	public void setCmBoxSeleccionarFunciones(JComboBox<String> cmBoxSeleccionarFunciones) {
		this.cmBoxSeleccionarFunciones = cmBoxSeleccionarFunciones;
	}

	public JButton getBtnMostrarFunciones() {
		return btnMostrarFunciones;
	}

	public void setBtnMostrarFunciones(JButton btnMostrarFunciones) {
		this.btnMostrarFunciones = btnMostrarFunciones;
	}

	public JButton getBtnIrAFunciones() {
		return btnIrAFunciones;
	}

	public void setBtnIrAFunciones(JButton btnIrAFunciones) {
		this.btnIrAFunciones = btnIrAFunciones;
	}

	public JButton getBtnInformes() {
		return btnInformes;
	}

	public void setBtnInformes(JButton btnInformes) {
		this.btnInformes = btnInformes;
	}

	public void setBtnBoleto(JButton btnBoleto) {
		this.btnBoleto = btnBoleto;
	}

	public JButton getBtnVenderBoleto() {
		return btnVenderBoleto;
	}

	public void setBtnVenderBoleto(JButton btnComprarBoleto) {
		this.btnVenderBoleto = btnComprarBoleto;
	}

	public JButton getBtnCancelarBoleto() {
		return btnCancelarBoleto;
	}

	public void setBtnCancelarBoleto(JButton btnCancelarBoleto) {
		this.btnCancelarBoleto = btnCancelarBoleto;
	}

	public JButton getBtnVerSala() {
		return btnVerSala;
	}

	public void setBtnVerSala(JButton btnVerSala) {
		this.btnVerSala = btnVerSala;
	}

	public void setPanelDinamico(PanelFactory panelDinamico) {
		this.panelDinamico = panelDinamico;
		add(panelDinamico);
		repaint();
	}

	public ElementoFactory getElementoDinamico() {
		return elementoDinamico;
	}

	public JTextField getTxtFieldNombreRepre() {
		return txtFieldNombreRepre;
	}

	public void setTxtFieldNombreRepre(JTextField txtFieldNombreRepre) {
		this.txtFieldNombreRepre = txtFieldNombreRepre;
	}

	public JTextField getTxtFieldApellidoRepre() {
		return txtFieldApellidoRepre;
	}

	public void setTxtFieldApellidoRepre(JTextField txtFieldApellidoRepre) {
		this.txtFieldApellidoRepre = txtFieldApellidoRepre;
	}

	public JTextField getTxtFieldTelefonoRepre() {
		return txtFieldTelefonoRepre;
	}

	public void setTxtFieldTelefonoRepre(JTextField txtFieldTelefonoRepre) {
		this.txtFieldTelefonoRepre = txtFieldTelefonoRepre;
	}

	public JTextField getTxtFieldTelefonoAlternativoRepre() {
		return txtFieldTelefonoAlternativoRepre;
	}

	public void setTxtFieldTelefonoAlternativoRepre(JTextField txtFieldTelefonoAlternativoRepre) {
		this.txtFieldTelefonoAlternativoRepre = txtFieldTelefonoAlternativoRepre;
	}

	public JTextField getTxtFieldEmailRepre() {
		return txtFieldEmailRepre;
	}

	public void setTxtFieldEmailRepre(JTextField txtFieldEmailRepre) {
		this.txtFieldEmailRepre = txtFieldEmailRepre;
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

	public javax.swing.JLabel getA() {
		return A;
	}

	public void setA(javax.swing.JLabel a) {
		A = a;
	}

	public javax.swing.JLabel getA1() {
		return A1;
	}

	public void setA1(javax.swing.JLabel a1) {
		A1 = a1;
	}

	public javax.swing.JLabel getA10() {
		return A10;
	}

	public void setA10(javax.swing.JLabel a10) {
		A10 = a10;
	}

	public javax.swing.JLabel getA11() {
		return A11;
	}

	public void setA11(javax.swing.JLabel a11) {
		A11 = a11;
	}

	public javax.swing.JLabel getA12() {
		return A12;
	}

	public void setA12(javax.swing.JLabel a12) {
		A12 = a12;
	}

	public javax.swing.JLabel getA13() {
		return A13;
	}

	public void setA13(javax.swing.JLabel a13) {
		A13 = a13;
	}

	public javax.swing.JLabel getA14() {
		return A14;
	}

	public void setA14(javax.swing.JLabel a14) {
		A14 = a14;
	}

	public javax.swing.JLabel getA15() {
		return A15;
	}

	public void setA15(javax.swing.JLabel a15) {
		A15 = a15;
	}

	public javax.swing.JLabel getA16() {
		return A16;
	}

	public void setA16(javax.swing.JLabel a16) {
		A16 = a16;
	}

	public javax.swing.JLabel getA17() {
		return A17;
	}

	public void setA17(javax.swing.JLabel a17) {
		A17 = a17;
	}

	public javax.swing.JLabel getA18() {
		return A18;
	}

	public void setA18(javax.swing.JLabel a18) {
		A18 = a18;
	}

	public javax.swing.JLabel getA19() {
		return A19;
	}

	public void setA19(javax.swing.JLabel a19) {
		A19 = a19;
	}

	public javax.swing.JLabel getA2() {
		return A2;
	}

	public void setA2(javax.swing.JLabel a2) {
		A2 = a2;
	}

	public javax.swing.JLabel getA20() {
		return A20;
	}

	public void setA20(javax.swing.JLabel a20) {
		A20 = a20;
	}

	public javax.swing.JLabel getA3() {
		return A3;
	}

	public void setA3(javax.swing.JLabel a3) {
		A3 = a3;
	}

	public javax.swing.JLabel getA4() {
		return A4;
	}

	public void setA4(javax.swing.JLabel a4) {
		A4 = a4;
	}

	public javax.swing.JLabel getA5() {
		return A5;
	}

	public void setA5(javax.swing.JLabel a5) {
		A5 = a5;
	}

	public javax.swing.JLabel getA6() {
		return A6;
	}

	public void setA6(javax.swing.JLabel a6) {
		A6 = a6;
	}

	public javax.swing.JLabel getA7() {
		return A7;
	}

	public void setA7(javax.swing.JLabel a7) {
		A7 = a7;
	}

	public javax.swing.JLabel getA8() {
		return A8;
	}

	public void setA8(javax.swing.JLabel a8) {
		A8 = a8;
	}

	public javax.swing.JLabel getA9() {
		return A9;
	}

	public void setA9(javax.swing.JLabel a9) {
		A9 = a9;
	}

	public javax.swing.JLabel getB() {
		return B;
	}

	public void setB(javax.swing.JLabel b) {
		B = b;
	}

	public javax.swing.JLabel getB1() {
		return B1;
	}

	public void setB1(javax.swing.JLabel b1) {
		B1 = b1;
	}

	public javax.swing.JLabel getB10() {
		return B10;
	}

	public void setB10(javax.swing.JLabel b10) {
		B10 = b10;
	}

	public javax.swing.JLabel getB11() {
		return B11;
	}

	public void setB11(javax.swing.JLabel b11) {
		B11 = b11;
	}

	public javax.swing.JLabel getB12() {
		return B12;
	}

	public void setB12(javax.swing.JLabel b12) {
		B12 = b12;
	}

	public javax.swing.JLabel getB13() {
		return B13;
	}

	public void setB13(javax.swing.JLabel b13) {
		B13 = b13;
	}

	public javax.swing.JLabel getB14() {
		return B14;
	}

	public void setB14(javax.swing.JLabel b14) {
		B14 = b14;
	}

	public javax.swing.JLabel getB15() {
		return B15;
	}

	public void setB15(javax.swing.JLabel b15) {
		B15 = b15;
	}

	public javax.swing.JLabel getB16() {
		return B16;
	}

	public void setB16(javax.swing.JLabel b16) {
		B16 = b16;
	}

	public javax.swing.JLabel getB17() {
		return B17;
	}

	public void setB17(javax.swing.JLabel b17) {
		B17 = b17;
	}

	public javax.swing.JLabel getB18() {
		return B18;
	}

	public void setB18(javax.swing.JLabel b18) {
		B18 = b18;
	}

	public javax.swing.JLabel getB19() {
		return B19;
	}

	public void setB19(javax.swing.JLabel b19) {
		B19 = b19;
	}

	public javax.swing.JLabel getB2() {
		return B2;
	}

	public void setB2(javax.swing.JLabel b2) {
		B2 = b2;
	}

	public javax.swing.JLabel getB20() {
		return B20;
	}

	public void setB20(javax.swing.JLabel b20) {
		B20 = b20;
	}

	public javax.swing.JLabel getB3() {
		return B3;
	}

	public void setB3(javax.swing.JLabel b3) {
		B3 = b3;
	}

	public javax.swing.JLabel getB4() {
		return B4;
	}

	public void setB4(javax.swing.JLabel b4) {
		B4 = b4;
	}

	public javax.swing.JLabel getB5() {
		return B5;
	}

	public void setB5(javax.swing.JLabel b5) {
		B5 = b5;
	}

	public javax.swing.JLabel getB6() {
		return B6;
	}

	public void setB6(javax.swing.JLabel b6) {
		B6 = b6;
	}

	public javax.swing.JLabel getB7() {
		return B7;
	}

	public void setB7(javax.swing.JLabel b7) {
		B7 = b7;
	}

	public javax.swing.JLabel getB8() {
		return B8;
	}

	public void setB8(javax.swing.JLabel b8) {
		B8 = b8;
	}

	public javax.swing.JLabel getB9() {
		return B9;
	}

	public void setB9(javax.swing.JLabel b9) {
		B9 = b9;
	}

	public javax.swing.JLabel getC() {
		return C;
	}

	public void setC(javax.swing.JLabel c) {
		C = c;
	}

	public javax.swing.JLabel getC1() {
		return C1;
	}

	public void setC1(javax.swing.JLabel c1) {
		C1 = c1;
	}

	public javax.swing.JLabel getC10() {
		return C10;
	}

	public void setC10(javax.swing.JLabel c10) {
		C10 = c10;
	}

	public javax.swing.JLabel getC11() {
		return C11;
	}

	public void setC11(javax.swing.JLabel c11) {
		C11 = c11;
	}

	public javax.swing.JLabel getC12() {
		return C12;
	}

	public void setC12(javax.swing.JLabel c12) {
		C12 = c12;
	}

	public javax.swing.JLabel getC13() {
		return C13;
	}

	public void setC13(javax.swing.JLabel c13) {
		C13 = c13;
	}

	public javax.swing.JLabel getC14() {
		return C14;
	}

	public void setC14(javax.swing.JLabel c14) {
		C14 = c14;
	}

	public javax.swing.JLabel getC15() {
		return C15;
	}

	public void setC15(javax.swing.JLabel c15) {
		C15 = c15;
	}

	public javax.swing.JLabel getC16() {
		return C16;
	}

	public void setC16(javax.swing.JLabel c16) {
		C16 = c16;
	}

	public javax.swing.JLabel getC17() {
		return C17;
	}

	public void setC17(javax.swing.JLabel c17) {
		C17 = c17;
	}

	public javax.swing.JLabel getC18() {
		return C18;
	}

	public void setC18(javax.swing.JLabel c18) {
		C18 = c18;
	}

	public javax.swing.JLabel getC19() {
		return C19;
	}

	public void setC19(javax.swing.JLabel c19) {
		C19 = c19;
	}

	public javax.swing.JLabel getC2() {
		return C2;
	}

	public void setC2(javax.swing.JLabel c2) {
		C2 = c2;
	}

	public javax.swing.JLabel getC20() {
		return C20;
	}

	public void setC20(javax.swing.JLabel c20) {
		C20 = c20;
	}

	public javax.swing.JLabel getC3() {
		return C3;
	}

	public void setC3(javax.swing.JLabel c3) {
		C3 = c3;
	}

	public javax.swing.JLabel getC4() {
		return C4;
	}

	public void setC4(javax.swing.JLabel c4) {
		C4 = c4;
	}

	public javax.swing.JLabel getC5() {
		return C5;
	}

	public void setC5(javax.swing.JLabel c5) {
		C5 = c5;
	}

	public javax.swing.JLabel getC6() {
		return C6;
	}

	public void setC6(javax.swing.JLabel c6) {
		C6 = c6;
	}

	public javax.swing.JLabel getC7() {
		return C7;
	}

	public void setC7(javax.swing.JLabel c7) {
		C7 = c7;
	}

	public javax.swing.JLabel getC8() {
		return C8;
	}

	public void setC8(javax.swing.JLabel c8) {
		C8 = c8;
	}

	public javax.swing.JLabel getC9() {
		return C9;
	}

	public void setC9(javax.swing.JLabel c9) {
		C9 = c9;
	}

	public javax.swing.JLabel getD() {
		return D;
	}

	public void setD(javax.swing.JLabel d) {
		D = d;
	}

	public javax.swing.JLabel getD1() {
		return D1;
	}

	public void setD1(javax.swing.JLabel d1) {
		D1 = d1;
	}

	public javax.swing.JLabel getD10() {
		return D10;
	}

	public void setD10(javax.swing.JLabel d10) {
		D10 = d10;
	}

	public javax.swing.JLabel getD11() {
		return D11;
	}

	public void setD11(javax.swing.JLabel d11) {
		D11 = d11;
	}

	public javax.swing.JLabel getD12() {
		return D12;
	}

	public void setD12(javax.swing.JLabel d12) {
		D12 = d12;
	}

	public javax.swing.JLabel getD13() {
		return D13;
	}

	public void setD13(javax.swing.JLabel d13) {
		D13 = d13;
	}

	public javax.swing.JLabel getD14() {
		return D14;
	}

	public void setD14(javax.swing.JLabel d14) {
		D14 = d14;
	}

	public javax.swing.JLabel getD15() {
		return D15;
	}

	public void setD15(javax.swing.JLabel d15) {
		D15 = d15;
	}

	public javax.swing.JLabel getD16() {
		return D16;
	}

	public void setD16(javax.swing.JLabel d16) {
		D16 = d16;
	}

	public javax.swing.JLabel getD17() {
		return D17;
	}

	public void setD17(javax.swing.JLabel d17) {
		D17 = d17;
	}

	public javax.swing.JLabel getD18() {
		return D18;
	}

	public void setD18(javax.swing.JLabel d18) {
		D18 = d18;
	}

	public javax.swing.JLabel getD19() {
		return D19;
	}

	public void setD19(javax.swing.JLabel d19) {
		D19 = d19;
	}

	public javax.swing.JLabel getD2() {
		return D2;
	}

	public void setD2(javax.swing.JLabel d2) {
		D2 = d2;
	}

	public javax.swing.JLabel getD20() {
		return D20;
	}

	public void setD20(javax.swing.JLabel d20) {
		D20 = d20;
	}

	public javax.swing.JLabel getD3() {
		return D3;
	}

	public void setD3(javax.swing.JLabel d3) {
		D3 = d3;
	}

	public javax.swing.JLabel getD4() {
		return D4;
	}

	public void setD4(javax.swing.JLabel d4) {
		D4 = d4;
	}

	public javax.swing.JLabel getD5() {
		return D5;
	}

	public void setD5(javax.swing.JLabel d5) {
		D5 = d5;
	}

	public javax.swing.JLabel getD6() {
		return D6;
	}

	public void setD6(javax.swing.JLabel d6) {
		D6 = d6;
	}

	public javax.swing.JLabel getD7() {
		return D7;
	}

	public void setD7(javax.swing.JLabel d7) {
		D7 = d7;
	}

	public javax.swing.JLabel getD8() {
		return D8;
	}

	public void setD8(javax.swing.JLabel d8) {
		D8 = d8;
	}

	public javax.swing.JLabel getD9() {
		return D9;
	}

	public void setD9(javax.swing.JLabel d9) {
		D9 = d9;
	}

	public javax.swing.JLabel getE() {
		return E;
	}

	public void setE(javax.swing.JLabel e) {
		E = e;
	}

	public javax.swing.JLabel getE1() {
		return E1;
	}

	public void setE1(javax.swing.JLabel e1) {
		E1 = e1;
	}

	public javax.swing.JLabel getE10() {
		return E10;
	}

	public void setE10(javax.swing.JLabel e10) {
		E10 = e10;
	}

	public javax.swing.JLabel getE11() {
		return E11;
	}

	public void setE11(javax.swing.JLabel e11) {
		E11 = e11;
	}

	public javax.swing.JLabel getE12() {
		return E12;
	}

	public void setE12(javax.swing.JLabel e12) {
		E12 = e12;
	}

	public javax.swing.JLabel getE13() {
		return E13;
	}

	public void setE13(javax.swing.JLabel e13) {
		E13 = e13;
	}

	public javax.swing.JLabel getE14() {
		return E14;
	}

	public void setE14(javax.swing.JLabel e14) {
		E14 = e14;
	}

	public javax.swing.JLabel getE15() {
		return E15;
	}

	public void setE15(javax.swing.JLabel e15) {
		E15 = e15;
	}

	public javax.swing.JLabel getE16() {
		return E16;
	}

	public void setE16(javax.swing.JLabel e16) {
		E16 = e16;
	}

	public javax.swing.JLabel getE17() {
		return E17;
	}

	public void setE17(javax.swing.JLabel e17) {
		E17 = e17;
	}

	public javax.swing.JLabel getE18() {
		return E18;
	}

	public void setE18(javax.swing.JLabel e18) {
		E18 = e18;
	}

	public javax.swing.JLabel getE19() {
		return E19;
	}

	public void setE19(javax.swing.JLabel e19) {
		E19 = e19;
	}

	public javax.swing.JLabel getE2() {
		return E2;
	}

	public void setE2(javax.swing.JLabel e2) {
		E2 = e2;
	}

	public javax.swing.JLabel getE20() {
		return E20;
	}

	public void setE20(javax.swing.JLabel e20) {
		E20 = e20;
	}

	public javax.swing.JLabel getE3() {
		return E3;
	}

	public void setE3(javax.swing.JLabel e3) {
		E3 = e3;
	}

	public javax.swing.JLabel getE4() {
		return E4;
	}

	public void setE4(javax.swing.JLabel e4) {
		E4 = e4;
	}

	public javax.swing.JLabel getE5() {
		return E5;
	}

	public void setE5(javax.swing.JLabel e5) {
		E5 = e5;
	}

	public javax.swing.JLabel getE6() {
		return E6;
	}

	public void setE6(javax.swing.JLabel e6) {
		E6 = e6;
	}

	public javax.swing.JLabel getE7() {
		return E7;
	}

	public void setE7(javax.swing.JLabel e7) {
		E7 = e7;
	}

	public javax.swing.JLabel getE8() {
		return E8;
	}

	public void setE8(javax.swing.JLabel e8) {
		E8 = e8;
	}

	public javax.swing.JLabel getE9() {
		return E9;
	}

	public void setE9(javax.swing.JLabel e9) {
		E9 = e9;
	}

	public javax.swing.JLabel getEscenario() {
		return Escenario;
	}

	public void setEscenario(javax.swing.JLabel escenario) {
		Escenario = escenario;
	}

	public javax.swing.JLabel getF() {
		return F;
	}

	public void setF(javax.swing.JLabel f) {
		F = f;
	}

	public javax.swing.JLabel getF1() {
		return F1;
	}

	public void setF1(javax.swing.JLabel f1) {
		F1 = f1;
	}

	public javax.swing.JLabel getF10() {
		return F10;
	}

	public void setF10(javax.swing.JLabel f10) {
		F10 = f10;
	}

	public javax.swing.JLabel getF11() {
		return F11;
	}

	public void setF11(javax.swing.JLabel f11) {
		F11 = f11;
	}

	public javax.swing.JLabel getF12() {
		return F12;
	}

	public void setF12(javax.swing.JLabel f12) {
		F12 = f12;
	}

	public javax.swing.JLabel getF13() {
		return F13;
	}

	public void setF13(javax.swing.JLabel f13) {
		F13 = f13;
	}

	public javax.swing.JLabel getF14() {
		return F14;
	}

	public void setF14(javax.swing.JLabel f14) {
		F14 = f14;
	}

	public javax.swing.JLabel getF15() {
		return F15;
	}

	public void setF15(javax.swing.JLabel f15) {
		F15 = f15;
	}

	public javax.swing.JLabel getF16() {
		return F16;
	}

	public void setF16(javax.swing.JLabel f16) {
		F16 = f16;
	}

	public javax.swing.JLabel getF17() {
		return F17;
	}

	public void setF17(javax.swing.JLabel f17) {
		F17 = f17;
	}

	public javax.swing.JLabel getF18() {
		return F18;
	}

	public void setF18(javax.swing.JLabel f18) {
		F18 = f18;
	}

	public javax.swing.JLabel getF19() {
		return F19;
	}

	public void setF19(javax.swing.JLabel f19) {
		F19 = f19;
	}

	public javax.swing.JLabel getF2() {
		return F2;
	}

	public void setF2(javax.swing.JLabel f2) {
		F2 = f2;
	}

	public javax.swing.JLabel getF20() {
		return F20;
	}

	public void setF20(javax.swing.JLabel f20) {
		F20 = f20;
	}

	public javax.swing.JLabel getF3() {
		return F3;
	}

	public void setF3(javax.swing.JLabel f3) {
		F3 = f3;
	}

	public javax.swing.JLabel getF4() {
		return F4;
	}

	public void setF4(javax.swing.JLabel f4) {
		F4 = f4;
	}

	public javax.swing.JLabel getF5() {
		return F5;
	}

	public void setF5(javax.swing.JLabel f5) {
		F5 = f5;
	}

	public javax.swing.JLabel getF6() {
		return F6;
	}

	public void setF6(javax.swing.JLabel f6) {
		F6 = f6;
	}

	public javax.swing.JLabel getF7() {
		return F7;
	}

	public void setF7(javax.swing.JLabel f7) {
		F7 = f7;
	}

	public javax.swing.JLabel getF8() {
		return F8;
	}

	public void setF8(javax.swing.JLabel f8) {
		F8 = f8;
	}

	public javax.swing.JLabel getF9() {
		return F9;
	}

	public void setF9(javax.swing.JLabel f9) {
		F9 = f9;
	}

	public javax.swing.JLabel getG() {
		return G;
	}

	public void setG(javax.swing.JLabel g) {
		G = g;
	}

	public javax.swing.JLabel getG1() {
		return G1;
	}

	public void setG1(javax.swing.JLabel g1) {
		G1 = g1;
	}

	public javax.swing.JLabel getG10() {
		return G10;
	}

	public void setG10(javax.swing.JLabel g10) {
		G10 = g10;
	}

	public javax.swing.JLabel getG11() {
		return G11;
	}

	public void setG11(javax.swing.JLabel g11) {
		G11 = g11;
	}

	public javax.swing.JLabel getG12() {
		return G12;
	}

	public void setG12(javax.swing.JLabel g12) {
		G12 = g12;
	}

	public javax.swing.JLabel getG13() {
		return G13;
	}

	public void setG13(javax.swing.JLabel g13) {
		G13 = g13;
	}

	public javax.swing.JLabel getG14() {
		return G14;
	}

	public void setG14(javax.swing.JLabel g14) {
		G14 = g14;
	}

	public javax.swing.JLabel getG15() {
		return G15;
	}

	public void setG15(javax.swing.JLabel g15) {
		G15 = g15;
	}

	public javax.swing.JLabel getG16() {
		return G16;
	}

	public void setG16(javax.swing.JLabel g16) {
		G16 = g16;
	}

	public javax.swing.JLabel getG17() {
		return G17;
	}

	public void setG17(javax.swing.JLabel g17) {
		G17 = g17;
	}

	public javax.swing.JLabel getG18() {
		return G18;
	}

	public void setG18(javax.swing.JLabel g18) {
		G18 = g18;
	}

	public javax.swing.JLabel getG19() {
		return G19;
	}

	public void setG19(javax.swing.JLabel g19) {
		G19 = g19;
	}

	public javax.swing.JLabel getG2() {
		return G2;
	}

	public void setG2(javax.swing.JLabel g2) {
		G2 = g2;
	}

	public javax.swing.JLabel getG20() {
		return G20;
	}

	public void setG20(javax.swing.JLabel g20) {
		G20 = g20;
	}

	public javax.swing.JLabel getG3() {
		return G3;
	}

	public void setG3(javax.swing.JLabel g3) {
		G3 = g3;
	}

	public javax.swing.JLabel getG4() {
		return G4;
	}

	public void setG4(javax.swing.JLabel g4) {
		G4 = g4;
	}

	public javax.swing.JLabel getG5() {
		return G5;
	}

	public void setG5(javax.swing.JLabel g5) {
		G5 = g5;
	}

	public javax.swing.JLabel getG6() {
		return G6;
	}

	public void setG6(javax.swing.JLabel g6) {
		G6 = g6;
	}

	public javax.swing.JLabel getG7() {
		return G7;
	}

	public void setG7(javax.swing.JLabel g7) {
		G7 = g7;
	}

	public javax.swing.JLabel getG8() {
		return G8;
	}

	public void setG8(javax.swing.JLabel g8) {
		G8 = g8;
	}

	public javax.swing.JLabel getG9() {
		return G9;
	}

	public void setG9(javax.swing.JLabel g9) {
		G9 = g9;
	}

	public javax.swing.JLabel getH() {
		return H;
	}

	public void setH(javax.swing.JLabel h) {
		H = h;
	}

	public javax.swing.JLabel getH1() {
		return H1;
	}

	public void setH1(javax.swing.JLabel h1) {
		H1 = h1;
	}

	public javax.swing.JLabel getH10() {
		return H10;
	}

	public void setH10(javax.swing.JLabel h10) {
		H10 = h10;
	}

	public javax.swing.JLabel getH11() {
		return H11;
	}

	public void setH11(javax.swing.JLabel h11) {
		H11 = h11;
	}

	public javax.swing.JLabel getH12() {
		return H12;
	}

	public void setH12(javax.swing.JLabel h12) {
		H12 = h12;
	}

	public javax.swing.JLabel getH13() {
		return H13;
	}

	public void setH13(javax.swing.JLabel h13) {
		H13 = h13;
	}

	public javax.swing.JLabel getH14() {
		return H14;
	}

	public void setH14(javax.swing.JLabel h14) {
		H14 = h14;
	}

	public javax.swing.JLabel getH15() {
		return H15;
	}

	public void setH15(javax.swing.JLabel h15) {
		H15 = h15;
	}

	public javax.swing.JLabel getH16() {
		return H16;
	}

	public void setH16(javax.swing.JLabel h16) {
		H16 = h16;
	}

	public javax.swing.JLabel getH17() {
		return H17;
	}

	public void setH17(javax.swing.JLabel h17) {
		H17 = h17;
	}

	public javax.swing.JLabel getH18() {
		return H18;
	}

	public void setH18(javax.swing.JLabel h18) {
		H18 = h18;
	}

	public javax.swing.JLabel getH19() {
		return H19;
	}

	public void setH19(javax.swing.JLabel h19) {
		H19 = h19;
	}

	public javax.swing.JLabel getH2() {
		return H2;
	}

	public void setH2(javax.swing.JLabel h2) {
		H2 = h2;
	}

	public javax.swing.JLabel getH20() {
		return H20;
	}

	public void setH20(javax.swing.JLabel h20) {
		H20 = h20;
	}

	public javax.swing.JLabel getH3() {
		return H3;
	}

	public void setH3(javax.swing.JLabel h3) {
		H3 = h3;
	}

	public javax.swing.JLabel getH4() {
		return H4;
	}

	public void setH4(javax.swing.JLabel h4) {
		H4 = h4;
	}

	public javax.swing.JLabel getH5() {
		return H5;
	}

	public void setH5(javax.swing.JLabel h5) {
		H5 = h5;
	}

	public javax.swing.JLabel getH6() {
		return H6;
	}

	public void setH6(javax.swing.JLabel h6) {
		H6 = h6;
	}

	public javax.swing.JLabel getH7() {
		return H7;
	}

	public void setH7(javax.swing.JLabel h7) {
		H7 = h7;
	}

	public javax.swing.JLabel getH8() {
		return H8;
	}

	public void setH8(javax.swing.JLabel h8) {
		H8 = h8;
	}

	public javax.swing.JLabel getH9() {
		return H9;
	}

	public void setH9(javax.swing.JLabel h9) {
		H9 = h9;
	}

	public javax.swing.JLabel getNum1() {
		return Num1;
	}

	public void setNum1(javax.swing.JLabel num1) {
		Num1 = num1;
	}

	public javax.swing.JLabel getNum10() {
		return Num10;
	}

	public void setNum10(javax.swing.JLabel num10) {
		Num10 = num10;
	}

	public javax.swing.JLabel getNum11() {
		return Num11;
	}

	public void setNum11(javax.swing.JLabel num11) {
		Num11 = num11;
	}

	public javax.swing.JLabel getNum12() {
		return Num12;
	}

	public void setNum12(javax.swing.JLabel num12) {
		Num12 = num12;
	}

	public javax.swing.JLabel getNum13() {
		return Num13;
	}

	public void setNum13(javax.swing.JLabel num13) {
		Num13 = num13;
	}

	public javax.swing.JLabel getNum14() {
		return Num14;
	}

	public void setNum14(javax.swing.JLabel num14) {
		Num14 = num14;
	}

	public javax.swing.JLabel getNum15() {
		return Num15;
	}

	public void setNum15(javax.swing.JLabel num15) {
		Num15 = num15;
	}

	public javax.swing.JLabel getNum16() {
		return Num16;
	}

	public void setNum16(javax.swing.JLabel num16) {
		Num16 = num16;
	}

	public javax.swing.JLabel getNum17() {
		return Num17;
	}

	public void setNum17(javax.swing.JLabel num17) {
		Num17 = num17;
	}

	public javax.swing.JLabel getNum18() {
		return Num18;
	}

	public void setNum18(javax.swing.JLabel num18) {
		Num18 = num18;
	}

	public javax.swing.JLabel getNum19() {
		return Num19;
	}

	public void setNum19(javax.swing.JLabel num19) {
		Num19 = num19;
	}

	public javax.swing.JLabel getNum2() {
		return Num2;
	}

	public void setNum2(javax.swing.JLabel num2) {
		Num2 = num2;
	}

	public javax.swing.JLabel getNum20() {
		return Num20;
	}

	public void setNum20(javax.swing.JLabel num20) {
		Num20 = num20;
	}

	public javax.swing.JLabel getNum3() {
		return Num3;
	}

	public void setNum3(javax.swing.JLabel num3) {
		Num3 = num3;
	}

	public javax.swing.JLabel getNum4() {
		return Num4;
	}

	public void setNum4(javax.swing.JLabel num4) {
		Num4 = num4;
	}

	public javax.swing.JLabel getNum5() {
		return Num5;
	}

	public void setNum5(javax.swing.JLabel num5) {
		Num5 = num5;
	}

	public javax.swing.JLabel getNum6() {
		return Num6;
	}

	public void setNum6(javax.swing.JLabel num6) {
		Num6 = num6;
	}

	public javax.swing.JLabel getNum7() {
		return Num7;
	}

	public void setNum7(javax.swing.JLabel num7) {
		Num7 = num7;
	}

	public javax.swing.JLabel getNum8() {
		return Num8;
	}

	public void setNum8(javax.swing.JLabel num8) {
		Num8 = num8;
	}

	public javax.swing.JLabel getNum9() {
		return Num9;
	}

	public void setNum9(javax.swing.JLabel num9) {
		Num9 = num9;
	}
	
	
	
}
