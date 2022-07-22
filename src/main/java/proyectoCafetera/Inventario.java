package proyectoCafetera;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Inventario {
	private int Cafe;
	private int Leche;
	private int Chocolate;
	private int Azucar;
	
    public static final int MAX_CAFE = 10;
    public static final int MAX_LECHE = 10;
    public static final int MAX_CHOCOLATE = 80;
    public static final int MAX_AZUCAR = 40;

	
	public Inventario(int cafe, int leche, int chocolate, int azucar) {
		super();
		Cafe = cafe;
		Leche = leche;
		Chocolate = chocolate;
		Azucar = azucar;
	}

	public int getCafe() {
		return Cafe;
	}

	public void setCafe(int cafe) throws Exception {
		if(cafe < 0) {
			throw new Exception("Inventario no puede ser negativo");
		}
		Cafe = cafe;
	}

	public int getLeche() {
		return Leche;
	}

	public void setLeche(int leche) throws Exception {
		if(leche < 0) {
			throw new Exception("Inventario no puede ser negativo");
		}
		Leche = leche;
	}

	public int getChocolate() {
		return Chocolate;
	}

	public void setChocolate(int chocolate) throws Exception {
		if(chocolate < 0) {
			throw new Exception("Inventario no puede ser negativo");
		}
		Chocolate = chocolate;
	}

	public int getAzucar() {
		return Azucar;
	}

	public void setAzucar(int azucar) throws Exception {
		if(azucar < 0) {
			throw new Exception("Inventario no puede ser negativo");
		}
		Azucar = azucar;
	}
	
	public void verificarInventario() {
		System.out.println("Cafe: "+Cafe+", Leche: "+Leche+", Chocolate: "+Chocolate+", Azucar: "+Azucar);
	}
	
	public void agregarInventario(Scanner sc, Logger logger) {
		try {
			System.out.println("Agregar café");
			int cafe = findInt(sc, MAX_CAFE, this.Cafe);
			this.setCafe(cafe);
			
			System.out.println("Agregar leche");
			int leche = findInt(sc, MAX_LECHE, this.Leche);
			this.setLeche(leche);
			
			System.out.println("Agregar chocolate");
			int chocolate = findInt(sc, MAX_CHOCOLATE, this.Chocolate);
			this.setChocolate(chocolate);
			
			System.out.println("Agregar azucar");
			int azucar = findInt(sc, MAX_AZUCAR, this.Azucar);
			this.setAzucar(azucar);
		} catch(Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	private int findInt(Scanner sc, int maxValue, int actual) {
		while(true) {
			int x = sc.nextInt();
			if((x+actual) > maxValue ) {
				System.out.println("Valor ingresado supera el maximo de "+maxValue+" unidades, intenta otra vez");
				continue;
			}
			if(x%1 == 0 && x>0 && x<= maxValue) {
				return x+actual;
			} else {
				System.out.println("Valor ingresado no valido, intenta otra vez");
			}
		}

	}
	
}
