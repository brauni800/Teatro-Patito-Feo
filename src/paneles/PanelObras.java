package paneles;

import javax.swing.JButton;

/**
 * 
 * @author b1796
 *
 */
@SuppressWarnings("serial")
public class PanelObras extends PanelFactory {
	
	/**
	 * Create the panel.
	 */
	public PanelObras() {

	}

	@Override
	protected void initComponents() {
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(5, 5, 100, 23);
		btnRegresar.setVisible(true);
        add(btnRegresar);
        
        btnCrear = new JButton("Crear Obra");
        btnCrear.setBounds(66, 100, 190, 23);
        add(btnCrear);
        
        btnEliminar = new JButton("Cancelar Obra");
        btnEliminar.setBounds(66, 150, 190, 23);
        add(btnEliminar);
        
        btnEditar = new JButton("Editar Obra");
        btnEditar.setBounds(66, 200, 190, 23);
        add(btnEditar);
	}

}
