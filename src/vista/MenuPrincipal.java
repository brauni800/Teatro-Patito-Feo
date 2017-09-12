/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Container;

/**
 *
 * @author b1796
 */
public class MenuPrincipal {

    private VentanaPrincipal ventanaPrincipal;
    private PanelMenuPrincipal panelMenuPrincipal;
    private PanelObras panelObras;
    private PanelCrearObra panelCrearObra;
    private Container contentPain;

    public MenuPrincipal() {
        initCompponents();
        initEvents();
    }

    private void initCompponents() {
        this.ventanaPrincipal = new VentanaPrincipal();
        this.contentPain = this.ventanaPrincipal.getContentPane();
        contentPain.setLayout(null);
        
        initPanelObras();
        initPanelMenuPrincipal();
    }

    private void initPanelMenuPrincipal() {
        
        this.panelMenuPrincipal = new PanelMenuPrincipal(this);
        this.contentPain.add(this.panelMenuPrincipal);
    }

    private void initPanelObras() {
        this.panelObras = new PanelObras(this);
        this.contentPain.add(this.panelObras);
    }

    private void initEvents() {
        this.panelMenuPrincipal.initEvents();
    }

    public VentanaPrincipal getVentanaPrincipal() {
        return ventanaPrincipal;
    }

    public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    public PanelMenuPrincipal getPanelMenuPrincipal() {
        return panelMenuPrincipal;
    }

    public void setPanelMenuPrincipal(PanelMenuPrincipal panelMenuPrincipal) {
        this.panelMenuPrincipal = panelMenuPrincipal;
    }

    public PanelObras getPanelObras() {
        return panelObras;
    }

    public void setPanelObras(PanelObras panelObras) {
        this.panelObras = panelObras;
    }

    public PanelCrearObra getPanelCrearObra() {
        return panelCrearObra;
    }

    public void setPanelCrearObra(PanelCrearObra panelCrearObra) {
        this.panelCrearObra = panelCrearObra;
    }
}
