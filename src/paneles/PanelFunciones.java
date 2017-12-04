package paneles;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class PanelFunciones extends PanelFactory{

	@Override
	protected void initComponents() {
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(5, 5, 100, 23);
		btnRegresar.setVisible(true);
        add(btnRegresar);
        
        btnCrearFuncion = new JButton("Crear Funcion");
        btnCrearFuncion.setBounds(66, 100, 190, 23);
        add(btnCrearFuncion);
        
        btnCancelarFuncion = new JButton("Cancelar Funcion");
        btnCancelarFuncion.setBounds(66, 150, 190, 23);
        add(btnCancelarFuncion);
        
        btnEditarFuncion = new JButton("Editar Funcion");
        btnEditarFuncion.setBounds(66, 200, 190, 23);
        add(btnEditarFuncion);
		
	}

}
