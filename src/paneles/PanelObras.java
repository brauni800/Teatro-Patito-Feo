package paneles;

import javax.swing.JButton;

/**
 * 
 * @author b1796
 *
 */
public class PanelObras extends PanelFactory {
	
	private JButton crearObra, eliminarObra, editarObra, regresar;
	
	/**
	 * Create the panel.
	 */
	public PanelObras() {

	}

	@Override
	protected void initComponents() {
		this.regresar = new JButton("Regresar");
        this.regresar.setBounds(5, 5, 100, 23);
        this.regresar.setVisible(true);
        add(this.regresar);
        
        this.crearObra = new JButton("Crear Obra");
        this.crearObra.setBounds(100, 100, 150, 23);
        add(this.crearObra);
        
        this.eliminarObra = new JButton("Eliminar Obra");
        this.eliminarObra.setBounds(100, 150, 150, 23);
        add(this.eliminarObra);
        
        this.editarObra = new JButton("Editar Obra");
        this.editarObra.setBounds(100, 200, 150, 23);
        add(this.editarObra);
	}

	@Override
	public JButton getBoton(String s) {
		JButton boton = null;
		switch(s) {
		case PanelFactory.REGRESAR:
			boton = regresar;
			break;
		case PanelFactory.CREAR_OBRA:
			boton = crearObra;
			break;
		case PanelFactory.ELIMINAR_OBRA:
			boton = eliminarObra;
			break;
		case PanelFactory.EDITAR_OBRA:
			boton = editarObra;
			break;
		}
		return boton;
	}

}
