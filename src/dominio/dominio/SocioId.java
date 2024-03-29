package dominio.dominio;

// Generated 08-ene-2009 19:15:20 by Hibernate Tools 3.2.4.CR1

/**
 * SocioId generated by hbm2java
 */
public class SocioId implements java.io.Serializable {

	private int codSocio;
	private String dni;

	public SocioId() {
	}

	public SocioId(int codSocio, String dni) {
		this.codSocio = codSocio;
		this.dni = dni;
	}
	
	public SocioId(String dni) {
		this.dni = dni;
	}
	
	public SocioId(int codSocio) {
		this.codSocio = codSocio;
	}

	public int getCodSocio() {
		return this.codSocio;
	}

	public void setCodSocio(int codSocio) {
		this.codSocio = codSocio;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SocioId))
			return false;
		SocioId castOther = (SocioId) other;

		return (this.getCodSocio() == castOther.getCodSocio())
				&& ((this.getDni() == castOther.getDni()) || (this.getDni() != null
						&& castOther.getDni() != null && this.getDni().equals(
						castOther.getDni())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodSocio();
		result = 37 * result
				+ (getDni() == null ? 0 : this.getDni().hashCode());
		return result;
	}

}
