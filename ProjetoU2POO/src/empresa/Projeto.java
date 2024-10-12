package empresa;

import cliente.Cliente;

public class Projeto {
	private Cliente cliente;
    private double consumoMensal;
    private int numeroPlacas;
    private int numeroInversores;
    private double custoTotal;
    private String nomeProjeto;  // Novo atributo para armazenar o nome do projeto

    // Construtor atualizado
    public Projeto(Cliente cliente, String nomeProjeto, double consumoMensal, int numeroPlacas, int numeroInversores, double custoTotal) {
        this.cliente = cliente;
        this.nomeProjeto = nomeProjeto;  // Inicializa o nome do projeto
        this.consumoMensal = consumoMensal;
        this.numeroPlacas = numeroPlacas;
        this.numeroInversores = numeroInversores;
        this.custoTotal = custoTotal;
    }

    // Getter para o nome do projeto
    public String getNomeProjeto() {
        return nomeProjeto;
    }

	public Cliente getCliente() {
		return cliente;
	}

	public double getConsumoMensal() {
		return consumoMensal;
	}

	public int getNumeroPlacas() {
		return numeroPlacas;
	}

	public int getNumeroInversores() {
		return numeroInversores;
	}

	public double getCustoTotal() {
		return custoTotal;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setConsumoMensal(double consumoMensal) {
		this.consumoMensal = consumoMensal;
	}

	public void setNumeroPlacas(int numeroPlacas) {
		this.numeroPlacas = numeroPlacas;
	}

	public void setNumeroInversores(int numeroInversores) {
		this.numeroInversores = numeroInversores;
	}

	public void setCustoTotal(double custoTotal) {
		this.custoTotal = custoTotal;
	}
	
	
}