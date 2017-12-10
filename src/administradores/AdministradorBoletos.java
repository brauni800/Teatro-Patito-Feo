package administradores;


import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import bd.DAO;
import entidades.Boleto;
import paneles.PanelFactory;
import tablas.TablaFunciones;

/**
 * 
 * @author ArmandoCarvajal
 *
 */
public class AdministradorBoletos {
	
	public static final String COMPRADO = "COMPRADO";
	public static final String CANCELADO = "CANCELADO";
	
	private PanelFactory panel;
	private Boleto boleto;

	public AdministradorBoletos(PanelFactory panel) {
		super();
		this.panel = panel;
	}
	
	public void crearBoleto() throws SQLException {
		crearEntidadBoleto();
		
	}

	public void venderBoleto() throws SQLException {
		int i = panel.getPanelDinamico().getTableFunciones().getSelectedRow();
		System.out.println(i);
		insertarBoletoBD();
		
	}

	public void verSala() {
		System.out.println("ver Sala");
		
		
	}

	public void cancelarBoleto() {
		System.out.println("Cancelar");
		
	}
	
	private void crearEntidadBoleto() throws SQLException {
		this.boleto = new Boleto();
		this.boleto.setIdfuncion(obtenerIDFuncion());
		this.boleto.setComprado(this.COMPRADO);
		this.boleto.setCoordenadaAsiento(obtenerCoordenada());
		this.boleto.setPrecioboleto(calcularPrecioBoleto());
	}
	
	private void insertarBoletoBD() throws SQLException {
		DAO insertar = new DAO();
		insertar.crearEstructuraParaInsertar(DAO.BOLETO, "idFuncion, coordenadaAsiento, comprado, precioBoleto");
		insertar.insertarInt(1, this.boleto.getIdfuncion());
		insertar.insertarString(2, this.boleto.getCoordenadaAsiento());
		insertar.insertarString(3, this.boleto.getComprado());
		insertar.insertarDouble(4, this.boleto.getPrecioboleto());
		int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea Comprar este boleto?",
				"Registrar Representante", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (reply == JOptionPane.YES_OPTION) {
			insertar.confirmar();
			JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
			imprimirBoleto();
		}
	}
	
	public int obtenerIDObra() {
		String item = panel.getCmBoxSeleccionarObra().getSelectedItem().toString();
		String[] idObra = item.split(" ");
		return Integer.parseInt(idObra[0]);
	}
	
	public void actualizarTabla() {
		JTable table = new TablaFunciones(obtenerIDObra());
		this.panel.setTableFunciones(table);
		table.setVisible(true);
		this.panel.getScrollPane().setViewportView(table);
	}
	
	private String obtenerCoordenada() {
		return "H-12";
	}
	
	private Double calcularPrecioBoleto() throws SQLException {
		String[] coordenada = obtenerCoordenada().split("-");
		Double precioObra = obtenerPrecioObra();
		if(coordenada[0].equals("H") || coordenada[0].equals("G")) {
			if(coordenada[1].equals("7") || coordenada[1].equals("6") || coordenada[1].equals("9") || coordenada[1].equals("10") || coordenada[1].equals("11")
					|| coordenada[1].equals("12") || coordenada[1].equals("13") || coordenada[1].equals("14")) {
				precioObra = precioObra*(0.9);
			}else {
				precioObra = precioObra*(.75); 
			}
		}
		if(coordenada[0].equals("F") || coordenada[0].equals("E") || coordenada[0].equals("D")) {
			if(coordenada[1].equals("7") || coordenada[1].equals("6") || coordenada[1].equals("9") || coordenada[1].equals("10") || coordenada[1].equals("11")
					|| coordenada[1].equals("12") || coordenada[1].equals("13") || coordenada[1].equals("14")) {
				return precioObra;
			}else {
				precioObra = precioObra*(.5); 
			}
		}
		if(coordenada[0].equals("C") || coordenada[0].equals("B") || coordenada[0].equals("A")) {
			if(coordenada[1].equals("7") || coordenada[1].equals("6") || coordenada[1].equals("9") || coordenada[1].equals("10") || coordenada[1].equals("11")
					|| coordenada[1].equals("12") || coordenada[1].equals("13") || coordenada[1].equals("14")) {
				precioObra = precioObra*(.6);
			}else {
				precioObra = precioObra*(.5); 
			}
		}
		
		return precioObra;// cambiar el return por precioObra cuando este lista la parte grafica de asientos
	}
	
	private Double obtenerPrecioObra() throws SQLException {
		Double consulta = new DAO().buscarPrecioObraJoinFunciones("precioObra", DAO.FUNCION, DAO.OBRA, "idObra", obtenerIDObra());
		return consulta;
	}
	
	/**
	 * Obtener del ComboBox de Funciones el ID para el boleto
	 * 
	 * @return el valor entero de el id de la funcion
	 */
	public int obtenerIDFuncion() {
		String item = panel.getCmBoxSeleccionarFunciones().getSelectedItem().toString();
		String[] idFuncion = item.split(" ");
		return Integer.parseInt(idFuncion[0]);
	}
	
	private void imprimirBoleto() throws SQLException {
		//String[] datos = new String[10];
		Object[][] buscar = new DAO().buscarObrasJoinFunciones("b.idBoleto, b.coordenadaAsiento, b.idFuncion, f.idObra, o.nombreObra, o.descripcionObra, o.duracionObra, f.fechaFuncion, f.inicioFuncion", 
				DAO.FUNCION,DAO.BOLETO,"b.idfuncion", obtenerIDFuncion(), obtenerIDObra());//Consulta super culera interrelacion de las tablas boleto, funcion y obra, revisa que este bien la sentencia
		System.out.println("Numero de Boleto: " + buscar[0][0].toString());
		System.out.println("Numero de Asiento: " + buscar[0][1].toString());
		System.out.println("Numero de Funcion: " + buscar[0][2].toString());
		System.out.println("Identificador de Obra: "+ buscar[0][3].toString());
		System.out.println("Identificador de la Obra: "+ buscar[0][4].toString());
		System.out.println("Nombre de la Obra: "+ buscar[0][5].toString());
		System.out.println("Descripcion de la Obra: "+ buscar[0][6].toString());
		System.out.println("Duracion de la obra: "+ buscar[0][7].toString());
		System.out.println("Fecha de la Funcion: "+ buscar[0][8].toString());
		System.out.println("Hora de Inicio: "+ buscar[0][9].toString());
		
		// espero jale
		
		/*Adjunto el query:
		 * select b.idBoleto, b.coordenadaAsiento, b.idFuncion, f.idObra, o.nombreObra, o.descripcionObra, o.duracionObra, f.fechaFuncion, f.inicioFuncion
			from funcion f
			join boleto b on f.idfuncion = b.idFuncion, obra o
			where b.idfuncion = 25 and f.idObra = 1
			
			los valores 1 y 25 son ejemplos a ver si jala, no pude revisar ya que mi tabla de boletos no tenia valores, inventele y pruebe
		 * 
		 * */
		
	}
}
