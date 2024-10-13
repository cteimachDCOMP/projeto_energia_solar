package empresa;

public class PlacaSolar extends Equipamento {
    private double capacidade;

    public PlacaSolar(String modelo, double capacidade, double preco, Fabricante fabricante) {
        super(modelo, preco, fabricante); // Chama o construtor da classe pai (Equipamento)
        this.capacidade = capacidade;
    }

    // Getters e Setters específicos de PlacaSolar
    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
}
