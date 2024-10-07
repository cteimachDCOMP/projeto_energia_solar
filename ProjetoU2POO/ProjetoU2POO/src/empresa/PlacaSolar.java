package empresa;

public class PlacaSolar {
	private String modelo;
	private int capacidade;
	private double preco;
	private Fabricante fabricante;
	
	public PlacaSolar(String modelo, int capacidade, double preco, Fabricante fabricante) {
		this.modelo = modelo;
		this.capacidade = capacidade;
		this.preco = preco;
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public double getPreco() {
		return preco;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
}
