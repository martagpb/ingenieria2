package aplicacion;

import java.math.BigInteger;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;

import dominio.dominio.*;


public class Reservas {
	
	Agente a= new Agente();
	
	public Reservas(){
		
	}
	
	public String devolvertipo(String Dni){

		a.configure();
		BigInteger count=new BigInteger("0");
		String tipo="";
		if(!a.cuentanumeroSocio(Dni).equals(count)){
				tipo="Socio";
		}
		else{
			if(!a.cuentanumeroSocioFamiliar(Dni).equals(count))	tipo="Socio Familiar";
			else{
				if(!a.cuentanumeroCliente(Dni).equals(count))	tipo="Cliente";
				else tipo="No registrado";
			}
		}	
		return tipo;
	}
	
	public double preciopista(String pista,String tipocliente){
		double precio;
		a.configure();
		precio=a.leerPista(pista).getPrecio();
		if(tipocliente.equals("Socio")) precio=(precio*40)/100;
		else{
			if(tipocliente.equals("Socio Familiar")) precio=(precio*40)/100;
		}
		return precio;
	}
	

	public void reserva_pagada(String pista,Date dia_hora,String dni,String tipocliente,double importe){
		a.configure();
		double precio=0.0;
		HorarioId hid= new HorarioId();
		hid.setPista(pista);
		hid.setDia_hora(dia_hora);

		
		Cliente c=new Cliente(dni);
		Horario h=new Horario(hid,c,importe,1);
		a.crearReserva(h);
	}
	
	public void reserva_no_pagada(String pista,Date dia_hora,String dni,String tipocliente,double importe){
		a.configure();
		double precio=0.0;
		HorarioId hid= new HorarioId();
		hid.setPista(pista);
		hid.setDia_hora(dia_hora);
		Cliente c=new Cliente(dni);
		Horario h=new Horario(hid,c,importe,0);
		a.crearReserva(h);
	}
	
	public ArrayList consultar_reservas_dni(String dni){
		ArrayList lista=a.lista_reservas_dni(dni);
		return lista;
	}
	
	
		
		
		
		
		

//	public void reserva_pagada_socio{
//	a.configure();
//	Horario h= new Horario();
//	
//	
//}
	
//	public void reserva_pagada_sociofamiliar{
//	a.configure();
//	Horario h= new Horario();
//	
//	
//}
	
	
}
