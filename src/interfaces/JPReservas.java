package interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JPReservas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel reservas_label = null;
	private JLabel identificador_label = null;
	private JTextField identificador = null;
	String []nombres={"Hora","Tenis_1","Tenis_2","Padel","Baloncesto","Futbol_sala","Balonmano"};
	Object datos[][] = {{"9:00","", "","","","","","","","","","",""}, {"10:00","","","","","","","","","","","",""},
	{"11:00","","","","","","","","","","","",""},{"12:00","","","","","","","","","","","",""},{"13:00", "","","","","","","","","","","",""},
	{"16:00","","","","","","","","","","","",""},{"17:00","","","","","","","","","","","",""},{"18:00","","","","","","","","","","","",""},{"19:00","","","","","","","","","","","",""},};  //  @jve:decl-index=0:
	private JScrollPane jScrollPane_reservas = null;
	private JTable jTable_reservas = null;
	private JLabel precio_label = null;
	private JTextField precio = null;
	private JLabel dia_label = null;
	private JButton calendario = null;
	public DateDialog dialog1;
	
    int calendario2;
	private JTextField fecha = null;
	private JLabel tipo_label = null;
	private JTextField tipo_cliente = null;
	private JButton Pagado = null;
	private JButton pendiente = null;
	private JLabel jLabel = null;
	private JButton eliminar = null;
	private JButton Imprimir = null;
	private JLabel label_dia = null;
	private JButton factura = null;
	private JLabel label_opcion = null;
	private JRadioButton jRadioButton1 = null;
	private JRadioButton jRadioButton2 = null;
	/**
	 * This is the default constructor
	 */
	public JPReservas() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		label_opcion = new JLabel();
		label_opcion.setBounds(new Rectangle(82, 112, 165, 16));
		label_opcion.setText("Elija la opción que desee:");
		label_dia = new JLabel();
		label_dia.setBounds(new Rectangle(48, 340, 320, 16));
		label_dia.setText("");
		jLabel = new JLabel();
		jLabel.setBounds(new Rectangle(269, 260, 113, 16));
		jLabel.setText(" (Solo para Socios)");
		tipo_label = new JLabel();
		tipo_label.setBounds(new Rectangle(379, 213, 95, 16));
		tipo_label.setText("Tipo de Cliente");
		dia_label = new JLabel();
		dia_label.setBounds(new Rectangle(85, 160, 267, 16));
		dia_label.setText("Escoja el día en el que se efectuará la reserva");
		precio_label = new JLabel();
		precio_label.setBounds(new Rectangle(565, 352, 81, 16));
		precio_label.setFont(new Font("Dialog", Font.BOLD, 14));
		precio_label.setText("Precio €/h");
		identificador_label = new JLabel();
		identificador_label.setBounds(new Rectangle(87, 217, 115, 16));
		identificador_label.setText("DNI del cliente");
		reservas_label = new JLabel();
		reservas_label.setBounds(new Rectangle(201, 44, 283, 16));
		reservas_label.setFont(new Font("Dialog", Font.BOLD, 18));
		reservas_label.setForeground(new Color(0, 153, 0));
		reservas_label.setText("Reserva o Consulta de Pistas");
		this.setSize(712, 585);
		this.setLayout(null);
		this.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));
		this.add(reservas_label, null);
		this.add(identificador_label, null);
		this.add(getIdentificador(), null);
		this.add(getJScrollPane_reservas(), null);
		this.add(precio_label, null);
		this.add(getPrecio(), null);
		this.add(dia_label, null);
		this.add(getCalendario(), null);
		this.add(getFecha(), null);
		this.add(tipo_label, null);
		this.add(getTipo_cliente(), null);
		this.add(getPagado(), null);
		this.add(getPendiente(), null);
		this.add(jLabel, null);
		this.add(getEliminar(), null);
		this.add(getImprimir(), null);
		this.add(label_dia, null);
		this.add(getFactura(), null);
		this.add(label_opcion, null);
		this.add(getJRadioButton1(), null);
		this.add(getJRadioButton2(), null);
	}

	/**
	 * This method initializes identificador	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getIdentificador() {
		if (identificador == null) {
			identificador = new JTextField();
			identificador.setBounds(new Rectangle(206, 213, 130, 20));
		}
		return identificador;
	}

	/**
	 * This method initializes jScrollPane_reservas	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane_reservas() {
		if (jScrollPane_reservas == null) {
			jScrollPane_reservas = new JScrollPane();
			jScrollPane_reservas.setBounds(new Rectangle(30, 365, 485, 130));
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
			jTable_reservas = new JTable(datos,nombres);
		}
		return jTable_reservas;
	}
	

	/**
	 * This method initializes precio	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getPrecio() {
		if (precio == null) {
			precio = new JTextField();
			precio.setBounds(new Rectangle(564, 383, 85, 20));
			precio.setEditable(false);
		}
		return precio;
	}

	public void enviar(DateDialog  dialog){
		dialog1=dialog;
	}
	
	public void fecha(String s){
		fecha.setText(s);
		if(s!=""){
			label_dia.setText("Planificación para el: " +s);
			label_dia.setFont(new Font("Arial Black", Font.PLAIN, 12));
		}

	}
	


	/**
	 * This method initializes calendario	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getCalendario() {
		if (calendario == null) {
			calendario = new JButton();
			calendario.setBounds(new Rectangle(367, 155, 29, 28));
			calendario.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/icono_calendario.png"));
			calendario.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
					dialog1.setVisible(true);
					

				}
			});
		}
		return calendario;
	}

	/**
	 * This method initializes fecha	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getFecha() {
		if (fecha == null) {
			fecha = new JTextField();
			fecha.setBounds(new Rectangle(415, 161, 97, 20));
			fecha.setEditable(false);
		}
		return fecha;
	}

	/**
	 * This method initializes tipo_cliente	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTipo_cliente() {
		if (tipo_cliente == null) {
			tipo_cliente = new JTextField();
			tipo_cliente.setBounds(new Rectangle(483, 210, 132, 20));
			tipo_cliente.setEditable(false);
		}
		return tipo_cliente;
	}

	/**
	 * This method initializes Pagado	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getPagado() {
		if (Pagado == null) {
			Pagado = new JButton();
			Pagado.setBounds(new Rectangle(89, 284, 110, 29));
			Pagado.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/ok.jpg"));
			Pagado.setText("Pagado");
		}
		return Pagado;
	}

	/**
	 * This method initializes pendiente	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getPendiente() {
		if (pendiente == null) {
			pendiente = new JButton();
			pendiente.setBounds(new Rectangle(240, 284, 173, 29));
			pendiente.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/precauciones.jpg"));
			pendiente.setText("Pendiente de Pagar");
		}
		return pendiente;
	}

	/**
	 * This method initializes eliminar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getEliminar() {
		if (eliminar == null) {
			eliminar = new JButton();
			eliminar.setBounds(new Rectangle(533, 438, 154, 28));
			eliminar.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/error2.JPG"));
			eliminar.setText("Eliminar Reserva");
		}
		return eliminar;
	}

	/**
	 * This method initializes Imprimir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getImprimir() {
		if (Imprimir == null) {
			Imprimir = new JButton();
			Imprimir.setBounds(new Rectangle(330, 508, 183, 31));
			Imprimir.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/imprimir.gif"));
			Imprimir.setBounds(new Rectangle(304, 506, 207, 31));
			Imprimir.setText("Imprimir Reservas");
		}
		return Imprimir;
	}

	/**
	 * This method initializes factura	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getFactura() {
		if (factura == null) {
			factura = new JButton();
			factura.setBounds(new Rectangle(449, 285, 141, 29));
			factura.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/ok.jpg"));
			factura.setText("Emitir factura");
		}
		return factura;
	}

	/**
	 * This method initializes jRadioButton1	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButton1() {
		if (jRadioButton1 == null) {
			jRadioButton1 = new JRadioButton();
			jRadioButton1.setBounds(new Rectangle(281, 110, 89, 21));
			jRadioButton1.setText("Consultar");
		}
		return jRadioButton1;
	}

	/**
	 * This method initializes jRadioButton2	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButton2() {
		if (jRadioButton2 == null) {
			jRadioButton2 = new JRadioButton();
			jRadioButton2.setBounds(new Rectangle(426, 110, 88, 21));
			jRadioButton2.setText("Reservar");
		}
		return jRadioButton2;
	}

}
