package dominio.dominio;

// Generated 02-dic-2008 9:49:40 by Hibernate Tools 3.2.2.GA

/**
 * Horario generated by hbm2java
 */
public class Horario implements java.io.Serializable {

	private HorarioId id;
	private SocioFamiliar socioFamiliar;
	private Pista pista;
	private double importe;
	private boolean pagado;

	public Horario() {
	}

	public Horario(HorarioId id, SocioFamiliar socioFamiliar, Pista pista,
			double importe, boolean pagado) {
		this.id = id;
		this.socioFamiliar = socioFamiliar;
		this.pista = pista;
		this.importe = importe;
		this.pagado = pagado;
	}

	public HorarioId getId() {
		return this.id;
	}

	public void setId(HorarioId id) {
		this.id = id;
	}

	public SocioFamiliar getSocioFamiliar() {
		return this.socioFamiliar;
	}

	public void setSocioFamiliar(SocioFamiliar socioFamiliar) {
		this.socioFamiliar = socioFamiliar;
	}

	public Pista getPista() {
		return this.pista;
	}

	public void setPista(Pista pista) {
		this.pista = pista;
	}

	public double getImporte() {
		return this.importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public boolean isPagado() {
		return this.pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

}
