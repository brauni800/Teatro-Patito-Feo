package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JLabel;

import administradores.AdministradorBoletos;
import administradores.AdministrarAsientos;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

public class EventosVerSala extends EventosFactory{

	private JLabel jl;
	
	public EventosVerSala(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch (comando) {
		case PanelFactory.VER_SALA:
			new AdministradorBoletos(ventanaPrincipal.getPanelDinamico().getPanelDinamico()).verSala();
			break;
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getBtnRegresar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnRegresar().setActionCommand(PanelFactory.REGRESAR);

		super.ventanaPrincipal.getPanelDinamico().getBtnVenderBoleto().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnVenderBoleto().setActionCommand(PanelFactory.VENDER_BOLETOS);

		super.ventanaPrincipal.getPanelDinamico().getBtnCancelarBoleto().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnCancelarBoleto().setActionCommand(PanelFactory.CANCELAR_BOLETO);
		agregandoEventos();
		
	}
	
    private MouseAdapter asientoAdapter(JLabel jl, String coordenada) {
        return new AdministrarAsientos(jl, coordenada);
    }
	
	private void agregandoEventos() {
        //Butacas Fila A
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA1();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA1().addMouseListener(asientoAdapter(jl, "A1"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA2();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA2().addMouseListener(asientoAdapter(jl, "A2"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA3();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA3().addMouseListener(asientoAdapter(jl, "A3"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA4();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA4().addMouseListener(asientoAdapter(jl, "A4"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA5();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA5().addMouseListener(asientoAdapter(jl, "A5"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA6();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA6().addMouseListener(asientoAdapter(jl, "A6"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA7();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA7().addMouseListener(asientoAdapter(jl, "A7"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA8();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA8().addMouseListener(asientoAdapter(jl, "A8"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA9();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA9().addMouseListener(asientoAdapter(jl, "A9"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA10();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA10().addMouseListener(asientoAdapter(jl, "A10"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA11();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA11().addMouseListener(asientoAdapter(jl, "A11"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA12();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA12().addMouseListener(asientoAdapter(jl, "A12"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA13();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA13().addMouseListener(asientoAdapter(jl, "A13"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA14();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA14().addMouseListener(asientoAdapter(jl, "A14"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA15();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA15().addMouseListener(asientoAdapter(jl, "A15"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA16();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA16().addMouseListener(asientoAdapter(jl, "A16"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA17();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA17().addMouseListener(asientoAdapter(jl, "A17"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA18();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA18().addMouseListener(asientoAdapter(jl, "A18"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA19();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA19().addMouseListener(asientoAdapter(jl, "A19"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA20();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA20().addMouseListener(asientoAdapter(jl, "A20"));

        //Butacas Fila B
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB1();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB1().addMouseListener(asientoAdapter(jl, "B1"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB2();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB2().addMouseListener(asientoAdapter(jl, "B2"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB3();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB3().addMouseListener(asientoAdapter(jl, "B3"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB4();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB4().addMouseListener(asientoAdapter(jl, "B4"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB5();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB5().addMouseListener(asientoAdapter(jl, "B5"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB6();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB6().addMouseListener(asientoAdapter(jl, "B6"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB7();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB7().addMouseListener(asientoAdapter(jl, "B7"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB8();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB8().addMouseListener(asientoAdapter(jl, "B8"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB9();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB9().addMouseListener(asientoAdapter(jl, "B9"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB10();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB10().addMouseListener(asientoAdapter(jl, "B10"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB11();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB11().addMouseListener(asientoAdapter(jl, "B11"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB12();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB12().addMouseListener(asientoAdapter(jl, "B12"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB13();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB13().addMouseListener(asientoAdapter(jl, "B13"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB14();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB14().addMouseListener(asientoAdapter(jl, "B14"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB15();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB15().addMouseListener(asientoAdapter(jl, "B15"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB16();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB16().addMouseListener(asientoAdapter(jl, "B16"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB17();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB17().addMouseListener(asientoAdapter(jl, "B17"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB18();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB18().addMouseListener(asientoAdapter(jl, "B18"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB19();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB19().addMouseListener(asientoAdapter(jl, "B19"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB20();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB20().addMouseListener(asientoAdapter(jl, "B20"));

        //Butacas Fila C
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC1();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC1().addMouseListener(asientoAdapter(jl, "C1"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC2();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC2().addMouseListener(asientoAdapter(jl, "C2"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC3();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC3().addMouseListener(asientoAdapter(jl, "C3"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC4();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC4().addMouseListener(asientoAdapter(jl, "C4"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC5();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC5().addMouseListener(asientoAdapter(jl, "C5"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC6();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC6().addMouseListener(asientoAdapter(jl, "C6"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC7();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC7().addMouseListener(asientoAdapter(jl, "C7"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC8();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC8().addMouseListener(asientoAdapter(jl, "C8"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC9();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC9().addMouseListener(asientoAdapter(jl, "C9"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC10();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC10().addMouseListener(asientoAdapter(jl, "C10"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC11();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC11().addMouseListener(asientoAdapter(jl, "C11"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC12();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC12().addMouseListener(asientoAdapter(jl, "C12"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC13();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC13().addMouseListener(asientoAdapter(jl, "C13"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC14();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC14().addMouseListener(asientoAdapter(jl, "C14"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC15();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC15().addMouseListener(asientoAdapter(jl, "C15"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC16();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC16().addMouseListener(asientoAdapter(jl, "C16"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC17();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC17().addMouseListener(asientoAdapter(jl, "C17"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC18();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC18().addMouseListener(asientoAdapter(jl, "C18"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC19();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC19().addMouseListener(asientoAdapter(jl, "C19"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC20();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC20().addMouseListener(asientoAdapter(jl, "C20"));

        //Butacas Fila D
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD1();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD1().addMouseListener(asientoAdapter(jl, "D1"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD2();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD2().addMouseListener(asientoAdapter(jl, "D2"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD3();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD3().addMouseListener(asientoAdapter(jl, "D3"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD4();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD4().addMouseListener(asientoAdapter(jl, "D4"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD5();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD5().addMouseListener(asientoAdapter(jl, "D5"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD6();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD6().addMouseListener(asientoAdapter(jl, "D6"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD7();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD7().addMouseListener(asientoAdapter(jl, "D7"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD8();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD8().addMouseListener(asientoAdapter(jl, "D8"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD9();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD9().addMouseListener(asientoAdapter(jl, "D9"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD10();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD10().addMouseListener(asientoAdapter(jl, "D10"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD11();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD11().addMouseListener(asientoAdapter(jl, "D11"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD12();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD12().addMouseListener(asientoAdapter(jl, "D12"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD13();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD13().addMouseListener(asientoAdapter(jl, "D13"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD14();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD14().addMouseListener(asientoAdapter(jl, "D14"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD15();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD15().addMouseListener(asientoAdapter(jl, "D15"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD16();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD16().addMouseListener(asientoAdapter(jl, "D16"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD17();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD17().addMouseListener(asientoAdapter(jl, "D17"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD18();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD18().addMouseListener(asientoAdapter(jl, "D18"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD19();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD19().addMouseListener(asientoAdapter(jl, "D19"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD20();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD20().addMouseListener(asientoAdapter(jl, "D20"));

        //Butacas Fila E
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE1();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE1().addMouseListener(asientoAdapter(jl, "E1"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE2();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE2().addMouseListener(asientoAdapter(jl, "E2"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE3();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE3().addMouseListener(asientoAdapter(jl, "E3"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE4();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE4().addMouseListener(asientoAdapter(jl, "E4"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE5();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE5().addMouseListener(asientoAdapter(jl, "E5"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE6();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE6().addMouseListener(asientoAdapter(jl, "E6"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE7();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE7().addMouseListener(asientoAdapter(jl, "E7"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE8();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE8().addMouseListener(asientoAdapter(jl, "E8"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE9();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE9().addMouseListener(asientoAdapter(jl, "E9"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE10();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE10().addMouseListener(asientoAdapter(jl, "E10"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE11();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE11().addMouseListener(asientoAdapter(jl, "E11"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE12();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE12().addMouseListener(asientoAdapter(jl, "E12"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE13();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE13().addMouseListener(asientoAdapter(jl, "E13"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE14();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE14().addMouseListener(asientoAdapter(jl, "E14"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE15();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE15().addMouseListener(asientoAdapter(jl, "E15"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE16();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE16().addMouseListener(asientoAdapter(jl, "E16"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE17();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE17().addMouseListener(asientoAdapter(jl, "E17"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE18();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE18().addMouseListener(asientoAdapter(jl, "E18"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE19();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE19().addMouseListener(asientoAdapter(jl, "E19"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE20();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE20().addMouseListener(asientoAdapter(jl, "E20"));

        //Butacas Fila F
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF1();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF1().addMouseListener(asientoAdapter(jl, "F1"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF2();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF2().addMouseListener(asientoAdapter(jl, "F2"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF3();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF3().addMouseListener(asientoAdapter(jl, "F3"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF4();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF4().addMouseListener(asientoAdapter(jl, "F4"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF5();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF5().addMouseListener(asientoAdapter(jl, "F5"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF6();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF6().addMouseListener(asientoAdapter(jl, "F6"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF7();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF7().addMouseListener(asientoAdapter(jl, "F7"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF8();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF8().addMouseListener(asientoAdapter(jl, "F8"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF9();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF9().addMouseListener(asientoAdapter(jl, "F9"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF10();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF10().addMouseListener(asientoAdapter(jl, "F10"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF11();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF11().addMouseListener(asientoAdapter(jl, "F11"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF12();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF12().addMouseListener(asientoAdapter(jl, "F12"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF13();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF13().addMouseListener(asientoAdapter(jl, "F13"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF14();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF14().addMouseListener(asientoAdapter(jl, "F14"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF15();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF15().addMouseListener(asientoAdapter(jl, "F15"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF16();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF16().addMouseListener(asientoAdapter(jl, "F16"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF17();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF17().addMouseListener(asientoAdapter(jl, "F17"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF18();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF18().addMouseListener(asientoAdapter(jl, "F18"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF19();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF19().addMouseListener(asientoAdapter(jl, "F19"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF20();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF20().addMouseListener(asientoAdapter(jl, "F20"));

        //Butacas Fila G
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG1();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG1().addMouseListener(asientoAdapter(jl, "G1"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG2();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG2().addMouseListener(asientoAdapter(jl, "G2"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG3();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG3().addMouseListener(asientoAdapter(jl, "G3"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG4();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG4().addMouseListener(asientoAdapter(jl, "G4"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG5();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG5().addMouseListener(asientoAdapter(jl, "G5"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG6();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG6().addMouseListener(asientoAdapter(jl, "G6"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG7();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG7().addMouseListener(asientoAdapter(jl, "G7"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG8();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG8().addMouseListener(asientoAdapter(jl, "G8"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG9();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG9().addMouseListener(asientoAdapter(jl, "G9"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG10();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG10().addMouseListener(asientoAdapter(jl, "G10"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG11();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG11().addMouseListener(asientoAdapter(jl, "G11"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG12();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG12().addMouseListener(asientoAdapter(jl, "G12"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG13();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG13().addMouseListener(asientoAdapter(jl, "G13"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG14();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG14().addMouseListener(asientoAdapter(jl, "G14"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG15();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG15().addMouseListener(asientoAdapter(jl, "G15"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG16();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG16().addMouseListener(asientoAdapter(jl, "G16"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG17();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG17().addMouseListener(asientoAdapter(jl, "G17"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG18();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG18().addMouseListener(asientoAdapter(jl, "G18"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG19();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG19().addMouseListener(asientoAdapter(jl, "G19"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG20();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG20().addMouseListener(asientoAdapter(jl, "G20"));

        //Butacas Fila H
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH1();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH1().addMouseListener(asientoAdapter(jl, "H1"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH2();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH2().addMouseListener(asientoAdapter(jl, "H2"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH3();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH3().addMouseListener(asientoAdapter(jl, "H3"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH4();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH4().addMouseListener(asientoAdapter(jl, "H4"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH5();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH5().addMouseListener(asientoAdapter(jl, "H5"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH6();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH6().addMouseListener(asientoAdapter(jl, "H6"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH7();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH7().addMouseListener(asientoAdapter(jl, "H7"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH8();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH8().addMouseListener(asientoAdapter(jl, "H8"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH9();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH9().addMouseListener(asientoAdapter(jl, "H9"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH10();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH10().addMouseListener(asientoAdapter(jl, "H10"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH11();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH11().addMouseListener(asientoAdapter(jl, "H11"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH12();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH12().addMouseListener(asientoAdapter(jl, "H12"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH13();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH13().addMouseListener(asientoAdapter(jl, "H13"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH14();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH14().addMouseListener(asientoAdapter(jl, "H14"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH15();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH15().addMouseListener(asientoAdapter(jl, "H15"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH16();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH16().addMouseListener(asientoAdapter(jl, "H16"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH17();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH17().addMouseListener(asientoAdapter(jl, "H17"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH18();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH18().addMouseListener(asientoAdapter(jl, "H18"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH19();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH19().addMouseListener(asientoAdapter(jl, "H19"));
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH20();
        super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH20().addMouseListener(asientoAdapter(jl, "H20"));
    }


}
