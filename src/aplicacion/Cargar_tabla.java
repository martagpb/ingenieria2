package aplicacion;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dominio.dominio.Agente;

public class Cargar_tabla {

	Agente a= new Agente();
	
		public Cargar_tabla(){
			
		}
		
		public String[][] cargar(String s){
			a.configure();
			String [][]dni=new String[8][6];
    		int indice=10;
	        for(int i=0;i<8;i++){
	        	BigInteger count=new BigInteger("0");
	        	SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
				Date dia3=null;
				try {
					dia3=formatoDeFecha.parse(s);
					dia3.setHours(indice);
		        	System.out.println(dia3);
		        } catch (ParseException ex) {
		                        ex.printStackTrace();
		        }
		       
	    		if(!a.hay_reserva(dia3,"Tenis_1").equals(count)){
	    			dni[i][0]=a.leerReserva(dia3,"Tenis_1");
	    			System.out.println(dni[i][0]);
	    		}
	    		else{
	    			dni[i][0]=" ";
	    			System.out.println(dni[i][0]);
	    		}
	    		if(!a.hay_reserva(dia3,"Tenis_2").equals(count)){
	    			dni[i][1]=a.leerReserva(dia3,"Tenis_2");
	    			System.out.println(dni[i][1]);
	    		}
	    		else{
	    			dni[i][1]=" ";
	    			System.out.println(dni[i][1]);
	    		}
	    		if(!a.hay_reserva(dia3,"Padel").equals(count)){
	    			dni[i][2]=a.leerReserva(dia3,"Padel");
	    			System.out.println(dni[i][2]);
	    		}
	    		else{
	    			dni[i][2]=" ";
	    			System.out.println(dni[i][2]);
	    		}
	    		if(!a.hay_reserva(dia3,"Baloncesto").equals(count)){
	    			dni[i][3]=a.leerReserva(dia3,"Baloncesto");
	    			System.out.println(dni[i][3]);
	    		}
	    		else{
	    			dni[i][3]=" ";
	    			System.out.println(dni[i][3]);
	    		}
	    		if(!a.hay_reserva(dia3,"Futbol_sala").equals(count)){
	    			dni[i][4]=a.leerReserva(dia3,"Futbol_sala");
	    			System.out.println(dni[i][4]);
	    		}
	    		else{
	    			dni[i][4]=" ";
	    			System.out.println(dni[i][4]);
	    		}
	    		if(!a.hay_reserva(dia3,"Balonmano").equals(count)){
	    			System.out.println("mi mama esta aqui");
	    			dni[i][5]=a.leerReserva(dia3,"Balonmano");
	    			System.out.println(dni[i][5]);
	    		}
	    		else{
	    			if(indice==19){
	    				System.out.println("mi mama 2");
	    			}
	    			dni[i][5]=" ";
	    			System.out.println(dni[i][5]);
	    		}
	    		
	    		if(indice==13){
	    			indice=15;
	    		}
	    		indice++;
	
	        }
	        return dni;
	        
		}
}
