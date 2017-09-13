/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaccionPaneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import vista.PanelMenuPrincipal;
import vista.PanelObras;
/**
 * 
 * @author brauni800
 *
 */
public class InteraccionPanelMenuPrincipal implements ActionListener {

    private JPanel panelMenuPrincipal;

    public InteraccionPanelMenuPrincipal(JPanel panelMenuPrincipal) {
        this.panelMenuPrincipal = panelMenuPrincipal;
        initComponents();
    }

    private void initComponents() {
        ((PanelMenuPrincipal) this.panelMenuPrincipal).getBtnObras().addActionListener(this);
        this.panelMenuPrincipal.getBtnObras().setActionCommand("OBRAS");
        
        this.panelMenuPrincipal.getBtnVenderBoletos().addActionListener(this);
        this.panelMenuPrincipal.getBtnVenderBoletos().setActionCommand("VENDER_BOLETOS");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        switch (comando) {
            case "OBRAS":
                this.panelMenuPrincipal.setPanelObras(new PanelObras(this.panelMenuPrincipal));
                this.panelMenuPrincipal.add(this.panelMenuPrincipal.getPanelObras());
                this.panelMenuPrincipal.getBtnObras().setVisible(false);
                this.panelMenuPrincipal.getBtnVenderBoletos().setVisible(false);
                this.panelMenuPrincipal.repaint();
                break;
            case "VENDER_BOLETOS":
                break;
        }
    }
}
