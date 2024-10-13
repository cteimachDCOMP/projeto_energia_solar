package empresa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InversorTest {
	
	@Test
	void testConstrutorEgetters() {
		
		String modelo = "Off Grid";
		double potencia = 4.2; //kW
		double preco = 2290;
		Fabricante fabricante = new Fabricante("NovaSol");
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
		Fabricante fabricante = new Fabricante("NBlast");
		String modelo = "Híbrido";
		double potencia = 3.0;
		double preco = 1200;
		inversor.setModelo(modelo);
		inversor.setPotencia(Double.valueOf(potencia));
		
		
		
	}

}
