package empresa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlacaSolarTest {
	private Fabricante fabricante;
	
	@BeforeEach
	void setUp() {
		fabricante = new Fabricante("NovaSol");
	}	
	@Test
	void testConstrutorEgetters() {
		String modelo = "Monocristalino";
		double capacidade = 0.5; //kW
		double preco = 739.90;
		PlacaSolar placaS = new PlacaSolar(modelo, capacidade, preco, fabricante);
		assertNotNull(placaS);
		assertEquals(placaS.getModelo(), "Monocristalino");
		assertEquals(placaS.getCapacidade(), 0.5);
		assertEquals(placaS.getPreco(), 739.90);
		assertEquals(placaS.getFabricante(), fabricante);
	}
	
	@Test
	void testSetters() {
		PlacaSolar placaSolar = new PlacaSolar("", 0, 0, null);
		String modelo = "Policristalino";
		double capacidade = 0.33; //kW
		double preco = 549.49;
		placaSolar.setModelo(modelo);
		placaSolar.setCapacidade(capacidade);
		placaSolar.setPreco(preco);
		placaSolar.setFabricante(fabricante);
		assertNotNull(placaSolar);
		assertEquals(placaSolar.getModelo(), "Policristalino");
		assertEquals(placaSolar.getCapacidade(), 0.33);
		assertEquals(placaSolar.getPreco(), 549.49);
		assertEquals(placaSolar.getFabricante(), fabricante);
	}
	
}
