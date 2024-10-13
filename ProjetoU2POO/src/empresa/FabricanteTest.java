package empresa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FabricanteTest {

	@Test
	void testConstrutorEgetter() {
		String nomeFabricante = "Nova";
		Fabricante fabricante = new Fabricante(nomeFabricante);
		assertNotNull(fabricante);
		assertEquals(fabricante.getNome(), "Nova");
	}
	
	@Test
	void testSetters() {
		Fabricante fabricante = new Fabricante("");
		String nomeFabricante = "NBoom";
		fabricante.setNome(nomeFabricante);
		assertNotNull(fabricante);
		assertEquals(fabricante.getNome(),"NBoom");
		
	}

}
