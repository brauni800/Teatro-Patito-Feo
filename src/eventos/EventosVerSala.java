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
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA1();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA1().addMouseListener(asientoAdapter(jl, "A-1"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA2();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA2().addMouseListener(asientoAdapter(jl, "A-2"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA3();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA3().addMouseListener(asientoAdapter(jl, "A-3"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA4();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA4().addMouseListener(asientoAdapter(jl, "A-4"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA5();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA5().addMouseListener(asientoAdapter(jl, "A-5"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA6();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA6().addMouseListener(asientoAdapter(jl, "A-6"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA7();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA7().addMouseListener(asientoAdapter(jl, "A-7"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA8();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA8().addMouseListener(asientoAdapter(jl, "A-8"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA9();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA9().addMouseListener(asientoAdapter(jl, "A-9"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA10();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA10().addMouseListener(asientoAdapter(jl, "A-10"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA11();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA11().addMouseListener(asientoAdapter(jl, "A-11"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA12();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA12().addMouseListener(asientoAdapter(jl, "A-12"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA13();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA13().addMouseListener(asientoAdapter(jl, "A-13"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA14();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA14().addMouseListener(asientoAdapter(jl, "A-14"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA15();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA15().addMouseListener(asientoAdapter(jl, "A-15"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA16();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA16().addMouseListener(asientoAdapter(jl, "A-16"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA17();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA17().addMouseListener(asientoAdapter(jl, "A-17"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA18();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA18().addMouseListener(asientoAdapter(jl, "A-18"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA19();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA19().addMouseListener(asientoAdapter(jl, "A-19"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA20();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getA20().addMouseListener(asientoAdapter(jl, "A-20"));

        //Butacas Fila B
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB1();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB1().addMouseListener(asientoAdapter(jl, "B-1"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB2();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB2().addMouseListener(asientoAdapter(jl, "B-2"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB3();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB3().addMouseListener(asientoAdapter(jl, "B-3"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB4();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB4().addMouseListener(asientoAdapter(jl, "B-4"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB5();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB5().addMouseListener(asientoAdapter(jl, "B-5"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB6();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB6().addMouseListener(asientoAdapter(jl, "B-6"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB7();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB7().addMouseListener(asientoAdapter(jl, "B-7"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB8();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB8().addMouseListener(asientoAdapter(jl, "B-8"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB9();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB9().addMouseListener(asientoAdapter(jl, "B-9"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB10();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB10().addMouseListener(asientoAdapter(jl, "B-10"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB11();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB11().addMouseListener(asientoAdapter(jl, "B-11"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB12();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB12().addMouseListener(asientoAdapter(jl, "B-12"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB13();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB13().addMouseListener(asientoAdapter(jl, "B-13"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB14();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB14().addMouseListener(asientoAdapter(jl, "B-14"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB15();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB15().addMouseListener(asientoAdapter(jl, "B-15"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB16();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB16().addMouseListener(asientoAdapter(jl, "B-16"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB17();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB17().addMouseListener(asientoAdapter(jl, "B-17"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB18();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB18().addMouseListener(asientoAdapter(jl, "B-18"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB19();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB19().addMouseListener(asientoAdapter(jl, "B-19"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB20();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getB20().addMouseListener(asientoAdapter(jl, "B-20"));

        //Butacas Fila C
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC1();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC1().addMouseListener(asientoAdapter(jl, "C-1"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC2();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC2().addMouseListener(asientoAdapter(jl, "C-2"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC3();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC3().addMouseListener(asientoAdapter(jl, "C-3"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC4();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC4().addMouseListener(asientoAdapter(jl, "C-4"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC5();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC5().addMouseListener(asientoAdapter(jl, "C-5"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC6();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC6().addMouseListener(asientoAdapter(jl, "C-6"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC7();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC7().addMouseListener(asientoAdapter(jl, "C-7"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC8();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC8().addMouseListener(asientoAdapter(jl, "C-8"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC9();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC9().addMouseListener(asientoAdapter(jl, "C-9"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC10();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC10().addMouseListener(asientoAdapter(jl, "C-10"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC11();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC11().addMouseListener(asientoAdapter(jl, "C-11"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC12();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC12().addMouseListener(asientoAdapter(jl, "C-12"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC13();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC13().addMouseListener(asientoAdapter(jl, "C-13"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC14();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC14().addMouseListener(asientoAdapter(jl, "C-14"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC15();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC15().addMouseListener(asientoAdapter(jl, "C-15"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC16();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC16().addMouseListener(asientoAdapter(jl, "C-16"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC17();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC17().addMouseListener(asientoAdapter(jl, "C-17"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC18();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC18().addMouseListener(asientoAdapter(jl, "C-18"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC19();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC19().addMouseListener(asientoAdapter(jl, "C-19"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC20();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getC20().addMouseListener(asientoAdapter(jl, "C-20"));

        //Butacas Fila D
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD1();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD1().addMouseListener(asientoAdapter(jl, "D-1"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD2();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD2().addMouseListener(asientoAdapter(jl, "D-2"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD3();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD3().addMouseListener(asientoAdapter(jl, "D-3"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD4();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD4().addMouseListener(asientoAdapter(jl, "D-4"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD5();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD5().addMouseListener(asientoAdapter(jl, "D-5"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD6();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD6().addMouseListener(asientoAdapter(jl, "D-6"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD7();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD7().addMouseListener(asientoAdapter(jl, "D-7"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD8();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD8().addMouseListener(asientoAdapter(jl, "D-8"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD9();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD9().addMouseListener(asientoAdapter(jl, "D-9"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD10();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD10().addMouseListener(asientoAdapter(jl, "D-10"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD11();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD11().addMouseListener(asientoAdapter(jl, "D-11"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD12();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD12().addMouseListener(asientoAdapter(jl, "D-12"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD13();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD13().addMouseListener(asientoAdapter(jl, "D-13"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD14();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD14().addMouseListener(asientoAdapter(jl, "D-14"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD15();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD15().addMouseListener(asientoAdapter(jl, "D-15"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD16();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD16().addMouseListener(asientoAdapter(jl, "D-16"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD17();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD17().addMouseListener(asientoAdapter(jl, "D-17"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD18();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD18().addMouseListener(asientoAdapter(jl, "D-18"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD19();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD19().addMouseListener(asientoAdapter(jl, "D-19"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD20();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getD20().addMouseListener(asientoAdapter(jl, "D-20"));

        //Butacas Fila E
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE1();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE1().addMouseListener(asientoAdapter(jl, "E-1"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE2();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE2().addMouseListener(asientoAdapter(jl, "E-2"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE3();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE3().addMouseListener(asientoAdapter(jl, "E-3"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE4();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE4().addMouseListener(asientoAdapter(jl, "E-4"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE5();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE5().addMouseListener(asientoAdapter(jl, "E-5"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE6();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE6().addMouseListener(asientoAdapter(jl, "E-6"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE7();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE7().addMouseListener(asientoAdapter(jl, "E-7"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE8();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE8().addMouseListener(asientoAdapter(jl, "E-8"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE9();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE9().addMouseListener(asientoAdapter(jl, "E-9"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE10();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE10().addMouseListener(asientoAdapter(jl, "E-10"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE11();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE11().addMouseListener(asientoAdapter(jl, "E-11"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE12();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE12().addMouseListener(asientoAdapter(jl, "E-12"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE13();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE13().addMouseListener(asientoAdapter(jl, "E-13"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE14();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE14().addMouseListener(asientoAdapter(jl, "E-14"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE15();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE15().addMouseListener(asientoAdapter(jl, "E-15"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE16();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE16().addMouseListener(asientoAdapter(jl, "E-16"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE17();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE17().addMouseListener(asientoAdapter(jl, "E-17"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE18();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE18().addMouseListener(asientoAdapter(jl, "E-18"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE19();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE19().addMouseListener(asientoAdapter(jl, "E-19"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE20();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getE20().addMouseListener(asientoAdapter(jl, "E-20"));

        //Butacas Fila F
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF1();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF1().addMouseListener(asientoAdapter(jl, "F-1"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF2();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF2().addMouseListener(asientoAdapter(jl, "F-2"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF3();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF3().addMouseListener(asientoAdapter(jl, "F-3"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF4();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF4().addMouseListener(asientoAdapter(jl, "F-4"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF5();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF5().addMouseListener(asientoAdapter(jl, "F-5"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF6();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF6().addMouseListener(asientoAdapter(jl, "F-6"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF7();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF7().addMouseListener(asientoAdapter(jl, "F-7"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF8();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF8().addMouseListener(asientoAdapter(jl, "F-8"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF9();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF9().addMouseListener(asientoAdapter(jl, "F-9"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF10();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF10().addMouseListener(asientoAdapter(jl, "F-10"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF11();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF11().addMouseListener(asientoAdapter(jl, "F-11"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF12();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF12().addMouseListener(asientoAdapter(jl, "F-12"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF13();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF13().addMouseListener(asientoAdapter(jl, "F-13"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF14();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF14().addMouseListener(asientoAdapter(jl, "F-14"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF15();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF15().addMouseListener(asientoAdapter(jl, "F-15"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF16();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF16().addMouseListener(asientoAdapter(jl, "F-16"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF17();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF17().addMouseListener(asientoAdapter(jl, "F-17"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF18();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF18().addMouseListener(asientoAdapter(jl, "F-18"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF19();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF19().addMouseListener(asientoAdapter(jl, "F-19"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF20();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getF20().addMouseListener(asientoAdapter(jl, "F-20"));

        //Butacas Fila G
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG1();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG1().addMouseListener(asientoAdapter(jl, "G-1"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG2();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG2().addMouseListener(asientoAdapter(jl, "G-2"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG3();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG3().addMouseListener(asientoAdapter(jl, "G-3"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG4();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG4().addMouseListener(asientoAdapter(jl, "G-4"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG5();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG5().addMouseListener(asientoAdapter(jl, "G-5"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG6();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG6().addMouseListener(asientoAdapter(jl, "G-6"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG7();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG7().addMouseListener(asientoAdapter(jl, "G-7"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG8();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG8().addMouseListener(asientoAdapter(jl, "G-8"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG9();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG9().addMouseListener(asientoAdapter(jl, "G-9"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG10();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG10().addMouseListener(asientoAdapter(jl, "G-10"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG11();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG11().addMouseListener(asientoAdapter(jl, "G-11"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG12();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG12().addMouseListener(asientoAdapter(jl, "G-12"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG13();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG13().addMouseListener(asientoAdapter(jl, "G-13"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG14();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG14().addMouseListener(asientoAdapter(jl, "G-14"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG15();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG15().addMouseListener(asientoAdapter(jl, "G-15"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG16();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG16().addMouseListener(asientoAdapter(jl, "G-16"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG17();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG17().addMouseListener(asientoAdapter(jl, "G-17"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG18();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG18().addMouseListener(asientoAdapter(jl, "G-18"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG19();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG19().addMouseListener(asientoAdapter(jl, "G-19"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG20();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getG20().addMouseListener(asientoAdapter(jl, "G-20"));

        //Butacas Fila H
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH1();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH1().addMouseListener(asientoAdapter(jl, "H-1"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH2();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH2().addMouseListener(asientoAdapter(jl, "H-2"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH3();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH3().addMouseListener(asientoAdapter(jl, "H-3"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH4();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH4().addMouseListener(asientoAdapter(jl, "H-4"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH5();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH5().addMouseListener(asientoAdapter(jl, "H-5"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH6();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH6().addMouseListener(asientoAdapter(jl, "H-6"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH7();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH7().addMouseListener(asientoAdapter(jl, "H-7"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH8();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH8().addMouseListener(asientoAdapter(jl, "H-8"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH9();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH9().addMouseListener(asientoAdapter(jl, "H-9"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH10();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH10().addMouseListener(asientoAdapter(jl, "H-10"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH11();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH11().addMouseListener(asientoAdapter(jl, "H-11"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH12();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH12().addMouseListener(asientoAdapter(jl, "H-12"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH13();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH13().addMouseListener(asientoAdapter(jl, "H-13"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH14();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH14().addMouseListener(asientoAdapter(jl, "H-14"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH15();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH15().addMouseListener(asientoAdapter(jl, "H-15"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH16();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH16().addMouseListener(asientoAdapter(jl, "H-16"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH17();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH17().addMouseListener(asientoAdapter(jl, "H-17"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH18();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH18().addMouseListener(asientoAdapter(jl, "H-18"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH19();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH19().addMouseListener(asientoAdapter(jl, "H-19"));
        this.jl = this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH20();
        this.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getH20().addMouseListener(asientoAdapter(jl, "H-20"));
    }


}
