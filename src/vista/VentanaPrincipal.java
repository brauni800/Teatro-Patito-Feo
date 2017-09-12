package vista;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(930, 550);
		
		panelMenuPrincipal();
		setVisible(true);
	}

	private void panelMenuPrincipal() {
		contentPane = new PanelMenuPrincipal();
		setContentPane(contentPane);
	}
	public static void main(String[] args) {
		new VentanaPrincipal();
	}
}
