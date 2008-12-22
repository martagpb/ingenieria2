package interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


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
public class JPGestion_Modificaciones extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel alta_label = null;
	private JLabel nombre_label = null;
	private JTextField nombre = null;
	private JLabel apellido1_label = null;
	private JTextField apellido1 = null;
	private JLabel apellido2_label = null;
	private JTextField apellido2 = null;
	private JLabel direccion_label = null;
	private JTextField direccion = null;
	private JLabel tfno_label = null;
	private JTextField telefono = null;
	private JLabel poblacion_label = null;
	private JTextField poblacion = null;
	private JLabel tipo_label = null;
	private JLabel codigo_label = null;
	private JTextField codigo = null;
	private JLabel dni1_label = null;
	private JTextField dni = null;
	private JLabel label1 = null;
	private JTextField cod_buscar = null;
	private JTextField tipo_cliente = null;
	private JButton aceptar = null;
	private JLabel cuenta = null;
	private JTextField nº_cuenta = null;
	/**
	 * This is the default constructor
	 */
	public JPGestion_Modificaciones() {
		super();
		initialize();
		
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		cuenta = new JLabel();
		cuenta.setBounds(new Rectangle(122, 383, 70, 16));
		cuenta.setText("Nº Cuenta");
		label1 = new JLabel();
		label1.setBounds(new Rectangle(66, 90, 330, 16));
		label1.setFont(new Font("Dialog", Font.BOLD, 14));
		label1.setText("Introduzca el Código del Cliente que busca:");
		alta_label = new JLabel();
		alta_label.setBounds(224, 40, 240, 24);
		alta_label.setFont(new Font("Dialog", Font.BOLD, 18));
		alta_label.setForeground(new Color(0, 153, 0));
		alta_label.setText("Modificar datos Cliente");
		dni1_label = new JLabel();
		dni1_label.setText("DNI");
		dni1_label.setBounds(new Rectangle(119, 243, 38, 16));
		codigo_label = new JLabel();
		codigo_label.setText("Código de Cliente");
		codigo_label.setBounds(new Rectangle(115, 459, 108, 16));
		tipo_label = new JLabel();
		tipo_label.setText("Tipo de Cliente");
		tipo_label.setBounds(new Rectangle(118, 420, 91, 16));
		poblacion_label = new JLabel();
		poblacion_label.setText("Población");
		poblacion_label.setBounds(new Rectangle(121, 312, 66, 16));
		tfno_label = new JLabel();
		tfno_label.setText("Teléfono");
		tfno_label.setBounds(new Rectangle(122, 344, 59, 16));
		direccion_label = new JLabel();
		direccion_label.setText("Dirección");
		direccion_label.setBounds(new Rectangle(121, 276, 69, 16));
		apellido2_label = new JLabel();
		apellido2_label.setText("Segundo Apellido");
		apellido2_label.setBounds(new Rectangle(120, 201, 102, 16));
		apellido1_label = new JLabel();
		apellido1_label.setText("Primer Apellido");
		apellido1_label.setBounds(new Rectangle(119, 169, 91, 16));
		nombre_label = new JLabel();
		nombre_label.setText("Nombre");
		nombre_label.setBounds(new Rectangle(120, 141, 56, 16));
		this.setSize(712, 663);
		this.setLayout(null);
		this.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));
		this.add(alta_label, null);
		this.add(nombre_label, null);
		this.add(getNombre(), null);
		this.add(apellido1_label, null);
		this.add(getApellido1(), null);
		this.add(apellido2_label, null);
		this.add(getApellido2(), null);
		this.add(dni1_label, null);
		this.add(getDni(), null);
		this.add(direccion_label, null);
		this.add(getDireccion(), null);
		this.add(poblacion_label, null);
		this.add(getPoblacion(), null);
		this.add(tfno_label, null);
		this.add(getTelefono(), null);
		this.add(tipo_label, null);
		this.add(codigo_label, null);
		this.add(getCodigo(), null);
		this.add(label1, null);
		this.add(getCod_buscar(), null);
		this.add(getTipo_cliente(), null);
		this.add(getAceptar(), null);
		this.add(cuenta, null);
		this.add(getNº_cuenta(), null);
		
	}

	/**
	 * This method initializes jContentPane	
	 * 	
	 * @return javax.swing.JPanel	
	 */

	/**
	 * This method initializes nombre	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNombre() {
		if (nombre == null) {
			nombre = new JTextField();
			nombre.setBounds(new Rectangle(234, 140, 315, 20));
		}
		return nombre;
	}

	/**
	 * This method initializes apellido1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getApellido1() {
		if (apellido1 == null) {
			apellido1 = new JTextField();
			apellido1.setBounds(new Rectangle(234, 169, 317, 20));
		}
		return apellido1;
	}

	/**
	 * This method initializes apellido2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getApellido2() {
		if (apellido2 == null) {
			apellido2 = new JTextField();
			apellido2.setBounds(new Rectangle(234, 201, 319, 20));
		}
		return apellido2;
	}

	/**
	 * This method initializes direccion	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getDireccion() {
		if (direccion == null) {
			direccion = new JTextField();
			direccion.setBounds(new Rectangle(235, 272, 317, 20));
		}
		return direccion;
	}

	/**
	 * This method initializes telefono	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTelefono() {
		if (telefono == null) {
			telefono = new JTextField();
			telefono.setBounds(new Rectangle(235, 342, 180, 20));
		}
		return telefono;
	}

	/**
	 * This method initializes poblacion	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getPoblacion() {
		if (poblacion == null) {
			poblacion = new JTextField();
			poblacion.setBounds(new Rectangle(235, 311, 251, 20));
		}
		return poblacion;
	}

	/**
	 * This method initializes codigo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getCodigo() {
		if (codigo == null) {
			codigo = new JTextField();
			codigo.setBounds(new Rectangle(238, 456, 108, 20));
		}
		return codigo;
	}

	/**
	 * This method initializes dni	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getDni() {
		if (dni == null) {
			dni = new JTextField();
			dni.setBounds(new Rectangle(235, 243, 143, 20));
		}
		return dni;
	}

	/**
	 * This method initializes cod_buscar	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getCod_buscar() {
		if (cod_buscar == null) {
			cod_buscar = new JTextField();
			cod_buscar.setBounds(new Rectangle(415, 90, 143, 20));
		}
		return cod_buscar;
	}

	/**
	 * This method initializes tipo_cliente	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTipo_cliente() {
		if (tipo_cliente == null) {
			tipo_cliente = new JTextField();
			tipo_cliente.setBounds(new Rectangle(237, 421, 157, 20));
		}
		return tipo_cliente;
	}

	/**
	 * This method initializes aceptar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAceptar() {
		if (aceptar == null) {
			aceptar = new JButton();
			aceptar.setBounds(new Rectangle(324, 509, 110, 30));
			aceptar.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/ok.jpg"));
			aceptar.setText("Aceptar");
		}
		return aceptar;
	}

	/**
	 * This method initializes nº_cuenta	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNº_cuenta() {
		if (nº_cuenta == null) {
			nº_cuenta = new JTextField();
			nº_cuenta.setBounds(new Rectangle(236, 383, 334, 20));
		}
		return nº_cuenta;
	}

}  //  @jve:decl-index=0:visual-constraint="-37,-82"
