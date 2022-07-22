package proyectoCafetera;

public class Receta {
	private String Nombre;
	private int Precio;
	private int UnidadCafe;
	private int UnidadChocolate;
	private int UnidadLeche;
	private int UnidadAzucar;
	public static final String VALUE1 = "foo";
	
	public Receta(String nombre, int precio, int unidadCafe, int unidadChocolate, int unidadLeche, int unidadAzucar) {
		super();
		Nombre = nombre;
		Precio = precio;
		UnidadCafe = unidadCafe;
		UnidadChocolate = unidadChocolate;
		UnidadLeche = unidadLeche;
		UnidadAzucar = unidadAzucar;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getPrecio() {
		return Precio;
	}
	public void setPrecio(int precio) {
		Precio = precio;
	}
	public int getUnidadCafe() {
		return UnidadCafe;
	}
	public void setUnidadCafe(int unidadCafe) {
		UnidadCafe = unidadCafe;
	}
	public int getUnidadChocolate() {
		return UnidadChocolate;
	}
	public void setUnidadChocolate(int unidadChocolate) {
		UnidadChocolate = unidadChocolate;
	}
	public int getUnidadLeche() {
		return UnidadLeche;
	}
	public void setUnidadLeche(int unidadLeche) {
		UnidadLeche = unidadLeche;
	}
	public int getUnidadAzucar() {
		return UnidadAzucar;
	}
	public void setUnidadAzucar(int unidadAzucar) {
		UnidadAzucar = unidadAzucar;
	}	
	

}
