package ejercicio;
//Alumno Erick Marca
import java.util.ArrayList;

public class Coleccion {
	private String nombreColeccion;
	private ArrayList<Figura> listaFiguras;
	
	public Coleccion(String nombreColeccion) {
		super();
		this.nombreColeccion = nombreColeccion;
		this.listaFiguras = new ArrayList<Figura>();
	}

	public String getNombreColeccion() {
		return nombreColeccion;
	}

	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}

	public void añadirFigura(Figura fig) {
		listaFiguras.add(fig);
	}
	
	public void subirPrecio(double cantidad, String id) {
		for (Figura f : listaFiguras) {
			if (f.getCodigo().equals(id)) {
				f.subirPrecio(cantidad);
			}
		}
	}
	
	public String toString() {
		String devolver = "Colección: " + nombreColeccion + "\n";
		for (Figura f : listaFiguras) {
			devolver += f.toString() + "\n";
		}
		return devolver;
	}
	
	public String conCapa() {
		String devolver = "";
		for (Figura f : listaFiguras) {
			if (f.getSuperheroe().isCapa()) {
				devolver += f.toString() + "\n";
			}
		}
		return devolver;
	}
	
	public Figura masValioso() {
		if (listaFiguras.isEmpty()) return null;
		Figura mayor = listaFiguras.get(0);
		for (Figura f : listaFiguras) {
			if (f.getPrecio() > mayor.getPrecio()) {
				mayor = f;
			}
		}
		return mayor;
	}
	
	public double getValorColeccion() {
		double total = 0;
		for (Figura f : listaFiguras) {
			total += f.getPrecio();
		}
		return total;
	}
	
	public double getVolumenColeccion() {
		double total = 0;
		for (Figura f : listaFiguras) {
			total += f.getDimension().getVolumen();
		}
		return total + 200;
	}
}
