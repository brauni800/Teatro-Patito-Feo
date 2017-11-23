package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

import javax.swing.ComboBoxModel;
import javax.swing.table.TableModel;

import com.sun.glass.events.MouseEvent;

import administradores.AdministradorFunciones;
import combobox.ComboBoxObras;
import entidades.Obra;
import paneles.PanelFactory;
import tablas.TablaFunciones;
import vista.VentanaPrincipal;

public class EventosCrearFuncion extends EventosFactory{

	public EventosCrearFuncion(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch (comando) {
		case PanelFactory.CREAR_FUNCION:
			try {
				new AdministradorFunciones(ventanaPrincipal.getPanelDinamico().getPanelDinamico()).crearFuncion();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			break;
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnCrearFuncion().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnCrearFuncion()
				.setActionCommand(PanelFactory.CREAR_FUNCION);
	}
	
}
