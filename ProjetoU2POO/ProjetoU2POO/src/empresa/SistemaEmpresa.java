package empresa;

import java.util.ArrayList;
import java.util.List;

import cliente.Cliente;

public class SistemaEmpresa {
	private int Npaineis, Ninversores;
	private Cliente cliente;
	private List<Projeto> projetos;
	
	public SistemaEmpresa() {
		this.projetos = new ArrayList<>();
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
		this.cliente.setNome(nome);
		this.cliente.setEndereco(endereco);
		this.cliente.setTelefone(telefone);
	}
	
	//Nesse método, o funcionário pode passar o valor da potencia da placa e do inversor diretamente
	//ou
	//através de placa e inversor que o cliente deseja adquirir, dados preços.
	//Além disso, solicita um novo projeto baseado no
	public void solicitarProjeto(String nomeProjeto, int consumoMensal, double potenciaPlaca, double potenciaInversor, double irradiacao) {
		 
		//Cálculo do Dimensionamento do SistemaFotovoltaico
		setNpaineis((int)Math.ceil((consumoMensal)/(irradiacao*potenciaPlaca*30)));
		setNinversores((int)Math.ceil((getNpaineis()*potenciaPlaca)/potenciaInversor));
		//Fim do Cálculo
		
		System.out.println("Número de paineis necessários: " + getNpaineis());
		System.out.println("Número de inversores necessários: " + getNinversores());
		
		Projeto projeto = new Projeto(nomeProjeto);
		if(!projetos.contains(projeto)) {
			projetos.add(projeto);
		}
	}
}
