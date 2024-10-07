package empresa;

public class Inversor {
	private String modelo;
	private int potencia;
	private double preco;
	private Fabricante fabricante;
	
	public Inversor (String modelo, int potencia, double preco, Fabricante fabricante) {
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

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
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
