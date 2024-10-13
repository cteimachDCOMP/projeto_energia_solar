package main;

import javax.swing.*;

import cliente.Cliente;
import cliente.Projeto;
import empresa.Fabricante;
import empresa.Inversor;
import empresa.PlacaSolar;

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
        
        panelInicial.add(buttonCliente);
        panelInicial.add(buttonFuncionario);
        
        frameInicial.add(panelInicial);
        
        // Cria o frameCliente
        JFrame frameCliente = new JFrame("Bem-vindo, cliente!");
        frameCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameCliente.setSize(400, 200);

        JPanel panelCliente = new JPanel();
        panelCliente.setLayout(new GridLayout(2, 2, 10, 10));
        
        JButton buttonCadastrarCliente = new JButton("Cadastrar Cliente");
        JButton buttonCadastrarProjeto = new JButton("Cadastrar Projeto");
        JButton buttonListarProjetos = new JButton("Listar Projetos");
        
        JButton buttonRetornarDeClienteParaInicial = new JButton("Retornar");
        
        panelCliente.add(buttonCadastrarCliente);
        panelCliente.add(buttonCadastrarProjeto);
        
        frameCliente.add(panelCliente);
        
        // Cria o frameFuncionario
        JFrame frameFuncionario = new JFrame("Bem-vindo, funcionário! Escolha a operação a ser executada");
        frameFuncionario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameFuncionario.setSize(400, 200);

        JPanel panelFuncionario = new JPanel();
        panelFuncionario.setLayout(new GridLayout(2, 2, 10, 10));
        
        JButton buttonCadastrarFabricante = new JButton("Cadastrar Fabricante");
        JButton buttonCadastrarPlacaSolar = new JButton("Cadastrar Placa Solar");
        JButton buttonCadastrarInversor = new JButton("Cadastrar Inversor");
        
        JButton buttonRetornarDeFuncionarioParaInicial = new JButton("Retornar");
        
        panelFuncionario.add(buttonCadastrarFabricante);
        panelFuncionario.add(buttonCadastrarPlacaSolar);
        panelFuncionario.add(buttonCadastrarInversor);
        
        frameFuncionario.add(panelFuncionario);
        
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
        
        JButton buttonRetornarDeInputClienteParaCliente = new JButton("Retornar");
        
        panelInputCliente.add(labelNomeDoCliente);
        panelInputCliente.add(textFieldNomeDoCliente);

        panelInputCliente.add(labelEndereço);
        panelInputCliente.add(textFieldEndereço);

        panelInputCliente.add(labelTelefone);
        panelInputCliente.add(textFieldTelefone);

        panelInputCliente.add(buttonSubmeterCliente);
        
        frameInputCliente.add(panelInputCliente);
        
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
        
        JLabel labelIrradiaçao = new JLabel("Insira a irradiação de sua região");
        JTextField textFieldIrradiaçao = new JTextField();

        JButton buttonSubmeterProjeto = new JButton("Submeter");
        
        JButton buttonRetornarDeInputProjetoParaCliente = new JButton("Retornar");
        
        panelInputProjeto.add(labelNomeDoRequisitador);
        panelInputProjeto.add(textFieldNomeDoRequisitador);
        
        panelInputProjeto.add(labelNomeDoProjeto);
        panelInputProjeto.add(textFieldNomeDoProjeto);
        
        panelInputProjeto.add(labelConsumoMedio);
        panelInputProjeto.add(textFieldConsumoMedio);
        
        panelInputProjeto.add(labelIrradiaçao);
        panelInputProjeto.add(textFieldIrradiaçao);
        
        panelInputProjeto.add(buttonSubmeterProjeto);
        
        frameInputProjeto.add(panelInputProjeto);
        
        // Cria o frameInputFabricante
        JFrame frameInputFabricante = new JFrame("Cadastrar Fabricante");
        frameInputFabricante.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Changed from EXIT_ON_CLOSE
        frameInputFabricante.setSize(400, 300);
        
        JPanel panelInputFabricante = new JPanel();
        panelInputFabricante.setLayout(new GridLayout(5, 2, 10, 10));
        
        JLabel labelNomeDoFabricante = new JLabel("Insira o nome do fabricante: ");
        JTextField textFieldNomeDoFabricante = new JTextField();
        
        JButton buttonSubmeterFabricante = new JButton("Submeter");
        
        JButton buttonRetornarDeFabricanteParaFuncionario = new JButton("Retornar");
        
        panelInputFabricante.add(labelNomeDoFabricante);
        panelInputFabricante.add(textFieldNomeDoFabricante);
        
        panelInputFabricante.add(buttonSubmeterFabricante);
        
        frameInputFabricante.add(panelInputFabricante);
        
        // Cria o frameInputPlacaSolar
        JFrame frameInputPlacaSolar = new JFrame("Cadastrar Placa Solar");
        frameInputPlacaSolar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Changed from EXIT_ON_CLOSE
        frameInputPlacaSolar.setSize(400, 300);
        
        JPanel panelInputPlacaSolar = new JPanel();
        panelInputPlacaSolar.setLayout(new GridLayout(5, 2, 10, 10));
        
        JLabel labelNomeDaPlacaSolar = new JLabel("Insira o nome do placa solar: ");
        JTextField textFieldNomeDaPlacaSolar = new JTextField();
        
        JLabel labelCapacidade = new JLabel("Insira a capacidade da placa solar: ");
        JTextField textFieldCapacidade = new JTextField();
        
        JLabel labelPreçoDaPlacaSolar = new JLabel("Insira o preço da placa solar: ");
        JTextField textFieldPreçoDaPlacaSolar = new JTextField();
        
        JLabel labelFabricantes = new JLabel("Insira os fabricantes da placa solar: ");
        JTextField textFieldFabricantesDaPlacaSolar = new JTextField();
        
        JButton buttonSubmeterPlacaSolar = new JButton("Submeter");
        
        JButton buttonRetornarDePlacaSolarParaFuncionario = new JButton("Retornar");
        
        panelInputPlacaSolar.add(labelNomeDaPlacaSolar);
        panelInputPlacaSolar.add(textFieldNomeDaPlacaSolar);
        
        panelInputPlacaSolar.add(labelCapacidade);
        panelInputPlacaSolar.add(textFieldCapacidade);
        
        panelInputPlacaSolar.add(labelPreçoDaPlacaSolar);
        panelInputPlacaSolar.add(textFieldPreçoDaPlacaSolar);
        
        panelInputPlacaSolar.add(labelFabricantes);
        panelInputPlacaSolar.add(textFieldFabricantesDaPlacaSolar);
        
        panelInputPlacaSolar.add(buttonSubmeterPlacaSolar);
        
        frameInputPlacaSolar.add(panelInputPlacaSolar);
        
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
        
        JLabel labelPreçoDoInversor = new JLabel("Insira o preço do inversor: ");
        JTextField textFieldPreçoDoInversor = new JTextField();
        
        JLabel labelFabricanteDoInversor = new JLabel("Insira o fabricante do inversor: ");
        JTextField textFieldFabricanteDoInversor = new JTextField();
        
        JButton buttonSubmeterInversor = new JButton("Submeter");

        JButton buttonRetornarDeInversorParaFuncionario = new JButton("Retornar");
        
        panelInputInversor.add(labelModeloDoInversor);
        panelInputInversor.add(textFieldModeloDoInversor);
        
        panelInputInversor.add(labelPotencia);
        panelInputInversor.add(textFieldPotencia);

        panelInputInversor.add(labelPreçoDoInversor);
        panelInputInversor.add(textFieldPreçoDoInversor);
        
        panelInputInversor.add(labelFabricanteDoInversor);
        panelInputInversor.add(textFieldFabricanteDoInversor);
        
        panelInputInversor.add(buttonSubmeterInversor);
        
        frameInputInversor.add(panelInputInversor);
        
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
            String irradiaçao = textFieldIrradiaçao.getText();

            try {
                Double doubleConsumoMedio = Double.valueOf(consumoMedio);
                Double doubleIrradiaçao = Double.valueOf(irradiaçao);

                Cliente clienteEncontrado = null;
                for (Cliente cliente : clientes) {
                    if (cliente.getNome().equals(nomeDoRequisitador)) {
                        clienteEncontrado = cliente;
                        break;
                    }
                }

                if (clienteEncontrado == null) {
                    SwingUtilities.invokeLater(() -> {
                        JOptionPane.showMessageDialog(frameInputProjeto, "Cliente não encontrado. Por favor, cadastre o cliente primeiro.", "Erro", JOptionPane.ERROR_MESSAGE);
                    });
                    return;
                }

                Projeto novoProjeto = new Projeto(nomeDoProjeto, clienteEncontrado, doubleConsumoMedio, doubleIrradiaçao);
                projetos.add(novoProjeto);

                SwingUtilities.invokeLater(() -> {
                    JOptionPane.showMessageDialog(frameInputProjeto, 
                        "Projeto cadastrado com sucesso!\n" +
                        "Nome: " + novoProjeto.getNome() + "\n" +
                        "Cliente: " + novoProjeto.getCliente().getNome() + "\n" +
                        "Consumo Médio: " + novoProjeto.getConsumoMedio() + "\n" +
                        "Irradiação: " + novoProjeto.getIrradiaçao(),
                        "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                    // Clear input fields
                    textFieldNomeDoRequisitador.setText("");
                    textFieldNomeDoProjeto.setText("");
                    textFieldConsumoMedio.setText("");
                    textFieldIrradiaçao.setText("");
                });

            } catch (NumberFormatException ex) {
                SwingUtilities.invokeLater(() -> {
                    JOptionPane.showMessageDialog(frameInputProjeto, "Por favor, insira valores numéricos válidos para consumo médio e irradiação.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                });
            }
        });
        
        buttonSubmeterFabricante.addActionListener(e -> {
        	String nomeDoFabricante = textFieldNomeDoFabricante.getText();
        	
        	fabricantes.add(new Fabricante(nomeDoFabricante));
        	
        	for (Fabricante fabricante : fabricantes) {
        		if (fabricante.getNome().equals(nomeDoFabricante)) {
        			JOptionPane.showMessageDialog(frameInputFabricante, "Projeto com o seguinte nome:/n" + fabricante.getNome() + "/nFoi cadastrado com sucesso!");
        		}
        	}
        });
        
        buttonSubmeterPlacaSolar.addActionListener(e -> {
        	String nomeDaPlacaSolar = textFieldNomeDaPlacaSolar.getText();
        	String capacidade = textFieldCapacidade.getText();
        	String preçoDaPlacaSolar = textFieldPreçoDaPlacaSolar.getText();
        	String fabricanteDaPlacaSolar = textFieldFabricantesDaPlacaSolar.getText();
        	
        	double doubleCapacidade = Double.valueOf(capacidade);
        	double doublePreçoDaPlacaSolar = Double.valueOf(preçoDaPlacaSolar);
        	
        	Fabricante objFabricanteDaPlacaSolar = null;
        	
        	for (Fabricante fabricante : fabricantes) {
        		if (fabricante.getNome().equals(fabricanteDaPlacaSolar)) {
        			objFabricanteDaPlacaSolar = fabricante;
        		}
        	}
        	
        	placasSolares.add(new PlacaSolar(nomeDaPlacaSolar, doubleCapacidade, doublePreçoDaPlacaSolar, objFabricanteDaPlacaSolar));
        	
        	for (PlacaSolar placaSolar : placasSolares) {
        		if (placaSolar.getModelo().equals(nomeDaPlacaSolar)) {
        			JOptionPane.showMessageDialog(frameInputProjeto, "Placa solar com os seguintes dados:/nModelo:" + placaSolar.getModelo() + "/nCapacidade: " + placaSolar.getCapacidade() + "/nPreço: " + placaSolar.getPreco() + "/nLista de fabricantes: " + placaSolar.getFabricante() + "/nFoi cadastrado com sucesso!");
        		}
        	}
        });
        
        buttonSubmeterInversor.addActionListener(e -> {
        	String modeloDoInversor = textFieldModeloDoInversor.getText();
        	String potencia = textFieldPotencia.getText();
        	String preçoDoInversor = textFieldPreçoDoInversor.getText();
        	String fabricanteDoInversor = textFieldFabricanteDoInversor.getText();
        	
        	double doublePotencia = Double.valueOf(potencia);
        	double doublePreçoDoInversor = Double.valueOf(preçoDoInversor);
        	
        	Fabricante objFabricanteDoInversor = null;
        	
        	for (Fabricante fabricante : fabricantes) {
        		if (fabricante.getNome().equals(fabricanteDoInversor)) {
        			objFabricanteDoInversor = fabricante;
        		}
        	}
        	
        	inversores.add(new Inversor(modeloDoInversor, doublePotencia, doublePreçoDoInversor, objFabricanteDoInversor));
        	
        	for (Inversor inversor : inversores) {
        		if (inversor.getModelo().equals(modeloDoInversor)) {
        			JOptionPane.showMessageDialog(frameInputInversor, "Inversor com os seguintes dados:/nModelo:" + inversor.getModelo() + "/nPotência: " + inversor.getPotencia() + "/nPreço: " + inversor.getPreco() + "/nFabricante: " + inversor.getFabricante() + "/nFoi cadastrado com sucesso!");
        		}
        	}
        });

        // Centraliza o frame inicial
        frameInicial.setLocationRelativeTo(null);
        
        // Torna o frame inicial visível
        frameInicial.setVisible(true);
    }
}
