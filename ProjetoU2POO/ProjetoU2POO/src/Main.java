package main;

import javax.swing.*;

import cliente.Cliente;
import cliente.Projeto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Cria lista de clientes e projetos
        ArrayList<Cliente> clientes = new ArrayList<>();

        // Cria os frames
        JFrame frameInicial = new JFrame("Você é...?");
        frameInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameInicial.setSize(400, 200);

        JFrame frameCliente = new JFrame("Bem-vindo, cliente!");
        frameCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameCliente.setSize(400, 200);

        JFrame frameFuncionario = new JFrame("Bem-vindo, funcionário! Escolha a operação a ser executada");
        frameFuncionario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameFuncionario.setSize(400, 200);

        JFrame frameInputCliente = new JFrame("Cadastrar Cliente");
        frameInputCliente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Changed from EXIT_ON_CLOSE
        frameInputCliente.setSize(400, 300);

        // Cria os panels para armazenar os botões
        JPanel panelInicial = new JPanel();
        panelInicial.setLayout(new GridLayout(2, 1, 10, 10));

        JPanel panelCliente = new JPanel();
        panelCliente.setLayout(new GridLayout(2, 2, 10, 10));
        
        JPanel panelFuncionario = new JPanel();
        panelFuncionario.setLayout(new GridLayout(2, 2, 10, 10));

        JPanel panelInputCliente = new JPanel();
        panelInputCliente.setLayout(new GridLayout(5, 2, 10, 10));

        // Cria os labels
        JLabel labelNome = new JLabel("Insira o nome do cliente: ");
        JTextField textFieldNome = new JTextField();

        JLabel labelEndereço = new JLabel("Insira o endereço do cliente: ");
        JTextField textFieldEndereço = new JTextField();

        JLabel labelTelefone = new JLabel("Insira o telefone do cliente: ");
        JTextField textFieldTelefone = new JTextField();

        // Cria os botões
        JButton buttonCliente = new JButton("Cliente");
        JButton buttonFuncionario = new JButton("Funcionário");

        JButton buttonCadastrarCliente = new JButton("Cadastrar Cliente");
        JButton buttonCadastrarProjeto = new JButton("Cadastrar Projeto");
        
        JButton buttonCadastrarFabricante = new JButton("Cadastrar Fabricante");
        JButton buttonCadastrarPlacaSolar = new JButton("Cadastrar Placa Solar");
        JButton buttonCadastrarInversor = new JButton("Cadastrar Inversor");
        
        JButton buttonSubmeter = new JButton("Submeter");

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
            frameFuncionario.setVisible(false);  // Hide frameFuncionario
            frameInputCliente.pack();  // Pack before setting visible
            frameInputCliente.setLocationRelativeTo(null);  // Center on screen
            frameInputCliente.setVisible(true);  // Show frameInputCliente
        });
        
        buttonCadastrarProjeto.addActionListener(e -> {
        	
        });
        
        buttonCadastrarFabricante.addActionListener(e -> {
        	
        });
        
        buttonCadastrarPlacaSolar.addActionListener(e -> {
        	
        });

        buttonCadastrarInversor.addActionListener(e -> {
        	
        });
        
        buttonSubmeter.addActionListener(e -> {

                String nome = textFieldNome.getText();
                String endereço = textFieldEndereço.getText();
                String telefone = textFieldTelefone.getText();

                clientes.add(new Cliente(nome, endereço, telefone));  // Criar cliente)

                JOptionPane.showMessageDialog(frameInputCliente, "Cliente cadastrado com sucesso!");

                // Opcional: Limpar campos de texto após o cadastro
                textFieldNome.setText("");
                textFieldEndereço.setText("");
                textFieldTelefone.setText("");
        });

        // Adiciona os botões para o panel
        panelInicial.add(buttonCliente);
        panelInicial.add(buttonFuncionario);

        panelCliente.add(buttonCadastrarCliente);
        panelCliente.add(buttonCadastrarProjeto);
        
        panelFuncionario.add(buttonCadastrarFabricante);
        panelFuncionario.add(buttonCadastrarPlacaSolar);
        panelFuncionario.add(buttonCadastrarInversor);

        // Adiciona os labels e textfields para o panel onde o usuário colocará os dados do cliente
        panelInputCliente.add(labelNome);
        panelInputCliente.add(textFieldNome);

        panelInputCliente.add(labelEndereço);
        panelInputCliente.add(textFieldEndereço);

        panelInputCliente.add(labelTelefone);
        panelInputCliente.add(textFieldTelefone);

        panelInputCliente.add(buttonSubmeter);

        // Adiciona o panel para o frame
        frameInicial.add(panelInicial);
        frameCliente.add(panelCliente);
        frameFuncionario.add(panelFuncionario);
        frameInputCliente.add(panelInputCliente);

        // Centraliza o frame inicial
        frameInicial.setLocationRelativeTo(null);
        
        // Torna o frame inicial visível
        frameInicial.setVisible(true);
    }
}
