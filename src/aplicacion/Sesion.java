package aplicacion;

import dominio.dominio.Agente;
import dominio.dominio.Personal;
import dominio.*;
public class Sesion {
	
	String usuario;
	String password;
	
	public Sesion(){	
	}
	public boolean comprobarSesion(String user, String pass){
		boolean devolver=false;
		Agente a =new Agente();
		a.configure();
		Personal p =a.leerPersonal(user, pass);
		if (p==null){
			devolver=false;
		}
		else{
			if(p.getClave().equalsIgnoreCase(pass))devolver =true;
		
			else devolver=false;
		}
		/*Personal p=new Personal("admin","hola");
		a.crearPersonal(p);*/
		return devolver;	
	}

}
