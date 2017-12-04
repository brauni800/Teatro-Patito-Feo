
package paneles;

import javax.swing.JButton;

/**
 * 
 * @author ArmandoCarvajal
 *
 */
public class PanelBoletos extends PanelFactory{

	

	@Override
	protected void initComponents() {
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(5, 5, 100, 23);
		btnRegresar.setVisible(true);
        add(btnRegresar);
        
        btnVenderBoleto = new JButton("Vender Boleto");
        btnVenderBoleto.setBounds(66, 100, 190, 23);
        add(btnVenderBoleto);
        
        btnCancelarBoleto = new JButton("Cancelar Boleto");
        btnCancelarBoleto.setBounds(66, 150, 190, 23);
        add(btnCancelarBoleto);
        
        btnVerSala = new JButton("Ver Sala");
        btnVerSala.setBounds(66, 200, 190, 23);
        add(btnVerSala);
		
	}
	
}
