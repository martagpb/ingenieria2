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

public class JPConsulta_Datos extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel consulta_label = null;
	private JLabel datos_label = null;
	private JLabel dni_label = null;
	private JTextField DNI = null;
	private JButton buscar1 = null;
	private JLabel gastos_label = null;
	private JButton fecha1 = null;
	private JTextField jTextField_fecha1 = null;
	private JButton fecha2 = null;
	private JTextField jTextField_fecha2 = null;
	private JLabel opcional_label = null;
	private JButton aceptar1 = null;
	private JLabel reserva_label = null;
	private JButton fecha3 = null;
	private JTextField jTextField_fecha3 = null;
	private JButton aceptar2 = null;
	public DateDialog dialog1;
	boolean primero=false;
	boolean segundo=false;
	private JLabel reservas_label = null;
	private JLabel gastos_label2 = null;
	/**
	 * This is the default constructor
	 */
	public JPConsulta_Datos() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		gastos_label2 = new JLabel();
		gastos_label2.setBounds(new Rectangle(122, 392, 382, 16));
		gastos_label2.setText("Seleccione las fechas entre las que quiere consultar los gastos:");
		reservas_label = new JLabel();
		reservas_label.setBounds(new Rectangle(121, 256, 238, 16));
		reservas_label.setText("Seleccione la fecha de la reserva:");
		reserva_label = new JLabel();
		reserva_label.setBounds(new Rectangle(86, 218, 275, 16));
		reserva_label.setFont(new Font("Dialog", Font.BOLD, 16));
		reserva_label.setText("Consultar reserva de un cliente:");
		opcional_label = new JLabel();
		opcional_label.setBounds(new Rectangle(325, 484, 64, 16));
		opcional_label.setText(" (Opcional)");
		gastos_label = new JLabel();
		gastos_label.setBounds(new Rectangle(86, 356, 304, 16));
		gastos_label.setFont(new Font("Dialog", Font.BOLD, 16));
		gastos_label.setText("Consultar gastos de un cliente:");
		dni_label = new JLabel();
		dni_label.setBounds(new Rectangle(130, 159, 73, 16));
		dni_label.setText("DNI cliente");
		datos_label = new JLabel();
		datos_label.setBounds(new Rectangle(84, 109, 338, 16));
		datos_label.setFont(new Font("Dialog", Font.BOLD, 16));
		datos_label.setText("Consultar datos personales de un cliente:");
		consulta_label = new JLabel();
		consulta_label.setBounds(new Rectangle(254, 50, 234, 16));
		consulta_label.setFont(new Font("Dialog", Font.BOLD, 18));
		consulta_label.setForeground(new Color(0, 153, 0));
		consulta_label.setText("Cosulta datos de Clientes");
		this.setSize(712, 585);
		this.setLayout(null);

		this.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));
		this.add(consulta_label, null);
		this.add(datos_label, null);
		this.add(dni_label, null);
		this.add(getDNI(), null);
		this.add(getBuscar1(), null);
		this.add(gastos_label, null);
		this.add(getFecha1(), null);
		this.add(getJTextField_fecha1(), null);
		this.add(getFecha2(), null);
		this.add(getJTextField_fecha2(), null);
		this.add(opcional_label, null);
		this.add(getAceptar1(), null);
		this.add(reserva_label, null);
		this.add(getFecha3(), null);
		this.add(getJTextField_fecha3(), null);
		this.add(getAceptar2(), null);
		this.add(reservas_label, null);
		this.add(gastos_label2, null);
	}

	public void enviar(DateDialog  dialog){
		dialog1=dialog;
	}
	
	public void fecha(String s){
		if(primero==true)	jTextField_fecha1.setText(s);
		else{
			if(segundo==true)jTextField_fecha2.setText(s);
			else	jTextField_fecha3.setText(s);	
		}
		
	}
	/**
	 * This method initializes DNI	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getDNI() {
		if (DNI == null) {
			DNI = new JTextField();
			DNI.setBounds(new Rectangle(220, 157, 146, 20));
		}
		return DNI;
	}

	/**
	 * This method initializes buscar1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBuscar1() {
		if (buscar1 == null) {
			buscar1 = new JButton();
			buscar1.setBounds(new Rectangle(412, 153, 111, 27));
			buscar1.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/icono-lupa.jpg"));
			buscar1.setText("Buscar");
			buscar1.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					JFDatos_Cliente datos_clientes=new JFDatos_Cliente();
					datos_clientes.setVisible(true);
					datos_clientes.setLocationRelativeTo(null);
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
				}
			});
		}
		return buscar1;
	}

	/**
	 * This method initializes fecha1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getFecha1() {
		if (fecha1 == null) {
			fecha1 = new JButton();
			fecha1.setBounds(new Rectangle(130, 424, 31, 30));
			fecha1.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/icono_calendario.png"));
			fecha1.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					primero=true;
					segundo=false;
					dialog1.setVisible(true);
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
				}
			});
		}
		return fecha1;
	}

	/**
	 * This method initializes jTextField_fecha1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_fecha1() {
		if (jTextField_fecha1 == null) {
			jTextField_fecha1 = new JTextField();
			jTextField_fecha1.setBounds(new Rectangle(176, 429, 137, 20));
			jTextField_fecha1.setEditable(false);
		}
		return jTextField_fecha1;
	}

	/**
	 * This method initializes fecha2	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getFecha2() {
		if (fecha2 == null) {
			fecha2 = new JButton();
			fecha2.setBounds(new Rectangle(130, 475, 32, 30));
			fecha2.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/icono_calendario.png"));
			fecha2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					segundo=true;
					primero=false;
					dialog1.setVisible(true);
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
				}
			});
		}
		return fecha2;
	}

	/**
	 * This method initializes jTextField_fecha2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_fecha2() {
		if (jTextField_fecha2 == null) {
			jTextField_fecha2 = new JTextField();
			jTextField_fecha2.setBounds(new Rectangle(176, 481, 135, 20));
			jTextField_fecha2.setEditable(false);
		}
		return jTextField_fecha2;
	}

	/**
	 * This method initializes aceptar1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAceptar1() {
		if (aceptar1 == null) {
			aceptar1 = new JButton();
			aceptar1.setBounds(new Rectangle(425, 471, 103, 27));
			aceptar1.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/ok.jpg"));
			aceptar1.setText("Aceptar");
		}
		return aceptar1;
	}

	/**
	 * This method initializes fecha3	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getFecha3() {
		if (fecha3 == null) {
			fecha3 = new JButton();
			fecha3.setBounds(new Rectangle(129, 286, 31, 30));
			fecha3.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/icono_calendario.png"));
			fecha3.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					primero=false;
					segundo=false;
					dialog1.setVisible(true);
					
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
				}
			});
		}
		return fecha3;
	}

	/**
	 * This method initializes jTextField_fecha3	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_fecha3() {
		if (jTextField_fecha3 == null) {
			jTextField_fecha3 = new JTextField();
			jTextField_fecha3.setBounds(new Rectangle(173, 295, 140, 20));
			jTextField_fecha3.setEditable(false);
		}
		return jTextField_fecha3;
	}

	/**
	 * This method initializes aceptar2	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAceptar2() {
		if (aceptar2 == null) {
			aceptar2 = new JButton();
			aceptar2.setBounds(new Rectangle(363, 292, 102, 26));
			aceptar2.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/ok.jpg"));
			aceptar2.setText("Aceptar");
			aceptar2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					JFConsulta_Reserva reserva_cliente=new JFConsulta_Reserva(jTextField_fecha3.getText());
					reserva_cliente.setVisible(true);
					reserva_cliente.setLocationRelativeTo(null);
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
				}
			});
		}
		return aceptar2;
	}

}  //  @jve:decl-index=0:visual-constraint="22,16"
