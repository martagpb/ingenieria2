package interfaces;

import javax.swing.JFrame;
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
public class JFDatos_Cliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel nombre_label = null;
	private JTextField nombre = null;
	private JLabel apellido1_label = null;
	private JTextField apellido1 = null;
	private JLabel apellido2_label = null;
	private JTextField apellido2 = null;
	private JLabel euros_label;
	private JTextField cuota;
	private JLabel cuota_label;
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
	private JTextField tipo_cliente = null;
	private JLabel cuenta = null;
	private JTextField nº_cuenta = null;
	/**
	 * This is the default constructor
	 */
	/**
	 * This is the default constructor
	 */
	public JFDatos_Cliente() {
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
		cuenta.setBounds(82, 299, 70, 16);
		cuenta.setText("Nº Cuenta");
		dni1_label = new JLabel();
		dni1_label.setText("DNI");
		dni1_label.setBounds(79, 159, 38, 16);
		codigo_label = new JLabel();
		codigo_label.setText("Código de Cliente");
		codigo_label.setBounds(75, 375, 108, 16);
		tipo_label = new JLabel();
		tipo_label.setText("Tipo de Cliente");
		tipo_label.setBounds(78, 336, 91, 16);
		poblacion_label = new JLabel();
		poblacion_label.setText("Población");
		poblacion_label.setBounds(81, 228, 66, 16);
		tfno_label = new JLabel();
		tfno_label.setText("Teléfono");
		tfno_label.setBounds(82, 260, 59, 16);
		direccion_label = new JLabel();
		direccion_label.setText("Dirección");
		direccion_label.setBounds(81, 192, 69, 16);
		apellido2_label = new JLabel();
		apellido2_label.setText("Segundo Apellido");
		apellido2_label.setBounds(80, 117, 102, 16);
		apellido1_label = new JLabel();
		apellido1_label.setText("Primer Apellido");
		apellido1_label.setBounds(79, 85, 91, 16);
		nombre_label = new JLabel();
		nombre_label.setText("Nombre");
		nombre_label.setBounds(80, 57, 56, 16);
		this.setSize(639, 510);
		this.setLayout(null);
		this.setTitle("Datos Personales Clientes");
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
		this.add(getTipo_cliente(), null);
		this.add(cuenta, null);
		this.add(getNº_cuenta(), null);
		getContentPane().add(getCuota_label());
		getContentPane().add(getCuota());
		getContentPane().add(getEuros_label());

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
			nombre.setBounds(198, 54, 315, 20);
			nombre.setEditable(false);
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
			apellido1.setBounds(197, 87, 317, 20);
			apellido1.setEditable(false);
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
			apellido2.setBounds(197, 117, 319, 20);
			apellido2.setEditable(false);
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
			direccion.setBounds(196, 189, 321, 20);
			direccion.setEditable(false);
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
			telefono.setBounds(198, 259, 180, 20);
			telefono.setEditable(false);
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
			poblacion.setBounds(198, 227, 251, 20);
			poblacion.setEditable(false);
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
			codigo.setBounds(198, 372, 108, 20);
			codigo.setEditable(false);
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
			dni.setBounds(197, 156, 143, 20);
			dni.setEditable(false);
		}
		return dni;
	}

	/**
	 * This method initializes tipo_cliente	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTipo_cliente() {
		if (tipo_cliente == null) {
			tipo_cliente = new JTextField();
			tipo_cliente.setBounds(197, 337, 157, 20);
			tipo_cliente.setEditable(false);
		}
		return tipo_cliente;
	}

	/**
	 * This method initializes nº_cuenta	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNº_cuenta() {
		if (nº_cuenta == null) {
			nº_cuenta = new JTextField();
			nº_cuenta.setBounds(196, 299, 334, 20);
			nº_cuenta.setEditable(false);
		}
		return nº_cuenta;
	}
	
	private JLabel getCuota_label() {
		if(cuota_label == null) {
			cuota_label = new JLabel();
			cuota_label.setText("Cuota");
			cuota_label.setBounds(75, 409, 66, 14);
		}
		return cuota_label;
	}
	
	private JTextField getCuota() {
		if(cuota == null) {
			cuota = new JTextField();
			cuota.setBounds(198, 406, 108, 21);
			cuota.setEditable(false);
		}
		return cuota;
	}
	
	private JLabel getEuros_label() {
		if(euros_label == null) {
			euros_label = new JLabel();
			euros_label.setText("\u20ac");
			euros_label.setBounds(320, 409, 10, 14);
		}
		return euros_label;
	}

}  //  @jve:decl-index=0:visual-constraint="37,-107"
