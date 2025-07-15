package ejercicio;
//Alumno Erick Marca
public class Figura {
	private String codigo;
	private double precio;
	private Superheroe superheroe;
	private Dimension dimension;
	
	public Figura(String codigo, double precio, Dimension dimension, Superheroe superheroe) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.dimension = dimension;
		this.superheroe = superheroe;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Superheroe getSuperheroe() {
		return superheroe;
	}

	public void setSuperheroe(Superheroe superheroe) {
		this.superheroe = superheroe;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	public void subirPrecio(double cantidad) {
		precio += cantidad;
	}
	
	public String toString() {
		String devolver;
		devolver = ("Código: " + codigo + "\nPrecio: " + precio + "\n" + superheroe.toString() + "\n" + dimension.toString());
		return devolver;
	}
}
