package paneles;

import javax.swing.JButton;

/**
 * 
 * @author b1796
 *
 */
public class PanelObras extends PanelFactory {
	
	/**
	 * Create the panel.
	 */
	public PanelObras() {

	}

	@Override
	protected void initComponents() {
		regresar = new JButton("Regresar");
        regresar.setBounds(5, 5, 100, 23);
        regresar.setVisible(true);
        add(regresar);
        
        crear = new JButton("Crear Obra");
        crear.setBounds(66, 100, 190, 23);
        add(crear);
        
        eliminar = new JButton("Eliminar Obra");
        eliminar.setBounds(66, 150, 190, 23);
        add(eliminar);
        
        editar = new JButton("Editar Obra");
        editar.setBounds(66, 200, 190, 23);
        add(editar);
        
        agregarResponsable = new JButton("Agregar Responsable");
        agregarResponsable.setBounds(66, 250, 190, 23);
        add(agregarResponsable);
	}

}
