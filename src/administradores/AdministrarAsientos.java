/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administradores;

import entidades.asiento.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import bd.Conexion;
import bd.DAO;

/**
 *
 * @author b-1-7-9-6
 */
public class AdministrarAsientos extends MouseAdapter {

	private int idFuncion;
	private JLabel jl;
	private Conexion conexion;
	private Connection connection;
	private ArrayList<AsientoFactory> listaAsientos;
	private AsientoFactory asientoEncontrado;
	private String coordenada;
	
	public AdministrarAsientos(JLabel jl, String coordenada) {
		this.jl = jl;
		this.coordenada = coordenada;
		buscarAsientosBD();
	}

	@Override
	public void mouseExited(MouseEvent me) {
		super.mouseExited(me);
		String direccion[] = this.jl.getIcon().toString().split("/");
		int i = direccion.length;
		switch (direccion[i - 2] + "/" + direccion[i - 1]) {
		case "imagenes/asiento_verde_lata.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg")));
			break;
		case "imagenes/asiento_verde_bronce.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg")));
			break;
		case "imagenes/asiento_verde_plata.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg")));
			break;
		case "imagenes/asiento_verde_oro.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_oro.jpg")));
			break;
		case "imagenes/asiento_verde_diamante.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg")));
			break;
		case "imagenes/asiento_rojo_lata.jpg":
		case "imagenes/asiento_rojo_bronce.jpg":
		case "imagenes/asiento_rojo_plata.jpg":
		case "imagenes/asiento_rojo_oro.jpg":
		case "imagenes/asiento_rojo_diamante.jpg":
			break;
		}
	}

	@Override
	public void mouseEntered(MouseEvent me) {
		super.mouseEntered(me);
		String direccion[] = this.jl.getIcon().toString().split("/");
		int i = direccion.length;
		switch (direccion[i - 2] + "/" + direccion[i - 1]) {
		case "imagenes/asiento_azul_lata.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_verde_lata.jpg")));
			break;
		case "imagenes/asiento_azul_bronce.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_verde_bronce.jpg")));
			break;
		case "imagenes/asiento_azul_plata.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_verde_plata.jpg")));
			break;
		case "imagenes/asiento_azul_oro.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_verde_oro.jpg")));
			break;
		case "imagenes/asiento_azul_diamante.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_verde_diamante.jpg")));
			break;
		case "imagenes/asiento_rojo_lata.jpg":
		case "imagenes/asiento_rojo_bronce.jpg":
		case "imagenes/asiento_rojo_plata.jpg":
		case "imagenes/asiento_rojo_oro.jpg":
		case "imagenes/asiento_rojo_diamante.jpg":
			break;
		}
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		DAO insertar = new DAO();
		DAO eliminar = new DAO();
		super.mouseClicked(me);
		String direccion[] = this.jl.getIcon().toString().split("/");
		int i = direccion.length;
		switch (direccion[i - 2] + "/" + direccion[i - 1]) {
		case "imagenes/asiento_verde_lata.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_verde_lata_clicked.jpg")));
			try {
				insertar.crearEstructuraParaInsertar(DAO.ASIENTO, "coordenada");
				insertar.insertarString(1, this.coordenada);
				insertar.confirmar();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "imagenes/asiento_verde_bronce.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_verde_bronce_clicked.jpg")));
			try {
				insertar.crearEstructuraParaInsertar(DAO.ASIENTO, "coordenada");
				insertar.insertarString(1, this.coordenada);
				insertar.confirmar();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "imagenes/asiento_verde_plata.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_verde_plata_clicked.jpg")));
			try {
				insertar.crearEstructuraParaInsertar(DAO.ASIENTO, "coordenada");
				insertar.insertarString(1, this.coordenada);
				insertar.confirmar();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "imagenes/asiento_verde_oro.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_verde_oro_clicked.jpg")));
			try {
				insertar.crearEstructuraParaInsertar(DAO.ASIENTO, "coordenada");
				insertar.insertarString(1, this.coordenada);
				insertar.confirmar();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "imagenes/asiento_verde_diamante.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_verde_diamante_clicked.jpg")));
			try {
				insertar.crearEstructuraParaInsertar(DAO.ASIENTO, "coordenada");
				insertar.insertarString(1, this.coordenada);
				insertar.confirmar();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "imagenes/asiento_verde_lata_clicked.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_verde_lata.jpg")));
			try {
				eliminar.crearEstructuraParaEliminar(DAO.ASIENTO, "coordenada", "\"" + this.coordenada + "\"");
				eliminar.confirmar();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "imagenes/asiento_verde_bronce_clicked.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_verde_bronce.jpg")));
			try {
				eliminar.crearEstructuraParaEliminar(DAO.ASIENTO, "coordenada", "\"" + this.coordenada + "\"");
				eliminar.confirmar();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "imagenes/asiento_verde_plata_clicked.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_verde_plata.jpg")));
			try {
				eliminar.crearEstructuraParaEliminar(DAO.ASIENTO, "coordenada", "\"" + this.coordenada + "\"");
				eliminar.confirmar();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "imagenes/asiento_verde_oro_clicked.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_verde_oro.jpg")));
			try {
				eliminar.crearEstructuraParaEliminar(DAO.ASIENTO, "coordenada", "\"" + this.coordenada + "\"");
				eliminar.confirmar();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "imagenes/asiento_verde_diamante_clicked.jpg":
			this.jl.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_verde_diamante.jpg")));
			try {
				eliminar.crearEstructuraParaEliminar(DAO.ASIENTO, "coordenada", "\"" + this.coordenada + "\"");
				eliminar.confirmar();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "imagenes/asiento_rojo_lata.jpg":
		case "imagenes/asiento_rojo_bronce.jpg":
		case "imagenes/asiento_rojo_plata.jpg":
		case "imagenes/asiento_rojo_oro.jpg":
		case "imagenes/asiento_rojo_diamante.jpg":
			break;
		}
	}

	public ArrayList<AsientoFactory> getListaAsientos() {
		return listaAsientos;
	}

	private boolean asientoEncontradoEnLaLista() {
		boolean asientoEncontrado = false;
		for (int i = 0; i < this.listaAsientos.size(); i++) {
			if (this.listaAsientos.get(i).getCoordenada().equals(this.coordenada)) {
				asientoEncontrado = true;
				this.asientoEncontrado = this.listaAsientos.get(i);
				break;
			}
		}
		return asientoEncontrado;
	}

	public ImageIcon colocarImagen(String coordenada) {
		this.coordenada = coordenada;
		ImageIcon icon = null;
		if (asientoEncontradoEnLaLista()) {
			icon = asignarImagenRojaPorRango(this.asientoEncontrado.getRango());
		} else {
			icon = asignarImagenAzulPorRango(generarAsiento(this.coordenada).getRango());
		}
		return icon;
	}

	private void buscarAsientosBD() {
		DAO buscar = new DAO();
		
		try {
			Object[][] a = buscar.buscar("coordenada", "asiento");
			for(int i = 0; i<a.length; i++)
					System.out.println(a[i][0]);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	

	private ImageIcon asignarImagenRojaPorRango(String s) {
		ImageIcon icon = null;
		switch (s) {
		case AsientoFactory.LATA:
			icon = new ImageIcon(getClass().getResource("imagenes/asiento_rojo_lata.jpg"));
			break;
		case AsientoFactory.BRONCE:
			icon = new ImageIcon(getClass().getResource("imagenes/asiento_rojo_bronce.jpg"));
			break;
		case AsientoFactory.PLATA:
			icon = new ImageIcon(getClass().getResource("imagenes/asiento_rojo_plata.jpg"));
			break;
		case AsientoFactory.ORO:
			icon = new ImageIcon(getClass().getResource("imagenes/asiento_rojo_oro.jpg"));
			break;
		case AsientoFactory.DIAMANTE:
			icon = new ImageIcon(getClass().getResource("imagenes/asiento_rojo_diamante.jpg"));
			break;
		}
		return icon;
	}

	private ImageIcon asignarImagenAzulPorRango(String s) {
		ImageIcon icon = null;
		switch (s) {
		case AsientoFactory.LATA:
			icon = new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"));
			break;
		case AsientoFactory.BRONCE:
			icon = new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"));
			break;
		case AsientoFactory.PLATA:
			icon = new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"));
			break;
		case AsientoFactory.ORO:
			icon = new ImageIcon(getClass().getResource("imagenes/asiento_azul_oro.jpg"));
			break;
		case AsientoFactory.DIAMANTE:
			icon = new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"));
			break;
		}
		return icon;
	}

	private void crearListaAsientos(String s) {
		this.listaAsientos.add(generarAsiento(s));
	}

	private AsientoFactory generarAsiento(String s) {
		AsientoFactory asiento = null;
		switch (s) {
		case "C-7":
		case "C-8":
		case "C-9":
		case "C-10":
		case "C-11":
		case "C-12":
		case "C-13":
		case "C-14":
		case "B-7":
		case "B-8":
		case "B-9":
		case "B-10":
		case "B-11":
		case "B-12":
		case "B-13":
		case "B-14":
		case "A-7":
		case "A-8":
		case "A-9":
		case "A-10":
		case "A-11":
		case "A-12":
		case "A-13":
		case "A-14":
			asiento = new AsientoBronce(this.idFuncion, s);
			break;
		case "H-1":
		case "H-2":
		case "H-3":
		case "H-4":
		case "H-5":
		case "H-6":
		case "H-15":
		case "H-16":
		case "H-17":
		case "H-18":
		case "H-19":
		case "H-20":
		case "G-1":
		case "G-2":
		case "G-3":
		case "G-4":
		case "G-5":
		case "G-6":
		case "G-15":
		case "G-16":
		case "G-17":
		case "G-18":
		case "G-19":
		case "G-20":
			asiento = new AsientoPlata(this.idFuncion, s);
			break;
		case "H-7":
		case "H-8":
		case "H-9":
		case "H-10":
		case "H-11":
		case "H-12":
		case "H-13":
		case "H-14":
		case "G-7":
		case "G-8":
		case "G-9":
		case "G-10":
		case "G-11":
		case "G-12":
		case "G-13":
		case "G-14":
			asiento = new AsientoOro(this.idFuncion, s);
			break;
		case "F-7":
		case "F-8":
		case "F-9":
		case "F-10":
		case "F-11":
		case "F-12":
		case "F-13":
		case "F-14":
		case "E-7":
		case "E-8":
		case "E-9":
		case "E-10":
		case "E-11":
		case "E-12":
		case "E-13":
		case "E-14":
		case "D-7":
		case "D-8":
		case "D-9":
		case "D-10":
		case "D-11":
		case "D-12":
		case "D-13":
		case "D-14":
			asiento = new AsientoDiamante(this.idFuncion, s);
			break;
		default:
			asiento = new AsientoLata(this.idFuncion, s);
			break;
		}
		return asiento;
	}
}