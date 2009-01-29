package persistencia;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JLabel;

import comunicaciones.ServidorIdentificar;

import comunicaciones.ServidorIdentificar;

import java.awt.Color;
import java.awt.Font;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JTextField;

public class JFArrancar_Servidor extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton arrancar = null;
	private JLabel Opciones = null;
	private ServidorIdentificar servidor;

	private JTextField jTextField = null;
	/**
	 * This is the default constructor
	 */
	public JFArrancar_Servidor() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {

		Opciones = new JLabel();
		Opciones.setBounds(new Rectangle(47, 45, 211, 29));
		Opciones.setFont(new Font("Dialog", Font.BOLD, 18));
		Opciones.setText("Opciones del Servidor");
		this.setSize(308, 274);
		this.setLayout(null);
		this.add(getarrancar(), null);
		this.add(Opciones, null);
		this.add(getJTextField(), null);
	}

	/**
	 * This method initializes arrancar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getarrancar() {
		if (arrancar == null) {
			arrancar = new JButton();
			arrancar.setBounds(new Rectangle(94, 102, 116, 27));
			arrancar.setBackground(new Color(0, 204, 51));
			arrancar.setText("Arrancar");
			arrancar.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
					arrancarOPararServidor();
				}
			});
		}
		return arrancar;
	}
	
	protected void arrancarOPararServidor() {
		try {
			this.servidor=ServidorIdentificar.getServidor();
			this.servidor.arrancarOParar();
			if (this.servidor.isStopped()) {
				this.arrancar.setBackground(new Color(0, 204, 51));
				this.arrancar.setText("Arrancar");
				this.jTextField.setText("Servidor detenido");
			} else {
				this.arrancar.setBackground(new Color(255, 0, 0));
				this.arrancar.setText("Parar");
				this.jTextField.setText("Servidor escuchando");
			}
		} catch (RemoteException e) {
			this.jTextField.setText(e.toString());
		} catch (MalformedURLException e) {
			this.jTextField.setText(e.toString());
		} catch (AlreadyBoundException e) {
			this.jTextField.setText(e.toString());
		} catch (NotBoundException e) {
			this.jTextField.setText(e.toString());
		}
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setBounds(new Rectangle(30, 150, 247, 99));
		}
		return jTextField;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
