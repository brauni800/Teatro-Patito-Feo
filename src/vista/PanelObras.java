/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author b1796
 */
public class PanelObras extends JPanel {

    private JButton crearObra, regresar;
    private PanelMenuPrincipal panelMenuPrincipal;

    public PanelObras(PanelMenuPrincipal panelMenuPrincipal) {
    	this.panelMenuPrincipal = panelMenuPrincipal;
        setBackground(Color.BLUE);
        setBounds(10, 10, 904, 499);
        setLayout(null);
        setVisible(true);
        initComponents();
    }

    private void initComponents() {
        this.regresar = new JButton("Regresar");
        this.regresar.setBounds(5, 5, 100, 23);
        this.regresar.setVisible(true);
        add(this.regresar);
        
        this.crearObra = new JButton("Crear Obra");
        this.crearObra.setBounds(100, 100, 150, 23);
        add(this.crearObra);
    }

    public void initEvents() {
    	
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
    
    public PanelMenuPrincipal getPanelMenuPrincipal() {
    	return panelMenuPrincipal;
    }
    
    public void setPanelMenuPrincipal(PanelMenuPrincipal panelMenuPrincipal) {
    	this.panelMenuPrincipal = panelMenuPrincipal;
    }
}
