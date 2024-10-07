package empresa;

import java.util.ArrayList;
import java.util.List;

public class Fabricante {
	private String nome;
	private List<PlacaSolar> placasSolares;
	private List<Inversor> inversores;
	
	public Fabricante(String nome){
		this.nome = nome;
		this.placasSolares = new ArrayList<>();
		this.inversores = new ArrayList<>();
	}

	//Getter e Setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionarPlacasSolares(PlacaSolar placaSolar) {
		placasSolares.add(placaSolar);
	}
	public void adicionarInversores(Inversor inversor) {
		inversores.add(inversor);
	}
	
}