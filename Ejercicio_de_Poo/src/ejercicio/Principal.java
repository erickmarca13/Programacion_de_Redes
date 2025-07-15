package ejercicio;
//Alumno Erick Marca
public class Principal {
	public static void main(String[] args) {
		Superheroe capitan = new Superheroe("Capitán América");
		capitan.setDesc("Traje azul con escudo y estrella blanca");
		capitan.setCapa(false);
		
		Dimension dim1 = new Dimension(11, 4, 3);
		Figura fig1 = new Figura("CAP001", 1300, dim1, capitan);
		
		Superheroe ironman = new Superheroe("Ironman", "Armadura roja y dorada", false);
		Dimension dim2 = new Dimension(12, 5, 4);
		Figura fig2 = new Figura("IRM002", 1500, dim2, ironman);
		
		Coleccion marvel = new Coleccion("Colección Marvel");
		marvel.añadirFigura(fig1);
		marvel.añadirFigura(fig2);
		
		System.out.println(marvel.toString());
		System.out.println("Figuras con capa:\n" + marvel.conCapa());
		System.out.println("Figura más valiosa:\n" + marvel.masValioso());
		System.out.println("Valor total de la colección: " + marvel.getValorColeccion());
		System.out.println("Volumen total de la colección: " + marvel.getVolumenColeccion());
	}
}
