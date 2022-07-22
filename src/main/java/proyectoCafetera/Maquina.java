package proyectoCafetera;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Maquina {

	private Inventario inventario;
	private ArrayList<Receta> recetas;

	public Maquina(Inventario inventario, ArrayList<Receta> recetas) {
		super();
		this.inventario = inventario;
		this.recetas = recetas;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

	public ArrayList<Receta> getRecetas() {
		return recetas;
	}

	public void setRecetas(ArrayList<Receta> recetas) {
		this.recetas = recetas;
	}

	public void menu(Scanner sc, Logger logger) {
		while (true) {
			System.out.println("Elige una opcion: \n" + "1. Agregar inventario \n" + "2. Verificar inventario \n"
					+ "3. Comprar bebida");
			System.out.print(">>>");
			int eleccion = sc.nextInt();
			if (eleccion == 1) {
				this.inventario.agregarInventario(sc, logger);
			} else if (eleccion == 2) {
				this.inventario.verificarInventario();

			} else if (eleccion == 3) {
				this.comprarBebida(sc, logger);
			} else {
				System.out.println("Ingresa un numero valido");
			}
		}

	}
	
	public void comprarBebida(Scanner sc, Logger logger) {
		try {
			System.out.println("Selecciona una receta:");
			for(int i = 0; i < this.getRecetas().size(); i++) {
				System.out.println(i+". "+this.getRecetas().get(i).getNombre());
			}
			System.out.println("Ingresa tu opcion: ");
			int eleccion = sc.nextInt();
			if(eleccion < this.getRecetas().size() && eleccion%1 == 0 && eleccion>=0) {
				this.inventario.setCafe(this.inventario.getCafe()-this.getRecetas().get(eleccion).getUnidadCafe());
				this.inventario.setLeche(this.inventario.getLeche()-this.getRecetas().get(eleccion).getUnidadLeche());
				this.inventario.setChocolate(this.inventario.getChocolate()-this.getRecetas().get(eleccion).getUnidadChocolate());
				this.inventario.setAzucar(this.inventario.getAzucar()-this.getRecetas().get(eleccion).getUnidadAzucar());
			}
		} catch(Exception e) {
			logger.error(e.getMessage());
		}
	}

}
