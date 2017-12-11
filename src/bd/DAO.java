/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author b1796
 */
public class DAO {

	public static final String ALL = "*";
	public static final String FUNCION = "funcion";
	public static final String OBRA = "obra";
	public static final String REPRESENTANTE = "representante";
	public static final String BOLETO = "boleto";
	public static final String ASIENTO = "asiento";

	private Conexion conexion;
	private Connection connection;

	private PreparedStatement prepareStatement;
	private Statement statement;
	private ResultSet resultStatement;

	public DAO() {
		this.conexion = new Conexion();
		this.connection = this.conexion.getConnection();
	}

	private void desconectar() {
		this.conexion = null;
		this.connection = null;
		this.prepareStatement = null;
	}

	private int contarColumnas(ResultSet rs) throws SQLException {
		int i = 1;
		try {
			while (rs.getObject(i) != null) {
				i++;
			}
		} catch (SQLException ex) {
			i -= 1;
		}
		return i;
	}

	private String interrogaciones(int a) {
		String interrogacion = "";
		for (int b = 1; b <= a; b++) {
			if (b < a) {
				interrogacion += "?,";
			} else if (b == a) {
				interrogacion += "?";
			}
		}
		return interrogacion;
	}

	private int numeroPalabras(String s) {
		String[] parse = s.split(",");
		return parse.length;
	}

	/**
	 * Metodo para buscar todos los elementos en una tabla en la Base de Datos.
	 *
	 * @param select
	 *            Nombre de las columnas que extraera de la tabla. Si se extraera
	 *            mas de una columna, separar los nombres por comas ','. Si se
	 *            extraeran todas las columnas se puede hacer uso del atributo ALL.
	 * @param from
	 *            Nombre de la tabla. Puede tomar los valores de ASIENTO o FUNCION.
	 * @return Object[][] - Arreglo de objetos en el se representan las filas y
	 *         columnas de la tabla
	 * @throws SQLException
	 */
	public Object[][] buscar(String select, String from) throws SQLException {
		ArrayList<Object[]> lista = new ArrayList<Object[]>();
		Object[] arreglo;
		Object[][] resultado;
		boolean encontrado = false;
		String sql = "SELECT " + select + " FROM " + from;
		this.statement = this.connection.createStatement();
		this.resultStatement = this.statement.executeQuery(sql);
		while (this.resultStatement.next()) {
			arreglo = new Object[contarColumnas(this.resultStatement)];
			for (int i = 0; i < arreglo.length; i++) {
				arreglo[i] = this.resultStatement.getObject(i + 1);
			}
			lista.add(arreglo);
			encontrado = true;
		}
		desconectar();
		if (encontrado) {
			resultado = new Object[lista.size()][lista.get(0).length];
			for (int i = 0; i < lista.size(); i++) {
				for (int j = 0; j < lista.get(i).length; j++) {
					resultado[i][j] = lista.get(i)[j];
				}
			}
		} else {
			resultado = new Object[0][0];
		}
		return resultado;
	}

	/**
	 * Metodo para buscar elementos en una tabla en la Base de Datos filtrando el
	 * contenido por algun parametro especificado.
	 *
	 * @param select
	 *            Nombre de las columnas que extraera de la tabla. Si se extraera
	 *            mas de una columna, separar los nombres por comas ','. Si se
	 *            extraeran todas las columnas se puede hacer uso del atributo ALL.
	 * @param from
	 *            Nombre de la tabla. Puede tomar los valores de ASIENTO o FUNCION.
	 * @param where
	 *            Parametro por el cual se filtraran los valores de la tabla.
	 * @param what
	 *            Valor del parametro.
	 * @return Object[][] - Arreglo de objetos en el se representan las filas y
	 *         columnas de la tabla
	 * @throws SQLException
	 */
	public Object[][] buscarConFiltro(String select, String from, String where, Object what) throws SQLException {
		ArrayList<Object[]> lista = new ArrayList<Object[]>();
		Object[] arreglo;
		Object[][] resultado;
		boolean encontrado = false;
		this.statement = this.connection.createStatement();
		String sql = "SELECT " + select + " FROM " + from + " WHERE " + where + " = " + what.toString();
		this.resultStatement = this.statement.executeQuery(sql);
		while (this.resultStatement.next()) {
			arreglo = new Object[contarColumnas(this.resultStatement)];
			for (int i = 0; i < arreglo.length; i++) {
				arreglo[i] = this.resultStatement.getObject(i + 1);
			}
			lista.add(arreglo);
			encontrado = true;
		}
		desconectar();
		if (encontrado) {
			resultado = new Object[lista.size()][lista.get(0).length];
			for (int i = 0; i < lista.size(); i++) {
				for (int j = 0; j < lista.get(i).length; j++) {
					resultado[i][j] = lista.get(i)[j];
				}
			}
		} else {
			resultado = new Object[0][0];
		}
		return resultado;
	}

	public Double buscarPrecioObraJoinFunciones(String select, String from, String join, String where, int idObra)
			throws SQLException {
		// boolean encontrado = false;
		Double resultado;
		this.statement = this.connection.createStatement();
		String sql = "SELECT " + select + " FROM " + from + "f" + " JOIN " + join + "o" + " on f.idObra = o.idObra"
				+ " WHERE " + "o." + where + " = " + Integer.toString(idObra) + " GROUP BY f.idObra";
		this.resultStatement = this.statement.executeQuery(sql);
		if (this.resultStatement.wasNull()) {
			System.out.println("No existe funciones para esta obra");
		} // Mejorar este metodo con la excepcion
		resultado = this.resultStatement.getDouble(1);
		return resultado;
	}

	public Object[][] buscarObrasJoinFunciones(String select, String from, String join, String where, int idObra,
			int idFuncion) throws SQLException {
		ArrayList<Object[]> lista = new ArrayList<Object[]>();
		Object[] arreglo;
		Object[][] resultado;
		boolean encontrado = false;
		this.statement = this.connection.createStatement();
		String sql = "SELECT " + select + " FROM " + from + " f" + " JOIN " + join + " b "
				+ " on f.idFuncion = b.idFuncion, obra o" + " WHERE " + "b" + where + " = "
				+ Integer.toString(idFuncion) + " AND " + "f.idObra = " + Integer.toString(idObra) + " GROUP BY idObra";
		this.resultStatement = this.statement.executeQuery(sql);
		while (this.resultStatement.next()) {
			arreglo = new Object[contarColumnas(this.resultStatement)];
			for (int i = 0; i < arreglo.length; i++) {
				arreglo[i] = this.resultStatement.getObject(i + 1);
			}
			lista.add(arreglo);
			encontrado = true;
		}
		desconectar();
		if (encontrado) {
			resultado = new Object[lista.size()][lista.get(0).length];
			for (int i = 0; i < lista.size(); i++) {
				for (int j = 0; j < lista.get(i).length; j++) {
					resultado[i][j] = lista.get(i)[j];
				}
			}
		} else {
			resultado = new Object[0][0];
		}
		return resultado;
	}

	/**
	 * Se crea la estructura inicial para actualizar un elemento en la Base de
	 * Datos.
	 *
	 * @param from
	 *            Nombre de la tabla. Puede tomar los valores de ASIENTO o FUNCION.
	 * @param where
	 *            Parametro por el cual se filtraran los valores de la tabla.
	 * @param what
	 *            Valor del parametro.
	 * @throws SQLException
	 */
	public void crearEstructuraParaActualizar(String from, String where, Object what) throws SQLException {
		String sql = "UPDATE " + from + " SET " + where + " = " + what.toString();
		this.prepareStatement = this.connection.prepareStatement(sql);
	}

	public void estruturaParaActualizarCondicion(String from, String set, Object whatSet, String where,
			Object whatWhere) throws SQLException {
		String sql = "UPDATE " + from + " SET " + set + " = " + whatSet.toString() + " WHERE " + where + " = "
				+ whatWhere.toString();
		System.out.println(sql);
		this.prepareStatement = this.connection.prepareStatement(sql);
	}

	/**
	 * Se crea la estructura inicial para eliminar un elemento de la Base de Datos.
	 *
	 * @param from
	 *            Nombre de la tabla. Puede tomar los valores de ASIENTO o FUNCION.
	 * @param where
	 *            Parametro por el cual se filtraran los valores de la tabla.
	 * @param what
	 *            Valor del parametro.
	 * @throws SQLException
	 */
	public void crearEstructuraParaEliminar(String from, String where, Object what) throws SQLException {
		String sql = "DELETE FROM " + from + " WHERE " + where + " = " + what.toString();
		this.prepareStatement = this.connection.prepareStatement(sql);
	}

	/**
	 * Se crea la estructura inicial para insertar un elemento en la Base de Datos.
	 *
	 * @param from
	 *            Nombre de la tabla. Puede tomar los valores de ASIENTO o FUNCION.
	 * @param select
	 *            Nombre de las columnas que se usaran de la tabla para indicar los
	 *            elementos que seran insertados. Si se insertara a mas de una
	 *            columna, separar los nombres por comas ','.
	 * @throws SQLException
	 */
	public void crearEstructuraParaInsertar(String from, String select) throws SQLException {
		String sql = "INSERT " + from + "(" + select + ")" + " VALUES(" + interrogaciones(numeroPalabras(select)) + ")";
		this.prepareStatement = this.connection.prepareStatement(sql);
	}

	/**
	 * Metodo que se utiliza para colocar un valor de tipo int a la estructura para
	 * insertar en la tabla de la Base de Datos.
	 *
	 * @param i
	 *            numero de columna. El numero de la columna 1 es 1, el 2 es 2,
	 *            etc...
	 * @param j
	 *            numero que se insertara.
	 * @throws SQLException
	 */
	public void insertarInt(int i, int j) throws SQLException {
		this.prepareStatement.setInt(i, j);
	}

	/**
	 * Metodo que se utiliza para colocar un valor de tipo String a la estructura
	 * para insertar en la tabla de la Base de Datos.
	 *
	 * @param i
	 *            numero de columna. El numero de la columna 1 es 1, el 2 es 2,
	 *            etc...
	 * @param s
	 *            String que se insertara.
	 * @throws SQLException
	 */
	public void insertarString(int i, String s) throws SQLException {
		this.prepareStatement.setString(i, s);
	}

	/**
	 * Metodo que se utiliza para colocar un valor de tipo Date a la estructura para
	 * insertar en la tabla de la Base de Datos.
	 * 
	 * @param i
	 *            numero de columna. El numero de la columna empieza a partir del 1
	 * @param d
	 *            es el objeto tipo date que se va a agregar
	 * @throws SQLException
	 */
	public void insertarDate(int i, long d) throws SQLException {
		java.sql.Date date = new java.sql.Date(d);
		this.prepareStatement.setDate(i, date);
	}

	/**
	 * Metodo que se utiliza para colocar un valor de tipo Time a la estructura para
	 * insertar en la tabla de la Base de Datos.
	 *
	 * @param i
	 *            numero de columna. El numero de la columna 1 es 1, el 2 es 2,
	 *            etc...
	 * @param time
	 *            Objeto de tipo Time que se insertara.
	 * @throws SQLException
	 */
	public void insertarTime(int i, Time time) throws SQLException {
		this.prepareStatement.setTime(i, time);
		;
	}

	/**
	 * Metodo que se utiliza para colocar un valor de tipo double a la estructura
	 * para insertar en la tabla de la Base de Datos.
	 *
	 * @param i
	 *            numero de columna. El numero de la columna 1 es 1, el 2 es 2,
	 *            etc...
	 * @param d
	 *            Objeto de tipo double que se insertara.
	 * @throws SQLException
	 */
	public void insertarDouble(int i, double d) throws SQLException {
		this.prepareStatement.setDouble(i, d);
	}

	/**
	 * Metodo que se utiliza para colocar un valor de tipo boolean a la estructura
	 * para insertar en la tabla de la Base de Datos.
	 *
	 * @param i
	 *            numero de columna. El numero de la columna 1 es 1, el 2 es 2,
	 *            etc...
	 * @param b
	 *            Objeto de tipo boolean que se insertara.
	 * @throws SQLException
	 */
	public void insertarBoolean(int i, boolean b) throws SQLException {
		this.prepareStatement.setBoolean(i, b);
	}

	/**
	 * Metodo para confirmar la instruccion que se realizara en la Base de Datos.
	 * Puede ser INSERT, DELETE o UPDATE.
	 *
	 * @throws SQLException
	 */
	public void confirmar() throws SQLException {
		this.prepareStatement.executeUpdate();
		desconectar();
	}

}
