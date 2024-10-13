package cliente;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClienteTest {
	
	@Test
	void testConstrutorEgetters() {
		String nome = "Matheus";
		String endereco = "Rua 05";
		String telefone = "7999999-9999";
		Cliente cliente = new Cliente(nome, endereco, telefone);
		assertNotNull(cliente);
		assertEquals(cliente.getNome(), "Matheus");
		assertEquals(cliente.getEndereco(), "Rua 05");
		assertEquals(cliente.getTelefone(), "7999999-9999");
	}
	
	@Test
	void testSetters() {
		Cliente cliente = new Cliente("", "", "");
		String nome = "João";
		String endereco = "Rua 07";
		String telefone = "7191111-1111";
		cliente.setNome(nome);
		cliente.setEndereco(endereco);
		cliente.setTelefone(telefone);
		assertNotNull(cliente);
		assertEquals(cliente.getNome(), "João");
		assertEquals(cliente.getEndereco(), "Rua 07");
		assertEquals(cliente.getTelefone(), "7191111-1111");
	}
}
