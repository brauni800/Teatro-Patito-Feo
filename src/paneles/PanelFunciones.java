package paneles;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class PanelFunciones extends PanelFactory {

	
	/**
	 * Create the panel.
	 */
	public PanelFunciones() {

	}
	
	@Override
	protected void initComponents() {
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(5, 5, 100, 23);
		btnRegresar.setVisible(true);
        add(btnRegresar);
        
        btnCrear = new JButton("Crear Funcion");
        btnCrear.setBounds(66, 100, 190, 23);
        add(btnCrear);
        
        btnEliminar = new JButton("Cancelar Funcion");
        btnEliminar.setBounds(66, 150, 190, 23);
        add(btnEliminar);
        
        btnEditar = new JButton("Editar Funcion");
        btnEditar.setBounds(66, 200, 190, 23);
        add(btnEditar);
	}

}
