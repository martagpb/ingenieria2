package dominio.dominio;

// Generated 08-ene-2009 19:15:20 by Hibernate Tools 3.2.4.CR1

import java.util.Date;

/**
 * Socio generated by hbm2java
 */
public class Socio implements java.io.Serializable {

	private SocioId id;
	private Cliente cliente;
	private Date fechaIngreso;
	private double cuota;
	private Integer numeroMiembros;
	private String cuentaBanco;
	private SocioFamiliar socioFamiliar;

	public Socio() {
	}

	public Socio(SocioId id, Cliente cliente, Date fechaIngreso, double cuota,
			String cuentaBanco) {
		this.id = id;
		this.cliente = cliente;
		this.fechaIngreso = fechaIngreso;
		this.cuota = cuota;
		this.cuentaBanco = cuentaBanco;
	}

	public Socio(SocioId id, Cliente cliente, Date fechaIngreso, double cuota,
			Integer numeroMiembros, String cuentaBanco,
			SocioFamiliar socioFamiliar) {
		this.id = id;
		this.cliente = cliente;
		this.fechaIngreso = fechaIngreso;
		this.cuota = cuota;
		this.numeroMiembros = numeroMiembros;
		this.cuentaBanco = cuentaBanco;
		this.socioFamiliar = socioFamiliar;
	}

	public SocioId getId() {
		return this.id;
	}

	public void setId(SocioId id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public double getCuota() {
		return this.cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public Integer getNumeroMiembros() {
		return this.numeroMiembros;
	}

	public void setNumeroMiembros(Integer numeroMiembros) {
		this.numeroMiembros = numeroMiembros;
	}

	public String getCuentaBanco() {
		return this.cuentaBanco;
	}

	public void setCuentaBanco(String cuentaBanco) {
		this.cuentaBanco = cuentaBanco;
	}

	public SocioFamiliar getSocioFamiliar() {
		return this.socioFamiliar;
	}

	public void setSocioFamiliar(SocioFamiliar socioFamiliar) {
		this.socioFamiliar = socioFamiliar;
	}

}
