/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;

/**
 *
 * @author b1796
 */
public class VentanaPrincipal2 extends JFrame {

    public static VentanaPrincipal2 getVentanaPrincipal() {
        return new VentanaPrincipal2();
    }

    public VentanaPrincipal2() {
        initComponents();
    }

    private void initComponents() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(930, 550);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
