package aplicacion;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dominio.dominio.Agente;
import dominio.dominio.DetalleRecibo;
import dominio.dominio.Recibo;
import dominio.dominio.Socio;
import dominio.dominio.SocioId;

public class Recibos {

	Agente a= new Agente();
	
	public Recibos(){
		
	}
	
	public void realizar_recibos(String pista,String dia,String dni,String tipocliente,double importe){
		a.configure();
		if(tipocliente.equals("Socio")){
			int cod_soc=a.leerSocio(dni);
			System.out.println("   "+cod_soc);
			SocioId sid=new SocioId(cod_soc,dni);
			Socio s=new Socio(sid);
			String dia2;
			dia2=dia.substring(0, 7);
			dia2=dia2+"01";
			SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
			Date dia3=null;
			try {
				dia3=formatoDeFecha.parse(dia2);
	        } catch (ParseException ex) {
	                        ex.printStackTrace();
	        }
	        String cuenta=a.leerSocio2(cod_soc,dni);
	        System.out.println(dia3);
	        int id=a.leerRecibo(dia3);
	        double importe_anterior=a.leerRecibo_importe(dia3);
	        double importe2=importe+importe_anterior;
			Recibo rec=new Recibo(id,dia3,s,cuenta,importe2);
			a.modRecibo(rec);
			DetalleRecibo det_rec=new DetalleRecibo(rec,pista,importe,dni);
			a.crearDetRecibo(det_rec);
			
		}
		
		else{
			int cod_soc=a.leerSocioFamiliar(dni);
			String dni_socio=a.leerSocio(cod_soc);
			SocioId sid=new SocioId(cod_soc,dni_socio);
			Socio s=new Socio(sid);
			String dia2;
			dia2=dia.substring(0, 7);
			dia2=dia2+"01";
			SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
			Date dia3=null;
			try {
				dia3=formatoDeFecha.parse(dia2);
		    } catch (ParseException ex) {
		              ex.printStackTrace();
		    }
		    String cuenta=a.leerSocio2(cod_soc,dni_socio);
		    System.out.println(dia3);
		    int id=a.leerRecibo(dia3);
		    double importe_anterior=a.leerRecibo_importe(dia3);
		    double importe2=importe+importe_anterior;
			Recibo rec=new Recibo(id,dia3,s,cuenta,importe2);
			a.modRecibo(rec);
			DetalleRecibo det_rec=new DetalleRecibo(rec,pista,importe,dni);
			a.crearDetRecibo(det_rec);
				
			}
		}
	}
	
	
