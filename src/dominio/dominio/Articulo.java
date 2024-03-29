package dominio.dominio;

// Generated 08-ene-2009 19:15:20 by Hibernate Tools 3.2.4.CR1

/**
 * Articulo generated by hbm2java
 */
public class Articulo implements java.io.Serializable {

	private int idarticulo;
	private String concepto;
	private String proveedor;
	private double precioCompra;
	private double beneficio;
	private int stock;

	public Articulo() {
	}

	public Articulo(String concepto, String proveedor, double precioCompra,
			double beneficio, int stock) {
		this.concepto = concepto;
		this.proveedor = proveedor;
		this.precioCompra = precioCompra;
		this.beneficio = beneficio;
		this.stock = stock;
	}

	public int getIdarticulo() {
		return this.idarticulo;
	}

	public void setIdarticulo(int idarticulo) {
		this.idarticulo = idarticulo;
	}

	public String getConcepto() {
		return this.concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public String getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public double getPrecioCompra() {
		return this.precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getBeneficio() {
		return this.beneficio;
	}

	public void setBeneficio(double beneficio) {
		this.beneficio = beneficio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
