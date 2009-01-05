package dominio.dominio;

// Generated 02-ene-2009 17:10:24 by Hibernate Tools 3.2.4.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Recibo generated by hbm2java
 */
public class Recibo implements java.io.Serializable {

	private int idrecibo;
	private SocioFamiliar socioFamiliar;
	private Date fecha;
	private String cuenta;
	private double importe;
	private Set detalleRecibos = new HashSet(0);

	public Recibo() {
	}

	public Recibo(SocioFamiliar socioFamiliar, Date fecha, String cuenta,
			double importe) {
		this.socioFamiliar = socioFamiliar;
		this.fecha = fecha;
		this.cuenta = cuenta;
		this.importe = importe;
	}

	public Recibo(SocioFamiliar socioFamiliar, Date fecha, String cuenta,
			double importe, Set detalleRecibos) {
		this.socioFamiliar = socioFamiliar;
		this.fecha = fecha;
		this.cuenta = cuenta;
		this.importe = importe;
		this.detalleRecibos = detalleRecibos;
	}

	public int getIdrecibo() {
		return this.idrecibo;
	}

	public void setIdrecibo(int idrecibo) {
		this.idrecibo = idrecibo;
	}

	public SocioFamiliar getSocioFamiliar() {
		return this.socioFamiliar;
	}

	public void setSocioFamiliar(SocioFamiliar socioFamiliar) {
		this.socioFamiliar = socioFamiliar;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getImporte() {
		return this.importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public Set getDetalleRecibos() {
		return this.detalleRecibos;
	}

	public void setDetalleRecibos(Set detalleRecibos) {
		this.detalleRecibos = detalleRecibos;
	}

}
