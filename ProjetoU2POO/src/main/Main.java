package main;

import javax.swing.*;

import cliente.Cliente;
import empresa.Projeto;
import empresa.Fabricante;
import empresa.Inversor;
import empresa.PlacaSolar;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Cria listas de clientes, projetos, fabricantes, placas solares e inversores
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Projeto> projetos = new ArrayList<>();
        ArrayList<Fabricante> fabricantes = new ArrayList<>();
        ArrayList<PlacaSolar> placasSolares = new ArrayList<>();
        ArrayList<Inversor> inversores = new ArrayList<>();

        // Cria o frameInicial
        JFrame frameInicial = new JFrame("Você é...?");
        frameInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameInicial.setSize(400, 200);
        
        JPanel panelInicial = new JPanel();
        panelInicial.setLayout(new GridLayout(2, 1, 10, 10));
        
        JButton buttonCliente = new JButton("Cliente");
        JButton buttonFuncionario = new JButton("Funcionário");
        
        // Cria o frameCliente
        JFrame frameCliente = new JFrame("Bem-vindo, cliente!");
        frameCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameCliente.setSize(400, 200);

        JPanel panelCliente = new JPanel();
        panelCliente.setLayout(new GridLayout(2, 2, 10, 10));
        
        JButton buttonCadastrarCliente = new JButton("Cadastrar Cliente");
        JButton buttonCadastrarProjeto = new JButton("Cadastrar Projeto");
        JButton buttonListarProjetos = new JButton("Listar Projetos");
        
        // Cria o frameFuncionario
        JFrame frameFuncionario = new JFrame("Bem-vindo, funcionário! Escolha a operação a ser executada");
        frameFuncionario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameFuncionario.setSize(400, 200);

        JPanel panelFuncionario = new JPanel();
        panelFuncionario.setLayout(new GridLayout(2, 2, 10, 10));
        
        JButton buttonCadastrarFabricante = new JButton("Cadastrar Fabricante");
        JButton buttonCadastrarPlacaSolar = new JButton("Cadastrar Placa Solar");
        JButton buttonCadastrarInversor = new JButton("Cadastrar Inversor");
        
        // Cria o frameInputCliente
        JFrame frameInputCliente = new JFrame("Cadastrar Cliente");
        frameInputCliente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Changed from EXIT_ON_CLOSE
        frameInputCliente.setSize(400, 300);
        
        JPanel panelInputCliente = new JPanel();
        panelInputCliente.setLayout(new GridLayout(5, 2, 10, 10));
        
        JLabel labelNomeDoCliente = new JLabel("Insira o nome do cliente: ");
        JTextField textFieldNomeDoCliente = new JTextField();

        JLabel labelEndereco = new JLabel("Insira o endereço do cliente: ");
        JTextField textFieldEndereco = new JTextField();

        JLabel labelTelefone = new JLabel("Insira o telefone do cliente: ");
        JTextField textFieldTelefone = new JTextField();
        
        JButton buttonSubmeterCliente = new JButton("Submeter");
        
        // Cria o frameInputProjeto
        JFrame frameInputProjeto = new JFrame("Cadastrar Projeto");
        frameInputProjeto.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Changed from EXIT_ON_CLOSE
        frameInputProjeto.setSize(400, 300);

        JPanel panelInputProjeto = new JPanel();
        panelInputProjeto.setLayout(new GridLayout(5, 2, 10, 10));
        
        JLabel labelNomeDoRequisitador = new JLabel("Insira o seu nome: ");
        JTextField textFieldNomeDoRequisitador = new JTextField();
        
        JLabel labelNomeDoProjeto = new JLabel("Insira o nome do projeto");
        JTextField textFieldNomeDoProjeto = new JTextField();
        
        JLabel labelConsumoMedio = new JLabel("Insira o seu consumo médio de energia");
        JTextField textFieldConsumoMedio = new JTextField();
        
        JLabel labelIrradiacao = new JLabel("Insira a irradiação de sua região");
        JTextField textFieldIrradiacao = new JTextField();

        JButton buttonSubmeterProjeto = new JButton("Submeter");
        
        // Cria o frameInputFabricante
        JFrame frameInputFabricante = new JFrame("Cadastrar Fabricante");
        frameInputFabricante.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameInputFabricante.setSize(400, 300);
        
        JPanel panelInputFabricante = new JPanel();
        panelInputFabricante.setLayout(new GridLayout(5, 2, 10, 10));
        
        JLabel labelNomeDoFabricante = new JLabel("Insira o nome do fabricante: ");
        JTextField textFieldNomeDoFabricante = new JTextField();
        
        JButton buttonSubmeterFabricante = new JButton("Submeter");
        
        // Cria o frameInputPlacaSolar
        JFrame frameInputPlacaSolar = new JFrame("Cadastrar Placa Solar");
        frameInputPlacaSolar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameInputPlacaSolar.setSize(400, 300);
        
        JPanel panelInputPlacaSolar = new JPanel();
        panelInputPlacaSolar.setLayout(new GridLayout(5, 2, 10, 10));
        
        JLabel labelNomeDaPlacaSolar = new JLabel("Insira o nome da placa solar: ");
        JTextField textFieldNomeDaPlacaSolar = new JTextField();
        
        JLabel labelCapacidade = new JLabel("Insira a capacidade da placa solar: ");
        JTextField textFieldCapacidade = new JTextField();
        
        JLabel labelPrecoDaPlacaSolar = new JLabel("Insira o preço da placa solar: ");
        JTextField textFieldPrecoDaPlacaSolar = new JTextField();
        
        JLabel labelFabricantes = new JLabel("Insira os fabricantes da placa solar: ");
        JTextField textFieldFabricantesDaPlacaSolar = new JTextField();
        
        JButton buttonSubmeterPlacaSolar = new JButton("Submeter");
        
        // Cria o frameInputInversor 
        JFrame frameInputInversor = new JFrame("Cadastrar Inversor");
        frameInputInversor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameInputInversor.setSize(400, 300);
        
        JPanel panelInputInversor = new JPanel();
        panelInputInversor.setLayout(new GridLayout(5, 2, 10, 10));
        
        JLabel labelModeloDoInversor = new JLabel("Insira o modelo do inversor: ");
        JTextField textFieldModeloDoInversor = new JTextField();
        
        JLabel labelPotencia = new JLabel("Insira a potência do inversor: ");
        JTextField textFieldPotencia = new JTextField();
        
        JLabel labelPrecoDoInversor = new JLabel("Insira o preço do inversor: ");
        JTextField textFieldPrecoDoInversor = new JTextField();
        
        JLabel labelFabricanteDoInversor = new JLabel("Insira o fabricante do inversor: ");
        JTextField textFieldFabricanteDoInversor = new JTextField();
        
        JButton buttonSubmeterInversor = new JButton("Submeter");

        // Adiciona ação para os botões
        buttonCliente.addActionListener(e -> {
            frameInicial.setVisible(false);
            frameCliente.setLocationRelativeTo(null);
            frameCliente.setVisible(true);
        });

        buttonFuncionario.addActionListener(e -> {
            frameInicial.setVisible(false);
            frameFuncionario.setLocationRelativeTo(null);
            frameFuncionario.setVisible(true);
        });

        buttonCadastrarCliente.addActionListener(e -> {
            frameCliente.setVisible(false);
            frameInputCliente.pack();
            frameInputCliente.setLocationRelativeTo(null);
            frameInputCliente.setVisible(true);
        });

        buttonCadastrarProjeto.addActionListener(e -> {
            frameCliente.setVisible(false);
            frameInputProjeto.setLocationRelativeTo(null);
            frameInputProjeto.setVisible(true);
        });

        buttonCadastrarFabricante.addActionListener(e -> {
            frameFuncionario.setVisible(false);
            frameInputFabricante.setLocationRelativeTo(null);
            frameInputFabricante.setVisible(true);
        });

        buttonCadastrarPlacaSolar.addActionListener(e -> {
            frameFuncionario.setVisible(false);
            frameInputPlacaSolar.setLocationRelativeTo(null);
            frameInputPlacaSolar.setVisible(true);
        });

        buttonCadastrarInversor.addActionListener(e -> {
            frameFuncionario.setVisible(false);
            frameInputInversor.setLocationRelativeTo(null);
            frameInputInversor.setVisible(true);
        });

        buttonSubmeterCliente.addActionListener(e -> {
            String nome = textFieldNomeDoCliente.getText();
            String endereco = textFieldEndereco.getText();
            String telefone = textFieldTelefone.getText();

            clientes.add(new Cliente(nome, endereco, telefone));

            JOptionPane.showMessageDialog(frameInputCliente, "Cliente cadastrado com sucesso:\nNome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone);
            textFieldNomeDoCliente.setText("");
            textFieldEndereco.setText("");
            textFieldTelefone.setText("");
        });

        buttonSubmeterProjeto.addActionListener(e -> {
            String nomeDoRequisitador = textFieldNomeDoRequisitador.getText();
            String nomeDoProjeto = textFieldNomeDoProjeto.getText();
            String consumoMedio = textFieldConsumoMedio.getText();
            String irradiacao = textFieldIrradiacao.getText();

            //projetos.add(new Projeto(nomeDoRequisitador, nomeDoProjeto, consumoMedio, irradiacao));

            JOptionPane.showMessageDialog(frameInputProjeto, "Projeto cadastrado com sucesso:\nNome do requisitador: " + nomeDoRequisitador + "\nNome do projeto: " + nomeDoProjeto);
            textFieldNomeDoRequisitador.setText("");
            textFieldNomeDoProjeto.setText("");
            textFieldConsumoMedio.setText("");
            textFieldIrradiacao.setText("");
        });

        // Adiciona componentes aos painéis
        panelInicial.add(buttonCliente);
        panelInicial.add(buttonFuncionario);
        frameInicial.add(panelInicial);

        panelCliente.add(buttonCadastrarCliente);
        panelCliente.add(buttonCadastrarProjeto);
        panelCliente.add(buttonListarProjetos);
        frameCliente.add(panelCliente);

        panelFuncionario.add(buttonCadastrarFabricante);
        panelFuncionario.add(buttonCadastrarPlacaSolar);
        panelFuncionario.add(buttonCadastrarInversor);
        frameFuncionario.add(panelFuncionario);

        panelInputCliente.add(labelNomeDoCliente);
        panelInputCliente.add(textFieldNomeDoCliente);
        panelInputCliente.add(labelEndereco);
        panelInputCliente.add(textFieldEndereco);
        panelInputCliente.add(labelTelefone);
        panelInputCliente.add(textFieldTelefone);
        panelInputCliente.add(buttonSubmeterCliente);
        frameInputCliente.add(panelInputCliente);

        panelInputProjeto.add(labelNomeDoRequisitador);
        panelInputProjeto.add(textFieldNomeDoRequisitador);
        panelInputProjeto.add(labelNomeDoProjeto);
        panelInputProjeto.add(textFieldNomeDoProjeto);
        panelInputProjeto.add(labelConsumoMedio);
        panelInputProjeto.add(textFieldConsumoMedio);
        panelInputProjeto.add(labelIrradiacao);
        panelInputProjeto.add(textFieldIrradiacao);
        panelInputProjeto.add(buttonSubmeterProjeto);
        frameInputProjeto.add(panelInputProjeto);

        // Exibe o frame inicial
        frameInicial.setLocationRelativeTo(null);
        frameInicial.setVisible(true);
    }
}
