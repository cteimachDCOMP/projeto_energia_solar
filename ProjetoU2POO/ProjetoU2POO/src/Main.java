import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
    	// Cria lista de clientes e projetos
    	ArrayList<Cliente> clientes = new ArrayList<>();
    	ArrayList<Projeto> projetos = new ArrayList<>();
    	
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
        
        JFrame frameInputCliente = new JFrame("Input Form");
        frameInputCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameInputCliente.setSize(400, 200);

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
        
        JLabel labelProjetos = new JLabel("Insira os projetos do cliente separados por virgula: ");
        JTextField textFieldProjetos = new JTextField();
        
        // Cria os botões
        JButton buttonCliente = new JButton("Cliente");
        JButton buttonFuncionario = new JButton("Funcionário");
        
        JButton buttonDimensionamento = new JButton("Dimensionamento do Sistema Fotovoltaico");
        
        JButton buttonCadastrarCliente = new JButton("Cadastrar Cliente");
        JButton buttonCadastrarFabricante = new JButton("Cadastrar Fabricante");
        JButton buttonCadastrarPlacaSolar = new JButton("Cadastrar Modelo De Placa Solar");
        JButton buttonCadastrarInversor = new JButton("Cadastrar Inversor");
        
        JButton buttonSubmeter = new JButton("Submeter");

        // Adiciona um action listener para cada botão
        buttonCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Task 1 code goes here
                // JOptionPane.showMessageDialog(frameInicial, "Você é um cliente!");
                frameCliente.setVisible(true);
            }
        });

        buttonFuncionario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Task 2 code goes here
                //JOptionPane.showMessageDialog(frameInicial, "Você é um funcionário!");
                frameFuncionario.setVisible(true);
            }
        });
        
        buttonCadastrarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ação do botão de cadastrar cliente
            	
            	
                // JOptionPane.showMessageDialog(frameFuncionario, "You clicked Button 1!");
            	
            }
        });

        buttonCadastrarFabricante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Button 2 action
                JOptionPane.showMessageDialog(frameFuncionario, "You clicked Button 2!");
            }
        });

        buttonCadastrarPlacaSolar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Button 3 action
                JOptionPane.showMessageDialog(frameFuncionario, "You clicked Button 3!");
            }
        });

        buttonCadastrarInversor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Button 4 action
                JOptionPane.showMessageDialog(frameFuncionario, "You clicked Button 4!");
            }
        });
        
        buttonSubmeter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Store the input values
                String nome = textFieldNome.getText();
                String endereço = textFieldEndereço.getText();
                String telefone = textFieldTelefone.getText();
                String projetos = textFieldProjetos.getText();
            }
            
            List<String> listaDeNomesDeProjetos = Arrays.asList(projetos.split(","));
            
            ArrayList<Projeto> listaDeProjetos = new ArrayList<>();
            
            for (Projeto projeto : projetos) {
            	for (String nomeDeProjeto: listaDeNomesDeProjetos) {
            		if (projeto.getNome.equals(nomeDeProjeto)) {
            			listaDeProjetos.add(projeto);
            		}
            	}
            }
            
            clientes.add(new Cliente(nome, endereço, telefone, listaDeProjetos));
        });

        // Adiciona os botões para o panel
        panelInicial.add(buttonCliente);
        panelInicial.add(buttonFuncionario);
        
        panelCliente.add(buttonDimensionamento);
        
        panelFuncionario.add(buttonCadastrarCliente);
        panelFuncionario.add(buttonCadastrarFabricante);
        panelFuncionario.add(buttonCadastrarPlacaSolar);
        panelFuncionario.add(buttonCadastrarInversor);
        
        // adiciona os labels e textfields para o panel onde o usuário colocará os dados do cliente
        panelInputCliente.add(labelNome);
        panelInputCliente.add(textFieldNome);
        

        // Adiciona o panel para o frame
        frameInicial.add(panelInicial);
        
        frameCliente.add(panelCliente);
        
        frameFuncionario.add(panelFuncionario);

        // Torna o frame visível
        frameInicial.setVisible(true);
    }
}
