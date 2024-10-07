package cliente;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome, endereco, telefone;
	private List<Projeto> projetos;
	
	public Cliente(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.projetos = new ArrayList<>();
	}

	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}
	
	//Métodos
	public void adicionarProjeto(Projeto projeto) {
		projetos.add(projeto);
	}
}
