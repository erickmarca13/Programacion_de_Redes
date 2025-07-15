package ejercicio;
//Alumno Erick Marca
public class Superheroe {
	private String nombre, desc;
	private boolean capa;
	
	public Superheroe(String nombre) {
		this.nombre = nombre;
		this.desc = "";
		this.capa = false;
	}

	public Superheroe(Superheroe s) {
		super();
		this.nombre = s.nombre;
		this.desc = s.desc;
		this.capa = s.capa;
	}

	public Superheroe(String nombre, String desc, boolean capa) {
		super();
		this.nombre = nombre;
		this.desc = desc;
		this.capa = capa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isCapa() {
		return capa;
	}

	public void setCapa(boolean capa) {
		this.capa = capa;
	}
	
	public String toString () {
		String devolver;
		devolver = ("\nNombre: " + nombre + "\nDescripcion: " + desc + "\nCapa: " + capa);
		return devolver;
	}
}
