package proyectoCafetera;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InventarioTest {
	private Inventario inventario; 
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@Before
	public void setUp() throws Exception {
		this.inventario = new Inventario(0,0,0,0);
	    System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	}

	@Test
	public void testSetPositivo() throws Exception {
		this.inventario.setCafe(50);
		this.inventario.setLeche(50);
		this.inventario.setChocolate(50);
		this.inventario.setAzucar(50);
		Assert.assertEquals("Busca que la cantidad de cafe en la maquina sea 50", this.inventario.getCafe(), 50);
		Assert.assertEquals("Busca que la cantidad de leche en la maquina sea 50", this.inventario.getLeche(), 50);
		Assert.assertEquals("Busca que la cantidad de chocolate en la maquina sea 50", this.inventario.getChocolate(), 50);
		Assert.assertEquals("Busca que la cantidad de Azucar en la maquina sea 50", this.inventario.getAzucar(), 50);
	}
	
	@Test
	public void testSetNegativoCafe() throws Exception {
		try {
			this.inventario.setCafe(-50);
		    fail( "My method didn't throw when I expected it to" );
		} catch (Exception e) {
			String expectedMessage = "Inventario no puede ser negativo";
			Assert.assertTrue(e.getMessage().contains(expectedMessage));
		}
	}
	
	@Test
	public void testSetNegativoLeche() throws Exception {
		try {
			this.inventario.setChocolate(-50);
		    fail( "My method didn't throw when I expected it to" );
		} catch (Exception e) {
			String expectedMessage = "Inventario no puede ser negativo";
			Assert.assertTrue(e.getMessage().contains(expectedMessage));
		}
	}
	
	@Test
	public void testSetNegativoChocolate() throws Exception {
		try {
			this.inventario.setChocolate(-50);
		    fail( "My method didn't throw when I expected it to" );
		} catch (Exception e) {
			String expectedMessage = "Inventario no puede ser negativo";
			Assert.assertTrue(e.getMessage().contains(expectedMessage));
		}
	}
	
	@Test
	public void testSetNegativoAzucar() throws Exception {
		try {
			this.inventario.setAzucar(-50);
		    fail( "My method didn't throw when I expected it to" );
		} catch (Exception e) {
			String expectedMessage = "Inventario no puede ser negativo";
			Assert.assertTrue(e.getMessage().contains(expectedMessage));
		}
	}
	
	@Test
	public void testVerificarInventario() throws Exception {
		this.inventario.setCafe(10);
		this.inventario.setLeche(10);
		this.inventario.setChocolate(10);
		this.inventario.setAzucar(10);
		this.inventario.verificarInventario();
	    assertEquals("Cafe: 10, Leche: 10, Chocolate: 10, Azucar: 10\n", outContent.toString());

	}
}
