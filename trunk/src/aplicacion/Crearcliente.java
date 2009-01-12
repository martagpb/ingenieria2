package aplicacion;


import java.util.Date;

import dominio.dominio.*;

public class Crearcliente {

	public Crearcliente(){
		
	}
	public void añadircliente(String dni, String nombre, String apellido1, String apellido2,
							  String direccion, String poblacion, String telefono){
		
		Agente a =new Agente();
		a.configure();		
		Cliente cliente=new Cliente(dni,nombre,apellido1,apellido2,direccion,poblacion,telefono);
		a.crearCliente(cliente);
	}
	
	public void añadirSocio(String dni, double cuota, String cuenta){
		Agente a=new Agente();
		a.configure();
		Date fecha =new Date();
		SocioId id=new SocioId(1,dni);
		Cliente c=a.leerCliente(dni);
		Socio socio=new Socio(id,c,fecha,cuota,cuenta);
		a.crearSocio(socio);
		
	}
	
}
