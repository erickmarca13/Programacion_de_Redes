package ejercicio;
//Alumno Erick Marca
public class Dimension {
	private double alto, ancho, profundidad;
	
	public Dimension() {
		super();
		this.alto = 0;
		this.ancho = 0;
		this.profundidad = 0;
	}

	public Dimension(double alto, double ancho, double profundidad) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
	}
	
	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}
	
	public double getVolumen() {
		return alto * ancho * profundidad;
	}
	
	public String toString() {
		String devolver;
		devolver = ("Alto: " + alto + "\nAncho: " + ancho + "\nProfundidad: " + profundidad + "\nVolumen: " + getVolumen());
		return devolver;
	}
}

