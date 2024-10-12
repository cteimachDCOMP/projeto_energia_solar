package cliente;

public class Projeto {
	private String nome;
	private Cliente cliente;
	private int consumoMedio;
	
	public Projeto(String nome, Cliente cliente, int consumoMedio) {
		this.nome = nome;
		this.cliente = cliente;
		this.consumoMedio = consumoMedio;
	}

	public String getNome() {
		return nome;
	} 
	
	public Cliente getCliente() {
		return cliente;
	}

	public int getConsumoMedio() {
		return consumoMedio;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setConsumoMedio(int consumoMedio) {
		this.consumoMedio = consumoMedio;
	}
}
