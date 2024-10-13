package empresa;

public class Inversor {
	private String modelo;
	private double potencia;
	private double preco;
	private Fabricante fabricante;
	
	public Inversor (String modelo, double potencia, double preco, Fabricante fabricante) {
		this.modelo = modelo;
		this.potencia = potencia;
		this.preco = preco;
		this.fabricante = fabricante;
	}

	//Getters e Setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
}
