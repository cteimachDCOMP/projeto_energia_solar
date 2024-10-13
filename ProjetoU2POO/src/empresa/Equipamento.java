package empresa;

public class Equipamento {
    private String modelo;
    private double preco;
    private Fabricante fabricante;

    public Equipamento(String modelo, double preco, Fabricante fabricante) {
        this.modelo = modelo;
        this.preco = preco;
        this.fabricante = fabricante;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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
