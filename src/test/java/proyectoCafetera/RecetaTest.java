package proyectoCafetera;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RecetaTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void createRecetaTest() {
		Receta receta = new Receta("Café con leche", 500, 2, 0, 4, 2);
		Assert.assertTrue(receta.getNombre().contains("Café con leche"));
		Assert.assertEquals(receta.getPrecio(), 500);
		Assert.assertEquals(receta.getUnidadCafe(), 2);
		Assert.assertEquals(receta.getUnidadLeche(), 4);
		Assert.assertEquals(receta.getUnidadChocolate(), 0);
		Assert.assertEquals(receta.getUnidadAzucar(), 2);
	}
	
	@Test
	public void setRecetaTest() {
		Receta receta = new Receta("Café con leche", 500, 2, 0, 4, 2);
		receta.setPrecio(600);
		receta.setUnidadCafe(3);
		receta.setUnidadChocolate(2);
		receta.setUnidadLeche(5);
		receta.setUnidadAzucar(3);
		receta.setNombre("Café con leche y chocolate xl");
		Assert.assertTrue(receta.getNombre().contains("Café con leche y chocolate xl"));
		Assert.assertEquals(receta.getPrecio(), 600);
		Assert.assertEquals(receta.getUnidadCafe(), 3);
		Assert.assertEquals(receta.getUnidadLeche(), 5);
		Assert.assertEquals(receta.getUnidadChocolate(), 2);
		Assert.assertEquals(receta.getUnidadAzucar(), 3);
	}

}
