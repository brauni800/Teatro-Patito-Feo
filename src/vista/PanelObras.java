/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import interaccionPaneles.InteraccionPanelObras;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author b1796
 */
public class PanelObras extends JPanel {

    private final MenuPrincipal menuPrincipal;
    private JButton crearObra, regresar;

    public PanelObras(MenuPrincipal menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
        setLayout(null);
        setVisible(true);
        setBackground(Color.BLUE);
        //initComponents();
    }

    private void initComponents() {
        this.regresar = new JButton("Regresar");
        this.regresar.setBounds(50, 50, 150, 23);
        add(this.regresar);
        
        this.crearObra = new JButton("Crear Obra");
        this.crearObra.setBounds(70, 200, 150, 23);
        add(this.crearObra);
    }

    public void initEvents() {
        new InteraccionPanelObras(this.menuPrincipal);
    }

    public JButton getCrearObra() {
        return crearObra;
    }

    public void setCrearObra(JButton crearObra) {
        this.crearObra = crearObra;
    }

    public JButton getRegresar() {
        return regresar;
    }

    public void setRegresar(JButton regresar) {
        this.regresar = regresar;
    }
}
