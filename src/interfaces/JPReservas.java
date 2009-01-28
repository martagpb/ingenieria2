package interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import aplicacion.Cargar_tabla;
import aplicacion.Crearcliente;
import aplicacion.Reservas;
import aplicacion.Recibos;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JList;

import dominio.dominio.Horario;

public class JPReservas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel reservas_label = null;
	private JLabel identificador_label = null;
	private JTextField identificador = null;
	String []nombres={"Hora","Tenis_1","Tenis_2","Padel","Baloncesto","Futbol_sala","Balonmano"};
	String []nombres2={"Pista","Dia y hora","Precio","Pagado"};
	Object datos[][] = {{"10:00","","","","","","","","","","","",""},
	{"11:00","","","","","","","","","","","",""},{"12:00","","","","","","","","","","","",""},{"13:00", "","","","","","","","","","","",""},
	{"16:00","","","","","","","","","","","",""},{"17:00","","","","","","","","","","","",""},{"18:00","","","","","","","","","","","",""},{"19:00","","","","","","","","","","","",""},};  //  @jve:decl-index=0:
	private JScrollPane jScrollPane_reservas = null;
	private JTable jTable_reservas = null;
	private JLabel precio_label = null;
	private JTextField precio = null;
	private JLabel dia_label = null;
	private JButton calendario = null;
	public DateDialog dialog1;
	String DNI;
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
	private JButton tipo = null;
	String tipocliente="No registrado";  //  @jve:decl-index=0:
	Date fecha_actual;  //  @jve:decl-index=0:
	private JLabel jLabel1 = null;
	private JFrame lista_reservas = null;  //  @jve:decl-index=0:visual-constraint="354,646"
	private JPanel jContentPane = null;
	private JLabel jlabel_dni = null;
	private JTextField dni_lista = null;
	private JScrollPane jScrollPane2 = null;
	private JTable jTable_reservas2 = null;
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
		jLabel1 = new JLabel();
		jLabel1.setBounds(new Rectangle(465, 259, 111, 16));
		jLabel1.setText("(Solo para Socios)");
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
		tipo_label.setBounds(new Rectangle(387, 211, 95, 16));
		tipo_label.setText("Tipo de Cliente");
		dia_label = new JLabel();
		dia_label.setBounds(new Rectangle(85, 160, 162, 16));
		dia_label.setText("Escoja el día de la reserva");
		precio_label = new JLabel();
		precio_label.setBounds(new Rectangle(565, 352, 81, 16));
		precio_label.setFont(new Font("Dialog", Font.BOLD, 14));
		precio_label.setText("Precio €/h");
		identificador_label = new JLabel();
		identificador_label.setBounds(new Rectangle(87, 217, 95, 16));
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
		this.add(getTipo(), null);
		this.add(jLabel1, null);
	}

	/**
	 * This method initializes identificador	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getIdentificador() {
		if (identificador == null) {
			identificador = new JTextField();
			identificador.setBounds(new Rectangle(189, 213, 106, 20));
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
			jTable_reservas.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if(jRadioButton2.isSelected()){
					
						if(!fecha.equals("")){
							 jTable_reservas.setValueAt(DNI, jTable_reservas.getSelectedRow(), jTable_reservas.getSelectedColumn());
							 Reservas r=new Reservas();
							 ////////////////////////////////////////////////////////////////////
							 double precio_pista=r.preciopista(jTable_reservas.getColumnName(jTable_reservas.getSelectedColumn()),tipocliente);
						 	precio.setText(precio_pista+"");
						 }
						 else{
							 JOptionPane.showMessageDialog(null, "No hay fecha para la reserva");
						 }
					}
					else{
						Reservas r=new Reservas();
						 double precio_pista=r.preciopista(jTable_reservas.getColumnName(jTable_reservas.getSelectedColumn()),tipocliente);
					 	precio.setText(precio_pista+"");
						
					}
				}
				
			});
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
		if(jRadioButton2.isSelected()){

			Calendar calendarioo = GregorianCalendar.getInstance();
	        Date fecha1 = calendarioo.getTime();
	        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
	        String a=formatoDeFecha.format(fecha1);
	        try {
	              fecha_actual=formatoDeFecha.parse(a);
	        } catch (ParseException ex) {
	                        ex.printStackTrace();
	        }
			comparar_fecha_actual(s);
			Cargar_tabla ct=new Cargar_tabla();
			String [][]tabla=new String [8][6];
			tabla=ct.cargar(s);
			for(int i=0;i<8;i++){
				for(int j=0;j<6;j++){
					//System.out.println("valor tabla: "+tabla[i][j]);
					jTable_reservas.setValueAt(tabla[i][j], i, j+1);
				}
			}
			
		}else{
			fecha.setText(s);
			if(s!=""){
				label_dia.setText("Planificación para el: " +s);
				label_dia.setFont(new Font("Arial Black", Font.PLAIN, 12));
				Cargar_tabla ct=new Cargar_tabla();
				String [][]tabla=new String [8][6];
				tabla=ct.cargar(s);
				for(int i=0;i<8;i++){
					for(int j=0;j<6;j++){
						//System.out.println("valor tabla: "+tabla[i][j]);
						jTable_reservas.setValueAt(tabla[i][j], i, j+1);
					}
				}
			}
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
        else{
        	fecha.setText(s);
			if(s!=""){
				label_dia.setText("Planificación para el: " +s);
				label_dia.setFont(new Font("Arial Black", Font.PLAIN, 12));
			}
        }
        return s;
    }
	


	/**
	 * This method initializes calendario	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getCalendario() {
		if (calendario == null) {
			calendario = new JButton();
			calendario.setBounds(new Rectangle(264, 154, 29, 28));
			calendario.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/Ingenieria_sw2/imagenes/icono_calendario.png"));
			calendario.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
					fecha.setText("");
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
			fecha.setBounds(new Rectangle(312, 160, 97, 20));
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
			tipo_cliente.setBounds(new Rectangle(490, 210, 132, 20));
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
			Pagado.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					String pista=jTable_reservas.getColumnName(jTable_reservas.getSelectedColumn());
					System.out.println("pista: "+pista);
					Date dia2=horario();
			        double importe=Double.parseDouble(precio.getText());
			        Reservas r=new Reservas();
			        r.reserva_pagada(pista,dia2,identificador.getText(),tipo_cliente.getText(),importe);
			        jRadioButton2.setSelected(false);
			        fecha.setText("");
			        identificador.setText("");
			        tipo_cliente.setText("");
			        label_dia.setText("");
			        precio.setText("");
			        int filas =jTable_reservas.getRowCount();//obtengo el numero de filas de mi table
			        int columnas=jTable_reservas.getColumnCount();
			        for(int b=0;b<filas;b++){
			        	for(int c=1;c<columnas;c++){
			        		jTable_reservas.setValueAt("",b,c);
			        	} 
					}

			        
			        
				}
			});
			
		}
		return Pagado;
	}
	
	public Date horario(){
		String dia=fecha.getText();
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
		Date dia2=null;
		try {
			dia2=formatoDeFecha.parse(dia);
        } catch (ParseException ex) {
                        ex.printStackTrace();
        }
        String hora=(String)jTable_reservas.getValueAt(jTable_reservas.getSelectedRow(), 0);
		
		int h, m, s;
		h = Integer.parseInt(hora.charAt(0)+""+hora.charAt(1)) ;
		m = 0;
		s = 0;
		dia2.setHours(h);
		dia2.setMinutes(m);
		dia2.setSeconds(s);
		return dia2;
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
			pendiente.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					// TODO Auto-generated Event stub mouseClicked()
					String pista=jTable_reservas.getColumnName(jTable_reservas.getSelectedColumn());
					System.out.println("pista: "+pista);
					Date dia2=horario();
			        double importe=Double.parseDouble(precio.getText());
			        Reservas r=new Reservas();
			        r.reserva_no_pagada(pista,dia2,identificador.getText(),tipo_cliente.getText(),importe);
			        /////////////////////////////////////////////////recibo
			        String fecha1=fecha.getText();
			        Date dia3=null;
			        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
			        try {
			              dia3=formatoDeFecha.parse(fecha1);
			        } catch (ParseException ex) {
			                        ex.printStackTrace();
			        }
			        Recibos rec=new Recibos();
			        System.out.println("1111111");
			        rec.realizar_recibos(pista,fecha.getText(),identificador.getText(),tipo_cliente.getText(),importe);
			        //rec.realizar_detalle_recibo(pista,dia3,identificador.getText(),tipo_cliente.getText(),importe);
  
			        
			        
			        
			        
			        jRadioButton2.setSelected(false);
			        fecha.setText("");
			        identificador.setText("");
			        tipo_cliente.setText("");
			        label_dia.setText("");
			        precio.setText("");
			        int filas =jTable_reservas.getRowCount();//obtengo el numero de filas de mi table
			        int columnas=jTable_reservas.getColumnCount();
			        for(int b=0;b<filas;b++){
			        	for(int c=1;c<columnas;c++){
			        		jTable_reservas.setValueAt("",b,c);
			        	} 
					}
				}
			});
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
			eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
					jTable_reservas.setValueAt("", jTable_reservas.getSelectedRow(), jTable_reservas.getSelectedColumn());
					
				}
			});
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
			jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					jRadioButton2.setSelected(false);
					Pagado.setVisible(false);
					pendiente.setVisible(false);
					factura.setVisible(false);
					jLabel.setVisible(false);
					eliminar.setVisible(false);
					fecha.setText("");
					
					Imprimir.setVisible(true);
					
				}
			});
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
			jRadioButton2.setBounds(new Rectangle(408, 110, 88, 21));
			jRadioButton2.setText("Reservar");
			jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					jRadioButton1.setSelected(false);
					Imprimir.setVisible(false);
					fecha.setText("");
					
					Pagado.setVisible(true);
					pendiente.setVisible(true);
					factura.setVisible(true);
					jLabel.setVisible(true);
					precio_label.setVisible(true);
					precio.setVisible(true);
					eliminar.setVisible(true);
				}
			});
		}
		return jRadioButton2;
	}

	/**
	 * This method initializes tipo	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getTipo() {
		if (tipo == null) {
			tipo = new JButton();
			tipo.setBounds(new Rectangle(304, 210, 30, 23));
			tipo.setIcon(new ImageIcon("F:/universidad/5º/Ingernieria sw II/repositorio2/ultimo/imagenes/ok.jpg"));
			tipo.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
					Reservas r=new Reservas();
					DNI=identificador.getText();
				    tipocliente=r.devolvertipo(DNI);
					tipo_cliente.setText(tipocliente);
					if(jRadioButton1.isSelected()&& fecha.getText().equals("")){
						getLista_reservas();
						dni_lista.setText(identificador.getText());
						ArrayList lista=r.consultar_reservas_dni(dni_lista.getText());
						DefaultTableModel modelo = new DefaultTableModel();
						jTable_reservas2.setModel(modelo);
						modelo.setColumnIdentifiers(nombres2);
						int indice;
						for (int i = 0; i < lista.size(); i++) {
							indice=jTable_reservas2.getRowCount();
							
							Horario h=(Horario)lista.get(i);
							Timestamp dia = new Timestamp(h.getId().getDia_hora().getTime());
							String fecha_hora=""+dia;
							String []fila={(String)h.getId().getPista(),fecha_hora,(String)(h.getImporte()+""),(String)(h.isPagado()+"")};
							jTable_reservas2.setModel(modelo);
							for(int j=0;j<4;j++){
								System.out.println(indice);
								System.out.println(j);
								System.out.println(fila[j]);
								modelo.addRow(fila);
								jTable_reservas2.setValueAt(fila[j], indice, j);
							}
														
						}
						
					}
				}
			});
		}
		return tipo;
	}

	/**
	 * This method initializes lista_reservas	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	private JFrame getLista_reservas() {
		if (lista_reservas == null) {
			lista_reservas = new JFrame();
			lista_reservas.setVisible(true);
			lista_reservas.setSize(new Dimension(558, 487));
			lista_reservas.setContentPane(getJContentPane());
		}
		return lista_reservas;
	}

	/**
	 * This method initializes jContentPane	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jlabel_dni = new JLabel();
			jlabel_dni.setBounds(new Rectangle(58, 45, 228, 16));
			jlabel_dni.setFont(new Font("Dialog", Font.BOLD, 14));
			jlabel_dni.setText("Reservas del Cliente con DNI: ");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jlabel_dni, null);
			jContentPane.add(getDni_lista(), null);
			jContentPane.add(getJScrollPane2(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes dni_lista	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getDni_lista() {
		if (dni_lista == null) {
			dni_lista = new JTextField();
			dni_lista.setBounds(new Rectangle(305, 44, 150, 20));
		}
		return dni_lista;
	}

	/**
	 * This method initializes jScrollPane2	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane2() {
		if (jScrollPane2 == null) {
			jScrollPane2 = new JScrollPane();
			jScrollPane2.setBounds(new Rectangle(60,100, 435, 300));
			jScrollPane2.setViewportView(getJTable_reservas2());
		}
		return jScrollPane2;
	}

	/**
	 * This method initializes jTable_reservas2	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTable_reservas2() {
		if (jTable_reservas2 == null) {
			jTable_reservas2 = new JTable();
		}
		return jTable_reservas2;
	}

}
