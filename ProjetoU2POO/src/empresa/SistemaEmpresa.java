package empresa;

import java.util.ArrayList;
import java.util.List;

import cliente.Cliente;

public class SistemaEmpresa {
	private int Npaineis, Ninversores;
    private List<Cliente> clientes;
    private List<Fabricante> fabricantes;
    private List<PlacaSolar> placasSolares;
    private List<Inversor> inversores;
	
	public SistemaEmpresa() {
		this.clientes = new ArrayList<>();
		this.fabricantes = new ArrayList<>();
		this.placasSolares = new ArrayList<>();
		this.inversores = new ArrayList<>();
	}
	
	public void setNpaineis(int npaineis) {
		Npaineis = npaineis;
	}

	public void setNinversores(int ninversores) {
		Ninversores = ninversores;
	}

	public int getNpaineis() {
		return Npaineis;
	}
	
	public int getNinversores() {
		return Ninversores;
	}

	//Métodos
	
	public void cadastrarCliente(String nome, String endereco, String telefone) {
		Cliente cliente = new Cliente(nome, endereco, telefone);
		clientes.add(cliente);
	}
	
	public void cadastrarFabricante(String nome) {
		Fabricante novoFabricante = new Fabricante(nome);
		fabricantes.add(novoFabricante);
	}
	
	public void cadastrarPlacaSolar(String modelo, double capacidade, double preco, Fabricante fabricante) {
		PlacaSolar placa = new PlacaSolar(modelo, capacidade, preco, fabricante);
		placasSolares.add(placa);
	}
	
	public void cadastrarInversor(String modelo, double potencia, double preco, Fabricante fabricante) {
		Inversor inversor = new Inversor(modelo, potencia, preco, fabricante);
		inversores.add(inversor);
	}
	
	
	public Projeto dimensionarSistema(Cliente cliente, String nomeProjeto, double consumoMensal, double irradiacaoSolar, PlacaSolar placa, Inversor inversor) {
		int numeroPlacas = (int) Math.ceil(consumoMensal / (placa.getCapacidade() * irradiacaoSolar * 30)); // 30 dias
	    int numeroInversores = (int) Math.ceil(consumoMensal / inversor.getPotencia());
	    
	    double custoEquipamentos = numeroPlacas * placa.getPreco() + numeroInversores * inversor.getPreco();
	    double custoMaoDeObra = custoEquipamentos * 0.2; // 20% do valor dos equipamentos
	    double custoTotal = custoEquipamentos + custoMaoDeObra;

	    // Passa o nome do projeto ao criar a instância de Projeto
	    return new Projeto(cliente, nomeProjeto, consumoMensal, numeroPlacas, numeroInversores, custoTotal);
	}
	
}
