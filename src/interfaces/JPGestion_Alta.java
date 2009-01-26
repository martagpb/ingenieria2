package interfaces;
import aplicacion.*;
import dominio.dominio.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


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


public class JPGestion_Alta extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel alta_label = null;
	private JLabel nombre_label = null;
	private JTextField nombre = null;
	private JLabel apellido1_label = null;
	private JTextField apellido1 = null;
	private JLabel apellido2_label = null;
	private JTextField apellido2 = null;
	private JLabel direccion_label = null;
	private JLabel euros_cuota;
	private JComboBox jComboBox_tipo_cliente;
	private JTextField direccion = null;
	private JLabel tfno_label = null;
	private JTextField telefono = null;
	private JLabel poblacion_label = null;
	private JTextField poblacion = null;
	private JLabel tipo_label = null;
	private JLabel codigo_label = null;
	private JTextField codigo =null;
	private JLabel dni1_label = null;
	private JTextField dni = null;
	private JButton aceptar = null;
	private JLabel cuenta = null;
	private JTextField nº_cuenta = null;
	private JLabel cuota_label = null;
	private JTextField cuota = null;
	private JButton calcular_cuota = null;
	private JButton codigo_titular = null;
	private JLabel Fecha_nacLabel = null;
	private JTextField fecha_nac = null;
	private Date fecha_nacimiento;

	/**
	 * This is the default constructor
	 */
	public JPGestion_Alta() {
		super();
		initialize();
		
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {

		Fecha_nacLabel = new JLabel();
		Fecha_nacLabel.setBounds(new Rectangle(92, 421, 129, 21));
		Fecha_nacLabel.setName("");
		Fecha_nacLabel.setText("Fecha de Nacimiento");
		cuota_label = new JLabel();
		cuota_label.setBounds(new Rectangle(118, 501, 46, 16));
		cuota_label.setText("Cuota");
		cuenta = new JLabel();
		cuenta.setBounds(new Rectangle(118, 465, 70, 16));
		cuenta.setEnabled(true);
		cuenta.setText("Nº Cuenta");
		cuenta.setVisible(false);
		alta_label = new JLabel();
		alta_label.setBounds(239, 49, 227, 24);
		alta_label.setFont(new Font("Dialog", Font.BOLD, 18));
		alta_label.setForeground(new Color(0, 153, 0));
		alta_label.setText("Dar de Alta a un Cliente");
		dni1_label = new JLabel();
		dni1_label.setText("DNI");
		dni1_label.setBounds(new Rectangle(119, 284, 38, 16));
		codigo_label = new JLabel();

		codigo_label.setText("Cod Socio");
		codigo_label.setBounds(new Rectangle(116, 153, 108, 16));
		tipo_label = new JLabel();
		tipo_label.setText("Tipo de Cliente");
		tipo_label.setBounds(new Rectangle(109, 110, 91, 16));
		poblacion_label = new JLabel();
		poblacion_label.setText("Población");
		poblacion_label.setBounds(new Rectangle(121, 353, 66, 16));
		tfno_label = new JLabel();
		tfno_label.setText("Teléfono");
		tfno_label.setBounds(new Rectangle(122, 385, 59, 16));
		direccion_label = new JLabel();
		direccion_label.setText("Dirección");
		direccion_label.setBounds(new Rectangle(121, 317, 69, 16));
		apellido2_label = new JLabel();
		apellido2_label.setText("Segundo Apellido");
		apellido2_label.setBounds(new Rectangle(120, 242, 102, 16));
		apellido1_label = new JLabel();
		apellido1_label.setText("Primer Apellido");
		apellido1_label.setBounds(new Rectangle(119, 210, 91, 16));
		nombre_label = new JLabel();
		nombre_label.setText("Nombre");
		nombre_label.setBounds(new Rectangle(120, 182, 56, 16));
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
		this.add(getAceptar(), null);
		this.add(cuenta, null);
		this.add(getNº_cuenta(), null);
		this.add(cuota_label, null);
		this.add(getCuota(), null);
		this.add(getCalcular_cuota(), null);
		this.add(getCodigo_titular(), null);
		this.add(getJComboBox_tipo_cliente());
		this.add(getEuros_cuota());
		this.add(Fecha_nacLabel, null);
		this.add(getFecha_nac(), null);
		codigo_label.setVisible(false);
		codigo.setVisible(false);
		codigo_titular.setVisible(false);
		cuota_label.setVisible(false);
		cuota.setVisible(false);
		calcular_cuota.setVisible(false);
		euros_cuota.setVisible(false);
		
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
			nombre.setBounds(234, 180, 315, 20);
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
			apellido1.setBounds(new Rectangle(234, 210, 317, 20));
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
			apellido2.setBounds(234, 242, 319, 20);
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
			direccion.setBounds(234, 315, 321, 20);
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
			telefono.setBounds(new Rectangle(235, 383, 180, 20));
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
			poblacion.setBounds(235, 351, 251, 20);
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
			codigo.setBounds(234, 151, 108, 20);
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
			dni.setBounds(234, 282, 143, 20);
		}
		return dni;
	}

	/**
	 * This method initializes aceptar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAceptar() {
		if (aceptar == null) {
			aceptar = new JButton();
			aceptar.setBounds(new Rectangle(300, 541, 123, 27));
			aceptar.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/ok.jpg"));
			aceptar.setText("Aceptar");
			aceptar.addMouseListener(new java.awt.event.MouseListener() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					boolean resultado=false;
					Crearcliente c =new Crearcliente();
					String s=(String)jComboBox_tipo_cliente.getSelectedItem();
					SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
					try{
						fecha_nacimiento=sdf.parse(fecha_nac.getText());
					
					
					resultado=c.añadircliente(dni.getText(),nombre.getText(),apellido1.getText(),
							apellido2.getText(), direccion.getText(),poblacion.getText(),
							telefono.getText(), fecha_nacimiento); 
					}
					catch(Exception formatofecha){
						JOptionPane.showMessageDialog(null, "El formato de la fecha debe ser dd/MM/yyyy ");
					}
					if (s.equalsIgnoreCase("Socio Individual")){
						
						double mensualidad=Double.parseDouble(cuota.getText());
						resultado=c.añadirSocio(dni.getText(),mensualidad, nº_cuenta.getText());
					}
					
					
					
					if (resultado==false) JOptionPane.showMessageDialog(null, "Error en los datos no se ha podido guardar en Base de Datos");
					else{
						limpiarinterfaz();
						JOptionPane.showMessageDialog(null, "Los datos se han guardado en Base de Datos");
					}
				}
				public void mousePressed(java.awt.event.MouseEvent e) {
				}
				public void mouseReleased(java.awt.event.MouseEvent e) {
				}
				public void mouseEntered(java.awt.event.MouseEvent e) {
				}
				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
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
			nº_cuenta.setBounds(231, 463, 334, 20);
			nº_cuenta.setVisible(false);
		}
		return nº_cuenta;
	}

	/**
	 * This method initializes jComboBox_tipo	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	

	/**
	 * This method initializes cuota	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getCuota() {
		if (cuota == null) {
			cuota = new JTextField();
			cuota.setBounds(new Rectangle(229, 499, 84, 20));
		}
		return cuota;
	}

	/**
	 * This method initializes calcular_cuota	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getCalcular_cuota() {
		if (calcular_cuota == null) {
			calcular_cuota = new JButton();
			calcular_cuota.setBounds(365, 497, 117, 26);
			calcular_cuota.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/calculadora2.gif"));
			calcular_cuota.setText("Calcular");
			calcular_cuota.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					int cod=Integer.parseInt(codigo.getText());
					Crearcliente c=new Crearcliente();
					cuota.setText(c.calcular(cod)+"");
				}
			});
		}
		return calcular_cuota;
	}

	/**
	 * This method initializes codigo_titular	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getCodigo_titular() {
		if (codigo_titular == null) {
			codigo_titular = new JButton();
			codigo_titular.setBounds(new Rectangle(362, 143, 113, 26));
			codigo_titular.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/icono-lupa.jpg"));
			codigo_titular.setText("Buscar");
			codigo_titular.setVisible(false);
			codigo_titular.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					JFFamiliar familiar=new JFFamiliar();
					familiar.setVisible(true);
					familiar.setSize(500,300);
					familiar.setLocation(200,200);
					familiar.setLocationRelativeTo(null);
					
				}
			});
	
		}
		return codigo_titular;
	}
	
	private JComboBox getJComboBox_tipo_cliente() {
		if(jComboBox_tipo_cliente == null) {
			ComboBoxModel jComboBox_tipo_clienteModel = 
				new DefaultComboBoxModel(
						new String[] { "Cliente", "Socio Individual","Socio Familiar" });
			jComboBox_tipo_cliente = new JComboBox();
			jComboBox_tipo_cliente.setModel(jComboBox_tipo_clienteModel);
			jComboBox_tipo_cliente.setBounds(239, 108, 139, 21);
			jComboBox_tipo_cliente.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent evt) {
					jComboBox_tipo_clienteItemStateChanged(evt);
				}
			});
			
		}
		return jComboBox_tipo_cliente;
	}
	
			
	private void jComboBox_tipo_clienteItemStateChanged(ItemEvent evt) {
		System.out.println("jComboBox_tipo_cliente.itemStateChanged, event="+evt);
		String s=(String)jComboBox_tipo_cliente.getSelectedItem();
		
		if((s.equals("Socio Individual"))||(s.equals("Socio Familiar"))){
			if(s.equals("Socio Familiar")){
				codigo_titular.setVisible(false);
				codigo_label.setVisible(true);
				codigo.setVisible(true);
				//codigo.setEditable(false);
				cuota_label.setVisible(true);
				cuota.setVisible(true);
				calcular_cuota.setVisible(true);
				euros_cuota.setVisible(true);
				cuenta.setVisible(true);
				nº_cuenta.setVisible(false);
				codigo_titular.setVisible(false);
			}else {
				codigo_titular.setVisible(false);
				codigo_label.setVisible(true);
				codigo.setVisible(true);
				//codigo.setEditable(true);
				cuota_label.setVisible(true);
				cuota.setVisible(true);
				calcular_cuota.setVisible(true);
				euros_cuota.setVisible(true);
				cuenta.setVisible(true);
				nº_cuenta.setVisible(true);
			}
		}
		else{
			codigo_titular.setVisible(false);
			codigo_label.setVisible(false);
			codigo.setVisible(false);
			codigo_titular.setVisible(false);
			cuota_label.setVisible(false);
			cuota.setVisible(false);
			calcular_cuota.setVisible(false);
			euros_cuota.setVisible(false);
			cuenta.setVisible(false);
			nº_cuenta.setVisible(false);
		}
		//TODO add your code for jComboBox_tipo_cliente.itemStateChanged
	}
	
	private JLabel getEuros_cuota() {
		if(euros_cuota == null) {
			euros_cuota = new JLabel();
			euros_cuota.setText("\u20ac");
			euros_cuota.setBounds(319, 502, 10, 14);
		}
		return euros_cuota;
	}

	/**
	 * This method initializes fecha_nac	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getFecha_nac() {
		if (fecha_nac == null) {
			fecha_nac = new JTextField();
			fecha_nac.setBounds(new Rectangle(234, 420, 109, 20));
		}
		return fecha_nac;
	}
	public void limpiarinterfaz(){
		dni.setText("");
		nombre.setText("");
		apellido1.setText("");
		apellido2.setText("");
		direccion.setText("");
		poblacion.setText("");
		telefono.setText("");
		fecha_nac.setText("");
		nº_cuenta.setText("");
		cuota.setText("");
		codigo.setText("");
	}
}  //  @jve:decl-index=0:visual-constraint="5,33"

 //  @jve:decl-index=0:visual-constraint="-50,-54"

