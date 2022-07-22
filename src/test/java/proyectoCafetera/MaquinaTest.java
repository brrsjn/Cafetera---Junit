package proyectoCafetera;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaquinaTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void createMaquinaTest() {
		Receta receta1 = new Receta("Café con leche", 500, 2, 0, 4, 2);
		Receta receta2 = new Receta("Café americano", 400, 2, 0, 0, 2);
		Receta receta3 = new Receta("Café con leche y chocolate", 700, 2, 4, 4, 2);
		ArrayList<Receta> recetas = new ArrayList<Receta>();
		recetas.add(receta1);
		recetas.add(receta2);
		recetas.add(receta3);
		Inventario inventario = new Inventario(5, 6, 40, 10);
		Maquina maquina = new Maquina(inventario, recetas);
		Assert.assertEquals(maquina.getRecetas(), recetas);
		Assert.assertEquals(maquina.getInventario(), inventario);
	}

	@Test
	public void setMaquinaTest() {
		Receta receta1 = new Receta("Café con leche", 500, 2, 0, 4, 2);
		Receta receta2 = new Receta("Café americano", 400, 2, 0, 0, 2);
		ArrayList<Receta> recetas = new ArrayList<Receta>();
		recetas.add(receta1);
		Inventario inventario = new Inventario(5, 6, 40, 10);
		Maquina maquina = new Maquina(inventario, recetas);
		Inventario inventarioActual = new Inventario(4, 6, 40, 10);
		recetas.add(receta2);
		maquina.setRecetas(recetas);
		maquina.setInventario(inventarioActual);
		Assert.assertEquals(maquina.getRecetas(), recetas);
		Assert.assertEquals(maquina.getInventario(), inventarioActual);
	}
}
