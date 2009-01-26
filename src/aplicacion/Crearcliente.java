package aplicacion;


import java.util.Date;

import org.hibernate.Query;

import dominio.dominio.*;

public class Crearcliente {

	public Crearcliente(){
		
	}
	public boolean añadircliente(String dni, String nombre, String apellido1, String apellido2,
							  String direccion, String poblacion, String telefono, Date fecha){
		boolean resultado=false;
		if(dni!=null && nombre!=null && apellido1!=null && direccion!=null && poblacion!=null && fecha!=null){ 
			Agente a =new Agente();
			a.configure();		
			Cliente cliente= new Cliente(dni,nombre,apellido1,apellido2,direccion,poblacion,telefono,fecha);
			a.crearCliente(cliente);
			resultado=true;
		}
		else resultado=false;
		
		return resultado;
	}
	
	public boolean añadirSocio(String dni, double cuota, String cuenta){
		boolean resultado=false;
		if(dni !=null && cuota>=0  && cuenta!=null){
			Agente a=new Agente();
			a.configure();
			Date fecha =new Date();
			int n=a.maxSocio()+1;
			SocioId id=new SocioId(n,dni);
			Cliente c=a.leerCliente(dni);
			Socio socio=new Socio(id,c,fecha,cuota,1,cuenta);
			a.crearSocio(socio);
			resultado=true;
		}
		else resultado=false;
		return resultado;
	}
	
	public Cliente cargarSocio(String Dni){
		Agente a= new Agente();
		a.configure();
		Cliente c=a.leerCliente(Dni);
		return c;
	}
	
	public int devolverSocio(String Dni){
		Agente a= new Agente();
		a.configure();
		int n=a.leerSocio(Dni);
		return n;
	}
	public double calcular(int n){
		Agente a=new Agente();
		a.configure();
		Socio s= a.leerSocio(n);
		s.setNumeroMiembros(s.getNumeroMiembros()+1);
		double resul=s.getNumeroMiembros()+1*s.getCuota();
		s.setCuota(resul);
		a.modSocio(s);
		return resul;
	}
	
}

