
 package interfaces;
 import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
 

public class DateDialog extends JDialog{

    String etiqueta;
 private static final String[] MESES =
 	new String[]{"Enero","Febrero","Marzo","Abril","Mayo","Junio",
 	             "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
 	             
 private static final String[] DIAS =
 	new String[]{"Dom","Lun","Mar","Mie","Jue","Vie","Sab"};
	
 		
	
 private GregorianCalendar calendario;
 
 private JFMenu owner; //frame padre
 private JLabel dias[][];
 private JPanel panelnorte, panelcentro;
 private JLabel currentMonth;
 private JButton proximo, anterior;
 
 
 private int diainicial; //Primer dia del mes
 private int diafinal;   //Ultimo dia del mes
 private int mes;        //Mes actual 
 private int ano;        //Año actual
 	

   public DateDialog(JFMenu owner) {
     super(owner,"Calendario");	
     this.owner = owner;
     calendario = new GregorianCalendar();
	 mes = calendario.get(Calendar.MONTH);
	 ano = calendario.get(Calendar.YEAR);
	 setLayout(new BorderLayout());
	 
	 currentMonth = new JLabel();
         
     panelnorte = new JPanel();
     panelnorte.setLayout(new FlowLayout());  
     	   
     proximo = new JButton(">>");
     proximo.addActionListener(new BH_handler());
     anterior = new JButton("<<");
     anterior.addActionListener(new BH_handler());
     
     panelnorte.add(anterior);
     panelnorte.add(currentMonth);
     panelnorte.add(proximo);
     
     dias = new JLabel[7][7];
     


     for(int i=0; i<7; i++ )
      for(int j=0; j<7; j++ ){	  
	    dias[i][j]=new JLabel(" ",JLabel.RIGHT);
	    if(i!=0) dias[i][j].addMouseListener(new MC_handler());
	    dias[i][j].setForeground( Color.blue );
		dias[i][j].setBackground( Color.white );
		dias[i][j].setBorder( BorderFactory.createEmptyBorder(1,1,1,1) );
	  }
	  
    //  for ( int i=0; i<7; i++ ) 
	//   dias[0][i] = new JLabel(DIAS[i],JLabel.RIGHT);
	
     
     update();
         
	 for(int i=0; i<7; i++)
	   for(int j=0; j<7; j++)
		 panelcentro.add(dias[i][j]);	  		  
	
		  
	 add(panelnorte, BorderLayout.NORTH);
	 add(panelcentro, BorderLayout.CENTER);
	      
	      
    setSize(250,175);
    setVisible(false);
    setResizable(false);
    setLocationRelativeTo(null);
    //pack(); 
    setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
    
    
    
   }
   
   private void update(){
   	
   	
   	panelcentro = new JPanel();
    panelcentro.setLayout(new GridLayout(7,7,5,0));
    panelcentro.setBackground( Color.white );
	panelcentro.setBorder( BorderFactory.createLoweredBevelBorder() );
   	
    currentMonth.setText(MESES[mes]+" "+String.valueOf(ano));

     for(int i=0; i<7; i++ )
	  for(int j=0; j<7; j++ )
	     	dias[i][j].setText(" ");
	  
     
     for ( int i=0; i<7; i++ ) 
     {
	   dias[0][i].setText(DIAS[i]);
	   dias[i][0].setForeground(Color.red);
	   dias[0][i].setForeground(Color.black);
      }
      
      
	    
	 calendario.set( Calendar.DATE, 1 );
	 calendario.set( Calendar.MONTH, mes+Calendar.JANUARY );
	 calendario.set( Calendar.YEAR, ano+1900 ); //1900 año inicial

	 diainicial = calendario.get(Calendar.DAY_OF_WEEK)-Calendar.SUNDAY-1;
	 
	 if(diainicial==-1) diainicial=diainicial+7;
	 
	 diafinal = calendario.getActualMaximum(Calendar.DATE);

	 
	 for(int i=0; i<diafinal; i++)
	 {	  	
	  dias[(i+diainicial)/7+1][(i+diainicial)%7].setText( String.valueOf(i+1) );
	  dias[(i+diainicial)/7+1][(i+diainicial)%7].addMouseListener(new MC_handler());
	 }   	
   	
   }
   
   private class BH_handler implements ActionListener{
   	
   	public void actionPerformed(ActionEvent event){
   	  if(event.getSource()==proximo){
   	  mes++;
   	   if(mes>11){
   	    ano++;
   	    mes=0;
   	   }		
   	  }
   		
   	  if(event.getSource()==anterior){
   	  mes--;
   	   if(mes<0){
   	    ano--;
   	    mes=11;
   	   }	
   	  }	
   	  update();		
   	}
   	
   }
   
      
   private class MC_handler implements MouseListener{
   	
   	public void mouseClicked( MouseEvent e ) {
	JLabel day = (JLabel)e.getSource();
	if ( !day.getText().equals(" ") )
	{	
	 owner.setSelectedDate(String.valueOf(ano)+"-"+String.valueOf(mes+1)+"-"+day.getText());	
	 setVisible(false);
	 	
	 }
	
    }
   	
    public void mouseEntered( MouseEvent e ) {}
    public void mouseExited( MouseEvent e) {}
    public void mousePressed( MouseEvent e ) {}
    public void mouseReleased( MouseEvent e) {}
   	
   }	
   
 	
}