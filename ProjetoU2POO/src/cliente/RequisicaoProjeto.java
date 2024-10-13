package cliente;

public class RequisicaoProjeto {
    private Cliente cliente;
    private String nomeProjeto;
    private double irradiacaoSolar;
    private double consumoMensal;

    public RequisicaoProjeto(Cliente cliente, String nomeProjeto, double irradiacaoSolar, double consumoMensal) {
        this.cliente = cliente;
        this.nomeProjeto = nomeProjeto;
        this.irradiacaoSolar = irradiacaoSolar;
        this.consumoMensal = consumoMensal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public double getIrradiacaoSolar() {
        return irradiacaoSolar;
    }

    public double getConsumoMensal() {
        return consumoMensal;
    }

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public void setIrradiacaoSolar(double irradiacaoSolar) {
		this.irradiacaoSolar = irradiacaoSolar;
	}

	public void setConsumoMensal(double consumoMensal) {
		this.consumoMensal = consumoMensal;
	}
}
