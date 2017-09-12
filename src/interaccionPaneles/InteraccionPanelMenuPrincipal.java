/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaccionPaneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.MenuPrincipal;
import vista.PanelMenuPrincipal;
import vista.PanelObras;

/**
 *
 * @author b1796
 */
public class InteraccionPanelMenuPrincipal implements ActionListener {

    private MenuPrincipal menuPrincipal;

    public InteraccionPanelMenuPrincipal(MenuPrincipal menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
        initComponents();
    }

    private void initComponents() {
        this.menuPrincipal.getPanelMenuPrincipal().getObras().addActionListener(this);
        this.menuPrincipal.getPanelMenuPrincipal().getObras().setActionCommand("OBRAS");
        
        this.menuPrincipal.getPanelMenuPrincipal().getVenderBoletos().addActionListener(this);
        this.menuPrincipal.getPanelMenuPrincipal().getVenderBoletos().setActionCommand("VENDER_BOLETOS");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        switch (comando) {
            case "OBRAS":
                this.menuPrincipal.getPanelMenuPrincipal().setVisible(false);
                break;
            case "VENDER_BOLETOS":
                break;
        }
    }
}
