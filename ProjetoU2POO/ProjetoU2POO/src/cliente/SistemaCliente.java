package cliente;

import java.util.ArrayList;
import java.util.List;

public class SistemaCliente {
	private List<Cliente> clientes;
	public SistemaCliente(){
		this.clientes = new ArrayList<>();
	}
	
	public void cadastrarCliente(String nome, String endereco, String telefone) {
		Cliente cliente = new Cliente(nome, endereco, telefone);
		clientes.add(cliente);
	}
	
	public void solicitarProjeto(Cliente cliente, int consumoMedio) {
		Projeto projeto = new Projeto(cliente, consumoMedio);
		cliente.adicionarProjeto(projeto);
	}
}
