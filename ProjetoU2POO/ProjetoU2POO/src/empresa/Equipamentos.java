package empresa;

import java.util.ArrayList;
import java.util.List;

public class Equipamentos {
	private List<Fabricante> fabricantes;
	private List<PlacaSolar> placasSolares;
	private List<Inversor> inversores;
	
	//Construtor das listas de equipamentos
	public Equipamentos() {
		this.fabricantes = new ArrayList<>();
		this.placasSolares = new ArrayList<>();
		this.inversores = new ArrayList<>();
	}
	
	public void cadastrarFabricante(String nome) {
		Fabricante fabricante = new Fabricante(nome);
		fabricantes.add(fabricante);
	}
	public void cadastrarPlacaSolar(String modelo, int capacidade, double preco, Fabricante fabricante) {
		//Procurando fabricante e adicionando o inversor ao fabricante
		if(fabricantes.contains(fabricante)) {
			PlacaSolar placaSolar = new PlacaSolar(modelo, capacidade, preco, fabricante);
			fabricante.adicionarPlacasSolares(placaSolar);
			placasSolares.add(placaSolar);
		}
		else
			System.out.println("Fabricante não encontrado.");
	}
	public void cadastrarInversor(String modelo, int potencia, double preco, Fabricante fabricante) {
		//Procurando fabricante e adicionando o inversor ao fabricante
		if(fabricantes.contains(fabricante)) {
			Inversor inversor = new Inversor(modelo, potencia, preco, fabricante);
			fabricante.adicionarInversores(inversor);
			inversores.add(inversor);
		}
		else System.out.println("Fabricante não encontrado.");
	}
}
