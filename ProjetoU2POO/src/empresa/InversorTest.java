package empresa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversorTest {
	private Fabricante fabricante;
	
	@BeforeEach
	void setUp() {
		fabricante = new Fabricante("NovaSol");
	}
	
	@Test
	void testConstrutorEgetters() {
		
		String modelo = "Off Grid";
		double potencia = 4.2; //kW
		double preco = 2290;
		Inversor inversor = new Inversor(modelo, potencia, preco, fabricante);
		assertNotNull(inversor);
		assertEquals(inversor.getModelo(), "Off Grid");
		assertEquals(inversor.getPotencia(), 4.2);
		assertEquals(inversor.getPreco(), 2290);
		assertEquals(inversor.getFabricante(), fabricante);
		//OU
		assertEquals(inversor.getFabricante().getNome(), "NovaSol");
	}
	
	@Test
	void testSetters() {
		Inversor inversor = new Inversor("", 0, 0, null);
		String modelo = "Híbrido";
		double potencia = 3.0; //kW
		double preco = 1200;
		inversor.setModelo(modelo);
		inversor.setPotencia(potencia);
		inversor.setPreco(preco);
		inversor.setFabricante(fabricante);
		assertNotNull(inversor);
		assertEquals(inversor.getModelo(), "Híbrido");
		assertEquals(inversor.getPotencia(), 3.0);
		assertEquals(inversor.getPreco(), 1200);
		assertEquals(inversor.getFabricante(), fabricante);
	}

}
