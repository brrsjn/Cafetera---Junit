package proyectoCafetera;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Main {
	final static Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receta receta1 = new Receta("Café con leche", 500, 2, 0, 4, 2);
		Receta receta2 = new Receta("Café americano", 400, 2, 0, 0, 2);
		Receta receta3 = new Receta("Café con leche y chocolate", 700, 2, 4, 4, 2);
		ArrayList<Receta> recetas = new ArrayList<Receta>();
		recetas.add(receta1);
		recetas.add(receta2);
		recetas.add(receta3);
		Inventario inventario = new Inventario(5, 6, 40, 10);
		Maquina maquina = new Maquina(inventario, recetas);
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		maquina.menu(sc, logger);
	}
}
