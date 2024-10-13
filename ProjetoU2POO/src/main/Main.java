package main;

import javax.swing.*;

import cliente.Cliente;
import empresa.Projeto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Cria lista de clientes e projetos
    	SistemaEmpresa sistema
    	
    	sistema.
    	
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Projeto> projetos = new ArrayList<>();

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

        JLabel labelEndereço = new JLabel("Insira o endereço do cliente: ");
        JTextField textFieldEndereço = new JTextField();

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
        
        JLabel labelIrradiacao = new JLabel("Insira a irradiação da sua região (em kWh/m².dia): ");
        JTextField textFieldIrradiacao = new JTextField();

        JButton buttonSubmeterProjeto = new JButton("Submeter");
        
        
        
        
        JButton buttonSubmeterFabricante = new JButton("Submeter");

        // Adiciona um action listener para cada botão
        buttonCliente.addActionListener(e -> {
                frameInicial.setVisible(false);  // Hide frameInicial
                frameCliente.setLocationRelativeTo(null);
                frameCliente.setVisible(true);
        });

        buttonFuncionario.addActionListener(e -> {
        	frameInicial.setVisible(false);  // Hide frameInicial
        	frameFuncionario.setLocationRelativeTo(null);
        	frameFuncionario.setVisible(true);  // Show frameFuncionario
        });

        buttonCadastrarCliente.addActionListener(e -> {
            frameCliente.setVisible(false);  // Hide frameFuncionario
            frameInputCliente.pack();  // Pack before setting visible
            frameInputCliente.setLocationRelativeTo(null);  // Center on screen
            frameInputCliente.setVisible(true);  // Show frameInputCliente
        });
        
        buttonCadastrarProjeto.addActionListener(e -> {
        	frameCliente.setVisible(false);
        	frameInputProjeto.setLocationRelativeTo(null);
        	frameInputProjeto.setVisible(true);
        });
        
        buttonListarProjetos.addActionListener(e -> {
        	
        });
        
        buttonCadastrarFabricante.addActionListener(e -> {
        	
        });
        
        buttonCadastrarPlacaSolar.addActionListener(e -> {
        	
        });

        buttonCadastrarInversor.addActionListener(e -> {
        	
        });
        
        buttonSubmeterCliente.addActionListener(e -> {

                String nome = textFieldNomeDoCliente.getText();
                String endereço = textFieldEndereço.getText();
                String telefone = textFieldTelefone.getText();

                clientes.add(new Cliente(nome, endereço, telefone));  // Criar cliente

                for (Cliente cliente : clientes) {
                	if (cliente.getNome().equals(nome)) {
                		JOptionPane.showMessageDialog(frameInputCliente, "Cliente com os seguintes dados:/nNome: " + cliente.getNome() + "/nEndereço: " + cliente.getEndereco() + "/nTelefone: " + cliente.getTelefone() + "/ncadastrado com sucesso!");
                	}
                }
                // Opcional: Limpar campos de texto após o cadastro
                textFieldNomeDoCliente.setText("");
                textFieldEndereço.setText("");
                textFieldTelefone.setText("");
        });
        
        buttonSubmeterProjeto.addActionListener(e -> {
        	String nomeDoRequisitador = textFieldNomeDoRequisitador.getText();
        	String nomeDoProjeto = textFieldNomeDoProjeto.getText();
        	String consumoMedio = textFieldConsumoMedio.getText();
        	String irradiacao = textFieldIrradiacao.getText();
        	
        	
        	int intConsumoMedio = Integer.valueOf(consumoMedio);
        	double doubleIrradiacao = Float.valueOf(irradiacao);
        	
        	for (Cliente cliente : clientes) {
        		if (cliente.getNome().equals(nomeDoRequisitador)) {
        			projetos.add(new Projeto(nomeDoProjeto, cliente, intConsumoMedio));
        		}
        	}
        	
        	for (Projeto projeto : projetos) {
        		if (projeto.getNome().equals(nomeDoProjeto)) {
        			JOptionPane.showMessageDialog(frameInputProjeto, "Projeto com os seguintes dados:/nNome:" + projeto.getNome() + "/nCliente: " + projeto.getCliente() + "/nConsumo Médio: " + projeto.getConsumoMedio());
        		}
        	}
        });
        
        buttonSubmeterFabricante.addActionListener(e -> {
        	
        });

        // Adiciona os botões para o panel
        panelInicial.add(buttonCliente);
        panelInicial.add(buttonFuncionario);

        panelCliente.add(buttonCadastrarCliente);
        panelCliente.add(buttonCadastrarProjeto);
        
        panelFuncionario.add(buttonCadastrarFabricante);
        panelFuncionario.add(buttonCadastrarPlacaSolar);
        panelFuncionario.add(buttonCadastrarInversor);

        // Adiciona os labels e textfields para o panel onde o usuário colocará os dados do cliente do panelInputCliente
        panelInputCliente.add(labelNomeDoCliente);
        panelInputCliente.add(textFieldNomeDoCliente);

        panelInputCliente.add(labelEndereço);
        panelInputCliente.add(textFieldEndereço);

        panelInputCliente.add(labelTelefone);
        panelInputCliente.add(textFieldTelefone);

        panelInputCliente.add(buttonSubmeterCliente);
        
        // Adiciona os labels e textfields para o panel onde o usuário colocará os dados do cliente do panelInputProjeto
        panelInputProjeto.add(labelNomeDoRequisitador);
        panelInputProjeto.add(textFieldNomeDoRequisitador);
        
        panelInputProjeto.add(labelNomeDoProjeto);
        panelInputProjeto.add(textFieldNomeDoProjeto);
        
        panelInputProjeto.add(labelConsumoMedio);
        panelInputProjeto.add(textFieldConsumoMedio);
        
        panelInputProjeto.add(buttonSubmeterProjeto);
        
        // Adiciona o panel para o frame
        frameInicial.add(panelInicial);
        frameCliente.add(panelCliente);
        frameFuncionario.add(panelFuncionario);
        frameInputCliente.add(panelInputCliente);
        frameInputProjeto.add(panelInputProjeto);

        // Centraliza o frame inicial
        frameInicial.setLocationRelativeTo(null);
        
        // Torna o frame inicial visível
        frameInicial.setVisible(true);
    }
}