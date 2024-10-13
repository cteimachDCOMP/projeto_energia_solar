package empresa;

import java.util.ArrayList;
import java.util.List;
import cliente.Cliente;
import cliente.RequisicaoProjeto;

public class SistemaEmpresa {
    private int Npaineis, Ninversores;
    private List<Cliente> clientes;
    private List<Fabricante> fabricantes;
    private List<PlacaSolar> placasSolares;
    private List<Inversor> inversores;
    private List<RequisicaoProjeto> requisicoes;
    private List<Projeto> projetos;

    // Construtor
    public SistemaEmpresa() {
        this.clientes = new ArrayList<>();
        this.fabricantes = new ArrayList<>();
        this.placasSolares = new ArrayList<>();
        this.inversores = new ArrayList<>();
        this.requisicoes = new ArrayList<>();
        this.projetos = new ArrayList<>();
    }

    // Getters e Setters
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
    public List<RequisicaoProjeto> getRequisicoes() {
        return requisicoes;
    }
    public List<Projeto> getProjetos() {
        return projetos;
    }

    // Métodos de cadastro de Cliente, Fabricante, Placa Solar e Inversor
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

    // Método para cadastrar uma requisição de projeto
    public void cadastrarRequisicao(RequisicaoProjeto requisicao) {
        requisicoes.add(requisicao);
    }

    // Método para dimensionar um projeto a partir de uma requisição
    public Projeto dimensionarProjeto(RequisicaoProjeto requisicao, PlacaSolar placa, Inversor inversor) {
        Cliente cliente = requisicao.getCliente();
        String nomeProjeto = requisicao.getNomeProjeto();
        double consumoMensal = requisicao.getConsumoMensal();
        double irradiacaoSolar = requisicao.getIrradiacaoSolar();

        // Realiza o cálculo de dimensionamento
        int numeroPlacas = (int) Math.ceil(consumoMensal / (placa.getCapacidade() * irradiacaoSolar * 30)); // 30 dias
        int numeroInversores = (int) Math.ceil(consumoMensal / inversor.getPotencia());

        double custoEquipamentos = numeroPlacas * placa.getPreco() + numeroInversores * inversor.getPreco();
        double custoMaoDeObra = custoEquipamentos * 0.2; // 20% do valor dos equipamentos
        double custoTotal = custoEquipamentos + custoMaoDeObra;

        Projeto projeto = new Projeto(cliente, nomeProjeto, consumoMensal, numeroPlacas, numeroInversores, custoTotal);
        projetos.add(projeto);

        // Remove a requisição já processada
        requisicoes.remove(requisicao);

        return projeto;
    }
}
