package dominio.dominio;

// Generated 02-dic-2008 9:49:40 by Hibernate Tools 3.2.2.GA

import java.util.Date;

/**
 * HorarioId generated by hbm2java
 */
public class HorarioId implements java.io.Serializable {

	private String pista;
	private Date dia;
	private Date hora;

	public HorarioId() {
	}

	public HorarioId(String pista, Date dia, Date hora) {
		this.pista = pista;
		this.dia = dia;
		this.hora = hora;
	}

	public String getPista() {
		return this.pista;
	}

	public void setPista(String pista) {
		this.pista = pista;
	}

	public Date getDia() {
		return this.dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public Date getHora() {
		return this.hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HorarioId))
			return false;
		HorarioId castOther = (HorarioId) other;

		return ((this.getPista() == castOther.getPista()) || (this.getPista() != null
				&& castOther.getPista() != null && this.getPista().equals(
				castOther.getPista())))
				&& ((this.getDia() == castOther.getDia()) || (this.getDia() != null
						&& castOther.getDia() != null && this.getDia().equals(
						castOther.getDia())))
				&& ((this.getHora() == castOther.getHora()) || (this.getHora() != null
						&& castOther.getHora() != null && this.getHora()
						.equals(castOther.getHora())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPista() == null ? 0 : this.getPista().hashCode());
		result = 37 * result
				+ (getDia() == null ? 0 : this.getDia().hashCode());
		result = 37 * result
				+ (getHora() == null ? 0 : this.getHora().hashCode());
		return result;
	}

}