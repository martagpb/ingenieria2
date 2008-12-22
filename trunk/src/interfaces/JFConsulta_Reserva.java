package interfaces;

import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JFConsulta_Reserva extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JScrollPane jScrollPane_reservas = null;
	private JTable jTable_reservas = null;
	private JButton imprimir = null;
	String titulo;
	String []nombres={"Hora","Tenis_1","Tenis_2","Padel","Baloncesto","Futbol_sala","Balonmano"};
	Object datos[][] = {{"9:00","", "","","","","","","","","","",""}, {"10:00","","","","","","","","","","","",""},
	{"11:00","","","","","","","","","","","",""},{"12:00","","","","","","","","","","","",""},{"13:00", "","","","","","","","","","","",""},
	{"16:00","","","","","","","","","","","",""},{"17:00","","","","","","","","","","","",""},{"18:00","","","","","","","","","","","",""},{"19:00","","","","","","","","","","","",""},};
	/**
	 * This is the default constructor
	 */
	public JFConsulta_Reserva(String s) {
		super();
		titulo=s;
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(572, 316);
		this.setContentPane(getJContentPane());
		this.setTitle("Reservas para el día: "+titulo);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJScrollPane_reservas(), null);
			jContentPane.add(getImprimir(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jScrollPane_reservas	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane_reservas() {
		if (jScrollPane_reservas == null) {
			jScrollPane_reservas = new JScrollPane();
			jScrollPane_reservas.setBounds(new Rectangle(30,30, 500, 160));
			jScrollPane_reservas.setViewportView(getJTable_reservas());
		}
		return jScrollPane_reservas;
	}

	/**
	 * This method initializes jTable_reservas	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTable_reservas() {
		if (jTable_reservas == null) {
			jTable_reservas = new JTable();
			jTable_reservas = new JTable(datos,nombres);
		}
		return jTable_reservas;
	}

	/**
	 * This method initializes imprimir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getImprimir() {
		if (imprimir == null) {
			imprimir = new JButton();
			imprimir.setBounds(new Rectangle(207, 221, 154, 28));
			imprimir.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/imprimir.gif"));
			imprimir.setText("Imprimir");
		}
		return imprimir;
	}

}  //  @jve:decl-index=0:visual-constraint="-105,19"
