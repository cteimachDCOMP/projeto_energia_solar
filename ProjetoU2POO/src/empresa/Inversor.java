package empresa;

public class Inversor extends Equipamento {
    private double potencia;

    public Inversor(String modelo, double potencia, double preco, Fabricante fabricante) {
        super(modelo, preco, fabricante); // Chama o construtor da classe pai (Equipamento)
        this.potencia = potencia;
    }

    // Getters e Setters específicos de Inversor
    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
}
