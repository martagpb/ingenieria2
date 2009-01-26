package dominio.dominio;

// Generated 08-ene-2009 19:15:20 by Hibernate Tools 3.2.4.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente implements java.io.Serializable {

	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String direccion;
	private String localidad;
	private String telefono;
	private Date fechaNac;
	private Set socios = new HashSet(0);

	public Cliente() {
	}

	public Cliente(String dni, String nombre, String apellido1,
			String direccion, String localidad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.direccion = direccion;
		this.localidad = localidad;
	}

	public Cliente(String dni, String nombre, String apellido1,
			String apellido2, String direccion, String localidad,
			String telefono, Date fechaNac, Set socios) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.localidad = localidad;
		this.telefono = telefono;
		this.fechaNac = fechaNac;
		this.socios = socios;
	}
	
	public Cliente(String dni, String nombre, String apellido1,String apellido2,
			String direccion, String localidad, String telefono, Date fecha) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2=apellido2;
		this.direccion = direccion;
		this.localidad = localidad;
		this.telefono=telefono;
		this.fechaNac=fecha;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return this.apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return this.apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNac() {
		return this.fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public Set getSocios() {
		return this.socios;
	}

	public void setSocios(Set socios) {
		this.socios = socios;
	}

}
