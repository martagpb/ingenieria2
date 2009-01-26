package interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import aplicacion.Sesion;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class JFIdentificar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanel1 = null;
	private JLabel intro_datos = null;
	private JLabel usuario_label = null;
	private JTextField usuario = null;
	private JLabel contraseña_label = null;
	private JPasswordField contraseña = null;
	private JButton aceptar_1 = null;

	/**
	 * This is the default constructor
	 */
	
	
	public static void main(String[] args) {

		JFIdentificar inst = new JFIdentificar();
		inst.setLocationRelativeTo(null);
		inst.setVisible(true);
}

	public JFIdentificar() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(548, 266);
		this.setContentPane(getJContentPane());
		this.setTitle("Identificar");
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				mouseClicked(evt);
			}
		});
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
			jContentPane.add(getJPanel1(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			contraseña_label = new JLabel();
			contraseña_label.setBounds(new Rectangle(137, 109, 109, 16));
			contraseña_label.setText("contraseña:");
			contraseña_label.setFont(new Font("Arial Black", Font.BOLD, 14));
			usuario_label = new JLabel();
			usuario_label.setBounds(new Rectangle(137, 71, 90, 16));
			usuario_label.setText("usuario:");
			usuario_label.setFont(new Font("Arial Black", Font.BOLD, 14));
			intro_datos = new JLabel();
			intro_datos.setBounds(new Rectangle(37, 36, 302, 16));
			intro_datos.setText("Intruduzca su usuario y su contraseña");
			intro_datos.setFont(new Font("Arial Black", Font.BOLD, 12));
			jPanel1 = new JPanel();
			jPanel1.setLayout(null);
			jPanel1.setBounds(new Rectangle(11, 15, 518, 201));
			jPanel1.setBackground(new Color(238, 238, 238));
			jPanel1.setBorder(BorderFactory.createTitledBorder(null, "CLUB DEPORTIVO JYM", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 14), new Color(0, 153, 0)));
			jPanel1.add(intro_datos, null);
			jPanel1.add(usuario_label, null);
			jPanel1.add(getUsuario(), null);
			jPanel1.add(contraseña_label, null);
			jPanel1.add(getContraseña(), null);
			jPanel1.add(getAceptar_1(), null);
		}
		return jPanel1;
	}

	/**
	 * This method initializes usuario	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getUsuario() {
		if (usuario == null) {
			usuario = new JTextField();
			usuario.setBounds(new Rectangle(250, 66, 225, 20));
		}
		return usuario;
	}

	/**
	 * This method initializes contraseña	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getContraseña() {
		if (contraseña == null) {
			contraseña = new JPasswordField();
			contraseña.setBounds(new Rectangle(252, 104, 222, 20));
		}
		return contraseña;
	}

	/**
	 * This method initializes aceptar_1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAceptar_1() {
		if (aceptar_1 == null) {
			aceptar_1 = new JButton();
			aceptar_1.setBounds(new Rectangle(381, 149, 103, 26));
			aceptar_1.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/ok.jpg"));
			aceptar_1.setText("Aceptar");
			aceptar_1.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					aceptar_1MouseClicked(evt);
				}
			});
		}
		return aceptar_1;
	}
	

	
	private void aceptar_1MouseClicked(MouseEvent evt) {
		Sesion s =new Sesion();
		boolean resultado=s.comprobarSesion(usuario.getText(),contraseña.getText());
		if (resultado ==true){
			JFMenu m =new JFMenu();
			m.setVisible(true);
			this.setVisible(false);
		}
		else {
			JOptionPane.showMessageDialog(null, "El usuario no existe o la contraseña es incorrecta");
		}
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
