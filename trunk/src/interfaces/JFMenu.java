package interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;


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
public class JFMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel club_label = null;
	private JLabel ventas_almacen = null;
	private JPanel panel1_2 = null;
	private JPanel panel2_2 = null;
	private JLabel solicitudes_label = null;
	private JLabel altas_2 = null;
	private JLabel bajas_2 = null;
	private JLabel modificaciones_2 = null;
	private JLabel Reservas_2 = null;
	private JLabel datos_2 = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	JPGestion_Alta panel_uno=new JPGestion_Alta();
	JPGestion_Bajas panel_dos=new JPGestion_Bajas();
	JPGestion_Modificaciones panel_tres=new JPGestion_Modificaciones();
	JPReservas panel_cuatro=new JPReservas();
	JPConsulta_Datos panel_cinco=new JPConsulta_Datos();
	JPVentas_Almacen panel_siete=new JPVentas_Almacen();
	private JLabel inicio_2 = null;
	private DateDialog dialog;
	public int calend;
	Date fecha_actual;
	private JLabel ventas_label = null;
	JDialog n=new JDialog();
	/**
	 * This is the default constructor
	 */
	
	
	
	public JFMenu() {
		super();
		initialize();
		
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(898, 696);
		this.setContentPane(getJContentPane());
		this.setLocationRelativeTo(null);
		this.setTitle("JFrame");
		dialog = new DateDialog(this);
		Calendar calendarioo = GregorianCalendar.getInstance();
        Date fecha = calendarioo.getTime();
        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
        String a=formatoDeFecha.format(fecha);
        try {
                    fecha_actual=formatoDeFecha.parse(a);
                    } catch (ParseException ex) {
                        ex.printStackTrace();
                    }
        
		
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			club_label = new JLabel();
			club_label.setBounds(new Rectangle(16, 20, 344, 33));
			club_label.setFont(new Font("Arial Black", Font.BOLD, 24));
			club_label.setForeground(new Color(0, 153, 0));
			club_label.setHorizontalTextPosition(SwingConstants.CENTER);
			club_label.setHorizontalAlignment(SwingConstants.CENTER);
			club_label.setText("CLUB DEPORTIVO JYM");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(club_label, null);
			panel_uno.setVisible(false);
			jContentPane.add(panel_uno, null);
			panel_dos.setVisible(false);
			jContentPane.add(panel_dos, null);
			panel_tres.setVisible(false);
			jContentPane.add(panel_tres, null);
			panel_cuatro.setVisible(false);
			jContentPane.add(panel_cuatro, null);
			panel_cinco.setVisible(false);
			jContentPane.add(panel_cinco, null);
			panel_siete.setVisible(false);
			jContentPane.add(panel_siete, null);
			jContentPane.add(getPanel2_2(), null);
			jContentPane.add(getPanel1_2(), null);
			
			
		}
		return jContentPane;
	}

	/**
	 * This method initializes panel1_2	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanel1_2() {
		if (panel1_2 == null) {
			ventas_label = new JLabel();
			ventas_label.setBounds(new Rectangle(21, 299, 129, 16));
			ventas_label.setFont(new Font("Dialog", Font.BOLD, 14));
			ventas_label.setText("Venta Articulos");
			ventas_label.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
				public void mouseMoved(java.awt.event.MouseEvent e) {
					//System.out.println("mouseMoved()"); // TODO Auto-generated Event stub mouseMoved()
					ventas_label.setForeground(Color.BLUE);
				}
			});
			
			ventas_almacen = new JLabel();
			ventas_almacen.setFont(new Font("Dialog", Font.BOLD, 14));
			ventas_almacen.setBounds(new Rectangle(21, 328, 144, 22));
			ventas_almacen.setText("Articulos y Almacen");
			ventas_almacen.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
				public void mouseMoved(java.awt.event.MouseEvent e) {
					//System.out.println("mouseMoved()"); // TODO Auto-generated Event stub mouseMoved()
					ventas_almacen.setForeground(Color.BLUE);
				}
			});
			ventas_almacen.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					panel_uno.setVisible(false);
					panel_dos.setVisible(false);
					panel_tres.setVisible(false);
					panel_cuatro.setVisible(false);
					panel_cinco.setVisible(false);
					//panel_seis.setVisible(false);
					panel_siete.setVisible(true);
					panel_siete.setLocation(176,75);
					panel_siete.enviar(dialog);
					calend=1;
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
				}
			});
			
			inicio_2 = new JLabel();
			inicio_2.setBounds(new Rectangle(20, 53, 56, 16));
			inicio_2.setFont(new Font("Dialog", Font.BOLD, 14));
			inicio_2.setText("Inicio");
			inicio_2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
				public void mouseMoved(java.awt.event.MouseEvent e) {
					inicio_2.setForeground(Color.BLUE);
					//System.out.println("mouseMoved()"); // TODO Auto-generated Event stub mouseMoved()
				}
			});
			inicio_2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					panel_uno.setVisible(false);
					panel_dos.setVisible(false);
					panel_tres.setVisible(false);
					panel_cuatro.setVisible(false);
					panel_cinco.setVisible(false);
					panel_siete.setVisible(false);
					setVisible(true);
					
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
				}
			});
			datos_2 = new JLabel();
			datos_2.setBounds(new Rectangle(22, 267, 111, 16));
			datos_2.setFont(new Font("Dialog", Font.BOLD, 14));
			datos_2.setText("Datos Clientes");
			datos_2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
				public void mouseMoved(java.awt.event.MouseEvent e) {
					//System.out.println("mouseMoved()"); // TODO Auto-generated Event stub mouseMoved()
					datos_2.setForeground(Color.BLUE);
				}
			});
			datos_2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					panel_uno.setVisible(false);
					panel_dos.setVisible(false);
					panel_tres.setVisible(false);
					panel_cuatro.setVisible(false);
					panel_siete.setVisible(false);
					panel_cinco.setVisible(true);
					panel_cinco.setLocation(176,75);
					calend=2;
					panel_cinco.enviar(dialog);
					
					
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
				}
			});
			
			Reservas_2 = new JLabel();
			Reservas_2.setBounds(new Rectangle(22, 236, 119, 16));
			Reservas_2.setFont(new Font("Dialog", Font.BOLD, 14));
			Reservas_2.setText("Reservas");
			Reservas_2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
				public void mouseMoved(java.awt.event.MouseEvent e) {
					//System.out.println("mouseMoved()"); // TODO Auto-generated Event stub mouseMoved()
					Reservas_2.setForeground(Color.BLUE);
				}
			});
			Reservas_2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					panel_tres.setVisible(false);
					panel_uno.setVisible(false);
					panel_dos.setVisible(false);
					panel_siete.setVisible(false);
					panel_cinco.setVisible(false);
					panel_cuatro.setVisible(true);
					panel_cuatro.setLocation(176,75);
					calend=0;
					panel_cuatro.enviar(dialog);
					
					
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
				}
			});
			modificaciones_2 = new JLabel();
			modificaciones_2.setBounds(new Rectangle(38, 194, 118, 16));
			modificaciones_2.setFont(new Font("Dialog", Font.BOLD, 14));
			modificaciones_2.setText("Modificaciones");
			modificaciones_2
					.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
						public void mouseMoved(java.awt.event.MouseEvent e) {
							//System.out.println("mouseMoved()"); // TODO Auto-generated Event stub mouseMoved()
							modificaciones_2.setForeground(Color.BLUE);
						}
						
					});
			modificaciones_2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					panel_tres.setVisible(true);
					panel_uno.setVisible(false);
					panel_dos.setVisible(false);
					panel_cuatro.setVisible(false);
					panel_siete.setVisible(false);
					panel_cinco.setVisible(false);
					panel_tres.setLocation(176,75);
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
				}
			});
			bajas_2 = new JLabel();
			bajas_2.setBounds(new Rectangle(39, 161, 72, 16));
			bajas_2.setFont(new Font("Dialog", Font.BOLD, 14));
			bajas_2.setText("Bajas");
			bajas_2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
				public void mouseMoved(java.awt.event.MouseEvent e) {
					//System.out.println("mouseMoved()"); // TODO Auto-generated Event stub mouseMoved()
				    bajas_2.setForeground(Color.BLUE);	
				}
			});
			bajas_2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					panel_dos.setVisible(true);
					panel_uno.setVisible(false);
					panel_tres.setVisible(false);
					panel_cuatro.setVisible(false);
					panel_siete.setVisible(false);
					panel_cinco.setVisible(false);
					panel_dos.setLocation(176,75);
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
				}
			});
			altas_2 = new JLabel();
			altas_2.setBounds(new Rectangle(37, 131, 71, 16));
			altas_2.setFont(new Font("Dialog", Font.BOLD, 14));
			altas_2.setText("Altas");
			altas_2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {   
				public void mouseMoved(java.awt.event.MouseEvent e) {    
					//System.out.println("mouseMoved()"); // TODO Auto-generated Event stub mouseMoved()
					altas_2.setForeground(Color.blue); 

				}
				
			
			});
			
			altas_2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					panel_uno.setVisible(true);
					panel_dos.setVisible(false);
					panel_cuatro.setVisible(false);
					panel_tres.setVisible(false);
					panel_siete.setVisible(false);
					panel_cinco.setVisible(false);
					panel_uno.setLocation(176,75);
     				
//					
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
				}
			});
			
			solicitudes_label = new JLabel();
			solicitudes_label.setBounds(new Rectangle(22, 95, 110, 16));
			solicitudes_label.setFont(new Font("Dialog", Font.BOLD, 14));
			solicitudes_label.setForeground(new Color(0, 153, 0));
			solicitudes_label.setText("Solicitudes:");
			GridLayout gridLayout = new GridLayout();
			gridLayout.setRows(1);
			panel1_2 = new JPanel();
			panel1_2.setLayout(null);
			panel1_2.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));
			panel1_2.setBounds(new Rectangle(2, 74, 174, 586));
			panel1_2.add(solicitudes_label, null);
			panel1_2.add(altas_2, null);
			panel1_2.add(bajas_2, null);
			panel1_2.add(modificaciones_2, null);
			panel1_2.add(Reservas_2, null);
			panel1_2.add(datos_2, null);
			panel1_2.add(inicio_2, null);
			panel1_2.add(ventas_label, null);
			panel1_2.add(ventas_almacen, null);
			panel1_2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
				public void mouseMoved(java.awt.event.MouseEvent e) {
					//System.out.println("mouseMoved()"); // TODO Auto-generated Event stub mouseMoved()
					altas_2.setForeground(Color.black); 
					bajas_2.setForeground(Color.black);
					modificaciones_2.setForeground(Color.black);
					Reservas_2.setForeground(Color.black);
					datos_2.setForeground(Color.black);
					inicio_2.setForeground(Color.black);
					ventas_label.setForeground(Color.black);
					ventas_almacen.setForeground(Color.black);
				}
			});
			
		}
		return panel1_2;
	}

	/**
	 * This method initializes panel2_2	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanel2_2() {
		if (panel2_2 == null) {
			
			jLabel3 = new JLabel();
			jLabel3.setBounds(89, 157, 545, 374);
			jLabel3.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/juegos_anti_estres_deportes_2.jpg"));
			jLabel3.setText("JLabel");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(332, 93, 83, 52));
			jLabel2.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 36));
			jLabel2.setForeground(Color.red);
			jLabel2.setText("JYM");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(193, 34, 337, 43));
			jLabel1.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 36));
			jLabel1.setForeground(Color.red);
			jLabel1.setText("CLUB DEPORTIVO");
			panel2_2 = new JPanel();
			panel2_2.setLayout(null);
			panel2_2.setBounds(new Rectangle(176, 75, 712, 585));
			panel2_2.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));
			panel2_2.add(jLabel1, null);
			panel2_2.add(jLabel2, null);
			panel2_2.add(jLabel3, null);
		}
		return panel2_2;
	}
	

	public void setSelectedDate(String s){
		System.out.println(s);
		System.out.println(calend);
	       switch(calend){
	            case 0: s=comparar_fecha_actual(s);
	            		panel_cuatro.fecha(s);
	                    break;
	            case 1: s=comparar_fecha_actual(s);
	            		panel_siete.fecha(s);
        				break;
	            case 2: s=comparar_fecha_actual2(s);
        				panel_cinco.fecha(s);
        				break;
	            
	            default:
	                    break;
	                    
	        }  
	    }
	
	public String comparar_fecha_actual(String s){
        String strFecha3 = s;
        SimpleDateFormat f3 = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha1 = null;
        try {
            fecha1 = f3.parse(strFecha3);
        } catch (ParseException ex) {
             ex.printStackTrace();
        }
        if(fecha1.before(fecha_actual)){
        	s="";
        	JOptionPane.showMessageDialog(null, " La fecha introducida no es correcta ");
        
        }
        return s;
    }
	
	public String comparar_fecha_actual2(String s){
        String strFecha3 = s;
        SimpleDateFormat f3 = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha1 = null;
        try {
            fecha1 = f3.parse(strFecha3);
        } catch (ParseException ex) {
             ex.printStackTrace();
        }
        if(fecha1.after(fecha_actual)){
        	s="";
        	JOptionPane.showMessageDialog(null, " La fecha introducida no es correcta ");
        
        }
        return s;
    }
	
	
}  //  @jve:decl-index=0:visual-constraint="10,10"
