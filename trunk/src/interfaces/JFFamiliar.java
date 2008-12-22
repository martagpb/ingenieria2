package interfaces;

import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFFamiliar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel dni_label = null;
	private JTextField DNI = null;
	private JLabel codigo_label = null;
	private JTextField codigo = null;
	private JLabel nombre_label = null;
	private JTextField nombre = null;
	private JLabel apellidos_label = null;
	private JTextField apellidos = null;
	private JButton aceptar = null;
	private JButton buscar = null;

	/**
	 * This is the default constructor
	 */
	public JFFamiliar() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {

		this.setSize(521, 300);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			apellidos_label = new JLabel();
			apellidos_label.setBounds(new Rectangle(60, 153, 66, 16));
			apellidos_label.setText("Apellidos");
			nombre_label = new JLabel();
			nombre_label.setBounds(new Rectangle(61, 116, 65, 16));
			nombre_label.setText("Nombre");
			codigo_label = new JLabel();
			codigo_label.setBounds(new Rectangle(62, 85, 76, 16));
			codigo_label.setText("Código Socio");
			dni_label = new JLabel();
			dni_label.setBounds(new Rectangle(38, 37, 87, 16));
			dni_label.setText("DNI del Titular");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(dni_label, null);
			jContentPane.add(getDNI(), null);
			jContentPane.add(codigo_label, null);
			jContentPane.add(getCodigo(), null);
			jContentPane.add(nombre_label, null);
			jContentPane.add(getNombre(), null);
			jContentPane.add(apellidos_label, null);
			jContentPane.add(getApellidos(), null);
			jContentPane.add(getAceptar(), null);
			jContentPane.add(getBuscar(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes DNI	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getDNI() {
		if (DNI == null) {
			DNI = new JTextField();
			DNI.setBounds(new Rectangle(131, 34, 112, 20));
		}
		return DNI;
	}

	/**
	 * This method initializes codigo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getCodigo() {
		if (codigo == null) {
			codigo = new JTextField();
			codigo.setBounds(new Rectangle(143, 84, 108, 20));
			codigo.setEditable(false);
		}
		return codigo;
	}

	/**
	 * This method initializes nombre	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNombre() {
		if (nombre == null) {
			nombre = new JTextField();
			nombre.setBounds(new Rectangle(142, 113, 260, 20));
			nombre.setEditable(false);
		}
		return nombre;
	}

	/**
	 * This method initializes apellidos	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getApellidos() {
		if (apellidos == null) {
			apellidos = new JTextField();
			apellidos.setBounds(new Rectangle(144, 151, 260, 20));
			apellidos.setEditable(false);
		}
		return apellidos;
	}

	/**
	 * This method initializes aceptar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAceptar() {
		if (aceptar == null) {
			aceptar = new JButton();
			aceptar.setBounds(new Rectangle(198, 209, 103, 24));
			aceptar.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/ok.jpg"));
			aceptar.setText("Aceptar");
		}
		return aceptar;
	}

	/**
	 * This method initializes buscar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBuscar() {
		if (buscar == null) {
			buscar = new JButton();
			buscar.setBounds(new Rectangle(258, 33, 112, 23));
			buscar.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/icono-lupa.jpg"));
			buscar.setText("Buscar");
		}
		return buscar;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
