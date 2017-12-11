package paneles;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * 
 * @author ArmandoCarvajal
 *
 */
@SuppressWarnings("serial")
public class PanelVerSala extends PanelFactory {

	/**
	 * Inicialización del Panel.
	 */
	public PanelVerSala() {
		setBounds(300, 20, 750, 500);
	}

	protected void initButtons() {
		btnAsientosSeleccionados = new JButton("Asientos Seleccionados");
		btnAsientosSeleccionados.setBounds(275, 445, 150, 23);
		btnAsientosSeleccionados.setEnabled(true);
		add(btnAsientosSeleccionados);
	}

	@Override
	protected void initComponents() {
		initButtons();
		H1 = new JLabel();
		H2 = new JLabel();
		H3 = new JLabel();
		H4 = new JLabel();
		H5 = new JLabel();
		H6 = new JLabel();
		H7 = new JLabel();
		H8 = new JLabel();
		H9 = new JLabel();
		H10 = new JLabel();
		H11 = new JLabel();
		H12 = new JLabel();
		H13 = new JLabel();
		H14 = new JLabel();
		H15 = new JLabel();
		H16 = new JLabel();
		H17 = new JLabel();
		H18 = new JLabel();
		H19 = new JLabel();
		H20 = new JLabel();
		G1 = new JLabel();
		G2 = new JLabel();
		G3 = new JLabel();
		G4 = new JLabel();
		G5 = new JLabel();
		G6 = new JLabel();
		G7 = new JLabel();
		G8 = new JLabel();
		G9 = new JLabel();
		G10 = new JLabel();
		G11 = new JLabel();
		G12 = new JLabel();
		G13 = new JLabel();
		G14 = new JLabel();
		G15 = new JLabel();
		G16 = new JLabel();
		G17 = new JLabel();
		G18 = new JLabel();
		G19 = new JLabel();
		G20 = new JLabel();
		F1 = new JLabel();
		F2 = new JLabel();
		F3 = new JLabel();
		F4 = new JLabel();
		F5 = new JLabel();
		F6 = new JLabel();
		F7 = new JLabel();
		F8 = new JLabel();
		F9 = new JLabel();
		F10 = new JLabel();
		F11 = new JLabel();
		F12 = new JLabel();
		F13 = new JLabel();
		F14 = new JLabel();
		F15 = new JLabel();
		F16 = new JLabel();
		F17 = new JLabel();
		F18 = new JLabel();
		F19 = new JLabel();
		F20 = new JLabel();
		E1 = new JLabel();
		E2 = new JLabel();
		E3 = new JLabel();
		E4 = new JLabel();
		E5 = new JLabel();
		E6 = new JLabel();
		E7 = new JLabel();
		E8 = new JLabel();
		E9 = new JLabel();
		E10 = new JLabel();
		E11 = new JLabel();
		E12 = new JLabel();
		E13 = new JLabel();
		E14 = new JLabel();
		E15 = new JLabel();
		E16 = new JLabel();
		E17 = new JLabel();
		E18 = new JLabel();
		E19 = new JLabel();
		E20 = new JLabel();
		D1 = new JLabel();
		D2 = new JLabel();
		D3 = new JLabel();
		D4 = new JLabel();
		D5 = new JLabel();
		D6 = new JLabel();
		D7 = new JLabel();
		D8 = new JLabel();
		D9 = new JLabel();
		D10 = new JLabel();
		D11 = new JLabel();
		D12 = new JLabel();
		D13 = new JLabel();
		D14 = new JLabel();
		D15 = new JLabel();
		D16 = new JLabel();
		D17 = new JLabel();
		D18 = new JLabel();
		D19 = new JLabel();
		D20 = new JLabel();
		C1 = new JLabel();
		C2 = new JLabel();
		C3 = new JLabel();
		C4 = new JLabel();
		C5 = new JLabel();
		C6 = new JLabel();
		C7 = new JLabel();
		C8 = new JLabel();
		C9 = new JLabel();
		C10 = new JLabel();
		C11 = new JLabel();
		C12 = new JLabel();
		C13 = new JLabel();
		C14 = new JLabel();
		C15 = new JLabel();
		C16 = new JLabel();
		C17 = new JLabel();
		C18 = new JLabel();
		C19 = new JLabel();
		C20 = new JLabel();
		B1 = new JLabel();
		B2 = new JLabel();
		B3 = new JLabel();
		B4 = new JLabel();
		B5 = new JLabel();
		B6 = new JLabel();
		B7 = new JLabel();
		B8 = new JLabel();
		B9 = new JLabel();
		B10 = new JLabel();
		B11 = new JLabel();
		B12 = new JLabel();
		B13 = new JLabel();
		B14 = new JLabel();
		B15 = new JLabel();
		B16 = new JLabel();
		B17 = new JLabel();
		B18 = new JLabel();
		B19 = new JLabel();
		B20 = new JLabel();
		A1 = new JLabel();
		A2 = new JLabel();
		A3 = new JLabel();
		A4 = new JLabel();
		A5 = new JLabel();
		A6 = new JLabel();
		A7 = new JLabel();
		A8 = new JLabel();
		A9 = new JLabel();
		A10 = new JLabel();
		A11 = new JLabel();
		A12 = new JLabel();
		A13 = new JLabel();
		A14 = new JLabel();
		A15 = new JLabel();
		A16 = new JLabel();
		A17 = new JLabel();
		A18 = new JLabel();
		A19 = new JLabel();
		A20 = new JLabel();
		Num1 = new JLabel();
		Num2 = new JLabel();
		Num3 = new JLabel();
		Num4 = new JLabel();
		Num5 = new JLabel();
		Num6 = new JLabel();
		Num7 = new JLabel();
		Num8 = new JLabel();
		Num9 = new JLabel();
		Num10 = new JLabel();
		Num11 = new JLabel();
		Num12 = new JLabel();
		Num13 = new JLabel();
		Num14 = new JLabel();
		Num15 = new JLabel();
		Num16 = new JLabel();
		Num17 = new JLabel();
		Num18 = new JLabel();
		Num19 = new JLabel();
		Num20 = new JLabel();

		Escenario = new JLabel();

		H1.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg")));
		H1.setBounds(10, 50, 36, 32);
		add(H1);

		H2.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		H2.setBounds(46, 50, 36, 32);
		add(H2);

		H3.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		H3.setBounds(82, 50, 36, 32);
		add(H3);

		H4.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		H4.setBounds(118, 50, 36, 32);
		add(H4);

		H5.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		H5.setBounds(154, 50, 36, 32);
		add(H5);

		H6.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		H6.setBounds(190, 50, 36, 32);
		add(H6);

		H7.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_oro.jpg"))); // NOI18N
		H7.setBounds(226, 50, 36, 32);
		add(H7);

		H8.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_oro.jpg"))); // NOI18N
		H8.setBounds(262, 50, 36, 32);
		add(H8);

		H9.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_oro.jpg"))); // NOI18N
		H9.setBounds(298, 50, 36, 32);
		add(H9);

		H10.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_oro.jpg"))); // NOI18N
		H10.setBounds(334, 50, 36, 32);
		add(H10);

		H11.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_oro.jpg"))); // NOI18N
		H11.setBounds(370, 50, 36, 32);
		add(H11);

		H12.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_oro.jpg"))); // NOI18N
		H12.setBounds(406, 50, 36, 32);
		add(H12);

		H13.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_oro.jpg"))); // NOI18N
		H13.setBounds(442, 50, 36, 32);
		add(H13);

		H14.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_oro.jpg"))); // NOI18N
		H14.setBounds(478, 50, 36, 32);
		add(H14);

		H15.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		H15.setBounds(514, 50, 36, 32);
		add(H15);

		H16.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		H16.setBounds(550, 50, 36, 32);
		add(H16);

		H17.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		H17.setBounds(586, 50, 36, 32);
		add(H17);

		H18.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		H18.setBounds(622, 50, 36, 32);
		add(H18);

		H19.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		H19.setBounds(658, 50, 36, 32);
		add(H19);

		H20.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		H20.setBounds(694, 50, 36, 32);
		add(H20);

		G1.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		G1.setBounds(10, 82, 36, 32);
		add(G1);

		G2.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		G2.setBounds(46, 82, 36, 32);
		add(G2);

		G3.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		G3.setBounds(82, 82, 36, 32);
		add(G3);

		G4.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		G4.setBounds(118, 82, 36, 32);
		add(G4);

		G5.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		G5.setBounds(154, 82, 36, 32);
		add(G5);

		G6.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		G6.setBounds(190, 82, 36, 32);
		add(G6);

		G7.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_oro.jpg"))); // NOI18N
		G7.setBounds(226, 82, 36, 32);
		add(G7);

		G8.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_oro.jpg"))); // NOI18N
		G8.setBounds(262, 82, 36, 32);
		add(G8);

		G9.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_oro.jpg"))); // NOI18N
		G9.setBounds(298, 82, 36, 32);
		add(G9);

		G10.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_oro.jpg"))); // NOI18N
		G10.setBounds(334, 82, 36, 32);
		add(G10);

		G11.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_oro.jpg"))); // NOI18N
		G11.setBounds(370, 82, 36, 32);
		add(G11);

		G12.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_oro.jpg"))); // NOI18N
		G12.setBounds(406, 82, 36, 32);
		add(G12);

		G13.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_oro.jpg"))); // NOI18N
		G13.setBounds(442, 82, 36, 32);
		add(G13);

		G14.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_oro.jpg"))); // NOI18N
		G14.setBounds(478, 82, 36, 32);
		add(G14);

		G15.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		G15.setBounds(514, 82, 36, 32);
		add(G15);

		G16.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		G16.setBounds(550, 82, 36, 32);
		add(G16);

		G17.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		G17.setBounds(586, 82, 36, 32);
		add(G17);

		G18.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		G18.setBounds(622, 82, 36, 32);
		add(G18);

		G19.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		G19.setBounds(658, 82, 36, 32);
		add(G19);

		G20.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_plata.jpg"))); // NOI18N
		G20.setBounds(694, 82, 36, 32);
		add(G20);

		F1.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		F1.setBounds(10, 114, 36, 32);
		add(F1);

		F2.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		F2.setBounds(46, 114, 36, 32);
		add(F2);

		F3.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		F3.setBounds(82, 114, 36, 32);
		add(F3);

		F4.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		F4.setBounds(118, 114, 36, 32);
		add(F4);

		F5.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		F5.setBounds(154, 114, 36, 32);
		add(F5);

		F6.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		F6.setBounds(190, 114, 36, 32);
		add(F6);

		F7.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		F7.setBounds(226, 114, 36, 32);
		add(F7);

		F8.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		F8.setBounds(262, 114, 36, 32);
		add(F8);

		F9.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		F9.setBounds(298, 114, 36, 32);
		add(F9);

		F10.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		F10.setBounds(334, 114, 36, 32);
		add(F10);

		F11.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		F11.setBounds(370, 114, 36, 32);
		add(F11);

		F12.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		F12.setBounds(406, 114, 36, 32);
		add(F12);

		F13.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		F13.setBounds(442, 114, 36, 32);
		add(F13);

		F14.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		F14.setBounds(478, 114, 36, 32);
		add(F14);

		F15.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		F15.setBounds(514, 114, 36, 32);
		add(F15);

		F16.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		F16.setBounds(550, 114, 36, 32);
		add(F16);

		F17.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		F17.setBounds(586, 114, 36, 32);
		add(F17);

		F18.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		F18.setBounds(622, 114, 36, 32);
		add(F18);

		F19.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		F19.setBounds(658, 114, 36, 32);
		add(F19);

		F20.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		F20.setBounds(694, 114, 36, 32);
		add(F20);

		E1.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		E1.setBounds(10, 146, 36, 32);
		add(E1);

		E2.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		E2.setBounds(46, 146, 36, 32);
		add(E2);

		E3.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		E3.setBounds(82, 146, 36, 32);
		add(E3);

		E4.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		E4.setBounds(118, 146, 36, 32);
		add(E4);

		E5.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		E5.setBounds(154, 146, 36, 32);
		add(E5);

		E6.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		E6.setBounds(190, 146, 36, 32);
		add(E6);

		E7.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		E7.setBounds(226, 146, 36, 32);
		add(E7);

		E8.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		E8.setBounds(262, 146, 36, 32);
		add(E8);

		E9.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		E9.setBounds(298, 146, 36, 32);
		add(E9);

		E10.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		E10.setBounds(334, 146, 36, 32);
		add(E10);

		E11.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		E11.setBounds(370, 146, 36, 32);
		add(E11);

		E12.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		E12.setBounds(406, 146, 36, 32);
		add(E12);

		E13.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		E13.setBounds(442, 146, 36, 32);
		add(E13);

		E14.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		E14.setBounds(478, 146, 36, 32);
		add(E14);

		E15.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		E15.setBounds(514, 146, 36, 32);
		add(E15);

		E16.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		E16.setBounds(550, 146, 36, 32);
		add(E16);

		E17.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		E17.setBounds(586, 146, 36, 32);
		add(E17);

		E18.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		E18.setBounds(622, 146, 36, 32);
		add(E18);

		E19.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		E19.setBounds(658, 146, 36, 32);
		add(E19);

		E20.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		E20.setBounds(694, 146, 36, 32);
		add(E20);

		D1.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		D1.setBounds(10, 178, 36, 32);
		add(D1);

		D2.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		D2.setBounds(46, 178, 36, 32);
		add(D2);

		D3.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		D3.setBounds(82, 178, 36, 32);
		add(D3);

		D4.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		D4.setBounds(118, 178, 36, 32);
		add(D4);

		D5.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		D5.setBounds(154, 178, 36, 32);
		add(D5);

		D6.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		D6.setBounds(190, 178, 36, 32);
		add(D6);

		D7.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		D7.setBounds(226, 178, 36, 32);
		add(D7);

		D8.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		D8.setBounds(262, 178, 36, 32);
		add(D8);

		D9.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		D9.setBounds(298, 178, 36, 32);
		add(D9);

		D10.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		D10.setBounds(334, 178, 36, 32);
		add(D10);

		D11.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		D11.setBounds(370, 178, 36, 32);
		add(D11);

		D12.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		D12.setBounds(406, 178, 36, 32);
		add(D12);

		D13.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		D13.setBounds(442, 178, 36, 32);
		add(D13);

		D14.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_diamante.jpg"))); // NOI18N
		D14.setBounds(478, 178, 36, 32);
		add(D14);

		D15.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		D15.setBounds(514, 178, 36, 32);
		add(D15);

		D16.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		D16.setBounds(550, 178, 36, 32);
		add(D16);

		D17.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		D17.setBounds(586, 178, 36, 32);
		add(D17);

		D18.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		D18.setBounds(622, 178, 36, 32);
		add(D18);

		D19.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		D19.setBounds(658, 178, 36, 32);
		add(D19);

		D20.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		D20.setBounds(694, 178, 36, 32);
		add(D20);

		C1.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		C1.setBounds(10, 210, 36, 32);
		add(C1);

		C2.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		C2.setBounds(46, 210, 36, 32);
		add(C2);

		C3.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		C3.setBounds(82, 210, 36, 32);
		add(C3);

		C4.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		C4.setBounds(118, 210, 36, 32);
		add(C4);

		C5.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		C5.setBounds(154, 210, 36, 32);
		add(C5);

		C6.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		C6.setBounds(190, 210, 36, 32);
		add(C6);

		C7.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		C7.setBounds(226, 210, 36, 32);
		add(C7);

		C8.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		C8.setBounds(262, 210, 36, 32);
		add(C8);

		C9.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		C9.setBounds(298, 210, 36, 32);
		add(C9);

		C10.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		C10.setBounds(334, 210, 36, 32);
		add(C10);

		C11.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		C11.setBounds(370, 210, 36, 32);
		add(C11);

		C12.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		C12.setBounds(406, 210, 36, 32);
		add(C12);

		C13.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		C13.setBounds(442, 210, 36, 32);
		add(C13);

		C14.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		C14.setBounds(478, 210, 36, 32);
		add(C14);

		C15.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		C15.setBounds(514, 210, 36, 32);
		add(C15);

		C16.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		C16.setBounds(550, 210, 36, 32);
		add(C16);

		C17.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		C17.setBounds(586, 210, 36, 32);
		add(C17);

		C18.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		C18.setBounds(622, 210, 36, 32);
		add(C18);

		C19.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		C19.setBounds(658, 210, 36, 32);
		add(C19);

		C20.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		C20.setBounds(694, 210, 36, 32);
		add(C20);

		B1.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		B1.setBounds(10, 242, 36, 32);
		add(B1);

		B2.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		B2.setBounds(46, 242, 36, 32);
		add(B2);

		B3.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		B3.setBounds(82, 242, 36, 32);
		add(B3);

		B4.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		B4.setBounds(118, 242, 36, 32);
		add(B4);

		B5.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		B5.setBounds(154, 242, 36, 32);
		add(B5);

		B6.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		B6.setBounds(190, 242, 36, 32);
		add(B6);

		B7.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		B7.setBounds(226, 242, 36, 32);
		add(B7);

		B8.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		B8.setBounds(262, 242, 36, 32);
		add(B8);

		B9.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		B9.setBounds(298, 242, 36, 32);
		add(B9);

		B10.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		B10.setBounds(334, 242, 36, 32);
		add(B10);

		B11.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		B11.setBounds(370, 242, 36, 32);
		add(B11);

		B12.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		B12.setBounds(406, 242, 36, 32);
		add(B12);

		B13.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		B13.setBounds(442, 242, 36, 32);
		add(B13);

		B14.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		B14.setBounds(478, 242, 36, 32);
		add(B14);

		B15.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		B15.setBounds(514, 242, 36, 32);
		add(B15);

		B16.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		B16.setBounds(550, 242, 36, 32);
		add(B16);

		B17.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		B17.setBounds(586, 242, 36, 32);
		add(B17);

		B18.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		B18.setBounds(622, 242, 36, 32);
		add(B18);

		B19.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		B19.setBounds(658, 242, 36, 32);
		add(B19);

		B20.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		B20.setBounds(694, 242, 36, 32);
		add(B20);

		A1.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		A1.setBounds(10, 274, 36, 32);
		add(A1);

		A2.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		A2.setBounds(46, 274, 36, 32);
		add(A2);

		A3.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		A3.setBounds(82, 274, 36, 32);
		add(A3);

		A4.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		A4.setBounds(118, 274, 36, 32);
		add(A4);

		A5.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		A5.setBounds(154, 274, 36, 32);
		add(A5);

		A6.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		A6.setBounds(190, 274, 36, 32);
		add(A6);

		A7.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		A7.setBounds(226, 274, 36, 32);
		add(A7);

		A8.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		A8.setBounds(262, 274, 36, 32);
		add(A8);

		A9.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		A9.setBounds(298, 274, 36, 32);
		add(A9);

		A10.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		A10.setBounds(334, 274, 36, 32);
		add(A10);

		A11.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		A11.setBounds(370, 274, 36, 32);
		add(A11);

		A12.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		A12.setBounds(406, 274, 36, 32);
		add(A12);

		A13.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		A13.setBounds(442, 274, 36, 32);
		add(A13);

		A14.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_bronce.jpg"))); // NOI18N
		A14.setBounds(478, 274, 36, 32);
		add(A14);

		A15.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		A15.setBounds(514, 274, 36, 32);
		add(A15);

		A16.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		A16.setBounds(550, 274, 36, 32);
		add(A16);

		A17.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		A17.setBounds(586, 274, 36, 32);
		add(A17);

		A18.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		A18.setBounds(622, 274, 36, 32);
		add(A18);

		A19.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		A19.setBounds(658, 274, 36, 32);
		add(A19);

		A20.setIcon(new ImageIcon(getClass().getResource("imagenes/asiento_azul_lata.jpg"))); // NOI18N
		A20.setBounds(694, 274, 36, 32);
		add(A20);

		Escenario.setIcon(new ImageIcon(getClass().getResource("imagenes/escenario.png")));
		Escenario.setBounds(44, 420, 662, 77);
		add(Escenario);// NOI18N
	}

}
