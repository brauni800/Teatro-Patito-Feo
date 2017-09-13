/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaccionPaneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.PanelMenuPrincipal;
import vista.PanelObras;

/**
 *
 * @author b1796
 */
public class InteraccionPanelObras implements ActionListener {

	private PanelObras panelObras;
	private PanelMenuPrincipal panelMenuPrincipal;
	
    public InteraccionPanelObras(PanelMenuPrincipal panelMenuPrincipal) {
        this.panelObras = panelMenuPrincipal.getPanelObras();
        initComponents();
    }

    private void initComponents() {
        this.menuPrincipal.getPanelObras().getRegresar().addActionListener(this);
        this.menuPrincipal.getPanelObras().getRegresar().setActionCommand("REGRESAR");
        
        this.menuPrincipal.getPanelObras().getCrearObra().addActionListener(this);
        this.menuPrincipal.getPanelObras().getCrearObra().setActionCommand("CREAR_OBRA");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        switch (comando) {
            case "REGRESAR":
                this.menuPrincipal.setPanelObras(new PanelObras(this.menuPrincipal));
                this.menuPrincipal.getPanelObras().setVisible(false);
                break;
            case "CREAR_OBRA":

                break;
        }
    }
    
    public void setPanelMenuPrincipal(PanelMenuPrincipal panelMenuPrincipal) {
    	this.panelMenuPrincipal = panelMenuPrincipal;
    }
}
