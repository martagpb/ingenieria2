package presentacion;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JList;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.GridBagConstraints;

public class JFPagina_ppal_TPV extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanel_Articulos = null;
	private JPanel jPanel_Reservas = null;
	private JPanel jPanel_Clientes = null;
	private JButton jButton_Venta = null;
	private JButton jButton_Devolucion = null;
	private JButton jButton_Reservar = null;
	private JButton jButton_Anular = null;
	private JButton jButton_Alta = null;
	private JButton jButton_Baja = null;
	private JButton jButton_Modificación = null;
	private JLabel jLabel_Articulos = null;
	private JLabel jLabel_Reservas = null;
	private JLabel jLabel_Clientes = null;
	private JPanel jPanel_Separador1 = null;
	private JPanel jPanel_Bienvenida = null;
	private JLabel jLabel_Saludo = null;
	private JLabel jLabel_Usuario = null;
	private JLabel jLabel_Instrucc1 = null;
	private JLabel jLabel_Instrucc2 = null;
	private JLabel jLabel_Instrucc3 = null;
	private JPanel jPanel_Alta_cliente = null;
	private JLabel jLabel_Introd_Datos = null;
	private JLabel jLabel_Nombre = null;
	private JLabel jLabel_Apell1 = null;
	private JLabel jLabel_Apell2 = null;
	private JLabel jLabel_DNI = null;
	private JLabel jLabel_Fech_Nac = null;
	private JLabel jLabel_Direcc = null;
	private JLabel jLabel_Localidad = null;
	private JLabel jLabel_Tlf = null;
	private JTextField jTextField_Nombre = null;
	private JTextField jTextField_Apell1 = null;
	private JTextField jTextField_Apell2 = null;
	private JTextField jTextField_DNI = null;
	private JTextField jTextField_Fech_Nac = null;
	private JTextField jTextField_Direcc = null;
	private JTextField jTextField_Localidad = null;
	private JTextField jTextField_Tlf = null;
	private JButton jButton_Socio = null;
	private JButton jButton_Cliente = null;
	private JPanel jPanel_Venta1 = null;
	private JLabel jLabel_Texto11 = null;
	private JRadioButton jRadioButton_No_Reg1 = null;
	private JRadioButton jRadioButton_Cli_No_Socio1 = null;
	private JRadioButton jRadioButton_Cli_Socio = null;
	private JLabel jLabel_Texto2 = null;
	private JTextField jTextField_Id_prod = null;
	private JButton jButton_Aniadir = null;
	private JButton jButton_Hecho = null;
	private JList jList_Compra = null;
	private JPanel jPanel_Devolucion = null;
	private JLabel jLabel_Texto1 = null;
	private JTextField jTextField_id_art_devuelto = null;
	private JButton jButton_Hecho_Devolucion = null;
	private JPanel jPanel_Baja = null;
	private JLabel jLabel_Texto12 = null;
	private JTextField jTextField_Id_cli_socio_baja = null;
	private JButton jButton_Hecho_Baja = null;
	/**
	 * This is the default constructor
	 */
	public JFPagina_ppal_TPV() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(732, 548);
		this.setContentPane(getJContentPane());
		this.setTitle("Página Principal");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel_Reservas = new JLabel();
			jLabel_Reservas.setText("Gestión de Reservas");
			jLabel_Reservas.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel_Reservas.setBounds(new Rectangle(14, 8, 197, 16));
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJPanel_Articulos(), null);
			jContentPane.add(getJPanel_Reservas(), null);
			jContentPane.add(getJPanel_Clientes(), null);
			jContentPane.add(getJPanel_Separador1(), null);
			jContentPane.add(getJPanel_Bienvenida(), null);
			jContentPane.add(getJPanel_Alta_cliente(), null);
			jContentPane.add(getJPanel_Venta1(), null);
			jContentPane.add(getJPanel_Devolucion(), null);
			jContentPane.add(getJPanel_Baja(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jPanel_Articulos	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_Articulos() {
		if (jPanel_Articulos == null) {
			jLabel_Articulos = new JLabel();
			jLabel_Articulos.setBounds(new Rectangle(13, 7, 198, 16));
			jLabel_Articulos.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel_Articulos.setText("Gestión de Artículos");
			jPanel_Articulos = new JPanel();
			jPanel_Articulos.setLayout(null);
			jPanel_Articulos.setBounds(new Rectangle(16, 15, 225, 137));
			jPanel_Articulos.add(getJButton_Venta(), null);
			jPanel_Articulos.add(getJButton_Devolucion(), null);
			jPanel_Articulos.add(jLabel_Articulos, null);
		}
		return jPanel_Articulos;
	}

	/**
	 * This method initializes jPanel_Reservas	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_Reservas() {
		if (jPanel_Reservas == null) {
			jPanel_Reservas = new JPanel();
			jPanel_Reservas.setLayout(null);
			jPanel_Reservas.setBounds(new Rectangle(15, 165, 225, 136));
			jPanel_Reservas.add(getJButton_Reservar(), null);
			jPanel_Reservas.add(getJButton_Anular(), null);
			jPanel_Reservas.add(jLabel_Reservas, null);
		}
		return jPanel_Reservas;
	}

	/**
	 * This method initializes jPanel_Clientes	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_Clientes() {
		if (jPanel_Clientes == null) {
			jLabel_Clientes = new JLabel();
			jLabel_Clientes.setBounds(new Rectangle(15, 9, 195, 16));
			jLabel_Clientes.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel_Clientes.setText("Gestión de Clientes");
			jPanel_Clientes = new JPanel();
			jPanel_Clientes.setLayout(null);
			jPanel_Clientes.setBounds(new Rectangle(14, 314, 224, 167));
			jPanel_Clientes.add(getJButton_Alta(), null);
			jPanel_Clientes.add(getJButton_Baja(), null);
			jPanel_Clientes.add(getJButton_Modificación(), null);
			jPanel_Clientes.add(jLabel_Clientes, null);
		}
		return jPanel_Clientes;
	}

	/**
	 * This method initializes jButton_Venta	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_Venta() {
		if (jButton_Venta == null) {
			jButton_Venta = new JButton();
			jButton_Venta.setBounds(new Rectangle(13, 47, 107, 31));
			jButton_Venta.setText("Venta");
			jButton_Venta.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					System.out.println("mouseClicked()"); 
					// TODO Auto-generated Event stub mouseClicked()
					jPanel_Bienvenida.setVisible(false);
					jPanel_Alta_cliente.setVisible(false);
					jPanel_Devolucion.setVisible(false);
					jPanel_Baja.setVisible(false);
					jPanel_Venta1.setVisible(true);
				}
			});
		}
		return jButton_Venta;
	}

	/**
	 * This method initializes jButton_Devolucion	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_Devolucion() {
		if (jButton_Devolucion == null) {
			jButton_Devolucion = new JButton();
			jButton_Devolucion.setBounds(new Rectangle(13, 88, 109, 32));
			jButton_Devolucion.setText("Devolución");
			jButton_Devolucion.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					System.out.println("mouseClicked()"); 
					// TODO Auto-generated Event stub mouseClicked()
					jPanel_Bienvenida.setVisible(false);
					jPanel_Alta_cliente.setVisible(false);
					jPanel_Venta1.setVisible(false);
					jPanel_Devolucion.setVisible(true);
				}
			});
		}
		return jButton_Devolucion;
	}

	/**
	 * This method initializes jButton_Reservar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_Reservar() {
		if (jButton_Reservar == null) {
			jButton_Reservar = new JButton();
			jButton_Reservar.setBounds(new Rectangle(14, 46, 106, 29));
			jButton_Reservar.setText("Reservar");
		}
		return jButton_Reservar;
	}

	/**
	 * This method initializes jButton_Anular	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_Anular() {
		if (jButton_Anular == null) {
			jButton_Anular = new JButton();
			jButton_Anular.setBounds(new Rectangle(14, 90, 105, 30));
			jButton_Anular.setText("Anular");
		}
		return jButton_Anular;
	}

	/**
	 * This method initializes jButton_Alta	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_Alta() {
		if (jButton_Alta == null) {
			jButton_Alta = new JButton();
			jButton_Alta.setBounds(new Rectangle(15, 44, 107, 31));
			jButton_Alta.setText("Alta");
			jButton_Alta.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					System.out.println("mouseClicked()"); 
					// TODO Auto-generated Event stub mouseClicked()
					jPanel_Bienvenida.setVisible(false);
					jPanel_Venta1.setVisible(false);
					jPanel_Devolucion.setVisible(false);
					jPanel_Baja.setVisible(false);
					jPanel_Alta_cliente.setVisible(true);
				}
			});
		}
		return jButton_Alta;
	}

	/**
	 * This method initializes jButton_Baja	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_Baja() {
		if (jButton_Baja == null) {
			jButton_Baja = new JButton();
			jButton_Baja.setBounds(new Rectangle(15, 90, 107, 32));
			jButton_Baja.setText("Baja");
			jButton_Baja.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					System.out.println("mouseClicked()"); 
					// TODO Auto-generated Event stub mouseClicked()
					jPanel_Bienvenida.setVisible(false);
					jPanel_Venta1.setVisible(false);
					jPanel_Devolucion.setVisible(false);
					jPanel_Alta_cliente.setVisible(false);
					jPanel_Baja.setVisible(true);
				}
			});
		}
		return jButton_Baja;
	}

	/**
	 * This method initializes jButton_Modificación	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_Modificación() {
		if (jButton_Modificación == null) {
			jButton_Modificación = new JButton();
			jButton_Modificación.setBounds(new Rectangle(15, 135, 106, 32));
			jButton_Modificación.setText("Modificación");
		}
		return jButton_Modificación;
	}

	/**
	 * This method initializes jPanel_Separador1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_Separador1() {
		if (jPanel_Separador1 == null) {
			jPanel_Separador1 = new JPanel();
			jPanel_Separador1.setLayout(new GridBagLayout());
			jPanel_Separador1.setBounds(new Rectangle(242, -2, 4, 516));
			jPanel_Separador1.setBackground(Color.black);
		}
		return jPanel_Separador1;
	}

	/**
	 * This method initializes jPanel_Bienvenida	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_Bienvenida() {
		if (jPanel_Bienvenida == null) {
			jLabel_Instrucc3 = new JLabel();
			jLabel_Instrucc3.setBounds(new Rectangle(45, 137, 183, 16));
			jLabel_Instrucc3.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel_Instrucc3.setText("izquierda");
			jLabel_Instrucc2 = new JLabel();
			jLabel_Instrucc2.setBounds(new Rectangle(45, 109, 287, 16));
			jLabel_Instrucc2.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel_Instrucc2.setText("de las opciones del menú de la ");
			jLabel_Instrucc1 = new JLabel();
			jLabel_Instrucc1.setBounds(new Rectangle(45, 78, 285, 16));
			jLabel_Instrucc1.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel_Instrucc1.setText("Para comenzar seleccione una");
			jLabel_Usuario = new JLabel();
			jLabel_Usuario.setBounds(new Rectangle(160, 30, 59, 16));
			jLabel_Usuario.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel_Usuario.setText("JLabel");
			jLabel_Saludo = new JLabel();
			jLabel_Saludo.setText("Bienvenido");
			jLabel_Saludo.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel_Saludo.setBounds(new Rectangle(45, 30, 105, 16));
			jPanel_Bienvenida = new JPanel();
			jPanel_Bienvenida.setLayout(null);
			jPanel_Bienvenida.setBounds(new Rectangle(307, 145, 393, 179));
			jPanel_Bienvenida.setVisible(true);
			jPanel_Bienvenida.add(jLabel_Saludo, null);
			jPanel_Bienvenida.add(jLabel_Usuario, null);
			jPanel_Bienvenida.add(jLabel_Instrucc1, null);
			jPanel_Bienvenida.add(jLabel_Instrucc2, null);
			jPanel_Bienvenida.add(jLabel_Instrucc3, null);
		}
		return jPanel_Bienvenida;
	}

	/**
	 * This method initializes jPanel_Alta_cliente	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_Alta_cliente() {
		if (jPanel_Alta_cliente == null) {
			jLabel_Tlf = new JLabel();
			jLabel_Tlf.setBounds(new Rectangle(28, 284, 72, 16));
			jLabel_Tlf.setText("Teléfono:");
			jLabel_Localidad = new JLabel();
			jLabel_Localidad.setBounds(new Rectangle(28, 254, 72, 16));
			jLabel_Localidad.setText("Localidad:");
			jLabel_Direcc = new JLabel();
			jLabel_Direcc.setBounds(new Rectangle(28, 224, 72, 16));
			jLabel_Direcc.setText("Dirección:");
			jLabel_Fech_Nac = new JLabel();
			jLabel_Fech_Nac.setBounds(new Rectangle(28, 194, 122, 16));
			jLabel_Fech_Nac.setText("Fecha de Nacimiento:");
			jLabel_DNI = new JLabel();
			jLabel_DNI.setBounds(new Rectangle(28, 165, 72, 16));
			jLabel_DNI.setText("DNI:");
			jLabel_Apell2 = new JLabel();
			jLabel_Apell2.setBounds(new Rectangle(28, 135, 109, 16));
			jLabel_Apell2.setText("Segundo Apellido:");
			jLabel_Apell1 = new JLabel();
			jLabel_Apell1.setBounds(new Rectangle(28, 105, 108, 16));
			jLabel_Apell1.setText("Primer Apellido:");
			jLabel_Nombre = new JLabel();
			jLabel_Nombre.setBounds(new Rectangle(28, 75, 72, 16));
			jLabel_Nombre.setText("Nombre:");
			jLabel_Introd_Datos = new JLabel();
			jLabel_Introd_Datos.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel_Introd_Datos.setBounds(new Rectangle(28, 21, 195, 16));
			jLabel_Introd_Datos.setText("Introduzca los datos:");
			jPanel_Alta_cliente = new JPanel();
			jPanel_Alta_cliente.setLayout(null);
			jPanel_Alta_cliente.setBounds(new Rectangle(269, 1, 434, 496));
			jPanel_Alta_cliente.setVisible(false);
			jPanel_Alta_cliente.add(jLabel_Introd_Datos, null);
			jPanel_Alta_cliente.add(jLabel_Nombre, null);
			jPanel_Alta_cliente.add(jLabel_Apell1, null);
			jPanel_Alta_cliente.add(jLabel_Apell2, null);
			jPanel_Alta_cliente.add(jLabel_DNI, null);
			jPanel_Alta_cliente.add(jLabel_Fech_Nac, null);
			jPanel_Alta_cliente.add(jLabel_Direcc, null);
			jPanel_Alta_cliente.add(jLabel_Localidad, null);
			jPanel_Alta_cliente.add(jLabel_Tlf, null);
			jPanel_Alta_cliente.add(getJTextField_Nombre(), null);
			jPanel_Alta_cliente.add(getJTextField_Apell1(), null);
			jPanel_Alta_cliente.add(getJTextField_Apell2(), null);
			jPanel_Alta_cliente.add(getJTextField_DNI(), null);
			jPanel_Alta_cliente.add(getJTextField_Fech_Nac(), null);
			jPanel_Alta_cliente.add(getJTextField_Direcc(), null);
			jPanel_Alta_cliente.add(getJTextField_Localidad(), null);
			jPanel_Alta_cliente.add(getJTextField_Tlf(), null);
			jPanel_Alta_cliente.add(getJButton_Socio(), null);
			jPanel_Alta_cliente.add(getJButton_Cliente(), null);
			
		}
		return jPanel_Alta_cliente;
	}

	/**
	 * This method initializes jTextField_Nombre	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Nombre() {
		if (jTextField_Nombre == null) {
			jTextField_Nombre = new JTextField();
			jTextField_Nombre.setBounds(new Rectangle(164, 73, 183, 20));
		}
		return jTextField_Nombre;
	}

	/**
	 * This method initializes jTextField_Apell1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Apell1() {
		if (jTextField_Apell1 == null) {
			jTextField_Apell1 = new JTextField();
			jTextField_Apell1.setBounds(new Rectangle(164, 103, 183, 20));
		}
		return jTextField_Apell1;
	}

	/**
	 * This method initializes jTextField_Apell2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Apell2() {
		if (jTextField_Apell2 == null) {
			jTextField_Apell2 = new JTextField();
			jTextField_Apell2.setBounds(new Rectangle(164, 135, 183, 20));
		}
		return jTextField_Apell2;
	}

	/**
	 * This method initializes jTextField_DNI	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_DNI() {
		if (jTextField_DNI == null) {
			jTextField_DNI = new JTextField();
			jTextField_DNI.setBounds(new Rectangle(164, 163, 183, 20));
		}
		return jTextField_DNI;
	}

	/**
	 * This method initializes jTextField_Fech_Nac	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Fech_Nac() {
		if (jTextField_Fech_Nac == null) {
			jTextField_Fech_Nac = new JTextField();
			jTextField_Fech_Nac.setBounds(new Rectangle(164, 194, 183, 20));
		}
		return jTextField_Fech_Nac;
	}

	/**
	 * This method initializes jTextField_Direcc	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Direcc() {
		if (jTextField_Direcc == null) {
			jTextField_Direcc = new JTextField();
			jTextField_Direcc.setBounds(new Rectangle(164, 222, 183, 20));
		}
		return jTextField_Direcc;
	}

	/**
	 * This method initializes jTextField_Localidad	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Localidad() {
		if (jTextField_Localidad == null) {
			jTextField_Localidad = new JTextField();
			jTextField_Localidad.setBounds(new Rectangle(164, 254, 183, 20));
		}
		return jTextField_Localidad;
	}

	/**
	 * This method initializes jTextField_Tlf	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Tlf() {
		if (jTextField_Tlf == null) {
			jTextField_Tlf = new JTextField();
			jTextField_Tlf.setBounds(new Rectangle(164, 282, 183, 20));
		}
		return jTextField_Tlf;
	}

	/**
	 * This method initializes jButton_Socio	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_Socio() {
		if (jButton_Socio == null) {
			jButton_Socio = new JButton();
			jButton_Socio.setBounds(new Rectangle(247, 404, 183, 34));
			jButton_Socio.setText("Dar de alta como socio");
			
		}
		return jButton_Socio;
	}

	/**
	 * This method initializes jButton_Cliente	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_Cliente() {
		if (jButton_Cliente == null) {
			jButton_Cliente = new JButton();
			jButton_Cliente.setBounds(new Rectangle(28, 405, 174, 33));
			jButton_Cliente.setText("Dar de alta como cliente");
		}
		return jButton_Cliente;
	}

	/**
	 * This method initializes jPanel_Venta1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_Venta1() {
		if (jPanel_Venta1 == null) {
			jLabel_Texto2 = new JLabel();
			jLabel_Texto2.setBounds(new Rectangle(32, 211, 259, 22));
			jLabel_Texto2.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel_Texto2.setText("Introduzca el ID del producto:");
			jLabel_Texto11 = new JLabel();
			jLabel_Texto11.setBounds(new Rectangle(28, 19, 288, 23));
			jLabel_Texto11.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel_Texto11.setText("Introduzca el tipo de cliente:");
			jPanel_Venta1 = new JPanel();
			jPanel_Venta1.setLayout(null);
			jPanel_Venta1.setBounds(new Rectangle(269, 3, 434, 494));
			jPanel_Venta1.setVisible(false);
			jPanel_Venta1.add(jLabel_Texto11, null);
			jPanel_Venta1.add(getJRadioButton_No_Reg1(), null);
			jPanel_Venta1.add(getJRadioButton_Cli_No_Socio1(), null);
			jPanel_Venta1.add(getJRadioButton_Cli_Socio(), null);
			jPanel_Venta1.add(jLabel_Texto2, null);
			jPanel_Venta1.add(getJTextField_Id_prod(), null);
			jPanel_Venta1.add(getJButton_Aniadir(), null);
			jPanel_Venta1.add(getJButton_Hecho(), null);
			jPanel_Venta1.add(getJList_Compra(), null);
		}
		return jPanel_Venta1;
	}

	/**
	 * This method initializes jRadioButton_No_Reg1	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButton_No_Reg1() {
		if (jRadioButton_No_Reg1 == null) {
			jRadioButton_No_Reg1 = new JRadioButton();
			jRadioButton_No_Reg1.setBounds(new Rectangle(29, 73, 120, 21));
			jRadioButton_No_Reg1.setText("No Registrado");
		}
		return jRadioButton_No_Reg1;
	}

	/**
	 * This method initializes jRadioButton_Cli_No_Socio1	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButton_Cli_No_Socio1() {
		if (jRadioButton_Cli_No_Socio1 == null) {
			jRadioButton_Cli_No_Socio1 = new JRadioButton();
			jRadioButton_Cli_No_Socio1.setBounds(new Rectangle(30, 107, 133, 21));
			jRadioButton_Cli_No_Socio1.setText("Cliente NO Socio");
		}
		return jRadioButton_Cli_No_Socio1;
	}

	/**
	 * This method initializes jRadioButton_Cli_Socio	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButton_Cli_Socio() {
		if (jRadioButton_Cli_Socio == null) {
			jRadioButton_Cli_Socio = new JRadioButton();
			jRadioButton_Cli_Socio.setBounds(new Rectangle(30, 144, 107, 21));
			jRadioButton_Cli_Socio.setText("Cliente Socio");
		}
		return jRadioButton_Cli_Socio;
	}

	/**
	 * This method initializes jTextField_Id_prod	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Id_prod() {
		if (jTextField_Id_prod == null) {
			jTextField_Id_prod = new JTextField();
			jTextField_Id_prod.setBounds(new Rectangle(291, 213, 129, 20));
		}
		return jTextField_Id_prod;
	}

	/**
	 * This method initializes jButton_Aniadir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_Aniadir() {
		if (jButton_Aniadir == null) {
			jButton_Aniadir = new JButton();
			jButton_Aniadir.setBounds(new Rectangle(33, 255, 132, 27));
			jButton_Aniadir.setText("Añadir producto");
		}
		return jButton_Aniadir;
	}

	/**
	 * This method initializes jButton_Hecho	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_Hecho() {
		if (jButton_Hecho == null) {
			jButton_Hecho = new JButton();
			jButton_Hecho.setBounds(new Rectangle(202, 255, 85, 26));
			jButton_Hecho.setText("Hecho");
		}
		return jButton_Hecho;
	}

	/**
	 * This method initializes jList_Compra	
	 * 	
	 * @return javax.swing.JList	
	 */
	private JList getJList_Compra() {
		if (jList_Compra == null) {
			jList_Compra = new JList();
			jList_Compra.setBounds(new Rectangle(34, 312, 167, 164));
		}
		return jList_Compra;
	}

	/**
	 * This method initializes jPanel_Devolucion	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_Devolucion() {
		if (jPanel_Devolucion == null) {
			jLabel_Texto1 = new JLabel();
			jLabel_Texto1.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel_Texto1.setBounds(new Rectangle(33, 18, 376, 16));
			jLabel_Texto1.setBounds(new Rectangle(32, 14, 376, 22));
			jLabel_Texto1.setText("Introduzca el ID del producto a devolver:");
			jPanel_Devolucion = new JPanel();
			jPanel_Devolucion.setLayout(null);
			jPanel_Devolucion.setBounds(new Rectangle(268, 5, 436, 253));
			jPanel_Devolucion.setSize(new Dimension(436, 253));
			jPanel_Devolucion.setLocation(new Point(268, 155));
			jPanel_Devolucion.add(jLabel_Texto1, null);
			jPanel_Devolucion.add(getJTextField_id_art_devuelto(), null);
			jPanel_Devolucion.add(getJButton_Hecho_Devolucion(), null);
			jPanel_Devolucion.setVisible(false);
		}
		return jPanel_Devolucion;
	}

	/**
	 * This method initializes jTextField_id_art_devuelto	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_id_art_devuelto() {
		if (jTextField_id_art_devuelto == null) {
			jTextField_id_art_devuelto = new JTextField();
			jTextField_id_art_devuelto.setBounds(new Rectangle(33, 55, 166, 20));
			jTextField_id_art_devuelto.setBounds(new Rectangle(33, 64, 166, 20));
		}
		return jTextField_id_art_devuelto;
	}

	/**
	 * This method initializes jButton_Hecho_Devolucion	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_Hecho_Devolucion() {
		if (jButton_Hecho_Devolucion == null) {
			jButton_Hecho_Devolucion = new JButton();
			jButton_Hecho_Devolucion.setText("Hecho");
			jButton_Hecho_Devolucion.setBounds(new Rectangle(33, 101, 75, 27));
			jButton_Hecho_Devolucion.setBounds(new Rectangle(33, 104, 75, 27));
		}
		return jButton_Hecho_Devolucion;
	}

	/**
	 * This method initializes jPanel_Baja	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_Baja() {
		if (jPanel_Baja == null) {
			jLabel_Texto12 = new JLabel();
			jLabel_Texto12.setBounds(new Rectangle(30, 18, 379, 16));
			jLabel_Texto12.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel_Texto12.setText("Introduzca el ID del cliente/socio:");
			jPanel_Baja = new JPanel();
			jPanel_Baja.setLayout(null);
			jPanel_Baja.setSize(new Dimension(436, 253));
			jPanel_Baja.setLocation(new Point(268, 155));
			jPanel_Baja.setVisible(false);
			jPanel_Baja.add(jLabel_Texto12, null);
			jPanel_Baja.add(getJTextField_Id_cli_socio_baja(), null);
			jPanel_Baja.add(getJButton_Hecho_Baja(), null);
		}
		return jPanel_Baja;
	}

	/**
	 * This method initializes jTextField_Id_cli_socio_baja	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Id_cli_socio_baja() {
		if (jTextField_Id_cli_socio_baja == null) {
			jTextField_Id_cli_socio_baja = new JTextField();
			jTextField_Id_cli_socio_baja.setBounds(new Rectangle(30, 59, 259, 20));
		}
		return jTextField_Id_cli_socio_baja;
	}

	/**
	 * This method initializes jButton_Hecho_Baja	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_Hecho_Baja() {
		if (jButton_Hecho_Baja == null) {
			jButton_Hecho_Baja = new JButton();
			jButton_Hecho_Baja.setBounds(new Rectangle(30, 102, 91, 32));
			jButton_Hecho_Baja.setText("Hecho");
		}
		return jButton_Hecho_Baja;
	}

	

}  //  @jve:decl-index=0:visual-constraint="9,12"