package interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPVentas_Almacen extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel label1 = null;
	private JLabel ventas = null;
	private JButton fecha1 = null;
	private JTextField jTextField_fecha1 = null;
	private JButton fecha2 = null;
	private JTextField jTextField_fecha2 = null;
	private JLabel jLabel_opcional = null;
	private JButton aceptar1 = null;
	private JLabel ventas_label = null;
	private JLabel Almacen_label = null;
	private JLabel Producto = null;
	private JComboBox jComboBox_productos = null;
	private JLabel unidades_label = null;
	private JLabel unidades = null;
	private JLabel agotados_label = null;
	private JButton aceptar_stock = null;
	public DateDialog dialog1;

	boolean primero=false;
	/**
	 * This is the default constructor
	 */
	public JPVentas_Almacen() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		agotados_label = new JLabel();
		agotados_label.setBounds(new Rectangle(106, 453, 343, 16));
		agotados_label.setText("Consulte los productos agotados o con pocas existencias:");
		unidades = new JLabel();
		unidades.setBounds(new Rectangle(395, 382, 38, 24));
		unidades.setText("");
		unidades_label = new JLabel();
		unidades_label.setBounds(new Rectangle(439, 386, 59, 18));
		unidades_label.setText("Unidades");
		Producto = new JLabel();
		Producto.setBounds(new Rectangle(104, 388, 62, 18));
		Producto.setText("Producto");
		Almacen_label = new JLabel();
		Almacen_label.setBounds(new Rectangle(55, 335, 236, 16));
		Almacen_label.setFont(new Font("Dialog", Font.BOLD, 16));
		Almacen_label.setText("Consulta Stock del Almacen");
		ventas_label = new JLabel();
		ventas_label.setBounds(new Rectangle(36, 106, 178, 14));
		ventas_label.setFont(new Font("Dialog", Font.BOLD, 16));
		ventas_label.setText("Consulta de Ventas");
		jLabel_opcional = new JLabel();
		jLabel_opcional.setBounds(new Rectangle(309, 246, 61, 16));
		jLabel_opcional.setText("(Opcional)");
		ventas = new JLabel();
		ventas.setBounds(new Rectangle(77, 142, 396, 16));
		ventas.setText("Seleccione las fechas entre las que quiere consultar las ventas:");
		label1 = new JLabel();
		label1.setText("Gestión de Ventas y Almacén");
		label1.setFont(new Font("Dialog", Font.BOLD, 18));
		label1.setForeground(new Color(0, 153, 0));
		label1.setBounds(new Rectangle(204, 43, 287, 26));
		this.setSize(712, 663);
		this.setLayout(null);
		this.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));
		this.add(label1, null);
		this.add(ventas, null);
		this.add(getFecha1(), null);
		this.add(getJTextField_fecha1(), null);
		this.add(getFecha2(), null);
		this.add(getJTextField_fecha2(), null);
		this.add(jLabel_opcional, null);
		this.add(getAceptar1(), null);
		this.add(ventas_label, null);
		this.add(Almacen_label, null);
		this.add(Producto, null);
		this.add(getJComboBox_productos(), null);
		this.add(unidades_label, null);
		this.add(unidades, null);
		this.add(agotados_label, null);
		this.add(getAceptar_stock(), null);
	}

	
	public void enviar(DateDialog  dialog){
		dialog1=dialog;
	}
	
	public void fecha(String s){
		if(primero==true)	jTextField_fecha1.setText(s);
		else	jTextField_fecha2.setText(s);
		
	}
	/**
	 * This method initializes fecha1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	
	private JButton getFecha1() {
		if (fecha1 == null) {
			fecha1 = new JButton();
			fecha1.setBounds(new Rectangle(119, 195, 31, 30));
			fecha1.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/icono_calendario.png"));
		}
		fecha1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
				primero=true;
				dialog1.setVisible(true);


			}
		});
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
			jTextField_fecha1.setBounds(new Rectangle(164, 201, 131, 20));
			jTextField_fecha1.setEditable(false);
			jTextField_fecha1.setEnabled(true);
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
			fecha2.setBounds(new Rectangle(118, 242, 32, 28));
			fecha2.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/icono_calendario.png"));
			fecha2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
					primero=false;
					dialog1.setVisible(true);


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
			jTextField_fecha2.setBounds(new Rectangle(164, 245, 135, 20));
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
			aceptar1.setBounds(new Rectangle(435, 218, 114, 29));
			aceptar1.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/ok.jpg"));
			aceptar1.setText("Aceptar");
		}
		return aceptar1;
	}

	/**
	 * This method initializes jComboBox_productos	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox_productos() {
		if (jComboBox_productos == null) {
			jComboBox_productos = new JComboBox();
			jComboBox_productos.setBounds(new Rectangle(183, 383, 168, 27));
		}
		return jComboBox_productos;
	}

	/**
	 * This method initializes aceptar_stock	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAceptar_stock() {
		if (aceptar_stock == null) {
			aceptar_stock = new JButton();
			aceptar_stock.setBounds(new Rectangle(463, 444, 118, 28));
			aceptar_stock.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/ok.jpg"));
			aceptar_stock.setText("Aceptar");
		}
		return aceptar_stock;
	}

}  //  @jve:decl-index=0:visual-constraint="10,16"
