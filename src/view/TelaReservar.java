package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.ControlApartamento;
import control.ControlCasa;
import control.ControleUsuario;
import model.Apartamento;
import model.Reserva;
import model.Usuario;

public class TelaReservar implements ActionListener, ListSelectionListener {

	int i = 0;
	private static JFrame janela = new JFrame();
	private static JButton salvar = new JButton("Salvar Reserva");

	private static JLabel checkin = new JLabel(" Data Check-in:");
	private static JLabel checkout = new JLabel("Data Check-out:");
	private static JLabel usuario = new JLabel("Usuario:");
	private JTextField tfCheckin = new JTextField();
	private JTextField tfCheckout = new JTextField();
	private JTextField tfUsuario = new JTextField();
	private static TelaImoveis ti = new TelaImoveis();
	
	//private static ControleUsuario ctu = new ControleUsuario();
	//private static ControlApartamento cta = new ControlApartamento();
	//private static ControlCasa ctc = new ControlCasa();
	
	public TelaReservar() {
		checkin.setBounds(20, 30, 100, 40);
		checkout.setBounds(20, 70, 100, 40);
		usuario.setBounds(20,110,100,40);
		tfCheckin.setBounds(130, 40, 100, 20);
		tfCheckout.setBounds(130, 80, 100, 20);
		tfUsuario.setBounds(130, 120, 100, 20);
		
		
		salvar.setBounds(90, 180, 150, 40);
		
		janela.setSize(400, 300);
		janela.setVisible(true);
		janela.add(checkin);
		janela.add(checkout);
		janela.add(usuario);
		janela.add(tfUsuario);
		janela.add(tfCheckin);
		janela.add(tfCheckout);
		janela.add(salvar);
		janela.setLayout(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	
	
	public void salvarReservaApt() {
		ti.valueChanged();
		
		String checkin = tfCheckin.getText();
		String checkout = tfCheckout.getText();
		Usuario usuario = tfUsuario.Usuario.getNome();
		Apartamento apt = 
		

		Reserva reserva = new Reserva(checkin, checkout, usuario, apt);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
	}


	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
		if(src == ti.valueChanged()) {
			 i = ti.retornaListaApt().getSelectedIndex();
		}
		
	}

	
}
