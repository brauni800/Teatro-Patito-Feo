package paneles;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;

/**
 * 
 * @author ArmandoCarvajal
 *
 */
@SuppressWarnings("serial")
public class PanelVerSala extends PanelFactory {

	public PanelVerSala() {
		setBounds(300, 20, 620, 500);
		url = getClass().getResource("imagenes/asiento_azul_bronce.jpg");
		image = new ImageIcon(url).getImage();
	}
	
    public void paint(Graphics g){
		Dimension d = getSize();
		g.drawImage(image, 0, 0, d.width, d.height, this);
		this.setOpaque(false);
        super.paint(g);
    } 

	@Override
	protected void initComponents() {
		
	}


}
